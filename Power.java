// Jesus Rodriguez
// 1/28/2020
// ITC 115 Winter 2020

/* Write a method called printPowersOfN that accepts a base and an exponent as arguments and prints each power of the base from base0 (1)
 * up to that maximum power,inclusive. For example, consider the following calls:
 * printPowerOfN(4, 3);
 * printPowerOfN(5, 6);
 * printPowerOfN(-2, 8);
 * These calls should produce the following output:
 * 1 4 16 54
 * 1 5 25 125 625 3125 15625
 * 1 -2 4 -8 16 -32 64 -128 256
 * You may assume that the exponent passed to printPowerOfN has a value of 0 or greater. (The math class may help you with this problem. 
 * If you see it, you may need to cast its result from double to int so that you don't see a .0 after each number in your output 
 * Also try to write this program without using Math class.)
 */


package chapter3;

public class Power {
	//The main method calls the printPowerOfN with two arguments
	public static void main(String[] args) {
		printPowerOfN(4, 3); 	//Call of the method printPowerOfN with its actual parameters.
		System.out.println(); 	//Print the separation within lines of output. 
		
		printPowerOfN(5,6); 	//Call of the method printPowerOfN with its actual parameters.
		System.out.println(); 	//Print the separation within lines of output. 
		
		printPowerOfN(-2, 8); 	//Call of the method printPowerOfN with its actual parameters.
		
	}
	
	public static void printPowerOfN(int num1, int num2) { 	//This is the method that I was required to build with to parameters
															//One parameter (num1) is the base and num2 is the power exponent. 
		
		for (int i = 0; i<= num2; i++) {					//In this loop I start in 0, stops in the value of num2, and increase by one each time.
		double power = Math.pow(num1, i);					//Here the variable "power" gets the value of num1 that goes to the i exponential.
		System.out.print((int) power + " ");				//Prints the value of power plus a space to separate each value.Also, I had to cast power to "int".
}
		
}
}
