/**
* BUBBLE SORT is based on the idea of repeatedly comparing pairs of 
* adjacent elements, then switching positions if they exist in the wrong order.
*
* @author  [your full name here]
* @link    [full github url]
* @version [version number]
* @since   [last updated dd/mm/yyyy]
*/

// TODO: import Scanner and Random from Java library

public class BubbleSort {

	public static void main(String[] args) {

		int array[], size, y, swap;

		Scanner input = new Scanner(System.in);
		Random rand = new Random();

		System.out.print("How many numbers are to be sorted: ");
		// TODO: use nextInt() to assign keyboard input as array size
		array = new int[size];

		System.out.println();
		System.out.println(size + " random numbers generated.");

		for (int i = 0; i < size; i++) {
			// TODO: use nextInt() to assign random numbers (range of 1000) to array index
			// TODO: print unsorted numbers separated by space
		}

		System.out.println();
		// note: compare each from the first index until largest number is moved to the last index.
		for (int i = 0; i < size-1; i++) { // note: loop until before the end of array
			for (y = 0; y < size-i-1; y++) { // note: will not loop to numbers already sorted
				if (array[y] > array[y+1]) { // note: compare adjacent numbers which is greater
					swap = array[y]; // note: swap positions...
					array[y] = array[y+1]; // note: smaller will be move to the left
					array[y+1] = swap; // note: larger will move to the right
				}
			}
		}

		System.out.println();

		System.out.println("After Sorting... Done!");
		
		// TODO: print sorted numbers separated by space
	}

}
