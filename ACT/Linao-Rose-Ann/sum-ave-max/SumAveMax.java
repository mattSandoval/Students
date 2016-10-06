/**
* @author  Rose Ann D. Linao
* @link    https://github.com/RoseAnnLinao
* @version 1.2
* @since   06/10/2016
*/

import java.util.*;

public class Sum_Ave_Max {

    public static void main(String[] args) {
        int[] array = { 10, 100, 50, 33, 5 };
        int sum = 0; int max = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] > max) {
                max = array[i];
            }
            System.out.println("array["+i+"]= " + array[i]);
            sum += array[i];
        }
        double average = (double) sum / array.length;
        System.out.println();
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
        System.out.println("Max = " + max);
    }
    
}
