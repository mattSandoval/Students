
import java.util.Scanner;
import java.util.Random;

public class BubbleSort {
    
    int array[], swap;
    
    public BubbleSort(int size){
        array = new int[size];
    }
    public void toRand(int size){
        Random rand = new Random();
        
        for ( int i = 0; i < size; i++ ){
            array[i] = rand.nextInt(1000);
        }
        
    }
    public void show(int size){
        int y = 0;
        for ( int x = 0; x < size; x++){
            System.out.print(array[x] + "\t");
            y += 1;
            if ( y == 10 ){
                System.out.println();
                y = 0;
            }
        }
    }
    public void bublsrt(int size){
        for ( int j = 0; j < size; j++ ){
            for ( int l = 0; l < size-j-1; l++ ){
                if (array[l] > array[l+1]){
                    swap = array[l];
                    array[l] = array[l+1];
                    array[l+1] = swap;
                }
            }
        }
        System.out.println("\n\nSorted Array: ");
        int y = 0;
        for ( int x = 0; x < size; x++){
            System.out.print(array[x] + "\t");
            y += 1;
            if ( y == 10 ){
                System.out.println();
                y = 0;
            }
        }
    }

    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
          
          System.out.print("Enter Array Size: ");
          int size = input.nextInt();
          
          BubbleSort obj = new BubbleSort(size);
          
          obj.toRand(size);
          obj.show(size);
          obj.bublsrt(size);
          
    }
    
}
