//Jesus Rodriguez 
//2/27/2020
//ITC 115 Winter2020
/*Write a static method isPowerOfTwo that takes an integer n as an argument, 
* and that returns true if n is a power of two, and otherwise false. 
* If n is zero or negative, return false. Note that isPowerOfTwo(1) 
* should return true, since 2^0 =1
*/

public class IsPowerOfTwo2 {
	public static void main(String[] args) {
		isPowerofTwo(0);     //Calls the method isPowerOfTwo

	}
	public static void isPowerofTwo(int n) {  
		if (n<=0) {				//If n is 0 or negative is false
			System.out.print("False");
		}else if(n==1) {		//If n is equal to one print True since 2^0=1
		System.out.print("True");
		}else if(n%2 ==0) { 	//If the reminder of n and 2 is 0 is power of two
		System.out.print("True");
	}else {						//Any other number is not power of two
		System.out.print("False");
	}
}
}


