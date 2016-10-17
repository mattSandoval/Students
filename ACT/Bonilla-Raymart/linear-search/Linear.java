/**
* LINEAR SEARCH checks each item in a collection from start to end until a match is found. 
*
* @author  Bonilla, Raymart Sandoval
* @link    https://github.com/mattSandoval
* @version 1
* @since   10/17/2016 5:08 pm
*/
import java.util.*;
 
class Linear {
  public static void main(String args[]) {
    int i, num, search;
    int array[];
 
    Scanner input = new Scanner(System.in);
    Random random = new Random();

    System.out.print("\nEnter array size : ");
    num = input.nextInt(); 
    array = new int[num];
 
    for ( i = 0; i < array.length ; i++ ) {
      array[i] = random.nextInt(100) + 1;
      System.out.print("\n Array [" + i + "] => " + array[i]);
    }
 
    System.out.print("\nSearch for :");
    search = input.nextInt();
 
    for ( i = 0; i < num; i++) {
      if (array[i] == search) {
         System.out.print("\nFOUND " +search + " at array[" + i + "]");
          break;
      }
    }
    if (i == num) {
      System.out.print("\n" +search + " NOT FOUND");
    }
  }
}
