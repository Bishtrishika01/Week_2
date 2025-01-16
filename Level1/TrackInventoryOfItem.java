import java.util.*;

class Item{
	private String itemCode;
	private String itemName;
	private double price;
	
	public Item(String itemCode, String itemName,double price){
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.price = price;
	}
	
	public void itemDetail(){
		System.out.println("Itemcode : "+itemCode);
		System.out.println("Item name : "+ itemName);
		System.out.println("Item Price : "+price);
	}
}
public class TrackInventoryOfItem{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Itemcode : ");
		String itemCode = sc.nextLine();
		System.out.println("Enter ItemName : ");
		String itemName = sc.nextLine();
		System.out.println("Enter Price : ");
		double price = sc.nextDouble();
		
		Item obj = new Item(itemCode,itemName,price);
		
		obj.itemDetail();
	}
}