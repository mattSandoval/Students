/*
Reinerio H. de Guzman
ACT-2
*/
package linearsearch;

import java.util.Scanner;
import java.util.Random;

public class LinearSearch {

        public static void main(String[] args) {
    Scanner Reinerio = new Scanner(System.in);
    Random rei = new Random();
    int deg[];
    System.out.print("Enter Array Size? ");
        int Size = Reinerio.nextInt();
         deg= new int[Size];
        System.out.print("Find number: ");   
        int find = Reinerio.nextInt();
    for (int r = 0; r < deg.length; r++) {
        deg[r] = rei.nextInt(100)+1;
        if (deg[r]==find){
            System.out.println("Found "+find+" at array ["+r+"]");
        }
        if (r==deg.length-1){
            System.out.println("Not Found "+find);
        }
       
        }
    }
    
}

