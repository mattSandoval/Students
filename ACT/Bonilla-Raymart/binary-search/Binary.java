/**
* BINARY SEARCH is a Divide and Conquer algorithm that compares the item with the middle element of a sorted (ascending) array. 
* Each step, the size of array is reduced to half until one single element remain and a match is found.
*
* @author  Bonilla, Raymart Sandoval
* @link    https://github.com/mattSandoval/Students/blob/patch-1/ACT/Bonilla-Raymart/binary-search/BinarySearch.java
* @version 1
* @since   10/17/2016 4:43 pm
*/
import java.util.*;
 
class Binary {
  public static void main(String args[]) {
    int num, search, first, last, middle;
    int array[];
 
    Scanner input = new Scanner(System.in);
    System.out.printf("\nEnter array size : ");
    num = input.nextInt(); 
    array = new int[num];
 
    for (int i = 0; i < num; i++) {
      System.out.printf("\n Enter value for array[" + i + "] : ");
      array[i] = input.nextInt();
    }
 
    System.out.printf("\nSearch for :");
    search = input.nextInt();
 
    first  = 0;
    last   = num - 1;
    middle = (first + last)/2;
 
    while( first <= last )
    {
      if ( array[middle] < search )
        first = middle + 1;    
      else if ( array[middle] == search ) 
      {
        System.out.println(search + "\n\t FOUND : array[" + middle + "].");
        break;
      }
      else
         last = middle - 1;
 
      middle = (first + last)/2;
   }
   if ( first > last )
      System.out.println(search + " NOT FOUND.\n");
  }

}
