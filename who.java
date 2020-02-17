//Jesus Rodriguez
//2/17/2020
//ITC 115 Winter 2020
/* 
 * Write a method called boyGirl that accepts a Scanner
 * that is reading its input from a file containing a series
 * of names followed by integers. The names alternate between boy's 
 * names and girl's names. Your method should compute the absolute difference
 * between the sum of the boy's integers and the sum the girl's integers.
 * The input could end with either a boy or girl; you may not assume that it
 * contains an even number of names. For example, if the input file contains the following:
 * Erick 3 Rita 7 Tanner 14 Jillin 13 Curtis 4 Stefanie 12 Ben 6
 * then the method should produce the following console output , since the boy's sum is 27
 * and the girl's sum is 32.
 * 4 boys, 3 girls
 * Difference between boy's and girl's sums: 5
  */

import java.io.*;
import java.util.*;

public class who {

	public static void main(String[] args) 
		throws FileNotFoundException{					//Avoid the exception FileNotFoundException
		Scanner input = new Scanner (new File("boysgirls.txt")); // Open the file boysgirls.txt
			
			
		boyGirl(input);									//Calls the method boyGirl
		}
	
	public static void boyGirl(Scanner input) {
	 	int boys = 0;
	    int boySum = 0;									//Declaring variables
	    int girls = 0;
	    int girlSum = 0;
	    
	    while(input.hasNext()) {    	//Condition while to get the values of boys and then do a sum
	        input.next();
	        boys++;
	        boySum += input.nextInt();
	        
	        if(!input.hasNext())    
	            break;
	        
	        input.next();				//Condition while to get the values of girls and then do a sum
	        girls++;
	        girlSum += input.nextInt();
	    }
	    
	    System.out.println(boys + " boys, " + girls + " girls");
	    System.out.println("Difference between boys' and girls' sums: " +  //Prints out the values. 
	        Math.abs(boySum - girlSum));

}
}
