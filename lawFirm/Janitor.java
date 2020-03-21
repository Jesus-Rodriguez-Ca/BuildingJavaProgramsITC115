package lawFirm;

// Creates a subclass Janitor from the superclass employee
public class Janitor extends Employee {
	
	// Modifies the value of the method getHours from the superclass to two times more
	public int getHours() {
		return super.getHours() *2;
	}
	// Modifies the value of the method getSalary from the superclass resting 10,000
	public double getSalary() {
		return super.getSalary() - 10000;
	}
	
	// Modifies the value of the method getVacationDays from the superclass to half the vacation days
	public int getVacationDays() {
		return super.getVacationDays() /2 ;
	}
	
	// Add a new method so far exclusive for Janitor
	public void Clean() {
		System.out.println("Workin' for the man");
	}
}
