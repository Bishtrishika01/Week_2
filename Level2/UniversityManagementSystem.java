/*University Management System
Description: Model a university system with Student, Professor, and Course classes. Students enroll in courses, and professors teach courses. Ensure students and professors can communicate through methods like enrollCourse() and assignProfessor().
Goal: Us association and aggregation to create a university system that emphasizes relationships and interactions among students, professors, and courses.*/

import java.util.ArrayList;
import java.util.List;

class Courses {
    private String courseName;
    private String courseCode;
    private Professors professor;
    private List<Students> students;

    public Courses(String courseName, String courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.students = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public Professors getProfessor() {
        return professor;
    }

    public void assignProfessor(Professors professor) {
        this.professor = professor;
        System.out.println(professor.getName() + " is assigned to the course " + courseName);
    }

    public void enrollStudent(Students student) {
        students.add(student);
        System.out.println(student.getName() + " enrolled in the course " + courseName);
    }

    public void showCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Code: " + courseCode);
        if (professor != null) {
            System.out.println("Professor: " + professor.getName());
        }
        System.out.println("Enrolled Students:");
        for (Students student : students) {
            System.out.println(" - " + student.getName());
        }
        System.out.println();
    }
}

class Professors {
    private String name;
    private String id;

    public Professors(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public void teachCourse(Courses course) {
        System.out.println(name + " is teaching the course: " + course.getCourseName());
    }
}

class Students {
    private String name;
    private String studentId;

    public Students(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }

    public void enrollCourse(Courses course) {
        course.enrollStudent(this);
    }
}

public class UniversityManagementSystem {
    public static void main(String[] args) {
        
        Professors professor1 = new Professors("Dr. Sanjay", "P01");
        Professors professor2 = new Professors("Dr. hema", "P02");

        Students student1 = new Students("Alisa", "S001");
        Students student2 = new Students("sachin", "S002");
        Students student3 = new Students("rahul", "S003");

        Courses course1 = new Courses("Data Structures", "CS101");
        Courses course2 = new Courses("Database Management", "CS102");

        course1.assignProfessor(professor1);
        course2.assignProfessor(professor2);

        student1.enrollCourse(course1);
        student2.enrollCourse(course1);
        student3.enrollCourse(course2);

        course1.showCourseDetails();
        course2.showCourseDetails();

        professor1.teachCourse(course1);
        professor2.teachCourse(course2);
    }
}
