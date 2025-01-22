/*University with Faculties and Departments (Composition and Aggregation)
Description: Create a University with multiple Faculty members and Department objects. Model it so that the University and its Departments are in a composition relationship (deleting a university deletes all departments), and the Faculty members are in an aggregation relationship (faculty can exist outside of any specific department).
Tasks:
Define a University class with Department and Faculty classes.
Demonstrate how deleting a University also deletes its Departments.
Show that Faculty members can exist independently of a Department.
Goal: Understand the differences between composition and aggregation in modeling complex hierarchical relationships*/
import java.util.ArrayList;
import java.util.List;


class Faculty{
    private String name;
    private String id;

    Faculty(String name, String id){
        this.name = name;
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public String getId(){
        return id;
    }

    public void showFacultyDetail(){
        System.out.println("Faculty Name : "+getName());
        System.out.println("Faculty Id"+ getId());
    }
}
class Department{
    private String departmentName;
    private List<Faculty> facultys;

    Department(String departmentName){
        this.departmentName = departmentName;
        this.facultys = new ArrayList<>();
    }

    public String getDepartmentName(){
        return departmentName;
    }

    public void addFaculty(Faculty faculty){
        facultys.add(faculty);
        System.out.println(faculty.getName()+" with id "+faculty.getId()+" work in "+departmentName);
        System.out.println();
    }

    public void showDepartmentDetail(){
        System.out.println("Name of all faculty in "+getDepartmentName()+" :");
        for(Faculty faculty: facultys){
            System.out.println(faculty.getName()+" with id "+faculty.getId());
        }
        System.out.println();
    }
}
class University{
    String universityName;
    private List<Department> departments;
    
    University(String universityName){
        this.universityName = universityName;
        this.departments = new ArrayList<>();
    }

    public String getUniversityName(){
        return universityName;
    }

    public void addDepartment(Department department){
        departments.add(department);
        System.out.println(department.getDepartmentName());
        System.out.println();
    }

    public List<Department> departments(){
        return departments;
    }

    public void showUniversityDetail(){
        System.out.println("University Name : "+getUniversityName());
        System.out.println();
        System.out.println("Department available in university : ");
        for(Department department:departments){
            System.out.print("/n"+department.getDepartmentName());
        }
    }
}
public class UnversityDetails {
    public static void main(String[] args){
        University university = new University("ABC College");

        Department department1 = new Department("Civil Engineering Department");
        Department department2 = new Department("Mechanical Engineering Department");
        Department department3 = new Department("Computer Science Engineering Department");

        Faculty faculty1 = new Faculty("Olivia", "F11");
        Faculty faculty2 = new Faculty("Lauaren", "F12");
        Faculty faculty3 = new Faculty("Jane", "F21");
        Faculty faculty4 = new Faculty("John", "F22");
        Faculty faculty5 = new Faculty("Sunny", "F31");
        Faculty faculty6 = new Faculty("Jasmine", "F32");

        university.showUniversityDetail();
        university.addDepartment(department1);
        university.addDepartment(department2);
        university.addDepartment(department3);
        
        department1.showDepartmentDetail();
        department1.addFaculty(faculty1);
        department1.addFaculty(faculty2);

        department2.showDepartmentDetail();
        department2.addFaculty(faculty3);
        department2.addFaculty(faculty4);

        department3.showDepartmentDetail();
        department3.addFaculty(faculty5);
        department3.addFaculty(faculty6);
    }
}
