import java.util.Scanner;
import java.util.Random;
public class BubbleSort {
	
	private int capacity;
	public int total=0;
	public double average=0;
	public int []array;
	
	public BubbleSort (int size) {
		capacity = size;
		array = new int [capacity];
	}
	
	public void ArrayWithRandomValues() {
			
		Random random = new Random();
		for (int i = 0; i <array.length ; i++) {	
			int x = random.nextInt(1000);
			array[i] = x;
		}
		
		System.out.println(capacity+" random numbers generated.");
		for (int i = 0; i < array.length; i++) {
			System.out.println("array["+i+"] = "+array[i]);
		}
		System.out.println();
		
	}

	public void BubbleSort() {
	
		for ( int i = 0; i < capacity-1; i++) {
			for ( int j = 0; j < capacity-i-1; j++) {
				if (array[j] > array[j+1]) {
					int swap = array[j];
					array[j] = array[j+1];
					array[j+1] = swap;
				}
			}
		}
		System.out.println("Bubble Sorting... Done!");
		for ( int i = 0; i < capacity; i++) {
			System.out.println("array["+i+"] = "+array[i] + " ");
		}
	}
	
	public static void main (String [] args) {
		
		Scanner input =  new Scanner(System.in);
		
		System.out.print("Enter the size of your array: ");
		int size = input.nextInt();
		System.out.println();
		
		BubbleSort implement = new BubbleSort(size);
		
		implement.ArrayWithRandomValues();
		implement.BubbleSort();

	}
}

