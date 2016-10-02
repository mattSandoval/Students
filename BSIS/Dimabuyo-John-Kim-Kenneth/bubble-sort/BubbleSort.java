import java.util.*;

public class BubbleSort {
	public static void main(String[] args) {
		
		int n, c, d, swap;
		Scanner input = new Scanner(System.in);

		System.out.print ("Please enter the array size: ");
		n = input.nextInt();

		int array[] = new int [n];

		System.out.println ("Enter " + n + " integers");

		for (int i=0; i < n ; i++ ) {
			array[i] = input.nextInt();
		}
		
		System.out.println("Sorting ... Please wait");
		
		//swaping time!
		for (c = 0; c < n - 1; c++) {
			for (d =0; d < n-1-c; d++) {
				if (array[d] < array[d+1])
				{
					swap = array[d];
					array[d] = array [d+1];
					array[d+1] = swap;
				}
			}
		}
		
		System.out.println("Successfully sorted!");
		
		for (int i = 0; i < n; i++) {
			System.out.println(array[i]);
		}
	}
}
