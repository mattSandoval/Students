/** 
* - Accepts keyboard input to set array size.
* - Generate random numbers accordingly.
* - Get the sum, average, and maximum value
*
* @author  [Kent Dayrit]
* @link    [https://github.com/lvcc-dsa/Students/edit/master/BSIS/Dayrit-Kent/sum-ave-max/SumAveMax.java]
* @version [version 1]
* @since   [10/6/16]
*/
package jrandom;
import java.util.*;

public class ArrayRandom {
		int sum=0,num;
		int max=0;
		double average;
		int how;
		int  array [];
		
		public void getAve(){
			
		
				average=(sum/array.length);
				
				System.out.println("Average :" +average);
		
		}
		
		public void getSum(){
			for (int i = 0; i<=how-1;i++){
				sum = sum+array[i];			
			}
			System.out.println("Sum :" +sum);

		}

		public void getMax(){

			
			for (int m=0; m<=how-1; m++ ){
				if (array[m]>max){
					max=array[m];
				}		
			}
			System.out.println("Max:" +max);
		}
		
		public void getInput(){
			
			Scanner input = new Scanner (System.in);
				Random rad = new Random();
			
		 System.out.println("How many Numbers: ");
			
			how= input.nextInt();	
			array= new int[how];
			
			for(int r=0; r<=how-1;r++){
			
				  array[r]=rad.nextInt(1000);
			  }
			
			for (int p=0;p <=how-1; p++){
				System.out.print(array[p]+"  ");
				
			}
			
			System.out.println();
		
		 
		}
		
		
		public static void main(String[]args){
			ArrayRandom arrayobject = new ArrayRandom();
				
				arrayobject.getInput();
				arrayobject.getSum();
				arrayobject.getAve();
				arrayobject.getMax();
		}

	}




