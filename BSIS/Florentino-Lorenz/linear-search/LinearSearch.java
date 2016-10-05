/**
* LINEAR SEARCH checks each item in a collection from start to end until a match is found. 
*
* @author  [Lorenz C. Florentino]
* @link    [github.com/lorenzhahaha]
* @version [1.1]
* @since   [05 October 2016]
*/


package linearsearch;
import java.util.Scanner;
import java.util.Random;

public class LinearSearch {
	public static void main(String[] args){
	int search, size, x, y, array[];
	Scanner input = new Scanner (System.in);
    Random rand = new Random();
    
    System.out.print("*-------------- Linear Search --------------*\n\n");
    System.out.print("Enter array size: ");
    size = input.nextInt();
    array = new int [size];
    
    System.out.println(size + " random numbers generated.\n");
    System.out.print("Random numbers: ");
    
    for (int i=0 ; i<array.length ; i++){
        	array[i]=rand.nextInt(1000);
        	System.out.print(array[i] + " ");
    	}
    
    System.out.print("\n\nEnter number to find: ");
    search = input.nextInt();
    
    for (x=0 ; x<size ; x++){
    		if (array[x] == search){
    			System.out.print("FOUND: " + search + " is at array[" + x + "].\n");
    			return;
    		}
    	}
    	System.out.print("NOT FOUND: " + search + " is not in the array.");
    }
}
