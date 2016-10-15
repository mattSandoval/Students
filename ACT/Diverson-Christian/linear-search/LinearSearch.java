import java.util.Scanner;
import java.util.Random;

public class LinearSearch {
  
 public static void main(String[] args)
 {
     int i, size, search, array[], space = 0;
     
     Scanner input = new Scanner(System.in);
     Random rand = new Random();
     
     System.out.print("Enter array size: ");
     size = input.nextInt();
     array = new int[size];
     
     System.out.print("\nEnter number to find: ");
     search = input.nextInt();
     System.out.println("\nThe random numbers are:");
     for(i = 0; i < size; i++) {
        array[i] = rand.nextInt(1000);
        System.out.print(array[i]+"\t\t");
        space+=1;
        if (space == 5) {
        System.out.println();
        space = 0;
        }
        if (array[i] == search) {
           System.out.println("\nFound: " + search + " is at " + "array["+i+"]");
           break;
        }
     }
     
     if (i == size) {
        System.out.println("\nNOT FOUND: "+search+" is not in the array.");
     }
 }

}
