import java.util.Scanner;

public class AdministratorInterface {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n=== Course Enrollment and Grade Management System ===");
            System.out.println("1. Add a new course");
            System.out.println("2. Enroll student in a course");
            System.out.println("3. Assign grade to a student");
            System.out.println("4. Calculate overall grade for a student");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addCourse();
                    break;
                case 2:
                    enrollStudent();
                    break;
                case 3:
                    assignGrade();
                    break;
                case 4:
                    calculateOverallGrade();
                    break;
                case 5:
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
}
