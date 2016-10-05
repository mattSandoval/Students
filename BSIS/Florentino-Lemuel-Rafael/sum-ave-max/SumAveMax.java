/** 
* - Accepts keyboard input to set array size.
* - Generate random numbers accordingly.
* - Get the sum, average, and maximum value
*
* @author  [@lemlemz22]
* @link    [www.github.com/lemlemz22]
* @version [1.0]
* @updated   [last updated 05/10/2016]
*/

package SumAveMax;
import java.util.*;
import java.util.Random;

public class SumAveMax {
	private int sum, max, arraySize;
	private int array[];
	private float average;

	public SumAveMax() {
		Scanner in = new Scanner(System.in);
		Random rand = new Random();
		System.out.print("Enter array size: ");
		arraySize = in.nextInt();
		array = new int[arraySize];
		System.out.println();
		System.out.println(arraySize + " random numbers generated.");
		for (int i=0; i<arraySize; i++) {
			array[i] = rand.nextInt(100);
			System.out.print(array[i] + " ");
			sum += array[i];
			if (array[i] > max)
				max = array[i];			
		}
		System.out.println();
	}

	public void getSum() {
		System.out.println("SUM: " + sum);
	}

	public void getMax() {
		System.out.println("MAX: " + max);
	}

	public void getAverage() {
		average = (float) sum / arraySize; 
		System.out.println("AVERAGE: " + average);
	}

	public static void main(String[] args) {
		SumAveMax find = new SumAveMax();
		System.out.println();
		find.getSum();
		find.getMax();
		find.getAverage();
	}
}
