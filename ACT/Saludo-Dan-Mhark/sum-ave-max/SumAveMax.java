package hola;
import java.util.Scanner;
import java.util.Random;

public class SumAveMax {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	int yes;
	System.out.println("Enter Array Size:");
	yes = input.nextInt();
	int [] size= new int[yes];
	for (int i = 0; i < yes; i++){
    System.out.print("Number["+ i + "]:"); 
	size[i] =input.nextInt();
    input.nextLine();
	

	
	}
	
	int sum = 0;
	for (int i=0; i <= size.length-1 ; i++ ){
	sum = sum + size[i];
	}
	double average = sum/ size.length;
	System.out.println("");
	System.out.println("");
	
	System.out.println("Sum= " + sum);
	System.out.println("Average = " + average);
	
	int max = size[0];
	for (int i=0; i <= size.length-1 ; i++ )
		if (size[i] > max)
			max = size[i];
	
	System.out.println("Max = " + max);
	}
}

	
