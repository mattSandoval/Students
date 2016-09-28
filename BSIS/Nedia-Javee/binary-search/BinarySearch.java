/**
* BINARY SEARCH is a Divide and Conquer algorithm that compares the item with the middle element of a sorted (ascending) array. 
* Each step, the size of array is reduced to half until one single element remain and a match is found.
*
* @author  [Javee Nedia]
* @link    [https://github.com/lvcc-dsa/Students/blob/master/BSIS/Nedia-Javee/binary-search/BinarySearch.java]
* @version [1.1]
* @since   [28/09/2016]
*/

import java.util.Scanner;
import java.util.Random;
public class BinarySearch{
  private int capacity, array[];
  
  public void sorting(){
  int x, y, temp;
  for(x = 0; x < capacity-1; x++){
    for(y = 0; y < capacity-1; y++){
      if (array[y] > array[y+1]){
        temp = array[y+1];
        array[y+1] = array[y];
        array[y] = temp;
      }
    }
  }
  for(int a =0; a < capacity;a++){
    if(x%10 == 0){
      System.out.println();
    }
    System.out.print(array[a]+ "\t");
  }
  }
 
  
  
  public BinarySearch(int num){
  capacity = num;
  array = new int [capacity];
  }
  
  public void searching(int num){
    int left = 0, middle, right = array.length-1;
    while(left <= right){
      middle=(left+right)/2;
      if(array[middle] == num){
        System.out.println("FOUND: " + num + " is at array[" + middle + "].");
        break;
      }
      else if(array[middle] < num)
        left = middle+1;
      else if(array[middle] > num)
        right = middle-1;
    }
    if(left >= right){
      System.out.println("NOT FOUND: " + num + " is not in the array.");
    }
  }
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    int size, number;
   System.out.print("Please input array size: ");
   size = input.nextInt();
   BinarySearch BinarySearch = new BinarySearch(size);
   for(int i = 0; i < BinarySearch.capacity; i++){
      BinarySearch.array[i] = (int) (1+Math.random()*1000);
    }
   Scanner in = new Scanner(System.in); 
   BinarySearch.sorting();
   System.out.println();
    System.out.print("Please enter the number to find: ");
    number = in.nextInt();
   System.out.println();
   BinarySearch.searching(number);
  }
}
