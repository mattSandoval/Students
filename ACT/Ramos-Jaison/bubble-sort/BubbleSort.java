/**
* BUBBLE SORT is based on the idea of repeatedly comparing pairs of 
* adjacent elements, then switching positions if they exist in the wrong order.
*
* @author  [Jaison Ramos]
* @link    [https://github.com/jan-jaison25/DSA/blob/master/BubbleSorting/src/BubbleSorting_ramos.java]
* @version [version number]
* @since   [last updated 10/10/2016]
*/

import java.util.Scanner;
import java.util.Random;

public class BubbleSorting_ramos {

	public static void main(String[] args) {

		int array[], size, a, b, swap;

		Scanner input = new Scanner(System.in);
		Random rand = new Random();

		System.out.print("Enter array size to sort: ");
		
                size = input.nextInt();
		array = new int[size];

		System.out.println();
		System.out.println(size + " random numbers activated.");

		for (a = 0; a < size; a++) {
			
			array[a] = rand.nextInt(1000);
                        
                        System.out.print(array[a]+" ");
		}

		System.out.println();
		
		for (a = 0; a < size-1; a++) { 
			for (b = 0; b < size-a-1; b++) { 
				if (array[b] > array[b+1]) { 
					swap = array[b];
					array[b] = array[b+1]; 
					array[b+1] = swap; 
				}
			}
		}

		System.out.println();

		System.out.println("Bubble Sorting... sucess!!!");
		
		
                for (a = 0; a< size; a++) {
                   System.out.print(array[a]+" ");
                }
	}

}
