/**
* Java implementation of a stack using array.
* For demo purpose, should hold a maximum of 10 string values.
*
* @author  [Nicko Fernandez Reyes]
* @link    [https://github.com/samcoii22/]
* @version [version number]
* @since   [10/6/2016]
*/

mport java.util.Random;
import java.util.*;
public class BubbleSort
{
	
	public static void main(String[] args) {

		int array[], x, y, swap,size;
       
		Scanner input = new Scanner(System.in);
		Random rand = new Random();

		System.out.print("Enter array size to sort: ");
		size = input.nextInt();// TODO: use nextInt() to assign keyboard input as array size
		array = new int[size];

		System.out.println();
		System.out.println(size + " random numbers generated.");

		for (x = 0; x < size; x++)
		{
			array[x] = (int)(Math.random()*1000 + 1);/// TODO: use nextInt() to assign random numbers (range of 1000) to array index
			System.out.println(array[x]);// TODO: print unsorted numbers separated by space
		}
	
		

		System.out.println();
		// note: compare each from the first index until largest number is moved to the last index.
		for (x = 0; x < size-1; x++)
		{ // note: loop until before the end of array
			for (y = 0; y < size-x-1; y++) 
			{ // note: will not loop to numbers already sorted
				if (array[y] > array[y+1]) 
					{ // note: compare adjacent numbers which is greater
					swap = array[y]; // note: swap positions...
					array[y] = array[y+1]; // note: smaller will be move to the left
					array[y+1] = swap; // note: larger will move to the right
				}
			}
		}

		System.out.println();

		System.out.println("Bubble Sorting... Done!");
		for (int c = 0; c <size;  c++) 
			System.out.println(array[c]+" " );

	}

