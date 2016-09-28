/** 
* - Accepts keyboard input to set array size.
* - Generate random numbers accordingly.
* - Get the sum, average, and maximum value
*
* @author  [your full name here]
* @link    [full github url]
* @version [version number]
* @since   [last updated dd/mm/yyyy]
*/

import java.util.Scanner;
import java.util.Random;

public class Arrays {
	 int array[];
	private int arrSize;
	private int sum =0;
	private int max=0;
	
	public Arrays(int size){
		arrSize = size;
		array = new int[arrSize];
		
	}
	
	
	public void show(){
		System.out.println("HERES YOUR ARRAY WITH VALUES:");
		for (int i=0; i<arrSize; i++){
			System.out.println("INDEX ["+(i+1)+"]:" +array[i]);
		}
		System.out.println();
	}
	
	public void getSum(){
		
		for(int i=0;i<6;i++){
			sum += array[i];
	}
		System.out.println("SUM: "+sum);
	}
	
	public void getAve(){
		double average =0;
		average = sum / array.length;
		System.out.println("AVERAGE: "+average);
	}
	
	public void getMax(){
		for(int i=0;i<array.length;i++){
			if(array[i]>max){
				max=array[i];
	}
			
			}System.out.println("MAX: "+max);
		}
	
	public void GetValues(){
		Scanner in = new Scanner(System.in);
		System.out.println("Please ENTER the values of the array~");
		for(int i=0;i<arrSize;i++){
			System.out.print("INDEX ["+(i+1)+"]: ");
			array[i] = in.nextInt();
			
		}System.out.println();
	}
	
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		int size;
		
		System.out.println("PLEASE ENTER THE SIZE OF THE ARRAY: ");
		size = input.nextInt();
		
		
		
		Arrays array = new Arrays(size);
		
		array.GetValues();
		array.show();
		array.getSum();
		array.getAve();
		array.getMax();
		
		

}
}
