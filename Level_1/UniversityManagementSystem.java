class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    // Getter for CGPA
    public double getCGPA() {
        return CGPA;
    }

    // Setter for CGPA
    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }
}

class PostgraduateStudent extends Student {
    public void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
    }
}

public class UniversityManagementSystem {
    public static void main(String[] args) {
        
        Student student = new Student();
        student.rollNumber = 1;
        student.name = "John";
        student.setCGPA(8.5);
        System.out.println("Roll Number: " + student.rollNumber);
        System.out.println("Name: " + student.name);
        System.out.println("CGPA: " + student.getCGPA());

        PostgraduateStudent postgraduateStudent = new PostgraduateStudent();
        postgraduateStudent.rollNumber = 2;
        postgraduateStudent.name = "Jane";
        postgraduateStudent.displayDetails();
    }
}
