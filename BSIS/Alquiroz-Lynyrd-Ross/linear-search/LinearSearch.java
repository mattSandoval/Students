/*
* @author: Lynyrd Ross Alquiroz
* @link: https://github.com/LynyrdRoss/linear-search
* @version: v1.2
* @since: 10/03/2016
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

/**
* LINEAR SEARCH checks each item in a collection from start to end until a match is found. 
*
* @author  Renaldo Valente
* @link    https://github.com/arrowbrave
* @version 1.1
* @since   22/09/2016
*/
/*
import java.util.Scanner;
import java.util.Random;

public class LinearSearch {

	public static void main(String[] args) {

		int i, size, search, array[];

		Scanner input = new Scanner(System.in);
		Random rand = new Random();

		System.out.print("Enter array size: ");
		size = input.nextInt();
		array = new int[size];		

		System.out.print("Enter number to find: ");
		search = input.nextInt();

		for (i = 0; i < size; i++) {
			array[i] = rand.nextInt(1000);
			if (array[i] == search) {
				System.out.println("FOUND: " + search + " is at " + "array["+i+"]");
				break;
			} 			
		}

		if (i == size) {
			System.out.println("NOT FOUND: " + search + " is not in the array.");
		}

	}

}
*/
