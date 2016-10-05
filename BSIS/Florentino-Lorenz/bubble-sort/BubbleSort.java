/**
* BUBBLE SORT is based on the idea of repeatedly comparing pairs of 
* adjacent elements, then switching positions if they exist in the wrong order.
*
* @author  [Lorenz C. Florentino]
* @link    [github.com/lorenzhahaha]
* @version [1.1]
* @since   [05 October 2016]
*/

package bubblesort;
import java.util.Scanner;
import java.util.Random;

public class BubbleSort {
	
	public static void main(String[] args){
		int array[], size, x, y, swap;
		
		Scanner input = new Scanner (System.in);
		Random rand = new Random();
		
		System.out.print("*------------ BUBBLE SORT ------------*\n\n");
		System.out.print("Enter array size to sort: ");
		size = input.nextInt();
		array = new int [size];
		
		System.out.print(size + " random numbers generated.");
		System.out.print("\n\nRandom numbers: ");
		
		for (x=0 ; x<size ; x++){
			array[x] = rand.nextInt(1000);
			System.out.print(array[x] + " ");
		}
		
		for (x=0 ; x<size-1 ; x++){
			for (y=0 ; y<size-x-1 ; y++){
				
				if (array[y] > array[y+1]){
					swap = array[y];
					array[y] = array[y+1];
					array[y+1] = swap;
				}
			}
		}
		
		System.out.print("\nSorted number: ");
		for (x=0 ; x<size ; x++){
			System.out.print(array[x] + " ");
		}
		
		System.out.print("\nBubble Sorting ... Done!");
	}
}
