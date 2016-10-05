/**
* LINEAR SEARCH checks each item in a collection from start to end until a match is found. 
*
* @author  Cristine Amie Rigo
* @link    https://github.com/amierigo/DSA/blob/master/LinearSearch.java
* @version 1.1
* @since   10-05-16
*/
import java.util.Scanner;
import java.util.Random;

public class LinearSearch {
    
    private int[] array;
    
    public void LinearSearch(int size){
        array = new int[size];
        Random rand = new Random();
        for(int i = 0; i < array.length; i++){
            array[i] = rand.nextInt(1000);
        }
    }
    
    public void show(){
        int x = 0;
        System.out.println();
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + "\t");
            x += 1;
            if(x == 10){
                System.out.println();
                x = 0;
            }
        }
    }

    public void toSearch(int search, int size){
        for(int i = 0; i < array.length; i++){
            if(array[i] == search){
                System.out.println("FOUND! At index [" + i + "]");
                break;
            }
            if( i == size-1){
                System.out.println("NOT FOUND\n");
                break;
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinearSearch look = new LinearSearch();
       
        System.out.print("Enter array size: ");
        int size = input.nextInt();
        look.LinearSearch(size);
        look.show();
        System.out.println();
        System.out.println("Enter number to find: ");
        int search = input.nextInt();
        look.toSearch(search, size);
        System.out.println();
    }
}

