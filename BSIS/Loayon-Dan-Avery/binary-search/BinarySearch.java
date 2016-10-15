
import java.util.Scanner;
import java.util.Random;

public class BinarySearch {
    
    int array[];
    int arraySize, swap;
    
    public BinarySearch(int size){
        arraySize = size;
        array = new int[arraySize];    
    }
    public void genRan(){
        Random ran = new Random();
        System.out.println("\nRandom Generated Values:");
        for (int i = 0; i < arraySize; i++ ){
            array[i] = ran.nextInt(1000);
        }
        System.out.println("\nThese are the Random Values of your Array: ");
        for ( int b = 0; b < arraySize; b++ ){
        }
    }
    public void sort(){
        System.out.println("\nSorted Array: ");
        for ( int j = 0; j < arraySize-1; j++ ){
            for ( int l = 0; l < arraySize-j-1; l++ ){
                if (array[l] > array[l+1]){
                    swap = array[l];
                    array[l] = array[l+1];
                    array[l+1] = swap;
                }
            }
        }
    }
    public void show(){
        for( int x = 0; x < arraySize; x++ ){
            System.out.println("\nIndex[" + (x+1) +"]: " + array[x]);

        }
    }
    
    public void search(int x){
        int mid, left = 0, right = arraySize-1, search;
        search = x;
        
        while(left <= right){
            mid = left + (right - left)/2;
            
            if(array[mid] == search){
                System.out.println("Search value found! At Index[" + (mid+1) + "]. ");
                
                return;
            }else if (search > mid){
                left = mid + 1;
            }else if (search < mid){
                right =  mid - 1;
            }
        }
        if(left > right){
            System.out.println("Search value not Found.");
        }
    }
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int size, search;
        
        System.out.print("Please enter array Size: ");
        size = input.nextInt();
        
        BinarySearch array = new BinarySearch(size);
        
        array.genRan();
        array.show();
        array.sort();
        array.show();
        System.out.println();
        
        System.out.print("What number do you want to search[0-1000]: ");
        search = input.nextInt();
        
        array.search(search);
        
    }
}
