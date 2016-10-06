/*
* @author: Adrian Villafuerte
* @since: 06/10/2016
*/
import java.util.*;

public class findMinMax {

	int [] upe;
	int size, capacity;

		public findMinMax (int size) {
			capacity = size;
			upe = new int [capacity];
	}

	public static void main (String [] args) {

		Scanner in = new Scanner(System.in);
		Random rand = new Random();

			int max = Integer.MIN_VALUE;
			int min = Integer.MAX_VALUE;
			int userSize;

			System.out.println();
			System.out.print("Please enter size of array: ");
			userSize = in.nextInt();
			System.out.println();

		findMinMax Eydrian = new findMinMax (userSize);

			for (int i = 0; i < userSize; i++) {
				Eydrian.upe[i] = 1+(rand.nextInt(150));
	
				if (min > Eydrian.upe[i]) {
					min = Eydrian.upe[i];
			}
				if (max < Eydrian.upe[i]) {
					max = Eydrian.upe[i];
			}

				System.out.print("[" + Eydrian.upe[i] + "] ");
		}
			System.out.println();
			System.out.println();
	
			System.out.println("The largest number is " + max);
			System.out.println("The smallest number is " + min);
	}
}
