

package linearsearch;

import java.util.Scanner;
import java.util.Random;
public class Linear {

    public static void main(String[] args) {
    Scanner Lessur = new Scanner(System.in);
    Random russel = new Random();
    int puso[];
    System.out.print("Enter Array Size? ");
        int Size = Lessur.nextInt();
         puso = new int[Size];
        System.out.print("Find number: ");  
        int find = Lessur.nextInt();
    for (int i = 0; i < puso.length; i++) {
        puso[i] = Lessur.nextInt(100)+1;
        if (puso[i] == find){
            System.out.println("Found "+find+" at array ["+i+"]");
        }
        if (i==puso.length-1){
            System.out.println("Not Found "+find);
        }
       
        }
    }
    
    
}


