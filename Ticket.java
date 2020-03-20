package inheritance;
import java.text.NumberFormat;

public abstract class Ticket{   
    private int ticketNumber;
   
    
	public Ticket(int ticketNumber) {
        this.ticketNumber = ticketNumber;
       
	}
	
    public int getNumber() {
        return ticketNumber;
    }
    
    public abstract double getPrice();
    
    
   public abstract String toString();
}