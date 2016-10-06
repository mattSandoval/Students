/**
* LINEAR SEARCH checks each item in a collection from start to end until a match is found. 
*
** @author  Gaviola, Mariella R.
* @link    https://github.com/Mariella18
* @version 1.5
* @since   06/10/2016
*/

import java.util.Scanner;
import java.util.Random;

public class LinearSearch {

	public static void main(String[] args) {

		int j, size, search, array[];

		Scanner input = new Scanner(System.in);
		Random rand = new Random();

		System.out.print("Enter array size: ");
		size = input.nextInt();
		array = new int[size];		

		System.out.print("Enter number to find: ");
		search = input.nextInt();

		for (i = 0; j < size; j++) {
			array[j] = rand.nextInt(1000);
			if (array[j] == search) {
				System.out.println("FOUND: " + search + " is at " + "array["+j+"]");
				break;
			} 			
		}

		if (j == size) {
			System.out.println("NOT FOUND: " + search + " is not in the array.");
		}

	}

}
