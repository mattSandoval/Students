/**
* BINARY SEARCH is a Divide and Conquer algorithm that compares the item with the middle element of a sorted (ascending) array. 
* Each step, the size of array is reduced to half until one single element remain and a match is found.
*
* @author  [your full name here]
* @link    [full github url]
* @version [version number]
* @since   [last updated dd/mm/yyyy]
*/

import java.util.*; // note: imports all classes inside java.util
import java.util.Random;
	public class BinarySearch {

		static int array[], index, size, search;

		public static void main(String[] args) {

			Scanner input = new Scanner(System.in);
			Random rand = new Random();

			System.out.print("Enter array size: ");
			size = input.nextInt();
			array = new int[size];

			System.out.println(size + " random numbers generated.");
			
			for (int i = 0; i < array.length; i++) {
				array[i] = rand.nextInt(1000);
				// TODO: use nextInt() to assign random numbers (range of 1000) to array index
			}
			
			// TODO: call bubbleSort method to sort the generated random numbers
			System.out.println();
			
			System.out.print("Enter number to find: ");
			search = input.nextInt();
			index = binarySearch(array, search); 
			// note: assign the search result to array index where it was found	
		
			
			if (index != -1) {
				System.out.println("FOUND: " + search + " is at " + "array["+index+"]");
			}
			else {
				System.out.println("NOT FOUND: " + search + " is not in the array.");
			}

		}

		static int binarySearch(int[] numbers, int find) { // note: @param array[], search

			int left, right, middle;
			left = 0;
			right = numbers.length - 1;
			while (left <= right) {
				middle = left + (right - left) / 2;
				if (numbers[middle] == find) {
					return middle;
				} else if (find < numbers[middle]) {
					right = middle - 1;
				} else { // if numbers[middle] < find
					left = middle + 1;
				}
			}
			return -1; // note: exit loop if not found

		}
		
		static int bubbleSort(int[] arr) {

			// TODO: sort the random array first before searching

		}

	}
