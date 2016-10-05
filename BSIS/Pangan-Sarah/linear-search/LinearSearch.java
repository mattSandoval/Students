/**
* LINEAR SEARCH checks each item in a collection from start to end until a match is found. 
*
* @author  Sarah Pangan
* @link    https://github.com/Saaraah22
* @version 1.1
* @since   05/10/2016
*/

import java.util.Scanner;
import java.util.Random;
public class Linear {
    public static void main(String[] args) {

		int i, size, search, array[],x=0;

		Scanner input = new Scanner(System.in);
		Random rand = new Random();

		System.out.print("Enter array size: ");
                size = input.nextInt();
		array = new int[size];	
                
                for (i = 0; i < size; i++) {
                    array[i]= rand.nextInt(1000);
                        System.out.print(array[i] + "\t");
                        x++;
                        if(x==5){
                            System.out.println();
                            x=0;
                        }
                }

		System.out.print("\nEnter number to find: ");
                search=input.nextInt();

		for (i = 0; i < array.length; i++) {
			if (array[i] == search) {
				System.out.println("\nFOUND: " + search + " is at " + "array["+i+"]");
				break;
                        }
                        if(array[i]==size-1){
                            System.out.println("\nNOT FOUND: " + search + " is not in the array.");
                        }
                }
    }
}
