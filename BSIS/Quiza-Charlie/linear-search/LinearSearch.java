/**
* LINEAR SEARCH checks each item in a collection from start to end until a match is found. 
*
* @author  Renaldo Valente
* @link    https://github.com/arrowbrave
* @version 1.1
* @since   22/09/2016
*/
import java.util.Random;
import java.util.Scanner;

public class LinearSearch {
	

	int [] array;
	double average = 0;
	int arraySize;
	private int toSearch;
	
	public LinearSearch (int size){
		arraySize = size;
		array = new int [arraySize];

		
	}
	public void getArray(){
		
		Random rand = new Random();
		
		for (int i = 0; i < arraySize; i++){
			array[i]=rand.nextInt(100);
			System.out.println("Random[" +i+ "] = " + array[i]);
		}
		System.out.println();
	}
	
	
	public void show(){
		
		for (int i = 0; i < arraySize; i++){
			
			System.out.println ( array[i]);
		}
		
	}
	
	public void search(){
		Scanner input = new Scanner(System.in);
		int i;
		System.out.print("Plese enter the number to be search : ");
		toSearch = input.nextInt();
		
		for(i = 0; i<array.length;i++){
			if(toSearch == array[i]){
				System.out.print("The value has been found in array["+i+"] = "+array[i]);
				break;
			}
			
		}
		if(i == array.length){
			System.out.print("The value not found!");		
			}
	}
	
	public static void main (String[] Args){
		
		int size;
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter array size: " );
		size = input.nextInt();
		
		
		LinearSearch summon = new LinearSearch (size);
		summon.getArray();
		summon.search();
		
		
		
	
	}
}
