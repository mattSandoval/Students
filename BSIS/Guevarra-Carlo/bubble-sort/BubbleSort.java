/**
* BUBBLE SORT is based on the idea of repeatedly comparing pairs of 
* adjacent elements, then switching positions if they exist in the wrong order.
*
* @author  [Carlo S. Guevarra]
* @link    [full github url]
* @version [1.00]
* @since   [last updated 01/10/2016]
*/

// TODO: import Scanner and Random from Java library

package Java;

import java.util.Random;
import java.util.Scanner;

public class BubbleSort {
	private int [] array;
	private int capacity;
	
	private BubbleSort (int size){
		capacity = size;
		array = new int [capacity];

		
	}
	public void getArray(){
		Random rand = new Random();
		
		for (int i = 0; i < capacity; i++){
			int x = rand.nextInt(100);
			array[i] = x;
			}
		System.out.println();
	}
	public void sort(){
		int swap;
		for(int x = 0;x < capacity-1;x++){
			for(int y = 0;y < capacity-x-1;y++){
				if(array[y] > array[y+1]){
					swap = array[y];
					array[y] = array[y+1];
					array[y+1] = swap;
				}
			}
		}
		System.out.println("\n\t ******** SORTED ARRAY *********\n");
	}
	public void show(){
		int dulo = 0;
		for (int i = 0; i < capacity; i++){		
			System.out.print(array[i]+"\t");
			dulo+=1;
			if(dulo == 10){
				System.out.println();
				dulo = 0;
			}
		}	
	}
	
	public static void main (String[] Args){
		
		int size;
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter array size: " );
		size = input.nextInt();
		
		
		BubbleSort demo = new BubbleSort (size);
		demo.getArray();
		demo.show();
		demo.sort();
		demo.show();
		
		
		
	
	}
}
