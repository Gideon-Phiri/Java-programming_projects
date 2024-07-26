import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Course implements Serializable {
    private static final long serialVersionUID = 1L;
    private String courseCode;
    private String courseName;
    private int maxCapacity;
    private List<Student> enrolledStudents;
    private static int totalEnrolledStudents = 0;

    public Course(String courseCode, String courseName, int maxCapacity) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.maxCapacity = maxCapacity;
        this.enrolledStudents = new ArrayList<>();
    }

    // Getter methods
    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public int getEnrolledCount() {
        return enrolledStudents.size();
    }

    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    // Method to add a student to the course
    public boolean addStudent(Student student) {
        if (enrolledStudents.size() < maxCapacity) {
            enrolledStudents.add(student);
            totalEnrolledStudents++;
            return true;
        }
        return false;
    }

    // Static method to get total enrolled students
    public static int getTotalEnrolledStudents() {
        return totalEnrolledStudents;
    }

    // Method to update course information
    public void updateCourseInfo(String courseCode, String courseName, int maxCapacity) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.maxCapacity = maxCapacity;
    }

    // Method to display course details
    public void displayCourseDetails() {
        System.out.println("Course Code: " + courseCode + ", Name: " + courseName +
                           ", Enrolled: " + getEnrolledCount() + "/" + maxCapacity);
        for (Student student : enrolledStudents) {
            System.out.println(" - " + student.getName() + " (" + student.getId() + ")");
        }
    }
}
