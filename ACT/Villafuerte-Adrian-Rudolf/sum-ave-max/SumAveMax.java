
/** @author  [Adrian Villafuerte]
*  @since   [last updated 06/10/2016]
*/

import java.util.Scanner;
import java.util.Random;
public class SumAveMax {

public static void main(String[] args) {
	Scanner upe = new Scanner(System.in);
	Random Upe = new Random();
		System.out.print("Please enter array size: ");
  int size = upe.nextInt();
  int capacity[]= new int[size];
    		for (int a = 0; a < capacity.length; a++) {
       	 capacity[a] = Upe.nextInt(100)+1;
        	System.out.println(" Random number for?  ["+(a+1)+"]: "+capacity[a]);
     
        
    }
       		int total = 0;
        	for (int i = 0; i < capacity.length; i++) {
        	total = total+capacity[i];
    }
    	    System.out.println("SUM = "+ total);
        	double average = total/capacity.length;
        	System.out.println("Avarage = "+ average);
        	int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < capacity.length; i++) {
               if ( capacity[i] > max)
                max = capacity[i];
        }
   
        System.out.println("MAX = "+max);
        
                    
        
    
}
}
