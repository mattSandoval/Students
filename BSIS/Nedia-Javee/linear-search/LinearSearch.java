/**
* LINEAR SEARCH checks each item in a collection from start to end until a match is found. 
*
* @author  Javee Nedia
* @link    https://github.com/lvcc-dsa/Students/tree/master/BSIS/Nedia-Javee/linear-search
* @version 1.1
* @since   28/09/2016
*/

import java.util.Scanner;
import java.util.Random;
public class linearSearch {
	private int i, capacity, search, array[];
	
	private linearSearch(int num){
		capacity=num;
		array = new int[capacity];
	}
	
	public void toFind(){
		Scanner in =new Scanner(System.in);
		System.out.print("Enter Number to Find: ");
		search = in.nextInt();
	}
	
	public void arrayValues(){

		for(i = 0;i < capacity; i++){
			array[i]=(int)(0+Math.random()*100);
		}
	}
	
	public boolean isFound(){
		if(array[i] == search){
			return true;
		}
		return false;
	}
	public boolean isNotFound(){
		if(i == capacity){
			return true;
		}
		return false;
	}
	
	public void searching(){
		for(i = 0; i< capacity; i++){
			if (isFound() == true){
				System.out.println("Found: "+ search +" is at array["+ i +"]" );
				break;
			}
		}
		if(isNotFound() == true){
			System.out.println("NOT FOUND: "+ search +" is not in the array.");
		}
	}
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		int size;
		System.out.print("Enter Array size: ");
		size = input.nextInt();
		linearSearch linearSearch = new linearSearch(size);
		linearSearch.arrayValues();
		linearSearch.toFind();
		linearSearch.searching();
	}	
}
