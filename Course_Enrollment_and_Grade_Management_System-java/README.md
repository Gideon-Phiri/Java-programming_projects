<a name="top"></a>

# Course Enrollment and Grade Management System

![Hero Image](./gitimg/hero.png)

⭐ Star me on GitHub — it will motivates me a lot!

[![Share](https://img.shields.io/badge/share-000000?logo=x&logoColor=white)](https://x.com/intent/tweet?text=Check%20out%20this%20project%20on%20GitHub:%20https://github.com/Gideon-Phiri/Java-programming_projects/tree/main/Course_Enrollment_and_Grade_Management_System-java.)
[![Share](https://img.shields.io/badge/share-1877F2?logo=facebook&logoColor=white)](https://www.facebook.com/sharer/sharer.php?u=https://github.com/Gideon-Phiri/Java-programming_projects/tree/main/Course_Enrollment_and_Grade_Management_System-java)
[![Share](https://img.shields.io/badge/share-0A66C2?logo=linkedin&logoColor=white)](https://www.linkedin.com/sharing/share-offsite/?url=https://github.com/Gideon-Phiri/Java-programming_projects/tree/main/Course_Enrollment_and_Grade_Management_System-java)
[![Share](https://img.shields.io/badge/share-FF4500?logo=reddit&logoColor=white)](https://www.reddit.com/submit?title=Check%20out%20this%20project%20on%20GitHub:%20https://github.com/Gideon-Phiri/Java-programming_projects/tree/main/Course_Enrollment_and_Grade_Management_System-java)
[![Share](https://img.shields.io/badge/share-0088CC?logo=telegram&logoColor=white)](https://t.me/share/url?url=https://github.com/Gideon-Phiri/Java-programming_projects/tree/main/Course_Enrollment_and_Grade_Management_System-java&text=Check%20out%20this%20project%20on%20GitHub)

## Table of Contents

- [Introduction](#-introduction)
- [Classes](#classes)
- [Students](#student)
- [course](#course)
- [Course Management](#coursemanagement)
- [AdministratorInterface](#administratorinterface)
- [Static Methods and Variables](#static-methods-and-variables)
- [Running the Program](#running-the-program)
- [Getting Started](#-getting-started)
- [Feedback and Contributions](#-feedback-and-contributions)
- [License](#-license)
- [Contacts](#%EF%B8%8F-contacts)
- [Author](#author)
- [Course Instructor](course-instructor)

## 🚀 Introduction

This project is designed to manage course enrollments and grade assignments for a university. It includes functionality to enroll students in courses, assign grades, and calculate overall grades for students.

## Classes

### Student

- **Attributes**
  - `name`: String
  - `id`: String
  - `enrolledCourses`: Map<Course, Double>
- **Methods**
  - `Student(String name, String id)`: Constructor to initialize student.
  - `getName()`, `setName(String name)`: Accessor and mutator for `name`.
  - `getId()`, `setId(String id)`: Accessor and mutator for `id`.
  - `enrollInCourse(Course course)`: Enrolls the student in a course.
  - `assignGrade(Course course, double grade)`: Assigns a grade to the student for a course.
  - `calculateOverallGrade()`: Calculates the overall grade for the student.

### Course

- **Attributes**
  - `courseCode`: String
  - `courseName`: String
  - `maxCapacity`: int
  - `enrolledStudents`: List<Student>
  - `totalEnrolledStudents`: static int
- **Methods**
  - `Course(String courseCode, String courseName, int maxCapacity)`: Constructor to initialize course.
  - `getCourseCode()`, `getCourseName()`, `getMaxCapacity()`: Accessors for course attributes.
  - `addStudent()`: Adds a student to the course.
  - `getTotalEnrolledStudents()`: Static method to get the total enrolled students across all courses.

### CourseManagement

- **Attributes**
  - `courses`: static List<Course>
  - `studentOverallGrades`: static Map<Student, Double>
- **Methods**
  - `addCourse(String courseCode, String courseName, int maxCapacity)`: Adds a new course.
  - `enrollStudent(Student student, Course course)`: Enrolls a student in a course.
  - `assignGrade(Student student, Course course, double grade)`: Assigns a grade to a student.
  - `calculateOverallGrade(Student student)`: Calculates the overall grade for a student.
  - `getCourseByCode(String courseCode)`: Retrieves a course by its code.

### AdministratorInterface

- **Methods**
  - `main(String[] args)`: Entry point for the command-line interface.
  - `addCourse()`: Prompts for course details and adds a new course.
  - `enrollStudent()`: Prompts for student and course details and enrolls the student in the course.
  - `assignGrade()`: Prompts for student, course, and grade details and assigns the grade.
  - `calculateOverallGrade()`: Prompts for student details and calculates their overall grade.

## Static Methods and Variables

Static methods and variables are used to keep track of information across multiple instances. For example, `Course` class uses a static variable `totalEnrolledStudents` to track the total number of students enrolled across all courses. Similarly, `CourseManagement` class uses static methods to manage courses and student enrollments.

## Running the Program

Follow the following steps to run the program from your CLI

```shell
# Open a terminal (Command Prompt or PowerShell for Windows, Terminal for macOS or Linux)

# Ensure Git is installed

# Visit https://git-scm.com to download and install console Git if not already installed

# Clone the repository
git clone https://github.com/Gideon-Phiri/Java-programming_projects.git

# Navigate to the project directory
cd Course_Enrollment_and_Grade_Management_System-java

# Compile all the Java files
javac AdministratorInterface.java student.java course.java courseManagement.java

# Run the `AdministratorInterface` class
java AdministratorInterface


```

## Getting Started

Now follow on screen prompts to Add a new course, Enroll student in a course, Assign grade to a student and Calculate overall grade for a student

## Persisting Data Between Runs

student and course information are stored in files (students.dat and courses.dat) and read them back at the start of the program. This involves:

- Saving student and course information to files before the program exits.
- Loading student and course information from files when the program starts.

## 🤝 Feedback and Contributions

We've made every effort to implement all the main aspects of the app in the best possible way. However, the development journey doesn't end here, and your input is crucial for our continuous improvement.

> [!IMPORTANT]
> Whether you have feedback on features, have encountered any bugs, or have suggestions for enhancements, we're eager to hear from you. Your insights help us make this app more robust and user-friendly.

Please feel free to contribute by [submitting an issue](https://github.com/Gideon-Phiri/Java-programming_projects/issues). Each contribution helps us grow and improve.

We appreciate your support and look forward to making our product even better with your help!

## 📃 License

This Project is part of ![UoPeople](./gitimg/uopeople.png) class **programing assignments** instructed by **Sir Marcellous Simeon**

For non-commercial use, this product is available for free.

## 🗨️ Contacts

For more details about about this project and any other projects you may need assistance on, feel free to reach out to me. Am here to provide support and answer any questions you may have. Below are the best way to contact with me:

- **Email**: Send me your inquiries or support requests on [gideonphiri032@gmail.com](mailto:gideonphiri032@gmail.com).

Subscribe to my LinkedIn:

[![LinkedIn](https://img.shields.io/badge/subscribe-white.svg?logo=data:image/svg%2bxml;base64,PHN2ZyB2aWV3Qm94PSIwIDAgMjQgMjQiIHhtbG5zPSJodHRwOi8vd3d3LnczLm9yZy8yMDAwL3N2ZyI+PHBhdGggZD0iTTIwLjQ0NyAyMC40NTJoLTMuNTU0di01LjU2OWMwLTEuMzI4LS4wMjctMy4wMzctMS44NTItMy4wMzctMS44NTMgMC0yLjEzNiAxLjQ0NS0yLjEzNiAyLjkzOXY1LjY2N0g5LjM1MVY5aDMuNDE0djEuNTYxaC4wNDZjLjQ3Ny0uOSAxLjYzNy0xLjg1IDMuMzctMS44NSAzLjYwMSAwIDQuMjY3IDIuMzcgNC4yNjcgNS40NTV2Ni4yODZ6TTUuMzM3IDcuNDMzYTIuMDYyIDIuMDYyIDAgMCAxLTIuMDYzLTIuMDY1IDIuMDY0IDIuMDY0IDAgMSAxIDIuMDYzIDIuMDY1em0xLjc4MiAxMy4wMTlIMy41NTVWOWgzLjU2NHYxMS40NTJ6TTIyLjIyNSAwSDEuNzcxQy43OTIgMCAwIC43NzQgMCAxLjcyOXYyMC41NDJDMCAyMy4yMjcuNzkyIDI0IDEuNzcxIDI0aDIwLjQ1MUMyMy4yIDI0IDI0IDIzLjIyNyAyNCAyMi4yNzFWMS43MjlDMjQgLjc3NCAyMy4yIDAgMjIuMjIyIDBoLjAwM3oiIGZpbGw9IiMwQTY2QzIiLz48cGF0aCBzdHlsZT0iZmlsbDojZmZmO3N0cm9rZS13aWR0aDouMDIwOTI0MSIgZD0iTTQuOTE3IDcuMzc3YTIuMDUyIDIuMDUyIDAgMCAxLS4yNC0zLjk0OWMxLjEyNS0uMzg0IDIuMzM5LjI3NCAyLjY1IDEuNDM3LjA2OC4yNS4wNjguNzY3LjAwMSAxLjAxYTIuMDg5IDIuMDg5IDAgMCAxLTEuNjIgMS41MSAyLjMzNCAyLjMzNCAwIDAgMS0uNzktLjAwOHoiLz48cGF0aCBzdHlsZT0iZmlsbDojZmZmO3N0cm9rZS13aWR0aDouMDIwOTI0MSIgZD0iTTQuOTE3IDcuMzc3YTIuMDU2IDIuMDU2IDAgMCAxLTEuNTItMi42NyAyLjA0NyAyLjA0NyAwIDAgMSAzLjQxOS0uNzU2Yy4yNC4yNTQuNDIuNTczLjUxMi45MDguMDY1LjI0LjA2NS43OCAwIDEuMDItLjA1MS4xODYtLjE5Ny41MDQtLjMuNjUyLS4wOS4xMzItLjMxLjM2Mi0uNDQzLjQ2NC0uNDYzLjM1Ny0xLjEuNTAzLTEuNjY4LjM4MlpNMy41NTcgMTQuNzJWOS4wMDhoMy41NTd2MTEuNDI0SDMuNTU3Wk05LjM1MyAxNC43MlY5LjAwOGgzLjQxMXYuNzg1YzAgLjYxNC4wMDUuNzg0LjAyNi43ODMuMDE0IDAgLjA3LS4wNzMuMTI0LS4xNjIuNTI0LS44NjUgMS41MDgtMS40NzggMi42NS0xLjY1LjI3NS0uMDQyIDEtLjA0NyAxLjMzMi0uMDA5Ljc5LjA5IDEuNDUxLjMxNiAxLjk0LjY2NC4yMi4xNTcuNTU3LjQ5My43MTQuNzEzLjQyLjU5Mi42OSAxLjQxMi44MDggMi40NjQuMDc0LjY2My4wODQgMS4yMTUuMDg1IDQuNTc4djMuMjU4aC0zLjUzNnYtMi45ODZjMC0yLjk3LS4wMS0zLjQ3NC0uMDc0LTMuOTA4LS4wOS0uNjA2LS4zMTQtMS4wODItLjYzNC0xLjM0Mi0uMzk1LS4zMjItMS4wMjktLjQzNy0xLjcwMy0uMzA5LS44NTguMTYzLTEuMzU1Ljc1LTEuNTIzIDEuNzk3LS4wNzYuNDcxLS4wODQuODQ1LS4wODQgMy44MzR2Mi45MTRIOS4zNTN6Ii8+PC9zdmc+)](https://www.linkedin.com/in/gideon-phiri22/)

## Author

- **Gideon Phiri**
- _Software Engineer_
- _[gideonphiri032@gmail.com](mailto:gideonphiri032@gmail.com)_

## Course Instructor

- **Marcellous Simeon**
- _UoPeople Course Instructor_

---

##

I look forward to assisting you and ensuring your experience with this project is successful and enjoyable!

[Back to top](#top)
