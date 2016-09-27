/**
* LINEAR SEARCH checks each item in a collection from start to end until a match is found. 
*
* @author  [Eldrin M. Bernardino]
* @link    [https://github.com/ldrin01]
* @version [version number]
* @since   [last updated 28/09/2016]
*/

import java.util.Scanner;
import java.util.Random;
public class LinearSearch {
    
    private int[] arr;
    
    public void LinearSearch(int size){
        arr = new int[size];
        Random rand = new Random();
        for(int i = 0; i < arr.length; i++){
            arr[i] = rand.nextInt(10000);
        }
    }
    
    public void show(){
        int line = 0;
        System.out.println();
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + "\t");
            line += 1;
            if(line == 10){
                System.out.println();
                line = 0;
            }
        }
    }

    public void toSearch(int search, int size){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == search){
                System.out.print("FOUND! At index [" + i + "]");
                break;
            }
            if( i == size-1){
                System.out.print("NOT FOUND\n");
                break;
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinearSearch call = new LinearSearch();
       
        System.out.print("Enter array size: ");
        int size = input.nextInt();
        call.LinearSearch(size);
        
        call.show();
        
        System.out.print("\nEnter number to find: ");
        int search = input.nextInt();
        call.toSearch(search, size);
        System.out.println();
    }
}
