/**
* BINARY SEARCH is a Divide and Conquer algorithm that compares the item with the middle element of a sorted (ascending) array. 
* Each step, the size of array is reduced to half until one single element remain and a match is found.
*
* @author  [Sarah Mae Ponce]
* @link    [https://github.com/Saranghae08]
* @version [version number]
* @since   [06/10/2016]
*/

import java.util.*;
public class BinarySearch {
		public static void main(String [] args) {
			int[] Arr;
			int Search = 0;
			int index, a, Size;
			
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.print("Enter number of elements: ");
		Size = input.nextInt();
		Arr = new int[Size];
		
		System.out.print( "\n" + Size + " Random numbers: \n");
		for (a = 0; a < Arr.length; a++) {
			Arr[a] = rand.nextInt(100);
			System.out.print(Arr[a] + "  ");
		}
		
		System.out.print("\n\nEnter value to find: ");
		Search = input.nextInt();
		
		index = binarySearch(Arr, Search);
		if (index != -1) {
			System.out.println(Search + " is FOUND at location " + index + ".");
		}
		else  {
			System.out.println(Search + " is NOT FOUND!!");
		}
	}

		static int binarySearch(int[] data, int key) {
			int Left, Right, Mid;
			Left = 0;
			Right = data.length - 1;
			
			while (Left <= Right ) {
				Mid = (Left + Right ) / 2;
				if (data[Mid] == key) {
					return Mid;
			}
			else if (data[Mid] < key ) {
				Left = Mid + 1;
			}
			else {
				Right = Mid - 1;
			}
		}
			return -1;
	}
}
