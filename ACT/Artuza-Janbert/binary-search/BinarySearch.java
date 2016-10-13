/**
* BINARY SEARCH is a Divide and Conquer algorithm that compares the item with the middle element of a sorted (ascending) array. 
* Each step, the size of array is reduced to half until one single element remain and a match is found.
*
* @author  [Janbert Q Artuza]
* @link    [https://github.com/janbertartuza23]
* @version [1.0]
* @since   [last updated 13/Oct/2016]
*/
  package binarysearch;
    import java.util.*;
	public class binarysearch {
		
	 public static void main(String[]args){
	  Scanner input= new Scanner(System.in);
	  Random jan= new Random ();
		
	   int[] array = new int[10];
	   int search =0,index;
	   int size;
		
	  System.out.println("enter array size: ");
		size=input.nextInt();
		array =new int[size];
		
	  for(int i=0;i<size;i++){
			array[i] = jan.nextInt(1000);
			System.out.println(array[i]+" ");
		 }
	  System.out.print("enter number to be find :");
		search=input.nextInt();
		index = binarysearch(array,search);
	if(index!= -1){
		System.out.println("found" +index);
	}
	else{
		System.out.println("Not found!!");
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
