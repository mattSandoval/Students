import java.util.Scanner;
import java.util.*;

public class BinarySearch {
	public int [] array;
	public int search;
	public int middle;
	
	public void setter (int size) {
		array = new int [size];
		Random rand = new Random ();
		System.out.println(size + " array was successfully GENERATED");
		for (int i = 0; i < size; i++) {
			array[i] = rand.nextInt(1000);
		}
		// sorting
		int swap;
		for (int s = 0; s < (size - 1); s++) 
		{
			for (int d = 0; d < size - s - 1; d++) 
			{
				if (array[d] > array [d+1]) 
				{
					swap = array[d];
					array[d] = array[d+1];
					array[d+1] = swap;
				}
			}
		}
	}
	
	public void show() {
		int n = 0;
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\t");
			n++;
			
			if (n == 10) {
				System.out.println();
				n = 0;
			}
		}
		System.out.println();
	}
	
	public void searcher() {
		Scanner input = new Scanner (System.in);
		int left, right;
		left = 0;
		right = array.length -1;
		
		System.out.print("Enter a number that you want to search: ");
		int search = input.nextInt();
		
		while (left <= right) 
		{
			middle = left + (right - left) /2;
			if (array[middle] == search){
				System.out.println("The number you entered found in Array[" + middle + "]");
				break;
			}
			else if (search < array[middle]){
				right = middle - 1;
			}
			else{
				left = middle + 1;
			}
		}
		if (search != array[middle]) {
			System.out.println("The number you input is not found!");
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		BinarySearch call = new BinarySearch();
		
		System.out.print("Enter an Array Size: ");
		int ArraySize = input.nextInt();
		System.out.println();
		call.setter(ArraySize);
		call.show();
		call.searcher();
	}
}