/**
* LINEAR SEARCH checks each item in a collection from start to end until a match is found. 
*
* @author  Zabala Abner
* @link    https://github.com/zabalaabner
* @version 1.1
* @since   10/06/2016
*/
import java.util.Scanner;
import java.util.Random;

public class LinearSearchA {
	public int [] array;
	public int number;
	
	
	public void setter (int Arraysize){
		array = new int [Arraysize];
		Random rand = new Random ();
			for (int i = 0; i < Arraysize; i++)
			{array [i] = rand.nextInt(100);}
	}

	public void search(){
	for (int i =0 ; i < array.length; i++) {
		if (array[i] == number) {
			System.out.println("Search Complete!");
			System.out.println("The number was located on "+ "Array[" + i + "] between Array ["+ array[(i-1)]+"]" + "Array ["+array[(i+1)] +"]" );
			break;
		}
		else {System.out.println ("The number you seek is not here!);}}
		
		}
	
	
	public void show () {
	for (int a =0; a < array.length; a++) 
	{System.out.print(array[a] + " ,");}
	}


	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		LinearSearchA storage = new LinearSearchA();
	
		System.out.println("Enter the Array size: ");
		int Arraysize = input.nextInt();
		storage.setter(Arraysize);
		System.out.println("What number do you want to search: ");
		int number = input.nextInt();
		storage.search();
		System.out.println ("Do you want to view the entire array? [1/0]");
		int answer = input.nextInt();
		
			if (answer == 1){
				storage.show();
			}
			
			else {
				System.out.println("Error! Input incorrect program Closing!");				
			}
	}
}
