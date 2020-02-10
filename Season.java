//Jesus Rodriguez
//ITC 115 Winter 2020
// 2/09/2020

/* Write a method called season that takes as parameters two integers representing
 * a month and day and returns a String indicating the season for that month and day.
 * Assume that the month is specified as an integer between 1 and 12 (1 for January,
 * 2 for February, and so on)and that the day of the month is a number between 1 and 31.
 * If the date falls between 12/16 and 3/15 the method should return "winter". 
 * If the date falls between 3/16 and 6/15, the method should return "spring" .
 * If the date falls between 6/16 and 9/15, the method should return "summer".
 * If the date falls between 9/16 and 12/15, the method should return "fall".
 */

public class Season {

	public static void main(String[] args) {
		season(1, 16);		//Calls the method season
		
	}
	
	public static void season(int month , int day) { // The method contains two parameter representing months and days
		
		String months[] = {" ","January", "February","March",  // An array containing the months of the year
				"April", "May", "June", "July", "August", 	   // It contains an empty space so the number enter	
				"September","October", "November", "December"}; // matches with month 
		
		if(month < 3 || (month ==3 && day <=15) || (month == 12 && day >= 16) ) { // conditions to print Winter
			
			//It uses the array months and the parameter month to print the corresponding month.
			System.out.print( months[month] + " " + day + " the season of the year is : Winter");
		}
		
		// conditions to print Spring
		else if( month < 6 || (month == 6 && day <= 15) || (month == 3 && day >= 16 )) {
			System.out.print( months[month] + " " + day + " the season of the year is: Spring"); 
		}
		
		
		// conditions to print Summer
		else if ( month < 9 || (month ==9 && day <= 15) || (month == 6 && day >=16 )) {
			System.out.print( months[month] +" " + day + " the season of the year is: Summer");
		}
		
		
		//if none of the conditions are true Fall will be printed.
		else {											
			System.out.print( months[month] + " " + day + " the season of the year is: Fall");
		}
		
	}
	
}
