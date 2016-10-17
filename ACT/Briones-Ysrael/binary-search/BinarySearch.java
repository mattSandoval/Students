/**
* BINARY SEARCH is a Divide and Conquer algorithm that compares the item with the middle element of a sorted (ascending) array. 
* Each step, the size of array is reduced to half until one single element remain and a match is found.
*
* @author  [Ysrael Carlos Briones]
* @link    [www.github.com/Bibleaffliction11]
* @version [version number]
* @since   [last updated 17/10/2016]
*/

import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {
        int[] array = new int [5];
        int search = 0, index;
        
        System.out.println("Enter 5 numbers: ");
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        System.out.print("Enter number to find: ");
        search = input.nextInt();
        index = binarysearch(array, search);
        if (index != -1) {
            System.out.println("FOUND at index " + index);            
        }else {
            System.out.println("NOT FOUND");
        }
    }
    
    static int binarysearch(int[] numbers, int find) {
        int left, right, middle;
        left = 0;
        right = numbers.length - 1;
        while (left <= right) {
            middle = (left + right) / 2;
            if (numbers[middle] == find) {
                return middle;
            }else if (numbers[middle] < find){
                left = middle + 1;
            }else {
                right = middle - 1;
            }
        }
        return -1;
        
    }
    
}
