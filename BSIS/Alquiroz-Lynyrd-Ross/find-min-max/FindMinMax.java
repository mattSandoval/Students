/*
* @author: Lynyrd Ross Alquiroz
* @link: https://github.com/LynyrdRoss/find-min-max
* @version: v1.2
* @since: 10/03/2016
*/

import java.util.*;

public class findMinMax {

	int [] arr;
	int size, capacity;

	public findMinMax (int size) {
		capacity = size;
		arr = new int [capacity];
	}

	public static void main (String [] args) {

		Scanner in = new Scanner(System.in);
		Random rand = new Random();

		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int userSize;

		System.out.println();
		System.out.print("Enter desired size of array: ");
		userSize = in.nextInt();
		System.out.println();

		findMinMax objClass = new findMinMax (userSize);

		for (int i = 0; i < userSize; i++) {
			objClass.arr[i] = 1+(rand.nextInt(150));

			if (min > objClass.arr[i]) {
				min = objClass.arr[i];
			}
			if (max < objClass.arr[i]) {
				max = objClass.arr[i];
			}

			System.out.print("[" + objClass.arr[i] + "] ");
		}
		System.out.println();
		System.out.println();

		System.out.println("The largest number is " + max);
		System.out.println("The smallest number is " + min);
	}
}
