/**
* BINARY SEARCH is a Divide and Conquer algorithm that compares the item with the middle element of a sorted (ascending) array. 
* Each step, the size of array is reduced to half until one single element remain and a match is found.
*
* @author  [Sarah Pangan]
* @link    [https://github.com/Saaraah22]
* @version [version number]
* @since   [17/10/2016]
*/

package binarysearch;

import java.util.Random;
import java.util.Scanner;
public class BinarySearch {
    
    private int[] arr;
    
    public void BinarySearch(int size){
        arr = new int[size];
        Random rand = new Random();
        System.out.print("\t\t\t      RANDOMIZED ARRAY\n");
        int line = 0;
        for(int i = 0; i < size; i++){
      arr[i] = rand.nextInt(10000);
            System.out.print(arr[i] + "\t");
            line+=1;
            if (line == 10){
                System.out.println();
                line = 0;
            }
        }
        int temp = 0;
        for(int q = 0; q < size-1; q++){
            for(int w = 0; w < (size-q)-1; w++){
                if(arr[w] > arr[w+1]){
                    temp = arr[w];
                    arr[w] = arr[w+1];
                    arr[w+1] = temp;
                }
            }
        }
        System.out.print("\n\n\t\t\t\tSORTED ARRAY\n");
        line = 0; 
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + "\t");
            line+=1;
            if (line == 10){
                System.out.println();
                line = 0;
            }
        }
    }
    
    public void toFind(int find){
        int left = 0, right = arr.length;
        int middle = ((left+right)/2)-1;
        int found = 0;
        do{
            for(int i = left; i < middle; i++){
                if(arr[i] == find){
                System.out.print("FOUND! At index ["+i+"]\n");
                found = 1;
                break;
                }
            }
            if(arr[middle] == find){
                System.out.print("FOUND! At index ["+middle+"]");
                found = 1;
                break;
            }else{
                left = middle +1;
                middle = (left+right)/2;
            }
        }while(found == 0&&middle!=right);
        
        if(found == 0){
            System.out.print("NOT FOUND\n");
        }  
    }
    static int array[], index, size, search;
    public static void main (String[]args){
  
        Scanner input = new Scanner(System.in);
		Random rand = new Random();
 
		System.out.print("Enter array size: ");
		size = input.nextInt();
		array = new int[size];

		System.out.println(size + " random numbers generated.");
		
		for (int i = 0; i < array.length; i++) {
                    array[i]=rand.nextInt(1000);
		}
		
                bubbleSort(array);
		System.out.println();
		
		System.out.print("Enter number to find: ");
                search= input.nextInt();
		index = binarySearch(array, search);
		
		if (index != -1) {
			System.out.println("FOUND: " + search + " is at " + "array["+index+"]");
		}
		else {
			System.out.println("NOT FOUND: " + search + " is not in the array.");
		}

	}

	static int binarySearch(int[] numbers, int find) { 

		int left=0, right= numbers.length-1, middle;
		while (left <= right) {
			middle = left + (right - left) / 2;
			if (numbers[middle] == find) {
				return middle;
			} else if (find < numbers[middle]) {
				right = middle - 1;
			} else { 
				left = middle + 1;
			}
		}
		return -1;

	}
	
	static int bubbleSort(int[] array) {

             int size, x, y, swap;
            for (x = 0; x < array.length-1; x++) { 
			for (y = 0; y < array.length-x-1; y++) { 
				if (array[y] > array[y+1]) { 
					swap = array[y]; 
					array[y] = array[y+1]; 
					array[y+1] = swap; 
                                }
                        }
            }
            for(int i=0; i<array.length; i++){
                System.out.print(array[i]+ " ");
            } return 0;
        }
}
