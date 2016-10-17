/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */

import java.util.*;

public class sumavemax {

	int [] arraysize;
	int size, capacity;

	public sumavemax (int size) {
		capacity = arraysize;
		arraysize = new int [capacity];
	}

	public int findMax(int []arraysize) {

		int temp = arraysize[0];

		for (int i = 0; i < arraysize.length - 1; i++) {
			if (temp < arraysize[i+1]) {
				temp = arraysize[i+1];
			}
		}

		return temp;
	}

	public int findMin(int []arr) {

		int temp = arraysize[0];

		for (int i = 0; i < arraysize.length - 1; i++) {
			if (temp > arraysize[i+1]) {
				temp = arraysize[i+1];
			}
		}

		return temp;
	}

	public int findTotal (int []arraysize) {
		int total = 0;

		for (int i = 0; i < arraysize.length; i++) {
			total += arraysize[i];
		}

		return total;
	}

	public int findAve (int []arraysize) {
		int total = 0;

		for (int i = 0; i < arraysize.length; i++) {
			total += arraysize[i];
		}

		int ave = total / arraysize.length;

		return ave;
	}
	
	public static void main(String [] args) {

		Scanner input = new Scanner (System.in);

		int ramil;

		System.out.println();
		System.out.print("Enter array size: ");
		ramil = input.nextInt();
		System.out.println();

		SumAveMax sison = new SumAveMax (ramil);

	for (int i = 0; i < ramil; i++) {
			System.out.print("Enter value number " + (i+1) + ": ");
			sison.arraysize[i] = input.nextInt();
		}
		System.out.println();


	for (int i = 0; i < ramil; i++) {
			System.out.print(sison.arraysize[i] + " ");
		}
	System.out.println();
	System.out.println("The size of your Array is: " + sison.capacity);
	System.out.println("The highest  array is: " + sison.findMax(sison.arraysize));
	System.out.println("The lowest  array is: " + sison.findMin(sison.arraysize));
	System.out.println("The total  array is: " + sison.findTotal(sison.arraysize));
	System.out.println("The average  array is: " + sison.findAve(sison.arraysize));

	}
}