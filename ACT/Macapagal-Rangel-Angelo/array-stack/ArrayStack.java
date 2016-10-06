/*
 Java Implementation of stack using array.
 For demo, purposes,shoul hold a maximum of 10 string value.
 
 @Author: Rangel Angelo C. Macapagal
 @Link: https://github.com/Rangel-Cruz-Macapagal
 @Version: 1.0
 @Since: 06/10/2016
 */


import java.util.*;

public class ArrayStack {
  
  private int capacity;
  private int top = 0;
  private String[] storage;
  
  public ArrayStack(int size) {
   capacity = size;
    storage = new String[10];
  } 

  public void show() {
   
    for (int j = capacity-1; j >= 0; j--) { 
      for (int i = capacity-1; i >= 0; i--) {
    	  System.out.println("stack["+j--+"]="+ storage[i]);
      }
    }
    System.out.println();         
  }
  
  private boolean isEmpty() {
    if (storage[0] == null) {
     
      System.out.println("Storage is Empty");
      return true;
    } 
    return false;
  }

  private boolean isFull() {
    if (top == capacity) {
     System.out.print("Storage is Full");
   
      return true;
    } 
    return false;
  }

  public void push(String value) {
    if (isFull()) {
     
      System.out.println();
    } else {
      System.out.println("> > > trying to push on stack[" + top + "] > > >");
      storage[top] = value;
      top++;
     
      System.out.println(value + " was successfully added.");
      System.out.println();
    }
  }

  public void pop(String value) {
    if (isEmpty()) {
     
      System.out.println("Pop Failed!");
    } else {
      System.out.println("> > > trying to pop stack[" + (top-1) + "] > > >");
      storage[top] = storage[top-1];
      top--;
     
      System.out.println(value + " was successfully removed.");
      System.out.println();
    }
  }

  public void peek() {
    if (storage[top] == storage[0]) {
      System.out.println("Peek Top = " + storage[top]);
      System.out.println();
    } else {
      System.out.println("Peek Top = " + storage[top-1]);
      System.out.println();
    }
  }
  
  public static void main(String[] args) {
  int max=10;
   ArrayStack storage= new ArrayStack(10);
    System.out.println("STORAGE CAPACITY = "+storage.capacity );
    System.out.println();
    
    storage.show();
 

    storage.peek();
    storage.push("one");
    storage.show();
  
    storage.push("two");
    storage.show();
   
    storage.push("three");
    storage.show();
  
    storage.push("four");
    storage.show();
   
    storage.push("five"); 
    storage.show();
   
    storage.push("six"); 
    storage.show();
    
    storage.push("seven"); 
    storage.show();
    
    storage.push("eight"); 
    storage.show();
    
    storage.push("nine");  
    storage.show();
    storage.push("ten"); 
   
  }  

}
