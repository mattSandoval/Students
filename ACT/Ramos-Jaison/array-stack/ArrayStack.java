/**
* Java implementation of a stack using array.
* For demo purpose, should hold a maximum of 10 string values.
*
* @author  [Jaison Ramos]
* @link    [https://github.com/jan-jaison25/DSA/blob/master/ArrayStack_ramos/src/ArrayStack.java]
* @version [version number]
* @since   [last updated 06/10/2016]
*/

import java.util.Scanner;
public class ArrayStack {
	public static void mian(String[]args){}
		
		private int capacity;
		  private int top = 0;
		  private String[] storage;
		  
		  public ArrayStack(int size) {
		    
		    capacity = size;
		    storage = new String[capacity];
		  } 

		  public void show() {
		      for (int j = capacity-1; j >= 0; j--) { 
		      for (int i = capacity-1; i >= 0; i--) {
		        System.out.println("stack[" + j-- + "]= ");
		      }
		    }
		    System.out.println();
		  }
		  
		  private boolean isEmpty() {
		    if (storage[0] == null) {
		      
		      System.out.println("storage is empty");
		         System.out.println();
		      return true;
		    } 
		    return false;
		  }

		  private boolean isFull() {
		    if (top == capacity) {
		         System.out.println("storage is FULL");
		            System.out.println();
		      return true;
		    } 
		    return false;
		  }

		  public void push(String value) {
		    if (isFull()) {
		     
		      System.out.println("ADD FAILED");
		    } else {
		      System.out.println("... trying to push on stack[" + top + "] ...");
		      storage[top] = value;
		      top ++;
		      System.out.println(value + " was successfully added.");
		      System.out.println();
		    }
		  }

		  public void pop() {
		    if (isEmpty()) {
		      
		      System.out.println("REMOVE FAILED.");
		    } else {
		      System.out.println("... trying to pop stack[" + (top-1) + "] ...");
		      storage[top] = null;
		      top--;
		      System.out.println(storage[top] + " was successfully removed.");
		      System.out.println();
		    }
		  }

		  public void peek() {
		    if (storage[top] == storage[0]) {
		      System.out.println("PEEK TOP = " + storage[top]);
		      System.out.println();
		    } else {
		      System.out.println("PEEK TOP = " + storage[top-1]);
		      System.out.println();
		    }
		  }
		  
		  public static void main(String[] args) {
		    		    ArrayStack storage = new ArrayStack(10);
		    System.out.println("STORAGE CAPACITY = " + storage.capacity);
		    System.out.println();
		  
		    storage.push("one");
		    
		    storage.push("two");
		   
		    storage.push("three");
		   
		    storage.push("four");
		    
		    storage.push("five"); 
		   
		    storage.push("six"); 
		    storage.push("seven"); 
		    storage.push("eight"); 
		    storage.push("nine");    
		    storage.push("ten"); 
		   
		  }  

		}
