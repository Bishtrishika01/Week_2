import java.util.Scanner;

class Product {
    
    public static double discount = 0.0;
    private static int idCounter = 100;

    public final String productName;
    private final double price;
    private final int quantity;
    public final int productID;

    Product(String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = idCounter++;
    }

    public static void updateDiscount(double discount) {
        Product.discount = discount;
    }

    public static int priceAfterDiscount(double price, double discount) {
        return (int) (price - (price * discount / 100));
    }
    
    public void display(){
        if (this instanceof Product) {
            System.out.println("Product ID: " + this.productID);
            System.out.println("Product Name: " + this.productName);
            System.out.println("Price: " + priceAfterDiscount(this.price, discount));
            System.out.println("Quantity: " + this.quantity);
        }
        else {
            System.out.println("The object is not an instance of the Product class.");
        }
    }
}

public class ShoppingCartSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the product name: ");
        String productName = sc.nextLine();
        System.out.println("Enter the price: ");
        double price = sc.nextDouble();
        System.out.println("Enter the quantity: ");
        int quantity = sc.nextInt();
        
        Product product1 = new Product(productName, price, quantity);
        
        System.out.println("Product details before discount update: " + Product.discount);
        product1.display();

        System.out.println("Enter the discount percentage: ");
        double discount = sc.nextDouble();

        Product.updateDiscount(discount);

        System.out.println("Product details after discount update: " + Product.discount);
        product1.display();

    }
}
