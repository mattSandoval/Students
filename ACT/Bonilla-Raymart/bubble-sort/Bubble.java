/**
* BUBBLE SORT is based on the idea of repeatedly comparing pairs of 
* adjacent elements, then switching positions if they exist in the wrong order.
*
* @author  Bonilla, Raymart Sandoval
* @link    https://github.com/mattSandoval/Students/edit/patch-1/ACT/Bonilla-Raymart/bubble-sort/BubbleSort.java
* @version 1
* @since   5:02pm 10/17/2016 
*/
import java.util.*;
 
class Bubble {
  public static void main(String []args) {
    int num, change_pos;
    Random random = new Random();

    Scanner input = new Scanner(System.in);
 
    System.out.printf("\nEnter array size : ");
    num = input.nextInt();
 
    int array[] = new int[num];
 
    for (int i = 0; i < array.length ; i++ ) {
      array[i] = random.nextInt(100) + 1;
      System.out.print("\n Number " + (i+1) + " => " + array[i]);
    }
 
    for (int i = 0; i < (num - 1); i++) {
      for (int j = 0; j < num - i - 1; j++) {
        if (array[j] > array[j+1]) {
          change_pos  = array[j];
          array[j]   = array[j+1];
          array[j+1] = change_pos;
        }
      }
    }
 
    System.out.printf("\nArray List : ");
 
    for (int i = 0; i < num; i++) 
      System.out.print("\n" + array[i]);
  }
}
