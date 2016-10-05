/**
* BUBBLE SORT is based on the idea of repeatedly comparing pairs of 
* adjacent elements, then switching positions if they exist in the wrong order.
*
* @author  [Dayrit Kent]
* @link    [https://github.com/lvcc-dsa/Students/edit/master/BSIS/Dayrit-Kent/bubble-sort/BubbleSort.java]
* @version [version 1]
* @since   [10/6/16]
*/
package bubbleSort;

import java.util.*;

class bubbleSorting {

	public static void main(String[] args) {

		int arraj[], ArrajSize, i, j, temp;

		Scanner input = new Scanner(System.in);
		
		Random rand = new Random();

		System.out.println();
		System.out.print("ArrajSize of an array: ");
	
		ArrajSize = input.nextInt();
		
		arraj = new int[ArrajSize];

		
		System.out.println();
		System.out.println(" random numbers.");

		for (i = 0; i < ArrajSize; i++) {
			
			arraj[i] = rand.nextInt(1000);
		
			System.out.print(arraj[i] + " ");
		
		}

		System.out.println();
		
		for (i = 0; i < ArrajSize-1; i++) { 
		
		for (j = 0; j < ArrajSize-i-1; j++) { 
				
				if (arraj[j] > arraj[j+1]) { 
					
					temp = arraj[j]; 
					
					arraj[j] = arraj[j+1]; 
					
					arraj[j+1] = temp; 
										}
			}
		}

		System.out.println();

		System.out.println("Sorted Numbers!");
		
		for (i = 0; i < ArrajSize; i++) {
			System.out.print(arraj[i] + " ");
		}
		System.out.println();
	}


}
