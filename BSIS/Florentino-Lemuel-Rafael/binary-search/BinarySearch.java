/**
* BINARY SEARCH is a Divide and Conquer algorithm that compares the item with the middle element of a sorted (ascending) array. 
* Each step, the size of array is reduced to half until one single element remain and a match is found.
*
* @author  [your full name here]
* @link    [full github url]
* @version [version number]
* @since   [last updated dd/mm/yyyy]
*/

import java.util.*; // note: imports all classes inside java.util

public class BinarySearch {

	import java.util.*;

public class BinarySearch {
    static int array[], index, size, search;
    
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        Random rand = new Random();
        
        System.out.print("Enter array size: ");
        size = input.nextInt();
        array = new int [size];
        
        System.out.println(size + " random numbers generated.");
        System.out.print("GENERATED NUMBERS: ");
        for (int i=0 ; i<array.length ; i++){
            array[i] = rand.nextInt(1000);
            System.out.print(" " + array[i]);
        }
        
       bubbleSort(array);
        
        System.out.print("Enter number to find: ");
        search = input.nextInt();
        
        index = binarySearch(array,search);
        
        if (index != -1){
        	System.out.print("FOUND: " + search + " is at array[" + index + "]");
        }
        else {
        	System.out.print("NOT FOUND: " + search + " is not in the array.");
        }
    }
    
    
    
    
    static int binarySearch(int[] numbers, int find){
    	int left=0, right=size-1, middle=(left+right)/2;
    	
    	while (left <= right){
    		middle = left + (right - left)/2;
    		if (numbers[middle] == find){
    			return middle;
    		}
    		else if (find < numbers[middle]){
    			right = middle - 1;
    		}
    		else {
    			left = middle + 1;
    		}
    	}
    	
    	
    	return -1;
    }   
    
    
    
    
    static int bubbleSort(int[] arr){
    	int x,y,swap;
    	System.out.println();
    	for (x=0 ; x<size-1 ; x++){
    		for (y=0 ; y<size-x-1 ; y++){
    			if (array[y] > array[y+1]){
    				swap = array[y];
    				array[y] = array[y+1];
    				array[y+1] = swap;
    			}
    		}
    	}
    	
    	System.out.print("\nBubble Sorting... Done!\n");
    	
    	System.out.print("SORTED ARRAY: ");
    	for(int a=0 ; a<size ; a++){
    		System.out.print(array[a] + " ");
    	}
    	System.out.println("\n");
    	
    	return 0;
    }
}

}
