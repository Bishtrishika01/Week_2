/*Library Management System
Description: Develop a library management system:
Use an abstract class LibraryItem with fields like itemId, title, and author.
Add an abstract method getLoanDuration() and a concrete method getItemDetails().
Create subclasses Book, Magazine, and DVD, overriding getLoanDuration() with specific logic.
Implement an interface Reservable with methods reserveItem() and checkAvailability().
Apply encapsulation to secure details like the borrower’s personal data.
Use polymorphism to allow a general LibraryItem reference to manage all items, regardless of type.*/
package com.practiceproblems;

public class LibraryManagementSystem {
    public static void main(String[] args) {
       
        LibraryItem book = new Book(1,"Let us c ","Student1");
        LibraryItem magazine = new Magazine(2," Times of India","Student2");
        LibraryItem dvd = new DVD(3,"Blue ray","Student3");

        LibraryItem [] library = {book,magazine,dvd};

        for(LibraryItem libraryItem : library){
            libraryItem.getItemDetails();
            
            if(libraryItem instanceof Reservable){
                Reservable reservable= (Reservable) libraryItem;
                System.out.println("Available : "+reservable.checkAvailability());
                reservable.reserveItem("Student2");
                System.out.println("Available after reservation : "+reservable.checkAvailability());
            }
            System.out.println("***************************************************");
        }
    }
}
abstract class LibraryItem {
    int itemId;
    String title;
    String author;

    LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getTitle() {
        return title;
    }

    public void setTittle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    abstract int getLoanDuration();

    void getItemDetails(){
        System.out.println("ItemId : "+itemId);
        System.out.println("Tittle  : "+title);
        System.out.println("Author : "+author);
    }

}

interface Reservable {
    void reserveItem(String browPersonName);
    boolean checkAvailability();
 }

class Book extends LibraryItem implements Reservable{

    private boolean isAvailable;
   
    Book(int itemId, String title, String author) {
        super(itemId, title, author);
        this.isAvailable = true;
    }
   
    @Override
    int getLoanDuration(){
        return 7;
    }
 
    @Override
    public void reserveItem(String browPersonName){
        if(isAvailable){
            isAvailable=false;
            System.out.println("The person reserved Book : "+browPersonName);
        }
        else{
            System.out.println("Magazine is currently unavailable");
        }
    }
    
    @Override
    public boolean checkAvailability(){
        return isAvailable;
    }
}

class Magazine extends LibraryItem implements Reservable {
    private boolean isAvailable;
  
    Magazine(int itemId, String title, String author) {
        super(itemId, title, author);
        this.isAvailable = true;
    }
   
    @Override
    public int getLoanDuration() {
        return 7; 
    }
    // overriding the method of interface
    @Override
    public void reserveItem(String browPersonName) {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("The person reserved Magazine : " + browPersonName);
        } else {
            System.out.println("Magazine is currently unavailable.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}

class DVD extends LibraryItem implements Reservable {
    private boolean isAvailable;

    DVD(int itemId, String title, String author) {
        super(itemId, title, author);
        this.isAvailable = true;
    }

    
    @Override
    public int getLoanDuration() {
        return 2;
    }

    @Override
    public void reserveItem(String browPersonName) {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("The person reserved DVD: " + browPersonName);
        } else {
            System.out.println("DVD is currently unavailable.");
        }
    }
    
    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}
