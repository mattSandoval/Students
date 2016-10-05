/**
* LINEAR SEARCH checks each item in a collection from start to end until a match is found. 
*
* @author  [@lemlemz22]
* @link    [https://github.com/lemlemz22]
* @version [v1.0]
* @update  [October 5, 2016]
*/

import java.util.Scanner;
import java.util.Random;

public class LinearSearch {
	
	public static void main (String[] args){
		
		int a, arraysize, search, array[];
		
		Scanner input = new Scanner (System.in);
		Random rand = new Random();
		
		System.out.print("Enter array size: ");
		arraysize = input.nextInt();
		array = new int[arraysize];

		System.out.print("Generated Numbers: ");
		for (a=0 ; a<arraysize ; a++){
			array[a]=rand.nextInt(1000);
			System.out.print(array[a] + " ");
		}
		System.out.println();
		
		System.out.print("\nEnter number to find: ");
		search = input.nextInt();
		
		for (a=0 ; a<arraysize ; a++){
			
			if (array[a] == search){
				System.out.println("FOUND: " + search + " is at array[" + a + "].");
				break;
			}
			else {
				System.out.println("NOT FOUND: " + search + " is not in the array.");
				break;
			}
		}		
	}
}
