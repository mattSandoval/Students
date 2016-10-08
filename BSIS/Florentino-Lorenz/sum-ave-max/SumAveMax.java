/** 
* - Accepts keyboard input to set array size.
* - Generate random numbers accordingly.
* - Get the sum, average, and maximum value
*
* @author  [Lorenz C. Florentino]
* @link    [github.com/lorenzhahaha]
* @version [1.1
* @since   [08 October 2016]
*/

package SumAveMax;
import java.util.Scanner;
import java.util.Random;

public class SumAveMax {
	int array[], sum=0, max=0;
	
	public void show(){
		int x=0;
		
		System.out.print("\nRandom numbers: ");
		for (int i=0 ; i<array.length ; i++){
			System.out.print(array[i] + " ");
			x += 1;
				if (x==0){
					System.out.println();
					x=0;
				}
		}
		System.out.println();
	}
	
	public void getsum(){
		System.out.print("\nThe sum of the random numbers generated is ");
		for (int i=0 ; i<array.length ; i++){
			sum += array[i];
		}
		System.out.print(sum + ".\n");
	}
	
	public void getave(){
		double average = sum/array.length;
		
		System.out.print("The average of the random numbers generated is " + average + ".\n");		
	}
	
	public void getmax(){
		System.out.print("The maximum/highest random number generated is ");
		max = array[0];
		
		for (int i=1 ; i<array.length ; i++){
			if (array[i] > max){
				max = array[i];
			}
		}
		System.out.print(max + ".\n");
	}
	
	public static void main (String[] args){
		int size;
		Random rand = new Random();
		Scanner input = new Scanner (System.in);
		SumAveMax storage = new SumAveMax();
	
		System.out.print("*------------------ SUM - AVE - MAX ------------------*\n\n");
		System.out.print("How many random numbers do you want? ");
		size = input.nextInt();
		System.out.print(size + " random numbers will be generated ...");
		storage.array = new int[size];
		
			for (int i=0 ; i<size ; i++){
				storage.array[i] = rand.nextInt(1000);
			}
		System.out.println();
		
		storage.show();
		storage.getsum();
		storage.getave();
		storage.getmax();
	}
}
