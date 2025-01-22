/*Problem 1: School and Students with Courses (Association and Aggregation)
Description: Model a School with multiple Student objects, where each student can enroll in multiple courses, and each course can have multiple students.
Tasks:
Define School, Student, and Course classes.
Model an association between Student and Course to show that students can enroll in multiple courses.
Model an aggregation relationship between School and Student.
Demonstrate how a student can view the courses they are enrolled in and how a course can show its enrolled students.
Goal: Practice association by modeling many-to-many relationships between students and courses.*/
import java.util.ArrayList;
import java.util.List;

class Student{
    private String name;
    private String stuId;

    Student(String name, String stuId){
        this.name = name;
        this.stuId =stuId;
    }

    public String getName(){
        return name;
    }

    public String getStuId(){
        return stuId;
    }

    public void showStudentDetails(){
        System.out.println("Student Detail: ");
        System.out.println("Student name : "+name);
        System.out.println("Student Id : "+stuId);
        System.out.println();
    }
}
class Course{
    private String courseName;
    private List<Student> students;

    Course(String courseName){
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    public String getCourseName(){
        return courseName;
    }

    public void addStudent(Student student){
        students.add(student);
        System.out.println(student.getName()+" enroll for "+getCourseName()+" course.");
        System.out.println();
    }

    public List<Student> getStudents(){
        return students;
    }

    public void showCourseDetail(){
        System.out.println("Name of student who enrolled for "+getCourseName()+" : ");
        for(Student student: students){
            System.out.println(student.getName()+" "+student.getStuId());
        }
        System.out.println();
    }
}
class School{
    String schoolName;
    private List<Student> students;

    School(String schoolName){
        this.schoolName = schoolName;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public List<Student> getStudents(){
        return students;
    }

    public void showSchoolDetail(){
        System.out.println("Name of all the student in "+schoolName+" :");
        for(Student student : students){
            System.out.println(student.getName()+" "+student.getStuId());
        }
        System.out.println();
    }
}
public class SchoolDeails {
    public static void main(String[] args){
        School school = new School("ABC School");

        Student student1 = new Student("Rishika Bisht", "STU01");
        Student student2 = new Student("Vivek Sahu", "STU02");
        Student student3 = new Student("Pratham Raj", "STU03");
        Student student4 = new Student("Suraj Patel", "STU04");

        school.addStudent(student1);
        school.addStudent(student2);
        school.addStudent(student3);
        school.addStudent(student4);
        school.showSchoolDetail();

        
        Course course1 = new Course("Mathematic");
        Course course2 = new Course("Science");
        Course course3 = new Course("English");

        course1.addStudent(student1);
        course1.addStudent(student2);
        course1.addStudent(student3);
        course1.addStudent(student4);
        course1.showCourseDetail();

        course2.addStudent(student4);
        course2.addStudent(student3);
        course2.addStudent(student2);
        course2.showCourseDetail();

        course3.addStudent(student1);
        course3.showCourseDetail();

    }
}