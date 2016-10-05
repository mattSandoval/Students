/**  * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
* - Accepts keyboard input to set array size.
* - Generate random numbers accordingly.
* - Get the sum, average, and maximum value

* SOURCE CODE: SumAveMax.java
* AUTHOR NAME: Sedurante, Norlieta I.
* GITHUB URL: [https://github.com/norlietasedurante/Totalmax_Array]
* LAST UPDATE: [09/01/2016]
*
* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
*/
package SumAveMax;

import java.util.Random;
import java.util.Scanner;

public class SumAveMax {

    

    
   int Array[];
    int sum;
    int max;
    int capacity; 
    int arraysize;
   
    

   public void show (){
       Scanner input = new Scanner (System.in);
       Random  nory = new Random();
       System.out.print("enter number:");
       arraysize = input.nextInt();
       Array = new int [arraysize];
        
       for (int i = 1; i < arraysize; i++) {
         
         if (i%10==0){
             System.out.println("\n");
               
         } 
         else{
             Array[i] = nory.nextInt(1000);
             System.out.print("\t" + Array[i]);
             
         }
          
    
    }
    System.out.println();
  }
   
   public void getsum(){
       for ( int i =0; i<arraysize; i++)
       {
           sum +=Array[i];
       }
       System.out.println("Sum " + sum);
       
   }
   public void getAve (){
        for (int  b=0; b < arraysize; b++){
            double average = sum /Array.length;
        }
        System.out.println("Ave " + sum/Array.length);
   }
   
   public void getmax(){
       for (int i =0; i< arraysize; i++)
       {
           if (Array[i]> max ) 
                max = Array[i];
       }
       System.out.println("Max " + max);
   }
   
   
    public static void main(String[] args) {
  
    
      Totalmax_Array A= new Totalmax_Array();
      
      
    
    System.out.println();
    
    A.show();
     System.out.println();
     
    A.getsum();
    A.getmax();
    A.getAve();
   
  
    
    }


    
}

 
