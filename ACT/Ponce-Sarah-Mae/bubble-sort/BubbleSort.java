/**
* BUBBLE SORT is based on the idea of repeatedly comparing pairs of 
* adjacent elements, then switching positions if they exist in the wrong order.
*
* @author  [Sarah Mae Ponce]
* @link    [https://github.com/Saranghae08]
* @version [version number]
* @since   [10/16/2016]
*/

import java.util.*;

public class BubbleSort {
  public static void main(String[] args) {

  int Array[], Size, a, b, Swap;

  	Scanner input = new Scanner(System.in);
  	Random rand = new Random();

	System.out.print("Enter array size to sort: ");
	Size = input.nextInt();
	Array = new int[Size];

  System.out.println();
  	System.out.println(Size + " Random numbers generated.");
  		for (a = 0; a < Size; a++) {
   		Array[a] = rand.nextInt(1000);
  		System.out.print(Array[a] + " ");
 	 }
  System.out.println();

 	 for (a = 0; a < Size-1; a++) {
	     for (b = 0; b < Size-a-1; b++) {
		if (Array[b] > Array[b+1]) {
		Swap = Array[b];
		Array[b] = Array[b+1];
		Array[b+1] = Swap;
 	}
     }
  }
  System.out.println();

  	System.out.println("BUBBLE SORTING is doneeeee! :)");
  	   for (a = 0; a < Size; a++) {
   		System.out.print(Array[a] + " ");
  	}
     }
}
