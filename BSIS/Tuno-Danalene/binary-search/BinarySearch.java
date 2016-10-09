/* @author [Danalene Laxamana Tuno]
* @link    [https://github.com/dandanalene]
* @version [10.7]
* @since   [last updated 10/9/2016]
*/
import java.util.*;

public class BinarySearch {
    static int index,size, search, array[];

    public static void main(String[] args) 
    {
       Scanner da = new Scanner (System.in);
       Random LL = new Random();

       System.out.print("Enter array size: ");
       size = da.nextInt();
       array = new int [size];

       System.out.print(size+ " random numbers generated.");
       System.out.println();


       for(int i=0; i < array.length; i++)
       {
           array[i] = d.nextInt(1000);
       }

       bubbleSort (array);
       System.out.println();

       System.out.print("Enter number to find: ");
       search = da.nextInt();
       index = BinarySearch(array, search);

       if (index != -1) 
       {
          System.out.print("Found: " +search+ " is at " + "array ["+index+"]");
       }
       else 
       {
          System.out.println("Not found: " +search+ " is not in the array.");

       }
   }

    static int BinarySearch(int[] numbers, int find)
    {
      int left, right, middle;
      right = numbers.length - 1;
      left = 0;
      

       while (left <= right)
       {
        middle = left+(right-left)/2;

        if (numbers[middle]==find)
        {
          return middle;

        }
        else if (find<numbers[middle])
        {
          right=middle-1;
        }
        else 
        {
          left=middle+1;
        }
      }
          return -1;
    }

    static int bubbleSort(int[] arr)
    {
      int x, y , swap;

      for (x=0; x < size-1 ; x++)
      {
        for (y = 0; y < size-x-1; y++)
        {

          if (array[y] > array[y+1]) 
          {
            swap = array[y];
            array[y] = array[y+1];
            array[y+1] = swap;
            
          }
        }
      }

      for (x=0; x<size ; x++ ) 
      {
          System.out.print(array[x] + " "); 
      }

      return 0;
    }

}
