/*Problem 1: Library and Books (Aggregation)
Description: Create a Library class that contains multiple Book objects. Model the relationship such that a library can have many books, but a book can exist independently (outside of a specific library).
Tasks:
Define a Library class with an ArrayList of Book objects.
Define a Book class with attributes such as title and author.
Demonstrate the aggregation relationship by creating books and adding them to different libraries.
Goal: Understand aggregation by modeling a real-world relationship where the Library aggregates Book objects.*/
import java.util.ArrayList;
import java.util.List;

class Book {
    String title;
    String author;
    boolean isAvailable;

    Book(String title, String author){
        this.title = title;
        this.author = author;
        this.isAvailable=true;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return title;
    }

    public void isBookAvailable() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You have successfully borrowed the book: " + getTitle());
        } else {
            System.out.println("Sorry, the book '" + getTitle() + "' is currently unavailable.");
        }
    }

    public void displayDetails(){
        System.out.println("Book Title : "+title);
        System.out.println("Author Name : "+author);
    }
}

class Library {
    String libraryName;
    public List<Book> availableBooks;

    Library(String libraryName){
        this.libraryName = libraryName;
        this.availableBooks = new ArrayList<>();
    }
    
    public String getLibraryName() {
        return libraryName;
    }

    public void availableBooks(Book book){
        availableBooks.add(book);
        System.out.println(book.getTitle() +" is Available in "+getLibraryName());
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }
   
    public void showAvailableBook(){
        System.out.println("Available Book Present in "+ getLibraryName() +" :");
        for(Book book:availableBooks){
            System.out.println(" -"+book.title+" By "+book.author);
        }
    }

    public List<Book> getAvailableBooks() {
        return availableBooks;
    }

    public void setAvailableBooks(List<Book> availableBooks) {
        this.availableBooks = availableBooks;
    }
}

public class Main{
    public static void main(String[] args){
        Book book1 = new Book("Pride and Prejustice", "Jane Austen");
        Book book2 = new Book ("1984","George Orwell");
        Book book3 = new Book ("To Kill a Mockingbird","Harper Lee");
        
        Library library1 = new Library("The Book Nuke");
        library1.availableBooks(book1);
        library1.availableBooks(book3);

        Library library2 = new Library("Reading Room");
        library2.availableBooks(book2);

        library1.showAvailableBook();
        library2.showAvailableBook();
    }
}