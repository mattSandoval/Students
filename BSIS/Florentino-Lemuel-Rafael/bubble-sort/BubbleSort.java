/**
* BUBBLE SORT is based on the idea of repeatedly comparing pairs of 
* adjacent elements, then switching positions if they exist in the wrong order.
*
* @author  [@lemlemz22]
* @link    [full github url]
* @version [version number]
* @since   [last updated 5/10/2016]
*/

/** UPDATED Bubble SORT by Lemuel Rafael C. Florentino (October 5, 2016) */
import java.util.*;
public class BubbleSort {

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
