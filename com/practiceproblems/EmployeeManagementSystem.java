/*Employee Management System
Description: Build an employee management system with the following requirements:
Use an abstract class Employee with fields like employeeId, name, and baseSalary.
Provide an abstract method calculateSalary() and a concrete method displayDetails().
Create two subclasses: FullTimeEmployee and PartTimeEmployee, implementing calculateSalary() based on work hours or fixed salary.
Use encapsulation to restrict direct access to fields and provide getter and setter methods.
Create an interface Department with methods like assignDepartment() and getDepartmentDetails().
Ensure polymorphism by processing a list of employees and displaying their details using the Employee reference.*/
package com.practiceproblems;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("FE893", "Rishika Bisht",50000, 10000);
        fullTimeEmployee.assignDepartment("IT");
        fullTimeEmployee.displayDetails();

        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("PE001", "Jonny Negi", 20000, 12, 5000);
        partTimeEmployee.assignDepartment("Sales");
        partTimeEmployee.displayDetails();
    }
}
abstract class Employee{
    private  String employeeId;
    private String name;
    private double baseSalary;

    Employee(String employeeId,String name,double baseSalary){
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getEmployeeId(){
        return employeeId;
    }

    public String getName(){
        return name;
    }

    public double getBaseSalary(){
        return baseSalary;
    }

    public abstract double calculateSalary();

    public void displayDetails(){
        System.out.println("Employee Name : "+name);
        System.out.println("Emoployee Id : "+ employeeId);
        System.out.println("Base Salary : "+baseSalary);
    }
}
interface Department{
    public void assignDepartment(String departmentName);
    public void getDepartmentDetails();
}
class FullTimeEmployee extends Employee implements Department{
    private double bonus; 

    FullTimeEmployee(String employeeId,String name,double baseSalary,double bonus){
        super(employeeId,name,baseSalary);
        this.bonus = bonus;
    }

    public double getBonus(){
        return bonus;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary()+bonus;
    }
    private String departmentName;

    @Override
    public void assignDepartment(String departmentName) {
      this.departmentName = departmentName;
    }

    public void getDepartmentDetails(){
        System.out.println("Assigned department : " + departmentName);
    }
    
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Bonus provided : "+bonus);
        getDepartmentDetails();
        System.out.println("Final salary : "+calculateSalary());
        System.out.println();
    }
}
class PartTimeEmployee extends Employee implements Department{
    private int workingHours;
    private double salary;

    PartTimeEmployee(String employeeId,String name,double baseSalary,int workingHours,double salary){
        super(employeeId, name, baseSalary);
        this.workingHours = workingHours;
        this.salary=salary;
    }
    
    public int getWorkingHours(){
        return workingHours;
    }

    public double getSalary(){
        return salary;
    }

    public double calculateSalary(){
        return getBaseSalary() + (workingHours*salary);
    }
    String departmentName;
    public void assignDepartment(String departmentName) {
        this.departmentName = departmentName;
      }
  
      public void getDepartmentDetails(){
          System.out.println("Assigned department : " + departmentName);
      }
      
      @Override
      public void displayDetails(){
          super.displayDetails();
          getDepartmentDetails();
          System.out.println("Final salary : "+calculateSalary());
      }
}