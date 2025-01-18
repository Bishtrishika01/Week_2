class BookDetail{
	String title;
	String author;
	double price;
	
	//Default Const
	BookDetail(){
		title = "The Great Gatsby";
		author = "F.Scott Fitzgerald";
		price = 500;
	}
	
	//Parameterized
	BookDetail(String title,String author,double price){
		this.title = title;
		this.author = author;
		this.price = price;
	}
	public void displayDetails(){
		System.out.println("Book Details");
		System.out.println("Book Title : " + title);
		System.out.println("Author name : " + author);
		System.out.println("Price in Rupees : " + price);
	}
}
public class Book{
	
	public static void main(String args[]){
		
		BookDetail obj1 = new BookDetail();
		System.out.println("Book 1 : ");
		obj1.displayDetails();
		
		BookDetail obj2 = new BookDetail("1984", "Georage Orwell", 750);
		System.out.println("Book 2 : ");
		obj2.displayDetails();
		
	}
}