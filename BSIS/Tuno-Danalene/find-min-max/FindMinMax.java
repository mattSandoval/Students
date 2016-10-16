/* @author [Danalene Laxamana Tuno]
* @link    [https://github.com/dandanalene]
* @version [10.7]
* @since   [last updated 10/16/2016]
*/
public class FindMinMax
{
	public static void main(String[] args) 
	{
		int[] numbers = { 88, 33, 55, 23, 64, 123 };
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for (int d = 0; d < numbers.length; d++) 
		{
			if (numbers[d] < min)
				min = numbers[i];
			if (numbers[d] > max)
				max = numbers[i];
		}
		System.out.println("Smallest number is " + min);
		System.out.println("Lagest number is " + max);
	}
}
