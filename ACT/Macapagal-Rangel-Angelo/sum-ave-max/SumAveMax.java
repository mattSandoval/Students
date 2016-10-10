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
public class SumAveMax {
	private int sum,max,size,array[];
	private float Ave;
	

public SumAveMax() {
	  Scanner in= new Scanner(System.in);
	  Random t= new Random();
	  System.out.print("Enter Array Size: ");
	  size= in.nextInt();
	  array =new int[size];
	  System.out.println("Random "+size+" numbers: ");
	  for(int i=0;i<size;i++){
		  array[i]=t.nextInt(1000);
		  System.out.print(array[i]+" ");
		  sum += array[i];
		  if(array[i]>max){
			  max=array[i];
		  }
		 System.out.println(); 
	  }
}	  
	  public void getSum(){
		  System.out.println("SUM ="+sum);
	  }
	  
	  public void getMax(){
		  System.out.println("MAX ="+max);
	  }
	  
	  public void getAve(){
		  Ave=(float) sum/size;
		  System.out.println("Avearge ="+Ave);
	  }
	  
	  
	  public static void main(String []args){
		  SumAveMax demo= new SumAveMax();
		  demo.getSum();
		  demo.getAve();
		  demo.getMax();
		 
	  }
	  
 
}

