/**
* LINEAR SEARCH checks each item in a collection from start to end until a match is found. 
*
* @author  [Michael John Isip]
* @link    [https://github.com/mj-isip23]
* @version [1.1]
* @since   [09-26-2016]
*/

import java.util.Scanner;
import java.util.Random;


public class LinearSearch {
    
    int array[];
    
    public void LinearSearch(int size){
        array = new int[size];
    }
    
    public void Random(int size){
        Random randNum = new Random();
        for(int i=0; i<array.length; i++){
            array[i] = randNum.nextInt(500);
        }
    }
    
    public void Search(int search, int size){
        for(int i=0; i<array.length; i++){
            if(array[i] == search){
                System.out.println("Element found on index [" + i + "].");
                break;
            } if(i==array.length-1)
                System.out.println("Element not found.");
        }
    }
    
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        LinearSearch obj = new LinearSearch();
        
        System.out.print("Enter array size: ");
        int size = input.nextInt();

        //Show random numbers
        obj.LinearSearch(size);
        obj.Random(size);
        
        System.out.println();
        System.out.print("Element to be searched: ");
        int search = input.nextInt();
        
        obj.Search(search, size);
    }

}
