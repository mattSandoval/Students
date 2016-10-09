/* @author [Danalene Laxamana Tuno]
* @link    [https://github.com/dandanalene]
* @version [10.7]
* @since   [last updated 10/9/2016]
*/
import java.util.Scanner;
import java.util.Random;

public class LinearSearch {

	public static void main(String[] args) {

		int d, size, search, array[];

		Scanner input = new Scanner(System.in);
		Random rand = new Random();

		System.out.print("Enter array size: ");
		size = input.nextInt();
		array = new int[size];		

		System.out.print("Enter number to find: ");
		search = input.nextInt();

		for (d = 0; d < size; i++) {
			array[d] = rand.nextInt(1000);
			if (array[d] == search) {
				System.out.println("FOUND: " + search + " is at " + "array["+d+"]");
				break;
			} 			
		}

		if (d == size) {
			System.out.println("NOT FOUND: " + search + " is not in the array.");
		}

	}

}
