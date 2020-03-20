package inheritance;

import java.text.NumberFormat;

public class WalkupTicket  extends Ticket{
	    public WalkupTicket(int ticketNumber) {
	        super(ticketNumber);
	    }
	    public double getPrice() {
	        return 50;
	    }
	    
	    public String toString() {
	        return "Ticket # " + getNumber() + " costs " + NumberFormat.getCurrencyInstance().format(getPrice());
	}
}

