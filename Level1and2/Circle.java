import java.util.*;

class Circle{
	double radius;
	
	public Circle(){
		radius = 20;
	}
	
	Circle(double radius){
		this.radius = radius;
	}
	
	public double areaOfCircle(){
		double area = Math.PI * Math.pow(radius,2);
		return area;
	}
	
	public double circumfrenceOfCircle(){
		double circumfrence = 2 * Math.PI * radius;
		return circumfrence;
	}
	
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Circle circle1 = new Circle();
		System.out.println("Area : "+circle1.areaOfCircle());
		System.out.println("Circumference : "+circle1.circumfrenceOfCircle());
		
		System.out.println("Enter a radius of circle whose area and circumfrence need to calculate : ");
		double r = sc.nextDouble();
		Circle circle2 = new Circle(r);
		System.out.println("Area : "+circle2.areaOfCircle());
		System.out.println("Circumference : "+circle2.circumfrenceOfCircle());
	}
}