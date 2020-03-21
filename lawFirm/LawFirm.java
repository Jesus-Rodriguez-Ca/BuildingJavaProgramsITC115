package lawFirm;

public class LawFirm {

	public static void main(String[] args) {
		// Creates a table
		System.out.print("Employee"  + "\t" + "Form" + "\t" + "Hours" + "\t" + "Salary" + "\t" + "\t" + "Vacation" + "\t" + "Special Skill");
		System.out.println();
		System.out.println("=======================================================================================");
		
		// Creates an employee object and calls its methods
		System.out.print("Lawyer" + "\t");
	        Employee employee1 = new Employee();
	        System.out.print("\t" + employee1.getVacationForm() + "\t" );
	        System.out.print(employee1.getHours() + "\t");
	        System.out.print(employee1.getSalary() + "\t");
	        System.out.print("\t" + employee1.getVacationDays());
	        System.out.println();
	     
	     // Creates a Janitor object and calls its methods
	        System.out.print("Janitor" + "\t");
	     Janitor employee2 = new Janitor();
	        System.out.print("\t" + employee2.getVacationForm() + "\t");
	        System.out.print(employee2.getHours() + "\t");
	        System.out.print(employee2.getSalary() + "\t");
	        System.out.print("\t" + employee2.getVacationDays() + "\t");
	        System.out.print("\t");
	        employee2.Clean();
	     
	      // Creates a Lawyer object and calls its methods
	      Lawyer employee3 = new Lawyer();
	      System.out.print("Lawyer" + "\t");
	        System.out.print("\t" + employee3.getVacationForm() + "\t");
	        System.out.print(employee3.getHours() + "\t");
	        System.out.print(employee3.getSalary() + "\t");
	        System.out.print("\t" + employee3.getVacationDays() + "\t");
	        System.out.print("\t");
	        employee3.Sue();
	       
	       // Creates a Harvard Lawyer object and call its methods
	        HarvardLawyer employee4 = new HarvardLawyer();
		      System.out.print("Hardvard" );
		        System.out.print("\t" + employee4.getVacationForm() + "\t");
		        System.out.print(employee4.getHours() + "\t");
		        System.out.print(employee4.getSalary() + "\t");
		        System.out.print("\t" + employee4.getVacationDays() + "\t");
		        System.out.print("\t");
		        employee4.Sue();
		        System.out.println();
	    }

	}


