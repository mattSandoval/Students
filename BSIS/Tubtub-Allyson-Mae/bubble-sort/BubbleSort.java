package bubblesort;
import java.util.*;
public class BubbleSort {

    public static void main(String[] args) {
        int sizeArray, temp = 0, array[];
        Scanner input = new Scanner (System.in);
        System.out.print("Enter array size: ");
        sizeArray = input.nextInt();
        array = new int[sizeArray];
        
        
        for( int i = 0; i < array.length; i++){
            // will input values
            System.out.print("numbers[" + i + "]= ");
            array[i] = input.nextInt();
            
            //
        }
   //     for(int j = 0; j < sizeArray-1; j++){                        
    //        }
        for(int i = 1; i <= array.length-1; i++){
            if(array[i] > array[i-1]){
                temp = array[i];
                    array[i] = array[i-1];
                    array[i-1] = temp;
            }
            System.out.println("number[" + (i-1) + "]: " + temp );
   }
}
}
