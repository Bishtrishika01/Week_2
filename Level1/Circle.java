class Circle{
	double radius;
	public Circle(double radius){
		this.radius = radius;
	}
	
	public double areaOfCircle(double radius){
	    double area = Math.PI * Math.pow(radius,2);
		return area;
	}
	public double circumferenceOfCircle(double radius){
		double circumference = 2 * Math.PI * radius;
        return circumference;		
	}
	
	public void display(){
		System.out.println("Area of Circle : "+areaOfCircle(radius));
		System.out.println("Circumference of Circle : "+circumferenceOfCircle(radius));
	}
	public static void main(String[] arg){
		Circle circle = new Circle(20);
		System.out.println("---Circle---");
		circle.display();
	}
}