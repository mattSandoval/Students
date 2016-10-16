/*
 * @author	[Josel Charille De Mesa]
 * @link	[@chadenggg]
 * @version	[Version number]
 * @since	[last updated 12/10/16]
 * 
 */

package BENGBENG;


import java.util.Scanner;
import java.util.Random;


public class SumAveMax {
   
        Scanner input = new Scanner(System.in);
        Random c  = new Random();
  
        int array[]; int sum = 0 , max = 0 ;
        double average = 0 ; int size;
   
        
    public void show(){
            
       System.out.print("Input Array Size : " ) ;
            size=input.nextInt();
            array = new int [size];
            
                for (int a = 0 ; a < size; a++){
                    array[a]=c.nextInt(1000);
                    System.out.print("(" +array[a]+")" +" ") ;           
            }
        }
        
    
       public void max() {
		for(int a = 0; a < size; a++)
                {
			if(array[a] > max)
                        max = array[a];
		}
                System.out.println();
		System.out.print("Max Number  : " + max);
	}
	
	public void sum()
        {
		for(int a = 0; a < size; a++)
                {
		sum = sum + array[a];
		}
        System.out.println();        
		System.out.print("Sum : " + sum);
	}

	public void average() {
                 System.out.println();
		 average = sum / size;
		 System.out.print("Average : " + average);		 
	}
    
        public static void main(String [] args){
             SumAveMax print = new SumAveMax();
            
            
            print.show();
            print.sum();
            print.average();
            print.max(); 
            
            
        }
        
}
