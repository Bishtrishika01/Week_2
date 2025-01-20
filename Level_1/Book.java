class BookManagementSystem{
    static String libraryName;
    String author;
    String title;
    final String isbn;
    
    public BookManagementSystem(String author,String title,String isbn){
        this.author = author;
        this.title = title;
        this.isbn = isbn;
    }
    public static String displayLibraryName(String libraryName){
        return libraryName;   
    }
    public void displayDetails(){
        System.out.println("Library Name : "+ displayLibraryName(libraryName));
        System.out.println("Book Title : "+title);
        System.out.println("Author Name : "+author);
        System.out.println("ISBN : "+isbn);
    }
}
public class Book {
    public static void main(String args[]){
        BookManagementSystem obj = new BookManagementSystem("Jane Austen","Pride and Prejustice","457-675-5343");
        BookManagementSystem.libraryName = "Random Library";
        if(obj instanceof BookManagementSystem){
            System.out.println("obj is instance of class BookManagementSystem");
            
            obj.displayDetails();
        }
        
    }
}