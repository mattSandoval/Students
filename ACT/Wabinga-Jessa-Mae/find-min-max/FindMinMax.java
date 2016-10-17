import java.util.*;

public class FindMinMax {

	static Scanner c = new Scanner (System.in);
	public static void main (String[] args)
	{
		System.out.println("enter array size: ");
		int n=c.nextInt(); 

		int arr[]=new int[n]; 
		System.out.println("enter elements: ");
		for(int i=0;i<n;i++)
		{
			arr[i]=c.nextInt();	
		}

		int smallest = arr[0];
		int large = arr[0];
		for(int i=0; i< arr.length; i++)
		{
			if(arr[i] > large)
				large= arr[i];
			else if (arr[i] < smallest)
				smallest = arr[i];
		}




		System.out.println("Largest Number is : " + large);
		System.out.println("Smallest Number is : " + smallest);	
		

	}
}
