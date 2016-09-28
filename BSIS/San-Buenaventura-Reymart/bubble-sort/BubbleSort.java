import java.util.Scanner;
import java.util.Random;

public class BubbleSort{
	public static void main(String[]args){
	
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		int size, array[];
		
		
	System.out.println("\t\t *** BUBBLE SORT ***");
	System.out.println("PLEASE ENTER THE ARRAY SIZE: ");
	size = input.nextInt();
	array = new int[size];
	
	System.out.println("GENERATING RANDOM VALUES...");
	for (int i= 0 ;i<size;i++ ){
	array[i] = rand.nextInt(size);
	}
	
	System.out.println("VALUES GENERATED:");
	for(int i=0;i<size;i++){
		System.out.println("INDEX ["+(i+1)+"]"+array[i]);
		
	}
	System.out.println();
	System.out.println("SORTING...");
		for(int i=0;i<size-1;i++){
			for(int j=0;j<size-i-1;j++){
				
				int temp;
				if(array[j]> array[j+1]){
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
				
			}
			
		}
		
	System.out.println("\t\t****SORTED ARRAY****");
	for(int i=0;i<size;i++){
		System.out.println("INDEX ["+(i+1)+"]"+array[i]);
		
	}
	}
}