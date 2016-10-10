/**
* LINEAR SEARCH checks each item in a collection from start to end until a match is found. 
*
* @author  Rangel Angelo C. Macapagal
* @link    https://github.com/Rangel-Cruz-Macapagal
* @version 1.0
* @since   10/10/2016
*/


import java.util.Scanner;
import java.util.Random;

public class LinearSearch {
 public static void main(String[] args){
	 int i ,size,search,array[];
	 
	 Scanner in = new Scanner(System.in);
	 Random t= new Random();
	 
	 System.out.print("Enter array size: ");
	 size = in.nextInt();
	 array= new int[size];
	 
	 System.out.print("Enter number to find: ");
	 search=in.nextInt();
	 
	 for( i=0;i<size;i++){
		 array[i]=t.nextInt(1000);
	 
	 	if (array[i]==search){
	 		System.out.println("Found: "+search+"is at "+"array["+i+"]");
	 	
	 	break;
	 }	
	 	}
	 
	 if(i==size){
		 System.out.println("Not Found: "+search+" is not in the array.");
	 }
	 
	 
 }
}
