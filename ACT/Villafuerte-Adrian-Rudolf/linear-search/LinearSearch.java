/**
* LINEAR SEARCH checks each item in a collection from start to end until a match is found. 
*
* @author Adrian Villafuerte
* @since   6/10/2016
*/

import java.util.*;

public class LinearSearch {

	int [] upe;
	int capacity;

	public LinearSearch (int size) {
		capacity = size;
		upe = new int [capacity];
	}

	public static void main (String [] args) {

		Scanner in = new Scanner(System.in);
		Random rand = new Random();
		int found = 0;
		System.out.print("Please enter the size of array: ");
		int Size = in.nextInt();
		System.out.print("Please enter number to find (1-100): ");
		int Find = in.nextInt();
		System.out.println();

		LinearSearch Eydrian = new LinearSearch(Size);
		for (int i = 0; i < Size; i++) {
			Eydrian.upe[i] = 1+(rand.nextInt(100));

			System.out.print("[" + Eydrian.upe[i] + "] ");			
		}
		System.out.println();
		System.out.println();
			
		for (int x = 0; x < Size; x++) {
			if (Find == Eydrian.upe[x]) {
				System.out.println("The number " + Find + " is at element " + (x+1) + ".");
				found++;
			}
		}

		if (found == 0) {
			System.out.println("The number " + Find + " is not FOUND!");
		}
	}
}
