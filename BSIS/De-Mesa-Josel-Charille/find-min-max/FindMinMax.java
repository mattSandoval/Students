/*
 * @author	[Josel Charille De Mesa]
 * @link	[@chadenggg]
 * @version	[Version number]
 * @since	[last updated 12/10/16]
 * 
 */

package BENGBENG;
import java.util.*;
public class FindMinMax {
	
	  
    public static void main (String [] args){
        
    	Scanner de = new Scanner(System.in);
    	Random mesa = new Random();
    	
        int numbers[] , size  ;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
            
        	System.out.print("Enter array size :");
        	size=de.nextInt();
        	numbers = new int [size];
        	System.out.print("Group of numbers ");
        
            for(int i = 0 ; i<size ; i++){
            	
            	numbers[i]=mesa.nextInt(1000);
            	
            	if(i%5==0){
            	System.out.println();
            	System.out.print( +numbers[i] +" ");
            
            	}
            	else{
            	System.out.print( +numbers[i] +" ");
            	}
            	
                if(numbers[i] < min ){
                       min = numbers[i] ;
                }
                if(numbers[i] > max ){
                        max = numbers[i];
                }
                
            }
            System.out.println("\n");
            System.out.println("Smallest Number is : " +min);
            System.out.println("Largest Number is : " +max);
        
        
    }
    
    
    
}

	

