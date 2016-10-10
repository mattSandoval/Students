/** 
* - Accepts keyboard input to set array size.
* - Generate random numbers accordingly.
* - Get the sum, average, and maximum value
*
* * @author  [Reinerio H. De guzman]
* @link    [https://github.com/reineriodeguzman]
* @version [version number]
* @since   [last updated 10/10/2016]
*/
package sumavemax;

import java.util.Scanner;
import java.util.Random;

public class SumAveMax {

public static void main(String[] args) {
Scanner reinerio = new Scanner(System.in);
Random rei = new Random();
System.out.print("Enter Array Size? ");
    int deg = reinerio.nextInt();
    int degu[]= new int[deg];
    for (int r = 0; r < degu.length; r++) {
        degu[r] = rei.nextInt(100)+1;
        System.out.println(" Random number for?  ["+(r+1)+"]: "+degu[r]);
     
        
    }
       int total = 0;
        for (int i = 0; i < degu.length; i++) {
        total = total+degu[i];
    }
        System.out.println("SUM = "+ total);
        double average = total/degu.length;
        System.out.println("Avarage = "+ average);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < degu.length; i++) {
               if ( degu[i] > max)
                max = degu[i];
        }
   
        System.out.println("MAX = "+max);
        
                    
        
    
}
}

