/**
* Java implementation of a stack using array.
* For demo purpose, should hold a maximum of 10 string values.
*
* @author  [Nicko Fernandez Reyes]
* @link    [https://github.com/samcoii22/]
* @version [version number]
* @since   [10/6/2016]
*/

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
		average = sum / size; 
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
