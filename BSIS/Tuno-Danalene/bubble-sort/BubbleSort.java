/* @author [Danalene Laxamana Tuno]
* @link    [https://github.com/dandanalene]
* @version [10.7]
* @since   [last updated 16/9/2016]
*/
import java.util.Scanner;
import java.util.Random;

public class BubbleSort 
	{

	public static void main(String[] args)
	{

		int array[], size, x, y, swap;

		Scanner input = new Scanner(System.in);
		Random rand = new Random();

		System.out.print("Enter array size to sort: ");
                size = input.nextInt();
		array = new int[size];

		System.out.println();
		System.out.println(size + " random numbers generated.");

		for (x = 0; x < size; x++) 
		{
			array[x] = rand.nextInt(1000);
                    	System.out.print(array[x] + "\t");
		}

		System.out.println();
		
		for (x = 0; x < size-1; x++)
		{ 
			for (i = 0; i < size-x-1; i++)
			{
				if (array[i] > array[i+1]) 
				{
					swap = array[i]; 
					array[i] = array[i+1];
					array[i+1] = swap; 
				}
			}
		}

		System.out.println();

		System.out.println("Bubble Sorting... done!");
		
                for(x=0; x<size; x++){
                    System.out.print(array[x] + "\t");
                }
	}

}
