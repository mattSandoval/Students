/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
 * 
 * DESCRIPTION:
 * 
 * BUBBLE SORT is based on the idea of repeatedly comparing pairs of adjacent elements, then switching positions if they exist in the wrong order.
 * It's worse case algorithmic time complexity is QUADRATIC or O(n^2).
 * 
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
 * TO DO:
 * 
 * Accepts keyboard input to set size of array.
 * Generate random numbers to array accordingly.
 * Show unsorted random numbers.
 * Show sorted numbers after.
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
 * 
 * PSEUDOCODE:
 * 
 * START PROGRAM
 * 
 *  FOR each number IN array
 *   IF array[i] > array[i+1]
 *     swap([i], array[i+1])
 * 
 * END PROGRAM 
 * 
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *  
 * @author [Aranas, Michaela M.]
 * @link [https://github.com/lvcc-dsa/Students/blob/master/BSIS/Aranas-Michaela/bubble-sort/BubbleSort.java]
 * @version [1.0]
 * @since [21/09/2016]
 *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
*/

import java.util.Random;
import java.util.Scanner;

public class BubbleSort {
  public static void main (String args[]){
    int size, x, y, swap, array[];
    Scanner input = new Scanner(System.in);
    Random rand = new Random();
    System.out.print("Enter array size to sort: ");
    size = input.nextInt();
    array = new int[size];
    System.out.println();
    System.out.println(size + " random numbers to be generated.");
    for (x = 0; x < size; x++){
      array[x] = rand.nextInt(1000);
      System.out.print(array[x] + " ");
    }
    System.out.println();
    for (x = 0; x < size-1; x++){
      for (y = 0; y < size-x-1; y++){
        if (array[y] > array[y+1]) {
        swap = array[y];
        array[y] = array[y+1];
        array[y+1] = swap;
        }
      }
    }
    System.out.println();
    System.out.println("Bubble Sorting ... Done!");
    for (x = 0; x < size; x++){
      System.out.print(array[x] + " "); 
    }
   
  }
}
