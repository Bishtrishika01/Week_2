class Student{
    String stuName; 
	int rollNumber;  

	int stuMarks; 
	
	//constructor to save details of studnet
	Student(int rollNumber, String stuName, int stuMarks){
		this.stuName = stuName; 
		this.rollNumber= rollNumber; 
		this.stuMarks = stuMarks;
	}
	
	
        // Method to calculate grade
    public char calculateGrade() {
        if (stuMarks >= 90) {
            return 'A';
        } else if (stuMarks >= 75) {
            return 'B';
        } else if (stuMarks >= 50) {
            return 'C';
        } else {
            return 'F'; // Fail
        }
    }

    // Method to display student's details and grade
    public void displayDetails() {
        char grade = calculateGrade();
        System.out.println("Student Name: " + stuName);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + stuMarks);
        System.out.println("Grade: " + grade);
    }
	
}
public class StudentReport{
    public static void main(String[] args) {
        Student st = new Student(133, "Rishika Bisht", 85); 
        st.displayDetails();
    }
}