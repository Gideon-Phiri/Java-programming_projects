import java.io.*;
import java.util.*;

public class CourseManagement {
    private static List<Course> courses = new ArrayList<>();
    private static Map<String, Student> students = new HashMap<>();
    private static Map<Student, Double> studentOverallGrades = new HashMap<>();

    private static final String COURSES_FILE = "courses.dat";
    private static final String STUDENTS_FILE = "students.dat";

    static {
        loadCourses();
        loadStudents();
    }

    // Method to add a new course
    public static void addCourse(String courseCode, String courseName, int maxCapacity) {
        courses.add(new Course(courseCode, courseName, maxCapacity));
        saveCourses();
    }

    // Method to update a course
    public static void updateCourse(String oldCourseCode, String newCourseCode, String newCourseName, int newMaxCapacity) {
        Course course = getCourseByCode(oldCourseCode);
        if (course != null) {
            course.updateCourseInfo(newCourseCode, newCourseName, newMaxCapacity);
            saveCourses();
        }
    }

    // Method to remove a course
    public static void removeCourse(String courseCode) {
        Course course = getCourseByCode(courseCode);
        if (course != null) {
            courses.remove(course);
            saveCourses();
        }
    }

    // Method to enroll a student in a course
    public static void enrollStudent(Student student, Course course) {
        student.enrollInCourse(course);
        saveStudents();
    }

    // Method to assign a grade to a student for a course
    public static void assignGrade(Student student, Course course, double grade) {
        student.assignGrade(course, grade);
        saveStudents();
    }

    // Method to calculate overall grade for a student
    public static double calculateOverallGrade(Student student) {
        double overallGrade = student.calculateOverallGrade();
        studentOverallGrades.put(student, overallGrade);
        saveStudents();
        return overallGrade;
    }

    // Method to get a course by its code
    public static Course getCourseByCode(String courseCode) {
        for (Course course : courses) {
            if (course.getCourseCode().equals(courseCode)) {
                return course;
            }
        }
        return null;
    }

    // Method to get a student by ID
    public static Student getStudentById(String id) {
        return students.get(id);
    }

    // Method to add a student
    public static void addStudent(Student student) {
        students.put(student.getId(), student);
        saveStudents();
    }

    // Method to update student information
    public static void updateStudent(String id, String newName, String newId) {
        Student student = getStudentById(id);
        if (student != null) {
            student.updateStudentInfo(newName, newId);
            saveStudents();
        }
    }

    // Method to list all courses with enrollment details
    public static void listCourses() {
        for (Course course : courses) {
            course.displayCourseDetails();
        }
    }

    // Method to list all students with their enrolled courses
    public static void listStudents() {
        for (Student student : students.values()) {
            student.displayEnrolledCourses();
        }
    }

    // Save courses to file
    private static void saveCourses() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(COURSES_FILE))) {
            oos.writeObject(courses);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Load courses from file
    @SuppressWarnings("unchecked")
    private static void loadCourses() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(COURSES_FILE))) {
            courses = (List<Course>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    // Save students to file
    private static void saveStudents() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(STUDENTS_FILE))) {
            oos.writeObject(students);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Load students from file
    @SuppressWarnings("unchecked")
    private static void loadStudents() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(STUDENTS_FILE))) {
            students = (Map<String, Student>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
