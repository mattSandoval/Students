/**
* BINARY SEARCH is a Divide and Conquer algorithm that compares the item with the middle element of a sorted (ascending) array. 
* Each step, the size of array is reduced to half until one single element remain and a match is found.
*
* @author  [your full name here]
* @link    [full github url]
* @version [version number]
* @since   [last updated dd/mm/yyyy]
*/
import java.util.*;


public class BinaryMethod {

	private int  array[];
	private int capacity;
	private int search;
	
	public BinaryMethod(int Size){
		capacity = Size;
		array = new int[capacity];
	}
	
	public void show(){
		System.out.println();
		System.out.println("\t\t==ARRAY VALUES==");
		for(int i=0;i<capacity;i++){
			System.out.println("INDEX ["+(i+1)+"]"+array[i]);
		}System.out.println();
	}
	
	public void generateValues(){
		System.out.println("\t\tGENERATING RANDOM VALUES...");
		Random rand = new Random();
		for(int i=0;i<capacity;i++){
			array[i] = rand.nextInt(capacity);
		}
	}
	
	public void binSearch(int value){
		search = value;
		
		int min =0;
		int max = capacity-1;
		int middle;
		
		while(min<=max){
			middle = min + (max-min)/2;
			if(array[middle] == search ){
				System.out.println();
				System.out.println("VALUE(s) FOUND AT INDEX["+(middle+1)+"]");
				return;
				
			}
			else if(array[middle]<search){
				min=middle+1;
			}
			else if(array[middle]>search ){
				max=middle-1;
			}
		
		}if(min>max){
			System.out.println("Sorry, the value you've entered is not in the list.");
		}
	}
	
	public void sort(){
		System.out.println();
		System.out.println("\t\tSORTING ARRAY...");
		for(int i=0; i<capacity-1 ; i++){
			for (int j=0; j<capacity-i-1; j++){
				
				int temp;
			if(array[j]>array[j+1]){	
				temp = array[j];
				array[j] = array[j+1];
				array[j+1] = temp;
			}
			}
		}
	}
	
	
	public static void main(String[]args){
		
		Scanner input = new Scanner(System.in);
		
		int size;
		System.out.print("PLEASE ENTER THE ARRAY SIZE: ");
		size = input.nextInt();
		System.out.println();
		
		BinaryMethod bin = new BinaryMethod(size);
		
		System.out.print("PLEASE ENTER THE VALUE TO BE SEARCHED: ");
		int search=input.nextInt();
		System.out.println();
		
		System.out.println("\t\tSTARTING BINARY SEARCH...");
		System.out.println();
		
		bin.generateValues();
		bin.sort();
		bin.binSearch(search);
		bin.show();
		
		
		
			
		
	}

	
}
