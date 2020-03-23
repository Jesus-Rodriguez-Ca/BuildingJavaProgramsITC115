// Jesus Rodriguez
// 3/23/2020
// ITC 115 Winter 2020

/* Design and code  a Library system of objects, including books, magazines, video DVDs and CDs
 * (feel free to add other objects)
 * Include an abstract superclass for the common information in a library item,  such as item number
 * and title and functionality such as reserved, checkedIn,  daysLate, finesAccrued (50 cents for 
 * each day late).  Add additional instance variables or methods as needed to model the characteristics
 * of each class.   
 * The classes you design should follow an OOP inheritance hierarchy,  demonstrate encapsulation by 
 * choosing appropriate access modifiers, and should have constructors, fields and methods.
 * Method overriding should be demonstrated in subclasses.
 * In addition, each class should implement a Printable interface that provides a standardized way 
 * to print a summary of the library item’s data. 
 
 * For full credit be sure to add a client class to test your classes.
 * Helpful tip: draw the inheritance hierarchy on paper before starting to code it. 
 * You may want to loosely (or precisely) follow the UML guidelines if familiar with them. 
 */




package library;

public class Library {

	public static void main(String[] args) {
		Item i1 = new Book(1254, "El Quijote: Miguel de Cervantes ");
		Item i2 = new Magazine(1512, "Animal Farm: Geroge Orwell        ");
		Item i3 = new CD(2014, "Odysseum: Homer                   ");
		Item i4 = new DVD(1541, "Decamaron: Giovanni Boccaccio     ");
		
		
		System.out.println("Number" + "\t" +  "Title" +"\t" +"\t" + "\t" +"\t" +"\t" +"Reserved" + "\t" + "Rent" + "\t"+ "\t"+"Due" + "\t" + "\t"+"Late" + "\t"+ "\t" + "Pay");
		System.out.println("=======================================================================================================================");
		System.out.println(i1.toString());
		System.out.println(i2.toString());
		System.out.println(i3.toString());
		System.out.println(i4.toString());
		
	
	}
	

}
