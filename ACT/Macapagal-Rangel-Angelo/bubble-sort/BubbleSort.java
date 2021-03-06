/**
* BUBBLE SORT is based on the idea of repeatedly comparing pairs of 
* adjacent elements, then switching positions if they exist in the wrong order.
*
* @author Rangel Angelo C. Macapagal
* @link   https://github.com/Rangel-Cruz-Macapagal
* @version 1.0
* @since   06/10/2016
*/

import java.util.Scanner;
import java.util.Random;
public class BubbleSort {
	public static void main(String [] args){
		Scanner in=new Scanner(System.in);
		Random rand= new Random();
		int num, swap=0;
		int [] array;
		
		System.out.print("Enter the number of arrays you want to sort: ");
		num=in.nextInt();
		array=new int[num];
		
		for(int i=0; i<num; i++){
		System.out.println(array[i]=rand.nextInt(100));
			for(int j=0; j<i; j++){
				if(array[j]<array[j+1]){
					swap=array[j];
					array[j]=array[j+1];
					array[j+1]=swap;
				}
			}
		}
		
		System.out.println();
		
		System.out.println("Bubble Sorting was Done!!!");
		
	}
}
