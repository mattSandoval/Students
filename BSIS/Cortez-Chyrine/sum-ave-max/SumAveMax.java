/**
* Java implementation of a queue using array.
* For demo purpose, should hold a maximum of 10 integers.
*
* @author  Cortez, Chyrine A.
* @link    github.com/cortezchyrine
* @version 0.1
* @since   [10/05/2016]
*/


package cortez;
import java.util.*;
public class SumAveMax {

	static int[] array;
	static int arraysize;
	static int sum;
	static int max = 0;
	static double average;
	 
	static public void input(){
		 Scanner in = new Scanner(System.in);
		 Random rad = new Random();
		 
		 System.out.print("Enter an array size: ");
		 arraysize = in.nextInt();
		 array = new int[arraysize];
		 for (int i=0; i < arraysize; i++){
			 array[i] = rad.nextInt(1000);
		 
			 System.out.print(array[i]);
			 System.out.println();
			
		 }
	 }
	 
	static public void max() {
		for(int a = 0; a < arraysize; a++){
			if(array[a] > max)
				max = array[a];
		}
		System.out.println("\nMax = " + max);
	}
	
	static public void sum(){
		for(int a = 0; a < arraysize; a++){
			sum = sum + array[a];
		}
		System.out.println("\nSum = " + sum);
	}

	static public void average() {
		 average = sum / arraysize;
		 System.out.println("\nAverage = " + average);
		 
	}


	public static void main (String[] args){
	 
		 input();
		 sum();
		 average();
		 max();
	 }
}
