/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linearsearch;
import java.util.*;
import java.util.Random;
/**
 *
 * @author Me
 */
public class LinearSearch {
     public static void main(String[] args) {
        int i, size, search, array[];
        
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        
        System.out.print("Enter array size: ");
        size = input.nextInt();
        array = new int[size];
        
        System.out.print("Enter number to find: ");
        search = input.nextInt();
        
        for (i = 0; i < size; i++) {
            array[i] = rand.nextInt(1000);
            if (array[i] == search) {
                System.out.println("FOUND: " + search + " is at " + "array[" + i + "]");
                break;
            }
        }
        
        if (i == size) {
            System.out.println("NOT FOUND: " + search + " is not in the array.");
        }
    }
}

        
     