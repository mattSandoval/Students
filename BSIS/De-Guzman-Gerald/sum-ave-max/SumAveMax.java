/** 
* - Accepts keyboard input to set array size.
* - Generate random numbers accordingly.
* - Get the sum, average, and maximum value
*
* @author  [Gerald M. De Guzman]
* @link    [igooop]
* @version [version number]
* @since   [last updated 05/10/2016]
* 
*/

import java.util.*;

public class SumAveMax {
    
        Scanner input = new Scanner(System.in);
        Random igo = new Random();
  
        int array[];
        int sum=0 , max=0 ;
        double average=0 ; 
        int size;
        
        public void show(){
            
            System.out.print("Please enter Array size : " ) ;
            size=input.nextInt();
            array = new int [size];
            
                for (int i = 0 ; i<size; i++){
                    array[i]=igo.nextInt(1000);
                    System.out.print(array[i]+" , ") ;
                   
            }
        }
        
       public void max() {
		for(int i = 0; i < size; i++){
			if(array[i] > max)
				max = array[i];
		}
                System.out.println();
		System.out.print("The Max number is = " + max);
	}
	
	public void sum(){
		for(int i = 0; i < size; i++){
			sum = sum + array[i];
		}
                System.out.println();
                System.out.println();
		System.out.print("The Sum is = " + sum);
	}

	public void average() {
                 System.out.println();
		 average = sum / size;
		 System.out.print("Average = " + average);
		 
	}
    
        public static void main(String [] args){
            
            SumAveMax print = new SumAveMax();
            
            print.show();
            print.sum();
            print.max();
            print.average();
            
        }
        
}
