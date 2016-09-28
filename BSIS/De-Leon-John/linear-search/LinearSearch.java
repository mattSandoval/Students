/**
* LINEAR SEARCH checks each item in a collection from start to end until a match is found. 
*
* @author  john deleon
* @link   @Johndeleon
* @version final build
* @since   09/29/2016
*/

import java.util.Scanner;
import java.util.Random;
public class LinearSearch {

	
	int size;
	int [] array;
	Random r = new Random();
	int find;
	int ans=0;
	int index;
	
	public static void main (String[] args){
		
		LinearSearch link = new LinearSearch();
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("enter number of integers ");
		link.size= input.nextInt();
		
		link.array= new int [link.size];

		
		link.getRand();
		
		System.out.print("enter number to find ");
		link.find=input.nextInt();
		
		link.search();
		
		if (link.ans==1){
		System.out.println("number "+link.find+" at index: "+link.index);
		
		}
		
		else{
		System.out.println("number not found");	
		}
		
		
		
	}
//--------------------------------------------------	
	public void getRand(){
		
		for (int i=0;i<size;i++){
			array[i]=r.nextInt(size);
		}
	}
//--------------------------------------------------	
	
	public void search(){
		
		for (int i=0;i<size;i++){
			if (find==array[i]){
				ans=1;
				index=i;
			}
			
		}
	}
	
	
	
	
}
