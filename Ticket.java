package inheritance;
import java.text.NumberFormat;

// Generic ticket that will be declare later 
public abstract class Ticket{   
    private int ticketNumber;
   
    // Set field ticketnumber to the parameter ticketnumber
	public Ticket(int ticketNumber) {
        this.ticketNumber = ticketNumber;
       
	}
	// Get ticket number
    public int getNumber() {
        return ticketNumber;
    }
    // It will be implemented later in the program
    public abstract double getPrice();
    
 // It will be implemented later in the program
    public abstract String toString();
}