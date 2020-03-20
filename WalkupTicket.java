package inheritance;

import java.text.NumberFormat;
	// Creates an object walk-up ticket extended from the ticket object
	public class WalkupTicket  extends Ticket{
	
	// Gets the value from the method of its parent
	    public WalkupTicket(int ticketNumber) {
	        super(ticketNumber);
	    }
	    
	// Gets the value 50 as the price of walk-up ticket   
	    public double getPrice() {
	        return 50;
	    }
	// Returns the the number of ticket and its cost   
	    public String toString() {
	        return "Ticket # " + getNumber() + " costs " + NumberFormat.getCurrencyInstance().format(getPrice());
	}
}

