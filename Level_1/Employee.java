class EmployeeManagament{
    static String companyName="IT Company";
    final int employeeId; 
    static int totalEmployee=0;
    String employeeName;
    String designation;

    EmployeeManagament(String employeeName,int employeeId,String designation){
        this.employeeName = employeeName;
        this.employeeId = employeeId;
        this.designation = designation;
        totalEmployee++;
    }

    static int getdisplayTotalEmployees(){
        return totalEmployee;
    }

    public void displayEmployeeDetails(){
        System.out.println("Company Name : "+companyName);
        System.out.println("Employee Name : "+employeeName);
        System.out.println("Employee Id : "+employeeId);
        System.out.println("Total Employee : "+getdisplayTotalEmployees());
    }
}
public class Employee {
    public static void main(String[] args){
        EmployeeManagament obj = new EmployeeManagament("Rishika", 11, "Software Engg");
        
        if(obj instanceof EmployeeManagament){
            System.out.println("Object is Instance of Employee Managament Class");
            obj.displayEmployeeDetails();
        }
       else{
        System.out.println("Object is not a Instance of Employee Managament Class");
       }
    }
}
