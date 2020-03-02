// Jesus Rodriguez
// 2/28/2020
// ITC 115 Winter 2020

/*	Write a method called isSorted that accepts an array of real numbers as a 
 *  parameter and returns true if the list is in sorted (nondecreasing) order and false otherwise. 
 *	For example, if arrays named list1 and list2 store [16.1, 12.3, 22.2, 14.4] and 
 *	[1.5, 4.3, 7.0, 19.5, 25.1, 46.2]
 *	respectively, the calls isSorted(list1) and isSorted(list2) should return
 *  false and true respectively. Assume the array has at least one element. 
 *  A one-element array is considered to be sorted. 
 */

// Test you methods from main
// Do not use built in sorting methods. Implement your own, or will no get credit for this assignments. 

import java.util.*;
public class isSorted {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);		// Constructs a new scanner
		System.out.print("Enter length of array: ");	// Tells to enter the length of the array
		int arraylength = console.nextInt();			// The value entered by the user is saved in the variable arraylength
		double[] numbers = new double [(int) arraylength];			// Create an array. Its length is the value enter by the user
		setArray(numbers);								// Calls setArray method. The parameter set is fill with the value of the array numbers on the main method
		isSorted(numbers);								// Calls isSorted method. The parameter sort is fill with the value of the array numbers on the main method
	}
	public static void setArray(double[] set) {			// Method setArray with an integer array as parameter
		Scanner console = new Scanner(System.in);		// Construct a new scanner
		for (int i = 0; i < set.length; i++) {			// Loop to enter and save the values of the array set
			System.out.print("Enter number: ");			// It save the values from index 0 to the length of the array. 
			set[i] = console.nextDouble();
		}
		System.out.println(Arrays.toString(set));				// Prints ] to close the array visually
	}
	public static void isSorted(double[] sort) {			// Method isSorted with an integer array as parameter
		boolean increasing= false, decreasing = false;	// Declare variables increasing and decreasing with boolean values.
		for(int i= 0; i< sort.length -1; i++) {			// Loop to see the values in the array
			if (sort[i] < sort[i + 1]) {					// If number value is less that the number plus 1 increasing is true
				increasing = true;						// Example, 1 < 1 + 1  = True | 2 < 2 + 1= True | 3 < 3 + 1 =True
			}
			else if (sort[i] > sort[i+1]) {				// If the number is greater than number + 1 increasing is false
				decreasing = true;						// Example,  1 > 1 + 1 = False | 2 > 2 + 1 = False | 3 > 3 + 1 = False
			}
		}
		if(increasing == true && decreasing == false) {
		System.out.print("True, the array is ordered in increasing order.");
	}
		else if(increasing == false && decreasing == true) {
		System.out.print("False, the array is order in decreasing order.");
	}
		else if (increasing == true && decreasing == true) {
			System.out.print("The array is not ordered");//If sort is increasing and decreasing at the same time means that the array is not ordered at all. 
		}
		else if (increasing == false && decreasing == false) {	// If the array has just one value or all the values are the same is still order in increasing order
			System.out.print("True, the array is ordered in increasing order.");
		}
		

		}
}
