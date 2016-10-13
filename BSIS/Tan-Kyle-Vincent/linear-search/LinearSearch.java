/**
* LINEAR SEARCH checks each item in a collection from start to end until a match is found.
/*
* @author: Kyle Vincent Q. Tan
* @link: https://github.com/elyk18
* @version: v1
* @since: 10/07/2016
*/



import java.util.*;

public class LinearSearch {

	int [] arr;
	int capacity;

	public LinearSearch (int size) {
		capacity = size;
		arr = new int [capacity];
	}

	public static void main (String [] args) {

		Scanner in = new Scanner(System.in);
		Random rand = new Random();

		int userSize, userFind;
		int found = 0;

		System.out.println();
		System.out.print("Enter the desired size of array: ");
		userSize = in.nextInt();
		System.out.print("Enter number to find (1-100): ");
		userFind = in.nextInt();
		System.out.println();

		LinearSearch objClass = new LinearSearch(userSize);

		for (int i = 0; i < userSize; i++) {
			objClass.arr[i] = 1+(rand.nextInt(100));

			System.out.print("[" + objClass.arr[i] + "] ");			
		}
		System.out.println();
		System.out.println();

		for (int x = 0; x < userSize; x++) {
			if (userFind == objClass.arr[x]) {
				System.out.println("The number " + userFind + " is at element " + (x+1) + ".");
				found++;
			}
		}

		if (found == 0) {
			System.out.println("The number " + userFind + " is not present in the array.");
		}
	}
}
