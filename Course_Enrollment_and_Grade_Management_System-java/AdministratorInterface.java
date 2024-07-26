import java.util.Scanner;

public class AdministratorInterface {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n=== Course Enrollment and Grade Management System ===");
            System.out.println("1. Add a new course");
            System.out.println("2. Update a course");
            System.out.println("3. Remove a course");
            System.out.println("4. Enroll student in a course");
            System.out.println("5. Assign grade to a student");
            System.out.println("6. Calculate overall grade for a student");
            System.out.println("7. Update student information");
            System.out.println("8. List all courses");
            System.out.println("9. List all students and their enrolled courses");
            System.out.println("10. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addCourse();
                    break;
                case 2:
                    updateCourse();
                    break;
                case 3:
                    removeCourse();
                    break;
                case 4:
                    enrollStudent();
                    break;
                case 5:
                    assignGrade();
                    break;
                case 6:
                    calculateOverallGrade();
                    break;
                case 7:
                    updateStudent();
                    break;
                case 8:
                    listCourses();
                    break;
                case 9:
                    listStudents();
                    break;
                case 10:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addCourse() {
        System.out.print("Enter course code (or type 'quit' to cancel): ");
        String courseCode = scanner.nextLine();
        if (courseCode.equalsIgnoreCase("quit")) return;

        System.out.print("Enter course name (or type 'quit' to cancel): ");
        String courseName = scanner.nextLine();
        if (courseName.equalsIgnoreCase("quit")) return;

        System.out.print("Enter maximum capacity (or type 'quit' to cancel): ");
        String maxCapacityStr = scanner.nextLine();
        if (maxCapacityStr.equalsIgnoreCase("quit")) return;

        int maxCapacity = Integer.parseInt(maxCapacityStr);
        CourseManagement.addCourse(courseCode, courseName, maxCapacity);
        System.out.println("Course added successfully.");
    }

    private static void updateCourse() {
        System.out.print("Enter the course code to update (or type 'quit' to cancel): ");
        String oldCourseCode = scanner.nextLine();
        if (oldCourseCode.equalsIgnoreCase("quit")) return;

        System.out.print("Enter new course code (or type 'quit' to cancel): ");
        String newCourseCode = scanner.nextLine();
        if (newCourseCode.equalsIgnoreCase("quit")) return;

        System.out.print("Enter new course name (or type 'quit' to cancel): ");
        String newCourseName = scanner.nextLine();
        if (newCourseName.equalsIgnoreCase("quit")) return;

        System.out.print("Enter new maximum capacity (or type 'quit' to cancel): ");
        String newMaxCapacityStr = scanner.nextLine();
        if (newMaxCapacityStr.equalsIgnoreCase("quit")) return;

        int newMaxCapacity = Integer.parseInt(newMaxCapacityStr);
        CourseManagement.updateCourse(oldCourseCode, newCourseCode, newCourseName, newMaxCapacity);
        System.out.println("Course updated successfully.");
    }

    private static void removeCourse() {
        System.out.print("Enter the course code to remove (or type 'quit' to cancel): ");
        String courseCode = scanner.nextLine();
        if (courseCode.equalsIgnoreCase("quit")) return;

        CourseManagement.removeCourse(courseCode);
        System.out.println("Course removed successfully.");
    }

    private static void enrollStudent() {
        System.out.print("Enter student ID (or type 'quit' to cancel): ");
        String studentId = scanner.nextLine();
        if (studentId.equalsIgnoreCase("quit")) return;

        Student student = CourseManagement.getStudentById(studentId);
        if (student == null) {
            System.out.print("Enter student name (or type 'quit' to cancel): ");
            String studentName = scanner.nextLine();
            if (studentName.equalsIgnoreCase("quit")) return;

            student = new Student(studentName, studentId);
            CourseManagement.addStudent(student);
        }

        System.out.print("Enter course code to enroll in (or type 'quit' to cancel): ");
        String courseCode = scanner.nextLine();
        if (courseCode.equalsIgnoreCase("quit")) return;

        Course course = CourseManagement.getCourseByCode(courseCode);

        if (course != null) {
            CourseManagement.enrollStudent(student, course);
            System.out.println("Student enrolled successfully.");
        } else {
            System.out.println("Course not found.");
        }
    }

    private static void assignGrade() {
        System.out.print("Enter student ID (or type 'quit' to cancel): ");
        String studentId = scanner.nextLine();
        if (studentId.equalsIgnoreCase("quit")) return;

        Student student = CourseManagement.getStudentById(studentId);
        if (student == null) {
            System.out.print("Enter student name (or type 'quit' to cancel): ");
            String studentName = scanner.nextLine();
            if (studentName.equalsIgnoreCase("quit")) return;

            student = new Student(studentName, studentId);
            CourseManagement.addStudent(student);
        }

        System.out.print("Enter course code (or type 'quit' to cancel): ");
        String courseCode = scanner.nextLine();
        if (courseCode.equalsIgnoreCase("quit")) return;

        Course course = CourseManagement.getCourseByCode(courseCode);

        if (course != null) {
            System.out.print("Enter grade (or type 'quit' to cancel): ");
            String gradeStr = scanner.nextLine();
            if (gradeStr.equalsIgnoreCase("quit")) return;

            double grade = Double.parseDouble(gradeStr);
            CourseManagement.assignGrade(student, course, grade);
            System.out.println("Grade assigned successfully.");
        } else {
            System.out.println("Course not found.");
        }
    }

    private static void calculateOverallGrade() {
        System.out.print("Enter student ID (or type 'quit' to cancel): ");
        String studentId = scanner.nextLine();
        if (studentId.equalsIgnoreCase("quit")) return;

        Student student = CourseManagement.getStudentById(studentId);
        if (student == null) {
            System.out.print("Enter student name (or type 'quit' to cancel): ");
            String studentName = scanner.nextLine();
            if (studentName.equalsIgnoreCase("quit")) return;

            student = new Student(studentName, studentId);
            CourseManagement.addStudent(student);
        }

        double overallGrade = CourseManagement.calculateOverallGrade(student);
        System.out.println("Overall grade for student " + student.getName() + ": " + overallGrade);
    }

    private static void updateStudent() {
        System.out.print("Enter the current student ID (or type 'quit' to cancel): ");
        String oldId = scanner.nextLine();
        if (oldId.equalsIgnoreCase("quit")) return;

        Student student = CourseManagement.getStudentById(oldId);
        if (student != null) {
            System.out.print("Enter new student name (or type 'quit' to cancel): ");
            String newName = scanner.nextLine();
            if (newName.equalsIgnoreCase("quit")) return;

            System.out.print("Enter new student ID (or type 'quit' to cancel): ");
            String newId = scanner.nextLine();
            if (newId.equalsIgnoreCase("quit")) return;

            CourseManagement.updateStudent(oldId, newName, newId);
            System.out.println("Student information updated successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }

    private static void listCourses() {
        CourseManagement.listCourses();
    }

    private static void listStudents() {
        CourseManagement.listStudents();
    }
}
