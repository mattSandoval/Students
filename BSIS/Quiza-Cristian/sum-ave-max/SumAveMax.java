/** 
* - Accepts keyboard input to set array size.
* - Generate random numbers accordingly.
* - Get the sum, average, and maximum value
*
* @author  [Cristian E. Quiza]
* @link    [http://github.com/kirisaite]
* @version [version 1.0]
* @since   [last updated 04/10/1016]
*/

import java.util.Random;
import java.util.Scanner;
public class SumAveMax {

 int [] array;
 int sum=0;
 int max=0;
 double average = 0;
 int arraySize;
 
 public SumAveMax (int size){
  arraySize = size;
  array = new int [arraySize];

  
 }
 public void getArray(){
  
  Random rand = new Random();
  
  for (int i = 0; i < arraySize; i++){
   array[i]=rand.nextInt(100);
   System.out.println("Random[" +i+ "] = " + array[i]);
  }
  System.out.println();
 }
 
 
 public void show(){
  
  for (int i = 0; i < arraySize; i++){
   
   System.out.println ( array[i]);
  }
  
 }
 public void getSum(){
  
  for (int i = 0; i < array.length; i++){
   sum += array[i];
  }
  System.out.println("SUM" + "= " + sum);
  
 }
 public void getAverage(){
  
  for (int i = 0; i < array.length; i++){
   
   average = sum / array.length;
   
  }
  System.out.println("Average" + "= " + average);
  
 }
 public void getMax(){

  for (int i = 0; i < array.length; i++){
   
   if (array[i] > max){
    max = array[i];
   }
   
  }
  System.out.println("MAXIMUM" + " = " + max);
  
  
 }
 
 public static void main (String[] Args){
  
  int size;
  Scanner input = new Scanner (System.in);
  
  System.out.println("Enter array size: " );
  size = input.nextInt();
  
  
  SumAveMax summon = new SumAveMax (size);
  summon.getArray();
  summon.getSum();
  summon.getAverage();
  summon.getMax();
  
  
  
 
 }
}
