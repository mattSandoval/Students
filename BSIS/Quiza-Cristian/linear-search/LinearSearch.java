/**
* LINEAR SEARCH checks each item in a collection from start to end until a match is found. 
*
* @author  Crisrian E. Quiza
* @link    https://github.com/kirisaite
* @version 1.1
* @since   22/09/2016
*/

import java.util.*;
public class LinearSearch {
   int size, search;
   int[] array;
   
   Scanner in = new Scanner(System.in);
   public void aSize(){
    System.out.print("Enter the size of an Array: ");
    size = in.nextInt();
    array = new int[size];
   }
   public void aRandom(){
    Random rand = new Random();
    System.out.print("\n");
    for(int i=0; i<array.length; i++){
     array[i] = rand.nextInt(100);
     System.out.print(array[i] + " ");
    }
   }
   public void aSearch(){
    int i;
    System.out.print("\n");
    System.out.print("Enter the number you want to search: ");
    search = in.nextInt();
    for (i = 0; i < array.length; i++){
     if(search == array[i]){
      System.out.println("The number has been found in Array["+i+"]");
      break;
     }
    }
    if (i == array.length){
     System.out.print("Value not found.");
    }
   }
   public static void main (String[] args){
    LinearSearch yonde = new LinearSearch();
    
    yonde.aSize();
    yonde.aRandom();
    yonde.aSearch();
   }
}
