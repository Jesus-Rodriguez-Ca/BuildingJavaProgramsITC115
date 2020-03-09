// Jesus Rodriguez
// 3/09/2020
// ITC115 WINTER 2020

/*The product data should include a product code, description, price and product count. 
  In addition to the getter and setter methods, the class should implement toString and
  also a formatted output of the price (Hint: use the NumberFormat class. Here is the 
  implementation of your formattedPrice method: 
  public String getPriceFormatted() 
   {
      String formattedPrice = NumberFormat.getCurrencyInstance().format(this.price);
      return formattedPrice;
    }
 3. From the client app create the instances of 2-3 different products and use the 
 toString method to display their data.
 Optional: Keep track of the count of the products created and call the getCount 
 method to verify that it is correct. (Where could you keep track of the count of products?)
*/

package chapter8;
import java.text.NumberFormat;
import chapter8.Item;

class Main {

	public static void main(String[] args) {
		
		// Create a receipt
		
		 System.out.println("\t"+ "\t" + "Red Apple");
		 System.out.println("====================================================");
		 System.out.println("Code"  + "\t" + "Product" + "\t" + "Description" + "\t" + "Count" + "\t" + "Price" );
		 System.out.println("----------------------------------------------------");
		 
		 // Gives values to item 1 and prints its values with toString method
		 Item I1 = new Item(1050, "Chips", "Snack", 2, 1.5);
		 System.out.println(I1.toString());
		 
		 // Gives values to item 2 and prints its values with toString method

		 Item I2 = new Item(1091, "Sprit", "Drink", 9, 3.15);
		 System.out.println(I2.toString());
		 
		 // Gives values to item 3 and prints its values with toString method

		 Item I3 = new Item(0547, "Beer", "Drink", 6, 8.60);
		 System.out.println(I3.toString());
		 
		 // Prints the total of products and the total price with currency format
		 System.out.println("====================================================");
		 System.out.println("Total" +"\t"+ "\t" + "\t" + "\t" +(I1.getCount() + I2.getCount() + I3.getCount()) + "\t" + NumberFormat.getCurrencyInstance().format(I1.total() + I2.total() + I3.total()));

		 
	}
}
	
