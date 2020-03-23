package library;

public class CD extends Item{

	public CD(int number, String title) {
		super(number, title);
	}
	public void play() {
		System.out.println("You can play me to hear the book");
	}
}
