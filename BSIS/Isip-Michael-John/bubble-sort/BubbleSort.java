/**
* BUBBLE SORT is based on the idea of repeatedly comparing pairs of 
* adjacent elements, then switching positions if they exist in the wrong order.
*
* @author  [Michael John Isip]
* @link    [https://github.com/mj-isip23]
* @version [version number]
* @since   [09-28-2016]
*/

// TODO: import Scanner and Random from Java library
import java.util.Scanner;
import java.util.Random;

public class BubbleSort {

	public static void main(String[] args) {

		int array[], size, x, y, swap;

		Scanner input = new Scanner(System.in);
		Random rand = new Random();

		System.out.print("Enter array size to sort: ");
		// TODO: use nextInt() to assign keyboard input as array size
                size = input.nextInt();
		array = new int[size];

		System.out.println();
		System.out.println(size + " random numbers generated.");

		for (x = 0; x < size; x++) {
        		// TODO: use nextInt() to assign random numbers (range of 1000) to array index
                    array[x] = rand.nextInt(1000);
			// TODO: print unsorted numbers separated by space
                    System.out.print(array[x] + "\t");
		}

		System.out.println();
		// note: compare each from the first index until largest number is moved to the last index.
		for (x = 0; x < size-1; x++) { // note: loop until before the end of array
			for (y = 0; y < size-x-1; y++) { // note: will not loop to numbers already sorted
				if (array[y] > array[y+1]) { // note: compare adjacent numbers which is greater
					swap = array[y]; // note: swap positions...
					array[y] = array[y+1]; // note: smaller will be move to the left
					array[y+1] = swap; // note: larger will move to the right
				}
			}
		}

		System.out.println();

		System.out.println("Bubble Sorting... Done!");
		
		// TODO: print sorted numbers separated by space
                for(x=0; x<size; x++){
                    System.out.print(array[x] + "\t");
                }
	}

}
