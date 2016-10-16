/*
 * @author	[Josel Charille De Mesa]
 * @link	[@chadenggg]
 * @version	[Version number]
 * @since	[last updated 12/10/16]
 * 
 */

package BENGBENG;

import java.util.*;
public class LinearSearch {

	public static void main(String [] args){
		
		Scanner input = new Scanner(System.in);
		Random output = new Random();
		
		int array[] , size , search , i ; 
		
		System.out.print("Enter array size : " ) ;
		size=input.nextInt();
		array = new int[size];
		
		System.out.print(size +" inputted array " ) ;
		System.out.println();
		System.out.print("Enter array to be search : " ) ;
		search=input.nextInt();

		
			for(i=0 ; i<size; i++){
			
			array[i]=output.nextInt(2);
				
				if(array[i]==search){
				
				System.out.println("FOUND:" +search +" is at " +"array"+ "[" +(i+1) +"]" );
				
				break;
			}
		}	
		
			if(i == size){
				System.out.println("\n");
				System.out.print("NOT FOUND : " +search +" is not in the array");
				System.out.println("\n\n\n");
			}
			
			System.out.print("THANK YOU FOR USING MY PROGRAM");
		
		
		
	}
	
}
