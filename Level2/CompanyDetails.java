/* Company and Departments (Composition)
Description: A Company has several Department objects, and each department contains Employee objects. Model this using composition, where deleting a company should also delete all departments and employees.
Tasks:
Define a Company class that contains multiple Department objects.
Define an Employee class within each Department.
Show the composition relationship by ensuring that when a Company object is deleted, all associated Department and Employee objects are also removed.
Goal: Understand composition by implementing a relationship where Department and Employee objects cannot exist without a Company.*/
import java.util.ArrayList;
import java.util.List; 

class Employee{
    private String name;
    private String id;
    private String designation;

    Employee(String name,String id,String designation){
        this.name = name;
        this.id = id;
        this.designation = designation;
    }

    public String getName(){
        return name;
    } 

    public String getId(){
        return id; 
    }

    public String getDesignation(){
        return designation;
    }

    public void viewEmployeeDetails(){
        System.out.println("Employee name : "+name);
        System.out.println("Employee id : "+id);
        System.out.println("Employee Role : "+designation);
    }
}
class Department{
    private String dname;
    private List<Employee> employees;

    Department(String name){
        this.dname = name;
        this.employees = new ArrayList<>();
    }

    public String getDname(){
        return dname;
    }

    public void addEmployees(Employee employee){
        employees.add(employee);
        System.out.println(employee.getName()+" work in "+getDname()+" Department.");
    }
    
    public void showDepartmentDetail(){
        System.out.println("All employee in "+getDname()+" Department :");
        for(Employee employee:employees){
            System.out.println(employee.getName());
        }
        System.out.println();
        
    }
} 
class Company{
    String companyName;
    private List<Department> departments;

    Company(String companyName){
        this.companyName = companyName;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department department){
        departments.add(department);
    }
    public List<Department> getDepartments() {
        return departments;
    }
    public void showCompanyDetails(){
        System.out.println(companyName+" have following department: ");
        for(Department department : departments){
            System.out.println(" -"+department.getDname());
        }
        System.out.println();
    } 
    
}
public class CompanyDetails {
    public static void main(String[] args){
        Company company = new Company("ABC");

        Department department1 = new Department("HR");
        Department department2 = new Department("Sales");
        Department department3 = new Department("IT");

        company.addDepartment(department1);
        company.addDepartment(department2);
        company.addDepartment(department3);
        company.showCompanyDetails();

        Employee employee1 = new Employee("Rishika Bisht", "E01", "Software Engineer");
        Employee employee2 = new Employee("Robart Jain", "E02", "Manager");
        Employee employee3 = new Employee("Olivia Dsuaza", "E03", "Senior Analyst");
        Employee employee4 = new Employee("Urmila Rathod", "E04", "Intern");
        Employee employee5 = new Employee("Pratham Raj", "E05", "Analyst");

        department1.addEmployees(employee4);
        department1.addEmployees(employee2);
        department1.showDepartmentDetail();

        department2.addEmployees(employee5);
        department2.showDepartmentDetail();

        department3.addEmployees(employee1);
        department3.addEmployees(employee3);
        department3.showDepartmentDetail();
    }
}
