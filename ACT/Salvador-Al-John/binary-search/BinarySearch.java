package binarysearch;
import java.util.Scanner;

public class BinarySearch {
	private static int capacity;
    private int begin=0;
    private static int[] numbers;
    
	public BinarySearch(int size){
        capacity = size;
        numbers = new int[capacity];
    }
	
	public void push(int value){
        System.out.print("'" + value + "' was succesfully added.\n\n");
        numbers[begin] = value;
        begin++;
    }
	
	public int search(){
		int left, right, middle, find;
        Scanner input = new Scanner (System.in);
        
        left = 0;
        right = capacity-1;
    	middle = left + (right-left) / 2;
    	
        System.out.print("\n\nWhat is the number you want to find? ");
        find = input.nextInt();
        
        while (left < right){
        	if (BinarySearch.numbers[middle] == find){
        		System.out.print("Found! The number is at index[" + middle + "]");
        		return middle;
        	}
        	else if (find < BinarySearch.numbers[middle]){
        		left = middle + 1;
                System.out.print("Not found!");
        	}
        	else {
        		right = middle - 1;
                System.out.print("Not found!\n");
        	}
        }
        
        System.out.print("\nThe left is " + BinarySearch.numbers[left]);
        System.out.print("\nThe middle is " + BinarySearch.numbers[middle]);
        System.out.print("\nThe right is " + BinarySearch.numbers[right]);
        return 0;
	}
	
	public static void main(String [] args){
		int limit=0;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
        Scanner input = new Scanner (System.in);
        
        System.out.print("\t*-------------* Binary Search *-------------*\n\n");
        System.out.print("What is the capacity of storage: ");
        limit = input.nextInt();
        BinarySearch numbers = new BinarySearch(limit);
       
        System.out.print("STORAGE CAPACITY: " + limit + "\n\n");
        
        for (int i=0 ; i<limit ; i++){
        System.out.print("Input number[" + i + "]: ");
        int user = input.nextInt();
        numbers.push(user);
        }
        
        
        for (int x=0 ; x<limit ; x++){
        	if (BinarySearch.numbers[x] < min)
        		min = BinarySearch.numbers[x];
        	if (BinarySearch.numbers[x] > max)
        		max = BinarySearch.numbers[x];
        }
        
        System.out.println("Smallest number is " + min);
        System.out.println("Largest number is " + max);
        
        numbers.search();
    }
}
	

