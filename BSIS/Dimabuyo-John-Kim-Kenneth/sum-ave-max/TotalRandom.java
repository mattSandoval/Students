import java.util.*;

public class TotalRandom {
	public int [] array;
	public int sum = 0;
	public int average = 0;
	public int max =0;
	
	public void setter(int size) {
		array = new int [size];
		Random rand = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(1000);
		}
	}
	
	public void show() {
		System.out.println("");
		for (int i = 0; i < array.length; i++) {
			System.out.println("Array [" + (i+1) +"] = " + array[i]);
		}
		System.out.println("");
	}
	
	public void GetSum() {
		for (int i = 0; i <array.length; i++) {
			sum += array [i];
		}
		System.out.println("Sum = " + sum);
	}
	
	public void GetAverage() {
		average = sum / array.length;
		System.out.println("Average = " + average);
	}
	
	public void GetMax() {
		for (int i = 0; i < array.length; i++) {
			if (max < array [i]){
				max = array[i];
			}
		}
		System.out.println("Max = " + max);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		TotalRandom call = new TotalRandom();
		
		System.out.print("Please input the Array size: ");
		int ArraySize = input.nextInt();
		call.setter(ArraySize);
		
		call.show();
		call.GetSum();
		call.GetAverage();
		call.GetMax();
	}
}
