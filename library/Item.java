package library;

import java.text.NumberFormat;

public abstract class Item
 {
	private int number;	
	private String title;  
	
	public Item(int number, String title)
	{
		 this.number = number;
		 this.title = title;
		
	 }
	
	public int getNumber() {
		return number;
	}
	public String getTitle() {
		return title;
	}
	public boolean isReserved() {
		boolean reserved = true;
		return reserved;
	}
	public String getItem() {
		return "03/23/2020";
	}
	public String dueDate() {
		return "03/30/2020";
	}
	
	public int daysOverDue() {
		return 0 ;
	}
	public double pay() {
		return 0;
	}
	
	public String toString() {
		return getNumber() + "\t" + getTitle() + "\t" + isReserved() + "\t" + "\t" +getItem() + "\t" + dueDate() + "\t" + daysOverDue() + "\t" + "\t"+ NumberFormat.getCurrencyInstance().format(pay())  ;
	}
}

	
 
 
 