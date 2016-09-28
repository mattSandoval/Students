/**
* LINEAR SEARCH checks each item in a collection from start to end until a match is found. 
*
* @author  Renaldo Valente
* @link    https://github.com/arrowbrave
* @version 1.1
* @since   22/09/2016
*/
import java.util.Scanner;
import java.util.Random;
public class LinearSearch {

	int array[];
	private int arrSize;
	private int searchValue;
	
	public LinearSearch(int Size){
		arrSize= Size;
		array = new int[arrSize];
	}
	
	public void show(){
		System.out.println();
		System.out.println("\t\t==ARRAY VALUES==");
		for(int i=0; i<arrSize;i++){
			System.out.println("INDEX ["+(i+1)+"]: "+array[i]);
			
		}System.out.println();
	}
	
	public void generateValues(){
		Random rand = new Random();
		for(int i=0;i<arrSize;i++){
			array[i]= rand.nextInt(10);
		}
		
	}
	
	public void search(int value){
		searchValue = value;
		int i;
		for(i=0;i<arrSize;i++){
		if(searchValue == array[i] ){
			System.out.println("VALUE FOUND! at INDEX["+(i+1)+"].");
		}
		}
		if (i==arrSize){
			System.out.println("NO MORE VALUE(s) TO SHOW.");
			
		}
	
		
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int Size;
		int value;
		System.out.print("PLEASE ENTER THE ARRAY SIZE: ");
		Size = input.nextInt();
		
		
		LinearSearch search = new LinearSearch(Size);
		
		System.out.print("PLEASE ENTER THE VALUE YOU WANT TO FIND: ");
		value = input.nextInt();
		
		search.generateValues();
		search.show();
		search.search(value);
		
		
		
		// TODO Auto-generated method stub
		
		

	}

}
