package library;

public class Magazine extends Book {

	public Magazine(int number, String title) {
		super(number, title);	
	}
	public void images() {
		System.out.println("You can see images");
	}
	public double pay() {
		return 1.00;
	}
}
