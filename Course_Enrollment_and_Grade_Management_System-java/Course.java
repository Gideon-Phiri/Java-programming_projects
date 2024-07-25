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

    // Method to add a student to the course
    public boolean addStudent() {
        if (enrolledStudents.size() < maxCapacity) {
            totalEnrolledStudents++;
            return true;
        }
        return false;
    }

    // Static method to get total enrolled students
    public static int getTotalEnrolledStudents() {
        return totalEnrolledStudents;
    }

    // Method to get enrolled students
    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }
}
