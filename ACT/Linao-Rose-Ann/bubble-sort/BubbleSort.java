/**
* @author  Rose Ann D. Linao
* @link    https://github.com/RoseAnnLinao
* @version 1.2
* @since   06/10/2016
*/

import java.util.Scanner;
import java.util.Random;

public class BubbleSort {

	public static void main(String[] args) {

		int array[], a, b, c, temp;

		Scanner input = new Scanner(System.in);
		Random rand = new Random();

		System.out.print("Enter array size to sort: ");
		a = input.nextInt();
		array = new int[a];

		System.out.println();
		System.out.println(a + " random numbers generated.");

		for (b = 0; b < a; b++) {
			array[b] = rand.nextInt(1000);
			System.out.print(array[b] + " ");
		}

		System.out.println();

		for (b = 0; b < a-1; b++) {
			for (c = 0; c < a-b-1; c++) {
				if (array[c] > array[c+1]) {
					temp = array[c];
					array[c] = array[c+1];
					array[c+1] = temp;
				}
			}
		}

		System.out.println();

		System.out.println("Bubble Sorting... Done!");
		
		for (b = 0; b < a; b++) {
			System.out.print(array[b] + " ");
		}

	}

}
