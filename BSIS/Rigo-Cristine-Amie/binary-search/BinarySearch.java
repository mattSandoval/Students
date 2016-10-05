/**
* BINARY SEARCH is a Divide and Conquer algorithm that compares the item with the middle element of a sorted (ascending) array. 
* Each step, the size of array is reduced to half until one single element remain and a match is found.
*
* @author  [Cristine Amie Rigo]
* @link    [https://github.com/amierigo/DSA/blob/master/BinarySearch.java]
* @version [1.0]
* @since   [10-05-16]
*/

import java.util.*; // note: imports all classes inside java.util

public class BinarySearch {
    int size = 0, x, y, swap,find, array[]; ;
 
       
     public void binarysearch () {
        Scanner input = new Scanner(System.in);
        int left, right, middle;
        left = 0;
        right = array.length - 1;
        middle = (left + right) / 2;
        
        System.out.println("Enter Number you want to search :");
        int find = input.nextInt();
            while (left <= right) {
                middle = left + (right - left) / 2;
            if (array[middle] == find){
                System.out.println();
                System.out.println( "Found! \n" + find + " is at " + "array [" + (middle + 1) + "]");
            break; 
            }else if (find < array[middle]) {
                right = middle - 1;
            }else {
                left = middle + 1;
            }
        } 
            if (middle <= array.length)
            System.out.println("Not Found! \n" + find + " is not in the array");
     }

    public void bubbleSorting(int size) {
        array = new int[size];
        Random rand = new Random();
       
       for (x = 0; x < size; x++) {
           array[x] = rand.nextInt(1000);
           System.out.print(array[x] + " ");
       }
       System.out.println();
       
       for (x = 0; x < size-1; x++) {
           for (y = 0; y < size-x-1; y++) {
               if (array [y] > array[y+1]) {
                   swap = array[y];
                   array[y] = array[y+1];
                   array[y+1] = swap;
               }
           }
       }
       System.out.println();
       System.out.println("Bubble Sorting ... Done!");
       for (x = 0; x < size; x++) {
           System.out.print(array[x] + " ");
       }
       System.out.println("\n\n");
    }
   
    public static void main(String[] args) {
        int array [];
        Scanner input = new Scanner(System.in);
        BinarySearch look = new BinarySearch ();
      
        System.out.print("How many array size do you want to input:");
        int size = input.nextInt();     
        System.out.println(size + " random numbers generated.");
        look.bubbleSorting(size);
        look.binarysearch();
        
        
    }
    
}
