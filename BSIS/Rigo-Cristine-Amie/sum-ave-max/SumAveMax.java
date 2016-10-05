/** 
* - Accepts keyboard input to set array size.
* - Generate random numbers accordingly.
* - Get the sum, average, and maximum value
*
* @author  [Cristine Amie Rigo]
* @link    [https://github.com/amierigo/DSA/blob/master/SumAveMax.java]
* @version [2.1]
* @since   [10-05-16]
*/
import java.util.Scanner;
import java.util.Random;

public class SumAveMax {
    int array [] ;
    public int sum = 0; 
    public int max = 0;
    
    public void setter (int size) {
        array = new int[size];
        Random rand = new Random();
            for (int i =0; i < size; i++) {
            array [i] = rand.nextInt(100);
            }
        }
    
    public void show() {
        int x = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
            x++;
            if (x == 10) {
                System.out.println();
                x=0;
            }
        }
        System.out.println();
    }
 
    public void getSum() {
        for (int i=0; i<array.length; i++) {
            sum += array[i];
        } 
        System.out.print("\nSum \t: " + sum);
        System.out.println();
    }
  
    public void getAve() {
        double average = sum / array.length;
        System.out.print("Average : " + average);
        System.out.println();
    }
    
    public void getMax() {
        for (int i = 0; i < array.length; i++)
        max = array [i];
            System.out.print("Max \t: " + max);
            System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        TotalMax obj = new TotalMax ();
        
        System.out.print("How many array do you want to input : ");
        int num = input.nextInt();
        
        obj.setter(num);
        obj.show();
        obj.getSum();
        obj.getAve();
        obj.getMax();
    }
}
