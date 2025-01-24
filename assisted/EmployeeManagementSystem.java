package com.assisted;

class Employee{
    String name;
    String id;
    double salary;
    
    Employee(String name,String id,double salary){
        this.name = name;
        this.id = id;
        this.salary = salary; 
    }
    
    public String getName(){
        return name;
    }

    public String getId(){
        return id;
    }

    public double getSalary(){
        return salary;
    }

    public void displayDetails(){
        System.out.println("Empolyee Details : ");
        System.out.println("Name : "+name);
        System.out.println("Id : "+id);
        System.out.println("Salary"+salary);
    }
}
class Manager extends Employee{
    String role = "Manager";
    public Manager(String name,String id,double salary){
        super(name, id, salary);
    }
    @Override
    public void displayDetails(){
        System.out.println("Empolyee Details : ");
        System.out.println("Name : "+name);
        System.out.println("Id : "+id);
        System.out.println("Salary"+salary);
        System.out.println("Role : "+role);
    }
}
class Developer extends Employee{
    String role = "Developer";
    public Developer(String name,String id,double salary){
        super(name, id, salary);
    }
    @Override
    public void displayDetails(){
        System.out.println("Empolyee Details : ");
        System.out.println("Name : "+name);
        System.out.println("Id : "+id);
        System.out.println("Salary"+salary);
        System.out.println("Role : "+role);
    }
}
class Intern extends Employee{
    String role = "Intern";
    public Intern(String name,String id,double salary){
        super(name, id, salary);
    }
    @Override
    public void displayDetails(){
        System.out.println("Empolyee Details : ");
        System.out.println("Name : "+name);
        System.out.println("Id : "+id);
        System.out.println("Salary"+salary);
        System.out.println("Role : "+role);
    }
}
public class EmployeeManagementSystem {
    public static void main(String args[]){
        Employee manager = new Manager("John", "013", 50000);
        Employee developer = new Developer("Marry", "023", 60000);
        Employee intern = new Intern("Peter", "033", 20000);

        manager.displayDetails();
        developer.displayDetails();
        intern.displayDetails();
    }
}
