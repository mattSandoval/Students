/*
Binary Search is a Divide and Conquer algorithm that compares the item with the middle element of a sorted (ascending) array.
Each step, the size of array is reducted to half until one single element remain and a match is found.
 
 @Author: Rangel Angelo C. Macapagal
 @Link: https://github.com/Rangel-Cruz-Macapagal
 @Version: 1.0
 @Since: 06/10/2016
 */

package binarysearch;
import java.util.*;
	public class binarysearch {
		
		public static void main(String[]args){
		Scanner in= new Scanner(System.in);
		Random t= new Random ();
		
		int[] array = new int[10];
		int search =0,index;
		int size;
		
		System.out.println("Enter Array Size: ");
		size=in.nextInt();
		array =new int[size];
		
		for(int i=0;i<size;i++){
			array[i] = t.nextInt(1000);
			System.out.println(array[i]+" ");
		}
		System.out.print("Enter Number To be Find:");
		search=in.nextInt();
		index = binarysearch(array,search);
		if(index!= -1){
			System.out.println("Found at index " +index);
		}
		else{
			System.out.println("Not Found!!");
		}
}
	
static int binarysearch(int[]numbers,int find){
	int left, right, middle;
	left=0;
	right= numbers.length -1;
	while(left <=right){
		middle =(left +right)/2;
		if(numbers[middle]==find){
			return middle;
		}
		else if(numbers[middle] <find){ 
			left=middle+1;
		}
		else{
			right=middle-1;
		}
	}
	return-1;
}
}
