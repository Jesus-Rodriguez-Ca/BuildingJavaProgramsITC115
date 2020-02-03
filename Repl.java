//Jesus Rodriguez
// 2/03/2020
//ITC 115

/* Write a method called repl that accepts a String and a number of repetitions
 * as parameters and returns the String concatenated that many times. For example, 
 * the call repl("hello", 3) should return "hellohellohello". If the number of
 *  repetitions is zero or less, the method should return an empty string. 
 */

import java.util.*; 	 //This library is to use Scanner
public class Repl {

	public static void main(String[] args) {
		//Declarations of variables.
	String word;    
	int times;
	String output;
		//Introduction of what the program will do.
	System.out.println("This program will print a word as many times as you want.");
		//Interaction with the user.
	Scanner console = new Scanner(System.in);
	System.out.print("Enter a word: ");
		//Assigns the value enter by the user to the variable word. This is the word that will be printed.
	word = console.nextLine();
	System.out.println();
		//interaction with the user.
	System.out.print("Enter how many times you want the word to repet: ");
		//Assigns the value enter by the user. This will be the times that the user wants the word to print. 
	times = console.nextInt();
		//Assigns the value of the method repl to the variable output.
	output= repl(word, times);
	System.out.println();
		/*This is the output of the program. Here the values that the user enter are 
		concatenated with the output value to send a more understandable output.*/
	System.out.print("The method repl(\"" + word + "\", " +times +
			") returns \"" + output + "\".");

	}
	public static String repl(String word,int times) { 	//Method with the parameters of the word and the times that will be printed.
		String empty = " ";		//The variable empty is used to send a empty space if the values times are zero or negative. 
		if (times<=0) { 		// Condition, if times is a negative number or zero the variable empty will be printed.
			return empty;
		}else {					// if times is greater that zero the loop will start.
			for (int i=1; i<=times; i++) {  //The loop will iterate as many times as the value of "times"
				empty=empty + word;  // The variable empty will receive the value of the variable word as many times as the value of the variable "times". 
			
			}
		}
		return empty;
		}	
}
