import java.util.*;
public class FindMinMax {
	int [] arrange;
	int capacity;
	int size;
	
	public FindMinMax (int size){
	capacity = size;
	arrange = new int [capacity];
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int arraysize;
		
		System.out.println("Enter size of an array: ");
		arraysize = input.nextInt();
		System.out.println();
		
		FindMinMax find = new FindMinMax (arraysize);
		for (int a = 0; a < arraysize; a++){
			find.arrange[a] = 1+(rand.nextInt(100));
			
			if (min > find.arrange[a]) {
				min = find.arrange[a];
			}
			if (max < find.arrange[a]){
				max = find.arrange[a];
			}
			
			System.out.println(find.arrange[a]);
		}
		System.out.println();
		
		System.out.println("The largest number is " + max);
		System.out.println("The smallest number is " + min);
		
		
		
	}
}
