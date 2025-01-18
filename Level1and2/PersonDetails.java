/*Create a Person class with a copy constructor that clones another person's attributes.
*/
class Person{
    private String name; 
    private String address; 
    private int age;
    //Default constructer
    public Person(){
        this.name= "ABC"; 
        this.address="------"; 
        this.age=0;
    }
    //paramaterized constructer to store value
    public Person(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    } 
    
    //copy constructer
    public Person(Person person){
        this.name = person.name; 
        this.address= person.address; 
        this.age= person.age;
    }
    //returning the name of person
    public String getName() {
        return name;
    }

    //set the name of the person
    public void setName(String name) {
        this.name = name;
    }
    //returning the address of person
    public String getAddress() {
        return address;
    }

     //set the address of the person
    public void setAddress(String address) {
        this.address = address;
    }
    //returning the age of person
    public int getAge() {
        return age;
    }

     //set the age of the person
    public void setAge(int age) {
        this.age = age;
    }

     // Method to display person details
     public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }

} 

public class PersonDetails{
    public static void main(String[] args) {
        //Store bydefault set value
        Person default1=new Person(); 

        default1.displayDetails();
        
        //new object with details
        Person person1 = new Person("Rishika", "Bisht", 21); 

        //printing details of the person
        person1.displayDetails(); 

        //copy the attribute to another person
        Person person2 =new Person(person1); 

        person2.displayDetails(); 

        //set the address of second person using setters
        person2.setAddress("Bhopal"); 

        //Display the details of person2 (updated value)
        person2.displayDetails();


    }
}