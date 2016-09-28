/** 
/*
 SumAveMax.java
 Angela Mikaela R. Requinto
 Bsis-2
 Github.com/AngelaRequinto
 September 7,2016
 */

import java.util.Scanner;
import java.util.Random;
public class SumAveMax {

	private int []array;
	private int sum=0;
	private int max=0;
	private int capacity;

	
	private SumAveMax(int num){
		capacity=num;
		array=new int[capacity];
	}
   public void Input(){
	   Scanner input=new Scanner(System.in);
	   for(int i=0;i<capacity;i++){
		   Random number = new Random();
		   array[i]=number.nextInt(1000);
		  
	   }
	 
	   for(int i=0;i<capacity;i++){
		   System.out.print( array[ i ]+ " " );
		   if(i%10==0){
			   System.out.println();
		   }
	   }
	   System.out.println();
   }
	
	
	
	public void Sum(){
		
		
		for(int i=0;i<capacity;i++){
			
			sum+=array[i];
			
		}
		System.out.println(" sum=  " + sum);
		}
		
	public void Average(){
		double average=sum/array.length;
		System.out.println(" average=  " + average);
	}
	
	public void Max(){
		
		for(int i=0;i<array.length;i++){
			if (array[i]>max)
				max=array[i];
		}
		System.out.println(" Max= "+max);
	}
	
	
	
	public static void main (String[]args){
		 Scanner input=new Scanner(System.in);
		int amount=0;
		System.out.println("please input the capacity:");
		amount=input.nextInt();
		SumAveMax SumAveMax =new SumAveMax(amount);
		SumAveMax.Input();
		SumAveMax.Sum();
		SumAveMax.Average();
		SumAveMax.Max();
	}
	
}
