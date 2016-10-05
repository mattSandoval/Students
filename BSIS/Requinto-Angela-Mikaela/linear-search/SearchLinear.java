/**
* LINEAR SEARCH checks each item in a collection from start to end until a match is found. 
*
* @author  Renaldo Valente
* @link    https://github.com/arrowbrave
* @version 1.1
* @since   22/09/2016
*/

import java.util.Scanner;
import java.util.Random;

public class SearchLinear {
	 private int[] array;
	    
	    public void LinearSearch(int size){
	        array = new int[size];
	        Random rand = new Random();
	        for(int i = 0; i < array.length; i++){
	            array[i] = rand.nextInt(10000);
	        }
	    }
	    
	    public void show(){
	        int line = 0;
	        System.out.println();
	        for(int i = 0; i < array.length; i++){
	            System.out.print(array[i] + "\t");
	            line += 1;
	            if(line == 10){
	                System.out.println();
	                line = 0;
	            }
	        }
	    }

	    public void Search(int search, int size){
	        for(int i = 0; i < array.length; i++){
	            if(array[i] == search){
	                System.out.print("FOUND! At index [" + i + "]");
	                break;
	            }
	            if( i == size-1){
	                System.out.print("NOT FOUND! \n");
	                break;
	            }
	        }
	    }
	    
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        SearchLinear SearchLinear = new SearchLinear();
	       
	        System.out.print("Enter the ARRAY size: ");
	        int size = input.nextInt();
	        SearchLinear.LinearSearch(size);
	        
	        SearchLinear.show();
	        
	        System.out.print("\nEnter the NUMBER to find: ");
	        int search = input.nextInt();
	        SearchLinear.Search(search, size);
	        System.out.println();
	    }
}
