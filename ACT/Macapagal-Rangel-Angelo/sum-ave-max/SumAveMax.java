/** 
* - Accepts keyboard input to set array size.
* - Generate random numbers accordingly.
* - Get the sum, average, and maximum value
*
* @author  Rangel Angelo C. Macapagal
* @link   https://github.com/Rangel-Cruz-Macapagal
* @version 1.0
* @since  07/10/2016
*/

/*Rangel Angelo C. Macapagal
  ACT-2
  DSA
 */

import java.util.*;
import java.util.Random;
public class RandomTotalMax {
 public static void main(String[]args){
	 Scanner in=new Scanner(System.in);
	 Random t= new Random();
		int  size=0;
		int array[];
		int sum=0;

		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		
		
		System.out.print("Enter the number that you want:");
		size=in.nextInt();
		array =new int[size];
		System.out.println("Random "+size+" numbers:");
		
		
		
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]=t.nextInt(100));
		}
		sum=0;
		for(int i=0;i<array.length;i++){
			sum = sum +array[i];
		    }
		    double ave =(double) sum /array.length;
		    System.out.println("Sum ="+sum);
		    System.out.println("Average ="+ave);
		    max =array[0];
		    for (int i=0;i<array.length;i++){
		        if(min>array[i]){
					 min= array[i];
				 }
		    	if(array[i]>max){
					 max= array[i];
				 }
		    }
		    System.out.println("Max ="+max);
		    System.out.println("Min ="+min);
		    
		
 }
}


