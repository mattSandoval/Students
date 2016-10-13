/**
* BUBBLE SORT is based on the idea of repeatedly comparing pairs of 
* adjacent elements, then switching positions if they exist in the wrong order.
*
* @author  [Janbert Q Artuza]
* @link    [https://github.com/janbertartuza23]
* @version [1.0]
* @since   [last updated 13/Oct/2016]
*/

// TODO: import Scanner and Random from Java library

import java.util.Scanner;
import java.util.Random;
 public class BubbleSort {
         public static void main(String [] args){
	    Scanner input = new Scanner(System.in);
	    Random rand = new Random();
	    int num, swap = 0;
	    int [] array;
		
	System.out.print("Enter the numbers you want to sort: ");
	  num = input.nextint();
	  array = new int[num];
		
	 for(int y=0; y<num; y++) {
              System.out.println(array[y]=rand.nextynt(100));
		for(int x=0; x<y; x++){
			if(array[x]<array[x+1]){
				swap=array[x];
				array[x]=array[x+1];
				array[x+1]=swap;
			}
		}
	}
		
}
}
