/**
* LINEAR SEARCH checks each item in a collection from start to end until a match is found. 
*
* @author  Cristine Amie Rigo
* @link    https://github.com/amierigo/DSA/blob/master/LinearSearch.java
* @version 1.1
* @since   10-05-16
*/

import java.util.Scanner;
import java.util.Random;

public class LinearSearch {
		
public void searcher (int size) {
    array = new int[size];
    Random rand = new Random();
        for (i = 0; i < size; i++) {
            array [i] = rand.nextInt(1000);
        
        for (i = 0; i < size; i++) {
			array[i] = rand.nextInt(1000);
			if (array[i] == search) {
				System.out.println("FOUND: " + search + " is at " + "array["+i+"]");
				break;
			} 			
		}

		if (i == size) {
			System.out.println("NOT FOUND: " + search + " is not in the array.");
		}

	}

}
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinearSearch look = new LinearSearch ();
        
            System.out.print("Enter Array Size:" );
            int size = input.nextInt();
            System.out.print("Enter Number you want to search :");
            int search = input.nextInt();
        
                look.searcher(size);    
       
        }
    }
    
