import java.util.*;

public class LinearSearch {
	public int [] array;
	private int search;
	
	public void setter(int size) {
		array = new int [size];
		Random rand = new Random ();
		for (int i = 0; i < size; i++){
			array [i] = rand.nextInt(100);
		}
	}
	
	public void show () {
		System.out.println("");
		for (int i =0; i < array.length; i++) {
			System.out.println("Array [" + (i+1) + "] = " + array [i]);
		}
		System.out.println("");
	}
	
	
	public void searching(int size){
		int i;
		for (i =0 ; i < array.length; i++) {
			if (array[i] == size) {
				System.out.println("The number was found on Array[" + (i+1) + "]");
				break;
			}
		}
		if (i == array.length){
			System.out.println("The value you input not found");
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		LinearSearch call = new LinearSearch();
		int yes;
		
		System.out.print("Enter the Array size: ");
		int ArraySize = input.nextInt();
		call.setter(ArraySize);
		
		System.out.print("What number do you want to search: ");
		int search = input.nextInt();
		call.searching(search);
		
		System.out.println("Do you want to show the entire Array? [1/0]");
		yes = input.nextInt();
		if (yes == 1){
			call.show();
		} else {
			System.out.println("Thank you for using my program! :)");
		}
		
	}
}
