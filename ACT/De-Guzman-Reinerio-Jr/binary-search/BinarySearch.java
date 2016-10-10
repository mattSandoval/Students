/*
Reinerio H. de Guzman
ACT-2
*/

package binarysearch;
    import java.util.*;
import java.util.Random;

public class BinarySearch {

public static void main(String[] args) {
    Scanner reinerio = new Scanner(System.in);
    
    Random deg = new Random();
    int array[] = new int [10];
    int search = 0, index;
    
    System.out.print("Enter array size: ");
   
    for (int i = 0; i < array.length; i++) {
        array[i] = reinerio.nextInt();
    }
    System.out.print("Enter the number to find: ");
    search = reinerio.nextInt();
    index = binarySearch(array,search);
    if (index!= -1){
        System.out.println("Found at index "+index);
    }else{
        System.out.println("NOT FOUND");
    }
   }
  static int binarySearch(int[] numbers, int find){
      int left,right,middle;
      left = 0 ;
      right = numbers.length-1;
      while(left<= right){
          middle = (left+right) / 2;
          if (numbers[middle] == find){
              return middle;
          }else if (numbers[middle] < find){
              left = middle+1;
          }else {
              right = middle-1;
          }
      }
      return -1;
  }  
}

