package find.min.max;

import java.util.Random;
import java.util.Scanner;

public class FindMinMax {

    public static void main(String[] args) {
        int array[];
        //int []numbers = {88, 33, 55, 23, 64, 123};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
       
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Enter array size: ");
        int size = input.nextInt();
        array = new int[size];
        System.out.print("Random " + size + " numbers: ");
        for(int i = 0; i < size; i++){
            array[i] = rand.nextInt(1000);
            System.out.print(array[i] + " ");
            if(array[i] > max)
                max = array[i];
        }
        System.out.println();
        System.out.println();
        
        for(int i = 0; i < array.length; i++){
            if (min > array[i])
                min = array[i];
            if(array[i] > max)
                max = array[i];
        }
        System.out.println("Smallest number is " + min);
        System.out.println("Largest number is " + max);
    }
}
