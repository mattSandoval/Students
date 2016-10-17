/** 
* - Accepts keyboard input to set array size.
* - Generate random numbers accordingly.
* - Get the sum, average, and maximum value
*
* @author  Bonilla, Raymart Sandoval
* @link    https://github.com/lvcc-dsa/Students/edit/master/ACT/Bonilla-Raymart/sum-ave-max/SumAveMax.java
* @version 1
* @since   10/17/2016 4:31 pm
*/
import java.util.*;
class Total {
	public int max = 0;
	public int min = 100;
    public int sum = 0;
    public int[] array;
    public double ave;
 	Scanner penge = new Scanner(System.in);
    Random random = new Random();
    public void Total(int size) {
    	array = new int[size];
    }

    public void showAll() {
    	for (int i = 0; i < array.length ; i++ ) {
			array[i] = random.nextInt(100) + 1;
			System.out.print("\n Number " + (i+1) + " => " + array[i]);
		}
		System.out.print("\n==========================\n");
    }

    public void makeTotal() {
    	for (int i = 0; i < array.length ; i++ ) {
			sum += array[i];
		}
    } 

    public void showTotal() {
		System.out.print("\nSum of numbers : " + sum);
    }

    public void makeMin() {
    	for (int i = 0; i < array.length ; i++ ) {
			if (array[i] < min) {
				min = array[i];
			}
		}
    }

    public void showMin() {
		System.out.print("\nSmallest number : " + min);
    }

    public void makeMax() {
    	for (int i = 0; i < array.length ; i++ ) {
			if (array[i] > max) {
				max = array[i];
			}
		}
    }

    public void showMax() {
		System.out.print("\nLargest number : " + max);
    }

    public void makeAve() {
		ave = sum / array.length;
    }

    public void showAve() {
    	System.out.print("\nAverage : " + ave);
		System.out.print("\n\n==========================\n");
    }
	public static void main(String[] args) {
		Scanner penge = new Scanner(System.in);
	    Random random = new Random();
		System.out.print("\nGive array size: ");
		int n = penge.nextInt();
        Total init = new Total();
        init.Total(n);
		init.showAll();
		init.makeTotal();
		init.showTotal();
		init.makeMin();
		init.showMin();
		init.makeMax();
		init.showMax();
		init.makeAve();
		init.showAve();
	}
}
