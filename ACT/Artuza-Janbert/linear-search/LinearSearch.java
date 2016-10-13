/**
* LINEAR SEARCH checks each item in a collection from start to end until a match is found. 
*
* @author  Janbert Q Artuza
* @link    https://github.com/janbertartuza23
* @version 1.0
* @since   13/Oct/2016
*/

import java.util.Scanner;
import java.util.Random;

public class LinearSearch {
 public static void main(String[] args){
	 int a,size,search,array[];
	 
	 Scanner input = new Scanner(System.in);
	 Random rand= new Random();
	 
	 System.out.print("enter array size: ");
	 size = input.nextInt();
	 array= new int[size];
	 
	 System.out.print("enter number to find: ");
	 search=input.nextInt();
	 
	 for( a=0; a<size; a++) { 
		 array[a]=rand.nextInt(1000);
	 
	 	if (array[a]==search) {
	 		System.out.println("found: "+search+"is at "+"array["+a+"]");
	 	
	 	break;
	 }	
	 	}
	 
	 if(a==size){
		 System.out.println("Not Found: "+search+" is not in the array.");
	 }
	 
	 
 }
}
