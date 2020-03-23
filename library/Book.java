package library;

public class Book extends Item{

	public Book(int number, String title) {
		super(number, title);
	}
	public void read() {
		System.out.println("You have to read me");
	}
	public boolean isReserved() {
	return false;
	}
	public int daysOverDue() {
		return 2;
	}
	public String getItem() {
		return "03/24/2020";
	}
	public String dueDate() {
		return "03/29/2020";
	}
	public double pay() {
		return 1.00;
	}
}
