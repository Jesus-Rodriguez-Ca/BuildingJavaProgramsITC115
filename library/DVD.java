package library;

public class DVD extends CD {

	public DVD(int number, String title) {
		super(number, title);
	}
	public void playImages() {
		System.out.println("You can play me to watch a video of the book!");
	}
	public boolean isReserved() {
		return false;
	}
	public int daysOverDue() {
		return 3;
}
	public String getItem() {
		return "03/21/2020";
	}
	public String dueDate() {
		return "03/38/2020";
	}
	public double pay() {
		return 1.50;
	}
}
