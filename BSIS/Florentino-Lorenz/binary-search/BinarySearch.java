/**
* BINARY SEARCH is a Divide and Conquer algorithm that compares the item with the middle element of a sorted (ascending) array. 
* Each step, the size of array is reduced to half until one single element remain and a match is found.
*
* @author  [Lorenz C. Florentino]
* @link    [github.com/lorenzhahaha]
* @version [1.1]
* @since   [05 October 2016]
*/

package binarysearch;
import java.util.*;

public class BinarySearch {
    
    static int array[], index, size, search;
    
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
       Random rand = new Random();
       
       System.out.print("*------------ BINARY SEARCH ------------*\n\n");
       System.out.print("Enter array size: ");
       size = input.nextInt();
       array = new int [size];
       
       System.out.println(size + " random numbers generated.\n");
       
       for (int i=0 ; i<array.length ; i++){
            array[i]=rand.nextInt(1000);
            System.out.print(array[i] + " ");
       }

       bubblesort();
       
       System.out.print("\n\nEnter number to find: ");
       search = input.nextInt();
       index = binarysearch(array,search);
       
       if (index!=-1){
           System.out.println("FOUND: " + search + " is at array[" + index + "].");
       }
       else {
           System.out.println("NOT FOUND: " + search + " is not in the array.");
       }
    }

static int binarysearch(int[] numbers, int find) {
        int left=0, right=array.length-1, middle;
        
        while (left<=right){
            middle = left + (right-left) / 2;
            if (numbers[middle] == find){
                return middle;
            }
            else if (find < numbers[middle]){
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return -1;
    }

static int bubblesort(){
	int x, y, swap;
		
		for (x=0 ; x<size-1 ; x++){
			for (y=0 ; y<size-x-1 ; y++){
				
				if (array[y] > array[y+1]){
					swap = array[y];
					array[y] = array[y+1];
					array[y+1] = swap;
				}
			}
		}
		
		System.out.print("\nSorted number: ");
		for (x=0 ; x<size ; x++){
			System.out.print(array[x] + " ");
		}
	return 0;
	}
}
