// Jesus Rodriguez
// 2/28/2020
// ITC 115 Winter 2020

/*Write a program that simulates an ant trying to crawl up a building
 *of height 6 steps. The ant starts on the ground, at height 0.
 *Each iteration, the ant either crawls up one step, or slips off and falls
 *all the way back to the ground. There is a 50% chance on each iteration
 *that the ant will slip. The program should keep going until the ant
 *gets to the top of the building. It should then print out the number of falls that 
 *the ant took before it finally reached the top. 
 * 
 * 
 */

package midterm;
import java.util.*;

public class Crawl {
	public static void main(String[] args) {
		Random r = new Random();	// Construct random object
		int steps = 0;				// Assigns the steps of the ant than needs to complete. Needed to star the loop
		int falls = 0;				// Assign the tries that the ant will do until reach the 6 steps
		while(steps < 6) {			// Activates the loop. It will stop when the ant reaches the 6 steps
			int crawl = r.nextInt(2); //Activates random to 50% and 50%  
			if(crawl == 1) {		// If ant crawls up 1 step 
				steps++;			// Steps are going to be added until it reaches 6
			}else {					// If crawl is zero the ant falls and starts over again
				steps=0;
				falls++;			// Tries are going to be added 
			}
		}
		System.out.print("The ant falls " + falls + " times.");
	}

}
