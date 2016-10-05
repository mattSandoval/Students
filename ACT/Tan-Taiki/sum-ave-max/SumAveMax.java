/** 
* - Accepts keyboard input to set array size.
* - Generate random numbers accordingly.
* - Get the sum, average, and maximum value
*
* @author  [taiki tan]
* @link    [full github url]
* @version [2.0]
* @since   [05/10/2016]
*/

import java.util.Scanner;
import java.util.Random;
public class SumAveMax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application lopublic static void main(String[] args) {
		int i, max = 0, size;
		int sum = 0;
		double ave;
        Scanner copy = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		size = copy.nextInt();
		 int numbers[] = new int[size];
	        Random rnd  = new Random();
		for(i = 0;i < numbers.length; i++){
			numbers[i] = rnd.nextInt(100);
		}
		for(i = 0; i < numbers.length; i++){
			System.out.print(numbers[i]+", ");
		}
		for(i = 0; i < numbers.length; i++){
			sum+=numbers[i];
		}
		System.out.println();
		System.out.println("Total = "+sum);
		ave = sum/numbers.length;
		System.out.println("Average = "+ave);
		for(i = 0; i < numbers.length; i++){
			if (max < numbers[i]+1){
				max = numbers[i];
			}
		}
		System.out.println("Max = "+ max);
		
		
}
}
    
