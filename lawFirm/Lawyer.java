package lawFirm;

// Creates a subclass from the superclass employee
public class Lawyer extends Employee{
	
	// Modifies the value of the method getVacation from the superclass to 5 more days of vacation
	public int getVacation() {
		return super.getVacationDays()  + 5;
}
	// Modifies the value of the method getVacationForm from the superclass pink color
	public String getVacationForm() {
        return "pink";
    }
	
	// Add a new method that so far is exclusive for lawyers
	public void Sue() {
		System.out.println("I'll se you in court!");
	}

	}
