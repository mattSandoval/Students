/**
* BINARY SEARCH is a Divide and Conquer algorithm that compares the item with the middle element of a sorted (ascending) array. 
* Each step, the size of array is reduced to half until one single element remain and a match is found.
*
* @author  [john deleon]
* @link    [@Johndeleon]
* @version [final build]
* @since   [9-29-16]
*/

import java.util.Scanner;
import java.util.Random;
public class BinarySearch {
    
    
    int left=0, right, middle, find, elements, swap, id;
        
        Scanner in = new Scanner(System.in);
        Random ran= new Random();
        int [] array;
    
    
    public static void main (String[] args){
        
        BinarySearch li = new BinarySearch();
        
        System.out.println("enter number of elements");
        li.elements=li.in.nextInt();
        li.array=new int[li.elements];
         li.right=li.elements-1;       
        for (int i=0;i<li.elements;i++){
            li.array[i]=li.ran.nextInt(100);
        }

        
        li.Sorter();
        
        for (int i=0;i<li.elements;i++){
            System.out.print(li.array[i]+", ");
        }
        
        li.Search();
    }
    
    
    
    
    
       public void Sorter(){
            
                       for (int i=0;i<elements-1;i++){
    for (int j=0;j<elements-i-1;j++){
        
        
        if (array[j]>array[j+1]){
            swap=array[j];
            array[j]=array[j+1];
            array[j+1]=swap;
            
        }
        
        
    }
}
        }
       
       
       
       
       public void Search(){
           
                 System.out.println("\n\nenter number to find");
        find=in.nextInt();
           
           
           while (left<=right){
               middle= (left+right)/2;

               if (array[middle]==find){
                   System.out.println("number found at index"+middle);
                   break;
               }
else if (array[middle]<find)
{left=middle+1;
}

else
{right = middle-1;}

           }
           
            if (array[middle]!=find){
                   System.out.println("number not found");
                  
               }
    
              
        
                  
           
       }
      
       
        
    }
