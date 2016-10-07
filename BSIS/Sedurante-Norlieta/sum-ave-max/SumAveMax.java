/**  * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
* - Accepts keyboard input to set array size.
* - Generate random numbers accordingly.
* - Get the sum, average, and maximum value

* SOURCE CODE: SumAveMax.java
* AUTHOR NAME: Sedurante, Norlieta I.
* GITHUB URL: [https://github.com/norlietasedurante/SumAveMax]
* LAST UPDATE: [10/07/2016]
*
* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
*/

package sumavemax;

import java.util.Random;
import java.util.Scanner;

public class SumAveMax {

	static int[] array;
	static int ArraySize;
	static int sum;

    public static void main(String[] args) {

  
 
 
            
            Scanner Input = new Scanner(System.in);
		Random Rand = new Random();
		System.out.print("Enter number you want : "); 
		ArraySize = Input.nextInt();
		array = new int[ArraySize]; 
                System.out.println();
                for(int a=0; a<ArraySize;a++){
                    array[a] = Rand.nextInt(1000);
                }
		input();
		getSum();
		getAve();
		getMax();	
	}
	
	static public void input(){	
                int x=0;
                        
		for(int a = 0; a < ArraySize; a++){
			System.out.print(array[a]+"\t");
                        x+=1;
                        if(x==10){
                            System.out.println();
                            x=0;
                        }
                        
		}System.out.println();
	}
	
	static public void getSum(){	
		for(int a = 0; a < ArraySize; a++){
			sum = sum + array[a];
		}
		
		System.out.println("Sum = " + sum);
	}
	
	static public void getAve(){
		int ave = sum / ArraySize;
		System.out.println("Average = " + ave);
	}
	
	static public void getMax(){
		int max = 0;
		for(int a = 0; a < ArraySize; a++){
			if(array[a] > max)
				max = array[a];
		}
		System.out.println("Max = " + max);
	}
        
	

}
    
    

    

