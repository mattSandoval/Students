/** 
* - Accepts keyboard input to set array size.
* - Generate random numbers accordingly.
* - Get the sum, average, and maximum value
*
/*
* @author: Kyle Vincent Q. Tan
* @link: https://github.com/elyk18
* @version: v1
* @since: 10/07/2016
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
