/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
* BINARY SEARCH is a Divide and Conquer algorithm that compares the item with the middle element of a sorted (ascending) array. 
* Each step, the size of array is reduced to half until one single element remain and a match is found.
*
*
* SOURCE CODE: ArrayStack.java
* AUTHOR NAME: Sedurante, Norlieta  I.
* GITHUB URL: [https://github.com/norlietasedurante/DSA-ArrayStack]
* LAST UPDATE: [07/31/2016]
*
* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
*/

package binary.search;


import java.util.Random;
import java.util.Scanner;


public class BinarySearch {
    private static int x;

   
    public static void main(String[] args) {
     
     Scanner input = new Scanner(System.in);
         Random  nory = new Random();

    int c, left, right, middle, size, n,  search, array[],table =0;
    int find_index=-1;
   
    System.out.print("Enter number of elements:");
    size = input.nextInt(); 
    array = new int[size];
 
     System.out.println();
     
     System.out.println( size + " Random number to be generated  ");
    
         
       
         System.out.println();
         for (int x=0 ; x < size ; x++)
            { array[x] = nory.nextInt(1000);
                System.out.print(array[x] + "\t");
                table+=1;
                 if(table==10){
                System.out.println("");
                table=0;
             }
                
        }
         
         for ( int x = 0; x <size-1; x++){
             for  (int y= 0 ; y< size-x-1; y++){
                if (array[y] > array [y+1]){
                  int swap = array [y];
                  array[y] = array [y+1];
                  array [y+1] = swap;
                  
              }
         }
                 
         }
 
    System.out.println();
    System.out.println (" Bubble sorting ....DONE ");
            
            for (int x=0 ; x < size ; x++)
            { 
                System.out.print(array[x] + "\t");
                table+=1;
                 if(table==10){
                System.out.println("");
                table=0;
        }
                
        }
        System.out.println();
        System.out.print("Enter value to find: ");
        search = input.nextInt();
        
    left  = 0;
    right  = array.length-1;
    middle = (left+ right)/2;
 
            while( left <= right ){
                   middle = left +(right - left )/2;
        
                if ( array[middle] < search ){
                    left = middle + 1; 
                }      
                else if ( array[middle] == search ) {
                    System.out.println(search + " found at location " + (middle+1) + "." );
                    break;
                }
                else{
                 right = middle - 1;
                }
                middle= (left + right)/2;
                if ( left > right )
                {
                    System.out.println( search + " is not present in the list ");
                    
                }
    
   }
    }      
    }

  
    


