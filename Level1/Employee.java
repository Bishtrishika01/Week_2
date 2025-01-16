class Employee{
	private String name;
	private String employeeId;
	private double salary;
	
	public Employee(String name, String employeeId, double Salary){
		this.name = name;
		this.employeeId = employeeId;
		this.salary = salary;
	}
	
	public void displayDetail(){
		System.out.println("Employee Name : "+name);
		System.out.println("Employee Id : "+ employeeId);
		System.out.println("Employee Salary : "+salary);
	}
	public static void main(String[] args){
		Employee employee1 = new Employee("Aman", "EM001",30000);
		Employee employee2 = new Employee("Rahul", "EM002",29000);
		Employee employee3 = new Employee("Vansh", "EM003",42000);
		Employee employee4 = new Employee("Megha", "EM004",35000);
		
		System.out.println("--Employee Detail---");
		System.out.println("Employee 1 : ");
		employee1.displayDetail();
		System.out.println("Employee 2 : ");
		employee2.displayDetail();
		System.out.println("Employee 3 : ");
		employee3.displayDetail();
		System.out.println("Employee 4 : ");
		employee4.displayDetail();
	}
}