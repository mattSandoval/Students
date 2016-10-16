/*Russel Ricohermoso
ACT-2
 */
package findminmax;
import java.util.Random;
import java.util.Scanner;

public class FindMinMax {

    public static void main(String[] args) {
        int[] numbers = {34,23,12,45,67,324};
        Scanner russel = new Scanner(System.in);
        Random sel = new Random();
        System.out.print("Enter Array Size? ");
        int sel = russel.nextInt();
        int wews[]= new int[rein];
    for (int j = 0; j < wews.length; j++) {
        wews[j] = sel.nextInt(100)+1;
        System.out.println("Random Number: "+deg[j]);
        }
    int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < deg.length; i++) {
            if ( min > wews[i])
                min = wews[i];
            if ( wews[i] > max)
                max = numbers[i];
      
    }
      System.out.println("Smallest number is "+min);
        System.out.println("LArgest number is "+max);
    }}
