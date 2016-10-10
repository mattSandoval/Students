/*
Reinerio H.de guzman
ACT-2
 */
package findminmax;
import java.util.Random;
import java.util.Scanner;

public class FindMinMax {

    public static void main(String[] args) {
        int[] numbers = {34,23,12,45,67,324};
        Scanner reinerio = new Scanner(System.in);
        Random rei = new Random();
        System.out.print("Enter Array Size? ");
        int rein = reinerio.nextInt();
        int deg[]= new int[rein];
    for (int j = 0; j < deg.length; j++) {
        deg[j] = rei.nextInt(100)+1;
        System.out.println("Random Number: "+deg[j]);
        }
    int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < deg.length; i++) {
            if ( min > deg[i])
                min = deg[i];
            if ( deg[i] > max)
                max = numbers[i];
      
    }
      System.out.println("Smallest number is "+min);
        System.out.println("LArgest number is "+max);
    }}

    
