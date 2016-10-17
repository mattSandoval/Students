import java.util.Scanner;
import java.util.Random;
public class FindMinMax {
	
	private int capacity;
	public int total=0;
	public double average=0;
	public int []array;
	
	public FindMinMax (int size) {
		capacity = size;
		array = new int [capacity];
	}
	
	public void rand() {
			
		Random random = new Random();
		for (int i = 0; i <array.length ; i++) {	
			int x = random.nextInt(100);
			array[i] = x;
		}
		
		System.out.println(capacity+" RANDOM NUMBERS GENERATED.");
		for (int i = 0; i < array.length; i++) {
			System.out.println("array["+i+"] = "+array[i]);
		}
		System.out.println();
		
	}

	public void FindMinMax() {
		int largest = 0, smallest=array[0], min=0, max = 0;
		for (int i = 0; i < array.length; i++) {
			
			if(array[i] <= smallest) {
				min = array[i];
				smallest = array[i];
			}
			if(array[i] > largest){
				max = array[i];
				largest = array[i];
			}
		}
		
		System.out.println("Largest number: "+max);
		System.out.println("Smallest number: "+min);
	}
	
	public static void main (String [] args) {
		
		Scanner input =  new Scanner(System.in);
		
		System.out.print("Enter the size of your array: ");
		int size = input.nextInt();
		System.out.println();
		
		FindMinMax implement = new FindMinMax(size);
		
		implement.rand();
		implement.FindMinMax();

	}
}

