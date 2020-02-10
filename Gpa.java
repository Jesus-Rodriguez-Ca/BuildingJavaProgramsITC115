/*  Jesus Manuel Rodriguez Castro
    ITC115 Winter 2020
    2/09/2020
  Write a method called printGpa 
*/

/* Write a method called printGpa that accepts a Scanner
for the console as a parameter and calculates a student's grade point average. 
The user will type a line of input containing the student's name, then a number
that represents the number of scores, followed by that many integer scores.Here are two examples dialogue:

Enter a student record: Maria 5 72 91 84 89 78
Maria's grade is 82.8

Enter a student record: Jordan 4 86 71 62 90
Jordan's grade is 72.25*/

import java.util.*;
public class Gpa {
	 public static void main(String[] args){
	        printGpa();
	    }
	    public static void printGpa(){
	    	System.out.print("This program will give you your grade.");
	    	System.out.println();
	        Scanner console = new Scanner(System.in);
	        
	        System.out.print("Enter your name: ");
	        String name = console.nextLine();
	        
	        System.out.println();
	        
	        System.out.print("Enter number of grades that you have to calculate: ");
	        int scores = console.nextInt();
	        int grade = 0;
	        for (int i = 1 ; i <= scores; i++) {
	            System.out.print(i + " : "  );
	            int next  = console.nextInt();
	            grade = grade + next;
	    }
	        console.close();
	        System.out.println();
	        
	        System.out.format(name + "'s " + "grade is : " + (double)grade / scores);
}
}
