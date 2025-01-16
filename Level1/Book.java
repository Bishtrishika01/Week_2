class Book{
	private String title;
	private String author;
	private double price;
	
	public Book(String title, String author, double price){
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public void displayDetail(){
		System.out.println("Title of Book : "+title);
		System.out.println("Author name : "+ author);
		System.out.println("Price of Book : "+price);
	}
}
public class HandleBookDetails{	
	public static void main(String[] args){
		Book obj = new Book("The Alchemist", "By Paul Coella",3000);

		
		System.out.println("--Book Details--");
		System.out.println("Book  : ");
		obj.displayDetail();
	}
}