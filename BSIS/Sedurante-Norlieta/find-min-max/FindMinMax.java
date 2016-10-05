/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
* Find minimum and maximum number in array 
*
* SOURCE CODE: FindMinMax.java
* AUTHOR NAME: Sedurante, Norlieta  I.
* GITHUB URL: [https://github.com/lvcc-dsa/Students/BSIS/Sedurante-Norlieta/find-min-max/FindMinMax.java]
* LAST UPDATE: [10/05/2016]
*
* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
*/

public class FindMinMax {
	public static void main(String[] args) {
		int[] numbers = { 7,5,6,64,8,9,9 };
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < min)
				min = numbers[i];
			if (numbers[i] > max)
				max = numbers[i];
		}
		System.out.println("Smallest number is " + min);
		System.out.println("Lagest number is " + max);
	}
}
