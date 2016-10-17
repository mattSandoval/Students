import java.util.*;
class Minmax {
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
		init.makeMin();
		init.showMin();
		init.makeMax();
		init.showMax();
	}
}
