package inheritance;

import java.text.NumberFormat;

 	// Creates an object Advance ticket its parent 
public class AdvanceTicket extends Ticket{
	// Declares field days as private
	private int days; 
	
	// Get number of ticket and the day that the ticket was bought
	public AdvanceTicket(int ticketNumber,int days) {
		   
        super(ticketNumber);
        this.days = days;
    } 
	// Condition to know what the price of the ticket will be
    public double getPrice() {
   
        if(days>=10)
        return 30;
        else
        return 40;
    }
    
    // Returns number of the ticket and its cost
    public String toString() {
        return "Ticket # : " + getNumber() +" costs " + NumberFormat.getCurrencyInstance().format(getPrice());
    }
}

