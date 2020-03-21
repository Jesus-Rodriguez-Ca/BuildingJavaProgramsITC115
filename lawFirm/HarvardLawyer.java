package lawFirm;

// Creates a subclass HarvardLawer from the superclass Lawyer
public class HarvardLawyer extends Lawyer {
	
	// Modifies the value of the method getVacationDays from the superclass adds three more days of vacation
	public int getVacationDays() {
		return super.getVacationDays() + 3;
	}
	
	// Modifies the value of the method getVacationForm from the superclass to print pink 4 times
	public String getVacationForm() {
	
		//	return super.getVacationForm() + super.getVacationForm() + super.getVacationForm() + super.getVacationForm();
		return super.getVacationForm() + "4x" ; 
    }
	
	// Modifies the value getSalary from the superclass so Harvard lawyers make 20% more money than regular lawyers
	public double getSalary() {
        return super.getSalary() * 1.2;
}
}
