/**
* BUBBLE SORT is based on the idea of repeatedly comparing pairs of 
* adjacent elements, then switching positions if they exist in the wrong order.
*
* @author  [Gerald M. De Guzman]
* @link    [igooop]
* @version [version number]
* @since   [last updated 05/10/2016]
*/

import java.util.*;
public class BubbleSort {

	public static void main (String[] args){
		
		int size, x, y, swap, array[];
		
		Scanner igo = new Scanner (System.in); 
		Random ego = new Random ();

		System.out.print("Enter array size to sort: ");
		size = igo.nextInt();
	
		array = new int [size];
		for (int i = 0; i < array.length; i++ ){
		array [i] = ego.nextInt(1000);
		
		}
		System.out.println();
		System.out.println(size + " random numbers generated ");
		
		for (x = 0; x < size; x++){
			array [x] = ego.nextInt(1000);
			System.out.print(array[x] + " ");
			
		}
		
		System.out.println();
		for (x=0; x < size -1; x++){
			for (y = 0; y< size -x -1; y++){
				
				if (array[y] > array[y+1]){
					swap = array [y];
					array[y] = array [y+1];
					array[y+1] = swap;
				}
			}
		}
		System.out.println();
		System.out.println("Bubble Sorting... Done! ");
		for (x = 0; x < size ; x++){
			System.out.print(array [x] + " ");
		}
	}
	
}
