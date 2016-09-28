/** 
* - Accepts keyboard input to set array size.
* - Generate random numbers accordingly.
* - Get the sum, average, and maximum value
*
* @author  [john deleon]
* @link    [@Johndeleon]
* @version [final build]
* @since   [9-29-16]
*/

import java.util.Scanner;
import java.util.Random;


public class SumAveMax {
    
     int size=0;
     int[] array;
     int sum=0;
     double ave=0;
     int max=0;
 
     Random r = new Random();
     
    public static void main (String[] args){
       
        
        SumAveMax link = new SumAveMax();
         
         
        Scanner input=new Scanner(System.in);
        
        System.out.print("enter size of array: ");
       link.size=input.nextInt();
        
       link.array = new int [link.size];
        
      
        
        for (int i=0;i<link.size;i++){
            link.array[i]=link.r.nextInt(); 
        }
        
        
        link.getTotal();
        link.getAve();
        link.getMax();
        
        
                
          for (int i=0;i<link.size;i++){
            System.out.println("index "+i+": "+link.array[i]);
        }
          
          System.out.println("\ntotal: "+link.sum);
          System.out.println("average: "+link.ave);
          System.out.println("max: "+link.max);
          
    }
    
    public void getTotal(){
        for (int i=0;i<size;i++){
        sum=sum+array[i];
    }
    }
    
    public void getAve(){
     ave=sum/array.length;
}
    
    public void getMax(){
     for (int i=0;i<size;i++){
        if (array[i]>max){
            max=array[i];
        }
    }
}
}
