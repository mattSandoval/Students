/**
* @author  Rose Ann D. Linao
* @link    https://github.com/RoseAnnLinao
* @version 1.2
* @since   06/10/2016
*/

public class FindMinMax {
	public static void main(String[] args) {
		int[] numbers = { 45, 37, 88, 23, 92, 83 };
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (int a = 0; a < numbers.length; a++) {
			if (numbers[a] < min)
				min = numbers[a];
			if (numbers[a] > max)
				max = numbers[a];
		}
		System.out.println("Smallest number is " + min);
		System.out.println("Lagest number is " + max);
	}
}
