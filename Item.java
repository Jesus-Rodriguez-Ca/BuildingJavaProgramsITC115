package chapter8;

import java.text.NumberFormat;
	// Create generic product
public class Item {
	// Declare private fields
	private int code;
	private String name;
	private String description;
	private double price;
	private int count;
	private double total;
	
	
	// Constructs the generic product relating fields with its parameters.
	 public Item(int code, String name, String description, int count, double price ) {
		 this.code = code;
		 this.name = name;
		 this.description = description;
		 this.price = price;
		 this.count = count; 
}
	 // Methods of the classes
	 
	 // Returns item attributes
	 public String toString() {
		 return code + "\t" + name + "\t" + description + "\t" + "\t" + count + "\t" + NumberFormat.getCurrencyInstance().format(price)  ; 
	 }
	 
	 // Returns total of price of each type of item
	 public double total() {
		 total = count * price;
		 return total;
	 }
	 
	 // Returns total with currency format as a string
	 public String getTotalPriceFormatted() 
	    {
	        String formattedPrice = NumberFormat.getCurrencyInstance().format(total);
	        return formattedPrice;
	    }
	 
	 //Return the price of each item with currency format as a string
	 public String getPriceFormatted() 
	    {
	        String formattedPrice = NumberFormat.getCurrencyInstance().format(this.price);
	        return formattedPrice;
	    }
	 
	 // Return code of the product
	 public int getCode() {
		 return code;
	 }
	 public void setCode(int code) {
		 this.code = code;
	 }
	 // Return name of the product
	 public String getName() {
		 return name;
	 }
	 public void setName(String name) {
		 this.name = name;
	 }
	 // Return description of the product
	 public String getDescription() {
		 return description;
	 }
	 public void setDescription(String description) {
		 this.description = description;
	 }
	 // Returns quantity of the product
	 public int getCount() {
		 return count;
	 }
	 public void setCount(int count) {
		 this.count = count;
	 }
	
}



