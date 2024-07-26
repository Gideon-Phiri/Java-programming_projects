import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private String id;
    private Map<Course, Double> enrolledCourses;

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
        this.enrolledCourses = new HashMap<>();
    }

    // Getter and Setter methods for name and id
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    // Method to enroll in a course
    public void enrollInCourse(Course course) {
        if (!enrolledCourses.containsKey(course) && course.addStudent(this)) {
            enrolledCourses.put(course, null);
        }
    }

    // Method to assign grade for a course
    public void assignGrade(Course course, double grade) {
        if (enrolledCourses.containsKey(course)) {
            enrolledCourses.put(course, grade);
        }
    }

    // Method to calculate overall grade
    public double calculateOverallGrade() {
        double total = 0;
        int count = 0;
        for (Double grade : enrolledCourses.values()) {
            if (grade != null) {
                total += grade;
                count++;
            }
        }
        return count > 0 ? total / count : 0;
    }

    // Method to get enrolled courses
    public Map<Course, Double> getEnrolledCourses() {
        return enrolledCourses;
    }

    // Method to update student information
    public void updateStudentInfo(String name, String id) {
        this.name = name;
        this.id = id;
    }

    // Method to display enrolled courses
    public void displayEnrolledCourses() {
        System.out.println("Student ID: " + id + ", Name: " + name);
        for (Course course : enrolledCourses.keySet()) {
            System.out.println(" - Enrolled in: " + course.getCourseCode() + " (" + course.getCourseName() + ")");
        }
    }
}
