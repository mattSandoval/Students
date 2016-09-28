/**
* BUBBLE SORT is based on the idea of repeatedly comparing pairs of 
* adjacent elements, then switching positions if they exist in the wrong order.
*
* @author  [Javee Nedia]
* @link    [https://github.com/lvcc-dsa/Students/blob/master/BSIS/Nedia-Javee/bubble-sort/BubbleSort.java]
* @version [1.1]
* @since   [28/09/2016]
*/

// TODO: import Scanner and Random from Java library

import java.util.Scanner;
import java.util.Random;
public class BubbleSort{
  public static void main(String[]args){
  int size, x, y, swap, array[];
  Scanner input = new Scanner(System.in);
  Random rand = new Random();
  System.out.print("Enter Array size to Sort: ");
  size = input.nextInt();
  array = new int [size];
  System.out.println("\n" + size + " Random numbers to be generated");
  System.out.println();
  for(x = 0; x < size; x++){
    if(x%10 == 0){
      System.out.println();
    }
    array[x] = rand.nextInt(10000);
    System.out.print(array[x] + "\t");
  }
  System.out.println("\n\n" + size + " Random numbers are generated");
  System.out.println();
  for(x = 0;x < size; x++){
    for(y = 0; y < x; y++){
      if(array[y] > array[y+1]){
      swap = array[y+1];
      array[y+1] = array[y];
      array[y] = swap;
      }
    }
  }
  System.out.println("Bubble Sorting.....DONE!");
  for(x = 0; x < size; x++){
    if(x%10 == 0){
      System.out.println();
    }
    System.out.print(array[x] + "\t");
  }
  }
}
