/** 
* - Accepts keyboard input to set array size.
* - Generate random numbers accordingly.
* - Get the sum, average, and maximum value
*
* @author  [Jessa Mae Wabinga]
* @link    [full github url]
* @version [version number]
* @since   [last updated 17/10/2016]
*/

import java.util.*;
import java.util.Random;
public class SumAveMax 
{
	static Scanner c = new Scanner (System.in);
	public static void main (String [] args)
	{
		
		int total = 0, ave = 0, large = 0;
		System.out.println("Please enter array size: ");
		int n = c.nextInt();
		int[] numbers = new int [n];
				
				for (int i = 0; i < numbers.length; i++)
				{
					numbers[i] = (int) (Math.random()*1000 + 1 );
				}
		System.out.println("Numbers Generated: "+ Arrays.toString(numbers));
		
		for (int j=0; j<numbers.length; j++)
		{
			total = total + numbers [j];
		}
		System.out.println ("Total = " +total);
		ave = total/numbers.length;
		System.out.println ("Average = " +ave);
		
		for (int i=0; i<numbers.length; i++)
		{
			if (numbers[i] > large)
				large = numbers[i];
		}
		System.out.println("Largest number is: " +large);
	}

}
