/**
* BINARY SEARCH is a Divide and Conquer algorithm that compares the item with the middle element of a sorted (ascending) array. 
* Each step, the size of array is reduced to half until one single element remain and a match is found.
*
/*
 BubbleSort.java
 Angela Mikaela R. Requinto
 Bsis-2
 Github.com/AngelaRequinto
 September 21'16
 */

import java.util.Scanner;
import java.util.Random;

public class BinarySearch {

    public static void main(String[] args) {
     
     Scanner input = new Scanner(System.in);
         Random  rand = new Random();

    int c, left, right, middle, n = 0, search, size, array[], table =0;

        
    System.out.print("Enter number of ELEMENTS:");
  
      size = input.nextInt();
        array = new int [size];
        System.out.println();
         System.out.print( size + " Random number to be generated  ");
         
         System.out.println();
         for ( int x = 0; x< size; x++){
             array[x] = rand.nextInt(1000);
             
             System.out.print(array[x] + "\t");
             table+=1;
             
             
             if(table==10){
             System.out.println("");
             table=0;
             }
         }
         System.out.println();
      
         for ( int x = 0; x <size-1; x++){
             for  (int y= 0 ; y< size-x-1; y++){
              if (array[y] > array [y+1])
              {
                  int swap = array [y];
                  array[y] = array [y+1];
                  array [y+1] = swap;
                  
              }
         }
         }
         System.out.println();
         
        System.out.println (" Bubble Sorting .... DONE! ");
 
  for ( int x = 0 ; x< size ; x++){
            System.out.print(array[x] + "\t");
            table+=1;
            if(table==10){
             System.out.println("");
             table=0;
             }
        }
System.out.println();
 
    System.out.print("Enter value to FIND: ");
    search = input.nextInt();
 
    left  = 0;
    right = array.length -1;
    middle = (left+ right)/2;
 
    while( left <= right )
    {
        middle = (left + right)/2;
      
        if ( array[middle] == search ) 
        {
            System.out.println();
            System.out.println(search + " FOUND at location " + (middle) + ".");
            break;
        }
     
        else if ( array[middle] < search )
        left = middle + 1; 
        else if(array[middle]>search)
         right = middle - 1;
   }
    System.out.println();
    if(left>=right){
    	System.out.println(search + " \" is NOT FOUND in the list.\n");
    }
     if(search==n)
       {   
        System.out.println(search + " FOUND at location " + (middle) + ".");
       }

    }
}
