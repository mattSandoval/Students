/* @author [Danalene Laxamana Tuno]
* @link    [https://github.com/dandanalene]
* @version [10.7]
* @since   [last updated 10/16/2016]
*/
import java.util.Scanner;
import java.util.Random;

public class SumAverageMax 
{
	    private int s;
	    private int num=0;
	    private int[] array;

	public SumAverageMax(int size)
	{
	    s = size;
	    array = new int[s];
	}

	public void show()
	{
	    int x=0;

		for(int i=0; i<array.length;i++)
		{
		    System.out.print(array[i] + "\t");
		    x= x+1;
		     if (x == 5)
		     {
		      System.out.println( );
		      x=0;
		     }
		 } 
		System.out.println();
	 }

	public void input(int value)
	{
		array[num] = value;
		num++;
	}

	public void sum()
	{
	    System.out.print("SUM: ");
	    int result=0;
		
		for (int c=0 ; c<=s-1 ; c++)
		{
			result += array[c];
		}
	    System.out.print(result + "\n\n");
	}

	public void average()
	{
	    System.out.print("AVERAGE: ");
	    int ave;
	    int result=0; 

		for (int x=0 ; x<=s-1 ; x++)
		{
		    result += array[x];
		}
	   	 ave = (result/s);
	    	System.out.print(ave + "\n\n");
	}

	public void highest()
	{
	    System.out.print("The highest inputted number in the array is: ");
	    int max=array[0];

	    for (int y=0 ; y<=s-1 ; y++)
	    {
		if (max<=array[y]) 
		{
		   max=array[y];
		}
	    }
	    System.out.print(max + "\n\n");
	}

	    public static void main(String[] args) 
	    {
		Random rand = new Random();

		Scanner input = new Scanner(System.in);
		int size;

		System.out.print("Enter array size: ");
		size = input.nextInt();
		SumAverageMax dan = new SumAverageMax(size);
		 dan.array = new int[size];

		for (int x=1 ; x<size ; x++)
		{
		   dan.array[x] = rand.nextInt(1000);
		} System.out.println();

		dan.show();
		dan.sum();
		dan.average();
		dan.highest();
	    }

}
