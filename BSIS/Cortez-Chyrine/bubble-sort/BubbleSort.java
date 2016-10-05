/**
* Java implementation of a queue using array.
* For demo purpose, should hold a maximum of 10 integers.
*
* @author  Cortez, Chyrine A.
* @link    github.com/cortezchyrine
* @version 0.1
* @since   [10/05/2016]
*/

import java.util.*;
public class BubbleSort {

	public static void main(String[] args) {

		int array[], size, x, y, swap;

		Scanner input = new Scanner(System.in);
		Random rand = new Random();

		System.out.print("Enter array size to sort: ");
		size = input.nextInt();
		
		array = new int[size];

		System.out.println();
		System.out.println(size + " random numbers generated.");

		for (x = 0; x < size; x++) {
			array[x] = rand.nextInt(1000);
			System.out.println(array[x] + " ");
			
		}

		System.out.println();
		
		for (x = 0; x < size-1; x++) { 
			for (y = 0; y < size-x-1; y++) {
				if (array[y] > array[y+1]) { 
					swap = array[y]; 
					array[y] = array[y+1];
					array[y+1] = swap; 
				}
			}
		}

		System.out.println();

		System.out.println("Bubble Sorting... Done!");
		
		for (x=0; x<size; x++)
			System.out.println(array[x]);
		
	}

}
