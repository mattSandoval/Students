/**
* BUBBLE SORT is based on the idea of repeatedly comparing pairs of 
* adjacent elements, then switching positions if they exist in the wrong order.
*
* @author  [Ramil Sison]
* @link    [https://github.com/princeramil]
* @version [version number]
* @since   [last updated dd/mm/yyyy]
*/

// TODO: import Scanner and Random from Java library

import java.util.*;
public class BubbleSort {

	public static void main (String[] args){
		
		int capacity, val, y, swap, arraysize[];
		
		Scanner ramil = new Scanner (System.in); 
		Random sison = new Random ();

		System.out.print("Enter array size to sort: ");
		size = ramil.nextInt();
	
		array = new int [capacity];
		for (int i = 0; i < arraysize.length; i++ ){
		array [i] = sison.nextInt(1000);
		
		}
		System.out.println();
		System.out.println(capacity + " random numbers generated ");
		
		for (val = 0; val < capacity; x++){
			array [val] = sison.nextInt(1000);
			System.out.print(arraysize[val] + " ");
			
		}
		
		System.out.println();
		for (val=0; val < capacity -1; val++){
			for (y = 0; y< capacity -val -1; y++){
				
			if (arraysize[y] > arraysize[y+1]){
				swap = arraysize [y];
			arraysize[y] = arraysize [y+1];
			arraysize[y+1] = swap;
				}
			}
		}
		System.out.println();
		System.out.println("Bubble Sorting Done! ");
		for (val = 0; val < capacity ; val++){
			System.out.print(arraysize [val] + " ");
		}
	}
	
}
