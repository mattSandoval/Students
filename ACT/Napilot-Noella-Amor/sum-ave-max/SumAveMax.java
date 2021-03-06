/** 
* - Accepts keyboard input to set array size.
* - Generate random numbers accordingly.
* - Get the sum, average, and maximum value
*
* @author  [Noella Amor Napilot]
* @link    [@AmorNapilot]
* @version [version number]
* @since   [10-05-16]
*/
import java.util.Scanner;
public class SumAveMax{
 
  public static void main(String[]args){
    int[] array;
    int size, sum = 0, max = 0, i;
 
  System.out.println("Please enter an array size: ");
  Scanner input = new Scanner (System.in);
  size = input.nextInt();
  array = new int[size];
 
  for(i = 0; i < array.length; i++){    
   System.out.print("Please enter a number: ");
   array[i] = input.nextInt();
  
   if(array[i] >= max)
   max = array[i];
  }
  
  for(i = 0; i < array.length; i++){
    sum += array[i];
    double average = (double) sum / array.length;
    
   System.out.println("Array ["+(i+1)+"]: " + array[i]);
   System.out.println("SUM: " + sum);
   System.out.println("MAX: " + max);
   System.out.println("AVERAGE: " + average);
  }
  }
}  
