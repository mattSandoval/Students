/** 
* - Accepts keyboard input to set array size.
* - Generate random numbers accordingly.
* - Get the sum, average, and maximum value
*
* @author  [Sarah Mae Ponce]
* @link    [https://github.com/Saranghae08]
* @version [version number]
* @since   [10/16/2016]
*/

import java.util.*

public class SumAveMaaax{
   	private int Sum, Max, Size, s;
	private Array[];
 	private float Average;
  
public SumAveMaaax(){
    Scanner input = new Scanner (System.in);
    Random rand = new Random ();

    System.out.print("Enter array size: ");
    Size = input.nextInt();
    Array = new int [Size];
    System.out.println();

    System.out.print(Size + "Random numbers: ");
    for(int s = 0; s < Size; s++) {
      Array[s] = rand.nextInt(1000);
      System.out.print(Array[s] + " ");
      Sum += Array[s];
       if (Array[s] > Max)
           Max = Array[s];
    }

    System.out.println();

  }

    public void getSum(){
      System.out.println("Sum = " + Sum + " .");
  }

    public void getMax(){
    System.out.println("Max= " + Max + " .");
  }

    public void getAverage(){
    Average=(float) Sum/Size;
    System.out.println("Average= " + Average);
  }

    public static void main (String []args){
    SumAveMaaax sample = new SumAveMaaax();

    sample.getSum();
    sample.getMax();
    sample.getAverage();
  }
}
                       
