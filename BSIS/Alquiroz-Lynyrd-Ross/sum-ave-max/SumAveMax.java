/*
* @author: Lynyrd Ross Alquiroz
* @link: https://github.com/LynyrdRoss/sum-ave-max
* @version: v1.2
* @since: 10/03/2016
*/

import java.util.*;

public class sumAveMax {

	int [] arr;
	int size, capacity;

	public sumAveMax (int size) {
		capacity = size;
		arr = new int [capacity];
	}

	public int findMax(int []arr) {

		int temp = arr[0];

		for (int i = 0; i < arr.length - 1; i++) {
			if (temp < arr[i+1]) {
				temp = arr[i+1];
			}
		}

		return temp;
	}

	public int findMin(int []arr) {

		int temp = arr[0];

		for (int i = 0; i < arr.length - 1; i++) {
			if (temp > arr[i+1]) {
				temp = arr[i+1];
			}
		}

		return temp;
	}

	public int findTotal (int []arr) {
		int total = 0;

		for (int i = 0; i < arr.length; i++) {
			total += arr[i];
		}

		return total;
	}

	public int findAve (int []arr) {
		int total = 0;

		for (int i = 0; i < arr.length; i++) {
			total += arr[i];
		}

		int ave = total / arr.length;

		return ave;
	}
	
	public static void main(String [] args) {

		Scanner input = new Scanner (System.in);

		int userSize;

		System.out.println();
		System.out.print("Enter desired size of Array: ");
		userSize = input.nextInt();
		System.out.println();

		sumAveMax objClass = new sumAveMax (userSize);

		for (int i = 0; i < userSize; i++) {
			System.out.print("Enter value number " + (i+1) + ": ");
			objClass.arr[i] = input.nextInt();
		}
		System.out.println();

		System.out.print("The values of your array is: ");
		for (int i = 0; i < userSize; i++) {
			System.out.print(objClass.arr[i] + " ");
		}
		System.out.println();

		System.out.println("The size of your Array is: " + objClass.capacity);
		System.out.println("The highest value in the array is: " + objClass.findMax(objClass.arr));
		System.out.println("The lowest value in the array is: " + objClass.findMin(objClass.arr));
		System.out.println("The total value in the array is: " + objClass.findTotal(objClass.arr));
		System.out.println("The average value in the array is: " + objClass.findAve(objClass.arr));

	}
}

/** 
* - Accepts keyboard input to set array size.
* - Generate random numbers accordingly.
* - Get the sum, average, and maximum value
*
* @author  [your full name here]
* @link    [full github url]
* @version [version number]
* @since   [last updated dd/mm/yyyy]
*/
/*
import java.util.Scanner;
import java.util.Random;

public class SumAveMax {

	private int sum, max, size, array[];
	private float average;

	public SumAveMax() {
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		System.out.print("Enter array size: ");
		size = input.nextInt();
		array = new int[size];
		System.out.println();
		System.out.println(size + " random numbers generated.");
		for (int i = 0; i < size; i++) {
			array[i] = rand.nextInt(1000);
			System.out.print(array[i] + " ");
			sum += array[i];
			if (array[i] > max)
				max = array[i];			
		}
		System.out.println();
	}

	public void getSum() {
		System.out.println("SUM = " + sum);
	}

	public void getMax() {
		System.out.println("MAX = " + max);
	}

	public void getAverage() {
		// note: type casting = assigning a value of one type to a variable of another type
		average = (float) sum / size; // note: type cast int to float
		System.out.println("AVERAGE = " + average);
	}

	public static void main(String[] args) {
		SumAveMax demo = new SumAveMax();
		System.out.println();
		demo.getSum();
		demo.getMax();
		demo.getAverage();
	}

}
*/
