/* E-Commerce Platform
Description: Develop a simplified e-commerce platform:
Create an abstract class Product with fields like productId, name, and price, and an abstract method calculateDiscount().
Extend it into concrete classes: Electronics, Clothing, and Groceries.
Implement an interface Taxable with methods calculateTax() and getTaxDetails() for applicable product categories.
Use encapsulation to protect product details, allowing updates only through setter methods.
Showcase polymorphism by creating a method that calculates and prints the final price (price + tax - discount) for a list of Product.*/
package com.practiceproblems;
public class ECommercePlatform {
    public static void main(String[] args) {
        Electronics electronics = new Electronics("P3845", "Smart Watch", 2000, 10,18);
        electronics.productDetail();
        System.out.println();
        Clothing clothing = new Clothing("P2556", "Dress", 1000, 5, 3);
        clothing.productDetail();
        System.out.println();
        Groceries groceries = new Groceries("P8942", "Grocery", 5000, 15,8);
        groceries.productDetail();
    }
}
abstract class Product{
    private String productId;
    private String name;
    private double price;

    Product(String productId,String name,double price){
        this.productId = productId;
        this.name = name;
        this.price =price;
    }

    public String getProductId(){
        return productId;
    }
    
    public String getName(){
        return name;
    }
    
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract double calculateDiscount();
    
    public void productDetail(){
        System.out.println("Product Id : "+productId);
        System.out.println("Prduct name : "+ name);
        System.out.println("Price : "+price);
    }
}

interface Texable{
    public double calculateTax(double pice, double productTax);    
    public void getTaxDetails();
}

class Electronics extends Product implements Texable{
    private int discount;
    private double productTax;

    Electronics(String productId, String name, double price, int discount,double productTax){
        super(productId, name, price);
        this.discount = discount;
        this.productTax = productTax;
    }

    public int getDiscount(){
        return discount;
    }

    public double productTax(){
        return productTax;
    }

    @Override
    public double calculateDiscount() {
        return getPrice()*(discount/100);
    }

    @Override
    public double calculateTax(double price,double productTax){
        return price +(price*(productTax/100));
    }

    @Override
    public void getTaxDetails(){
        System.out.println("Taxable Amount : "+(getPrice()-calculateDiscount()+calculateTax(getPrice(),productTax)));
    }

    @Override
    public void productDetail(){
        super.productDetail();
        System.out.println("Discount : "+discount);
        System.out.println("Tax :"+productTax);
        getTaxDetails();
    } 
}
class Clothing extends Product implements Texable{
    private int discount;
    private double productTax;

    Clothing(String productId, String name, double price, int discount,double productTax){
        super(productId, name, price);
        this.discount = discount;
        this.productTax = productTax;
    }

    public int getDiscount(){
        return discount;
    }

    public double productTax(){
        return productTax;
    }

    @Override
    public double calculateDiscount() {
        return getPrice()*(discount/100);
    }

    @Override
    public double calculateTax(double price,double productTax){
        return price +(price*(productTax/100));
    }

    @Override
    public void getTaxDetails(){
        System.out.println("Taxable Amount : "+(getPrice()-calculateDiscount()+calculateTax(getPrice(),productTax)));
    }

    @Override
    public void productDetail(){
        super.productDetail();
        System.out.println("Discount : "+discount);
        System.out.println("Tax :"+productTax);
        getTaxDetails();
    } 
}
class Groceries extends Product implements Texable{
    private int discount;
    private double productTax;

    Groceries(String productId, String name, double price, int discount,double productTax){
        super(productId, name, price);
        this.discount = discount;
        this.productTax = productTax;
    }

    public int getDiscount(){
        return discount;
    }

    public double productTax(){
        return productTax;
    }

    @Override
    public double calculateDiscount() {
        return getPrice()*(discount/100);
    }

    @Override
    public double calculateTax(double price,double productTax){
        return price +(price*(productTax/100));
    }

    @Override
    public void getTaxDetails(){
        System.out.println("Taxable Amount : "+(getPrice()-calculateDiscount()+calculateTax(getPrice(),productTax)));
    }

    @Override
    public void productDetail(){
        super.productDetail();
        System.out.println("Discount : "+discount);
        System.out.println("Tax :"+productTax);
        getTaxDetails();
    } 
}