/*Description: Create a hierarchy for a school system where Person is the superclass, and Teacher, Student, and Staff are subclasses.
Tasks:
Define a superclass Person with common attributes like name and age.
Define subclasses Teacher, Student, and Staff with specific attributes (e.g., subject for Teacher and grade for Student).
Each subclass should have a method like displayRole() that describes the role.
Goal: Demonstrate hierarchical inheritance by modeling different roles in a school, each with shared and unique characteristics. */
package com.hierarchicalinheritance;
 
class Person {
  String name;
  int age;
  String role;

  Person(String name, int age, String role) {
    this.name = name;
    this.age = age;
    this.role = role;
  }

  void displayRole() {
    System.out.println("Role : " + role);
    System.out.println("name of the " + role + " : " + name);
    System.out.println("Age of the " + role + " : " + age);

  }

}

class Teacher extends Person {
  String subject;

  Teacher(String name, int age, String role, String subject) {
    super(name, age, role);
    this.subject = subject;
  }

  void displayRole() {
    super.displayRole();

    System.out.println("Subject of the Teacher : " + subject);
    System.out.println("----------------------------------");
  }

}

class Student extends Person {
  String grade;

  Student(String name, int age, String role, String grade) {
    super(name, age, role);
    this.grade = grade;
  }

  void displayRole() {
    super.displayRole();
    System.out.println("Grade of the Student : " + grade);
    System.out.println("----------------------------------");
  }

}

class Staff extends Person {
  String department;

  Staff(String name, int age, String role, String department) {
    super(name, age, role);
    this.department = department;
  }

  void displayRole() {
    super.displayRole();
    System.out.println("Department : " + department);
    System.out.println("----------------------------------");
  }

}

public class SchoolSystem {
  public static void main(String[] args) {

    
    Teacher teacher = new Teacher("suraj", 35, "Teacher", "Mathematics");
    Student student = new Student("vivek", 16, "student", "10th Grade");
    Staff staff = new Staff("pratham", 40, "staff", "Administration");

    teacher.displayRole();
    student.displayRole();
    staff.displayRole();
  }
}
