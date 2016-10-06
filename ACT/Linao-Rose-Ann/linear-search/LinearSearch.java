/**
* @author  Rose Ann D. Linao
* @link    https://github.com/RoseAnnLinao
* @version 1.2
* @since   06/10/2016
*/

import java.util.Scanner;
import java.util.Random;

public class LinearSearch {

	public static void main(String[] args) {

		int i, sukat, hanap, array[];

		Scanner input = new Scanner(System.in);
		Random rand = new Random();

		System.out.print("Enter array size: ");
		sukat = input.nextInt();
		array = new int[sukat];		

		System.out.print("Enter number to find: ");
		hanap = input.nextInt();

		for (i = 0; i < sukat; i++) {
			array[i] = rand.nextInt(1000);
			if (array[i] == search) {
				System.out.println("FOUND: " + hanap + " is at " + "array["+i+"]");
				break;
			} 			
		}

		if (i == sukat) {
			System.out.println("NOT FOUND: " + hanap + " is not in the array.");
		}

	}

}
