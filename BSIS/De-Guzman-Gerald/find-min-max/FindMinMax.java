/**
* @author  [Gerald M. De Guzman]
* @link    [igooop]
* @version [version number]
* @since   [last updated 05/10/2016]
*/

import java.util.Scanner;
import java.util.Random;

public class FindMinMax {

    
    public static void main (String [] args){
        
    	Scanner igo = new Scanner(System.in);
    	Random ego = new Random();
    	
        int numbers[] , size ;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
            
        	System.out.print("Enter array Size : " ) ;
        	size=igo.nextInt();
        	numbers = new int [size] ;
         	System.out.print(size +" random numbers generated " );
         	System.out.println("\n");
    
            for(int i = 0 ; i<size ; i++){
         
            	numbers[i]=ego.nextInt(1000);
            	if(i%10==0){
            	System.out.println();
            	System.out.print(numbers[i]  +" , " ) ;
            	}
            	else{
            		System.out.print(numbers[i]  +" , " ) ;
            	}
            	if(numbers[i] < min ){
                       min = numbers[i] ;
                }
                if(numbers[i] > max ){
                        max = numbers[i];
                }    
           }
            System.out.println("\n\n");
            System.out.println("Smallest Number is : " +min);
            System.out.println("Largest Number is : " +max);
        
    }
}
