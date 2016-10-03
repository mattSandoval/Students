/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
* DESCRIPTION:
*
* LINEAR SEARCH checks each item in a collection from the start to end until a match is found.
* It's worse case algorithmic time complexity is LINEAR or O(n).
*
* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
* TO DO:
*
* Accepts keyboard input to set size of array.
* Generate random numbers to array accordingly.
* Accepts keyboard input to search for a number.
* Show search result if number is found and what index position.
*
* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
* PSEUDOCODE:
* 
* START PROGRAM
* 
*  FOR each number IN array
*   IF array[i] == search
*      PRINT FOUND at array[i]
*   ELSE
*      PRINT NOT FOUND
* 
* END PROGRAM  
*
* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *  
* 
* @author [Aranas, Michaela M.]
* @link [https://github.com/lvcc-dsa/Students/blob/master/BSIS/Aranas-Michaela/linear-search/LinearSearch.java]
* @version [1.0]
* @since [28/09/2016]
*
* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
*/

import java.util.Random;
import java.util.Scanner;

public class LinearSearch {
  private int array [];
  private int capacity;
  
  public LinearSearch(int size) {
     capacity = size;
     array = new int[capacity];
   }
  
  public void toSearch(int search){
    int i;
    for (i = 0; i < capacity; i++){
      if ( array [i] == search ){
        System.out.println("FOUND: " + search + " is at array["+ i +"]");
        break;
      }
    }
    if (i == capacity){
      System.out.println("NOT FOUND: " + search + " is not in the array.");    
    }
  }
  
  public static void main (String args[]){
    Scanner input = new Scanner (System.in);
    
    System.out.print ("Enter array size: ");
    int size =  input.nextInt();
    LinearSearch implement = new LinearSearch(size);
    for (int k = 0; k < size; k++){
       Random rand = new Random();
       implement.array[k] = rand.nextInt(1000);
    }
   
    System.out.print ("Enter number to find: ");
    int search = input.nextInt();
    implement.toSearch(search); 
  }
}
