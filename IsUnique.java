// Jesus Rodriguez
// 2/28/2020
// ITC 115 Winter2020
/*	Write a method called isUnique that accepts an array of integers as a parameter and returns
 *  a boolean value indicating whether or not the values n the array are unique
 *  (true for yes, false for no). 
 * 	The values in the list are considered unique if there is no pair of 
 * 	values that are equal . For example, if passed an array containing 
 *  [3, 8, 12, 2, 9, 17, 43, -8, 46], your method should return true, but if passed
 * 	[4, 7, 3, 9, 12, -47, 3, 74], your method should return false because the value 3 appears twice. 
 */

// Test your method from the main.
// Hint: You will need a nested for loop to solve this.

import java.util.Arrays;
import java.util.Scanner;
public class IsUnique {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);		// Constructs a new scanner
		System.out.print("Enter length of array: ");	// Tells to enter the length of the array
		int arraylength = console.nextInt();			// The value entered by the user is saved in the variable arraylength
		int[] numbers = new int [arraylength];			// Create an array. Its length is the value enter by the user
		int[] unique = setArray(numbers);				// Assigns the value of the method setArray with parameter numbers to variable unique
		
        System.out.println("The uniquenes is: " + isUnique(unique) );	// Prints the String "The uniqueness is :" plus the boolean value of the isUnique method
	
	}
	public static int[] setArray(int[] set) {			// Method setArray with an integer array as parameter
		Scanner console = new Scanner(System.in);		// Construct a new scanner
		for (int i = 0; i < set.length ; i++) {			// Loop to enter and save the values of the array set
			System.out.print("Enter number: ");			// It save the values from index 0 to the length of the array. 
			set[i] = console.nextInt();
		}
		System.out.println(Arrays.toString(set));		// Prints the array visually
		return set;										// Returns the values set in the array
						
	}
	 public static boolean isUnique(int[] array){		// Boolean method is unique with an array as parameter
	        for (int i = 0; i < array.length -1; i++){	 
	            for(int j = i + 1;j < array.length; j++){ // Check the values of the array
	                if(array[i] == array[j]){			  // If one value of the i loops is repeated on the j loop 
	                    return false ;					  // Returns the value false 
	                }
	            }
	        }
	        return true;								// No value is repeated returns true
	    }
}
