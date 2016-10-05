/**
* BUBBLE SORT is based on the idea of repeatedly comparing pairs of 
* adjacent elements, then switching positions if they exist in the wrong order.
*
* @author  [Cristian E. Quiza]
* @link    [https://github.com/Kirisaite]
* @version [version 1]
* @since   [last updated 04/10/2016]
*/

// TODO: import Scanner and Random from Java library

import java.util.*;
public class BubbleSort{
  public static void main(String[] args){
    
    int size,x,y,swap,array[];
    Scanner input = new Scanner(System.in);
    Random rand = new Random();
    
    System.out.print("Enter array size to sort: ");
    size = input.nextInt();
    array = new int[size];
    
    for(int i=0;i<array.length;i++){
      array[i] = rand.nextInt(1000);
    }
    
    System.out .println();
    System.out.println(size+" random numbers generated.");
    
    for (x=0;x<=size-1;x++){
      System.out.print(array[x] + " ");
      for (y=0; y<size-x-1;  y++){
        if (array[y] > array[y+1]){
          swap = array[y];
          array[y] = array[y+1];
          array[y+1] = swap;
      }
    }
  }
System.out.println();
System.out.println("\nBubble Sorting... Done!");
for (x = 0; x < size; x++){
  System.out.print(array[x] + " ");
}
  }
}



