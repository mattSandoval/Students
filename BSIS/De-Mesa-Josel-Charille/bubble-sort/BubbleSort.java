/*
 * @author	[Josel Charille De Mesa]
 * @link	[@chadenggg]
 * @version	[Version number]
 * @since	[last updated 12/10/16]
 * 
 */

package BENGBENG;

import java.util.*;

public class BubbleSorting {

	public static void main(String[] args) {

		int array[], size;
		int a, b;
		int swap;

		Scanner input = new Scanner(System.in);
		Random rand = new Random();

		System.out.print("Enter array size to sort: ");
		size = input.nextInt();
		array = new int[size];

		System.out.println();
		System.out.println(size + " random numbers generated.");

		for (a = 0; a < size; a++) {
			array[a] = rand.nextInt(1000);
			System.out.print(" " + array[a]);
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
		System.out.println("Bubble Sorting... Done!");
		System.out.print("SORTED ARRAY: ");
		for (int x=0; x<size; x++){
			System.out.print(array[x] + " ");
		}
	}

}
