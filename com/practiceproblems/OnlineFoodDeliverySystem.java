/*Online Food Delivery System
Description: Create an online food delivery system:
Define an abstract class FoodItem with fields like itemName, price, and quantity.
Add abstract methods calculateTotalPrice() and concrete methods like getItemDetails().
Extend it into classes VegItem and NonVegItem, overriding calculateTotalPrice() to include additional charges (e.g., for non-veg items).
Use an interface Discountable with methods applyDiscount() and getDiscountDetails().
Demonstrate encapsulation to restrict modifications to order details and use polymorphism to handle different types of food items in a single order-processing method.*/
package com.practiceproblems;
import java.util.ArrayList;
import java.util.List;

public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        List<FoodItem> order = new ArrayList<>();
        order.add(new VegItem("Chole Kulche", 200, 2));
        order.add(new NonVegItem("Chicken Curry", 300, 1));
        order.add(new VegItem("Dosa", 70, 3));
        order.add(new NonVegItem("Mutton", 400, 2));

        double discountRate = 0.20; // 20% discount
        for (FoodItem item : order) {
            System.out.println(item.getItemDetails());

            if (item instanceof Discountable) {
                Discountable discountable = (Discountable) item;
                discountable.applyDiscount(discountRate);
                System.out.println(discountable.getDiscountDetails());
            }

            System.out.println("********************************************************************");
        }
    }
}
interface Discountable {
    void applyDiscount(double discountRate);

    String getDiscountDetails();
}
abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;
    
    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
    
    public abstract double calculateTotalPrice();

    public String getItemDetails() {
        return "Item: " + itemName + ", Price: " + price + ", Quantity: " + quantity;
    }
    
    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}
class VegItem extends FoodItem implements Discountable{
    private double totalPrice;
    private double discount;
    
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
        this.totalPrice = calculateTotalPrice();
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }
    
    @Override
    public void applyDiscount(double discountRate) {
        discount = totalPrice * discountRate;
        totalPrice -= discount;
    }
    
    @Override
    public String getDiscountDetails() {
        return "Discount Applied: " + discount + ", Final Price: " + totalPrice;
    }
    
    @Override
    public String getItemDetails() {
        return super.getItemDetails() + ", Total Price: " + totalPrice;
    }
}
class NonVegItem extends FoodItem implements Discountable {
    private double totalPrice;
    private double discount;
    
    private static final double NON_VEG_SURCHARGE = 50;

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
        this.totalPrice = calculateTotalPrice();
    }
    
    @Override
    public double calculateTotalPrice() {
        return (getPrice() + NON_VEG_SURCHARGE) * getQuantity();
    }
    
    @Override
    public void applyDiscount(double discountRate) {
        discount = totalPrice * discountRate;
        totalPrice -= discount;
    }
    
    @Override
    public String getDiscountDetails() {
        return "Discount Applied: " + discount + ", Final Price: " + totalPrice;
    }
    
    @Override
    public String getItemDetails() {
        return super.getItemDetails() + ", Total Price (with surcharge): " + totalPrice;
    }
}