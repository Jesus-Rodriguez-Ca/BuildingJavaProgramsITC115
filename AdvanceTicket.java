package inheritance;

import java.text.NumberFormat;

public class AdvanceTicket extends Ticket{
	private int days;
	public AdvanceTicket(int ticketNumber,int days) {
		   
        super(ticketNumber);
        this.days = days;
    } 
    public double getPrice() {
   
        if(days>=10)
        return 30;
        else
        return 40;
    }
    public String toString() {
        return "Ticket # : " + getNumber() +" costs " + NumberFormat.getCurrencyInstance().format(getPrice());
    }
}

