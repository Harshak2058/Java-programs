package abc1;

public class ArrayDemo2 {

	public static void main(String[] args) {
		int age[]= {20,25,30};
		for(int i=0;i<age.length;i++) //here we used .length
		System.out.println(age[i]);
			
	}

}
/*see .length is a property of Array.As here only three array values are there so it is easy to 
use index i=2 but what if 100 numbers are there and how can you say that there are 100 values.
You have to count all the values and then have to confirm there are 100 values.
SO INSTEAD OF THAT WE CAN USE arr.length PROPERTY TO SIMPLIFY THE SOLUTION
*/
