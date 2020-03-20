// Jesus Rodriguez
// 3-19-2020
package inheritance;
import java.text.NumberFormat;

public class Main {
	public static void main(String args[]) {

// Creates an walk-up ticket and prints it
WalkupTicket two = new WalkupTicket(5);
System.out.println(two);

//Creates an Advance ticket and prints it
AdvanceTicket one = new AdvanceTicket(10,15);
System.out.println(one);
}
}
