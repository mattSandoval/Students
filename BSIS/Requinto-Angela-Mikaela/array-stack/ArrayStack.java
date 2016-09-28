/**
* Java implementation of a stack using array.
/*
 ArrayStack.java
 Angela Mikaela R. Requinto
 Bsis-2
 Github.com/AngelaRequinto
 august 23,,2016
 */

package arraystack;

public class ArrayStack {


 private int capacity;
  private int top = 0;
  private String[] storage;
  
 
  public ArrayStack(int size) {
   
	capacity=size;
    storage = new String[capacity];
  }

  public void show() {
     for (int i = capacity-1; i >= 0; i--) {
      
    	System.out.println("stack["+i+"] = "+storage[i]);
    }
    System.out.println();
  }
  
  private boolean isEmpty() {
    if (storage[0] == null) {
      System.out.println("Stack is empty");
      System.out.println();
      return true;
    } 
    return false;
  }

  private boolean isFull() {
    if (top == capacity) {
      
        System.out.println("Stack is Full");
      return true;
    } 
    return false;
  }

  public void push(String value) {
    if (isFull()) {
      
      System.out.println("Add Failed");
      System.out.println();
    } else {
      System.out.println("... trying to push on stack[" + top + "] ...");
      storage[top] = value;
      
      top++;
      System.out.println(value + " was successfully added.");
      System.out.println();
    }
  }

  public void pop() {
    if (isEmpty()) {
      
    System.out.println("Removing failed");
      System.out.println();
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
    
	  ArrayStack ArrayStack= new ArrayStack (10);
    System.out.println("STORAGE CAPACITY = 	"+ArrayStack.capacity);
    System.out.println();
    
    ArrayStack.show();
    
    ArrayStack.pop();
    
    ArrayStack.peek();
    ArrayStack.push("one");
   
    ArrayStack.show();
    
    ArrayStack.peek();
    ArrayStack.push("two");
    
    ArrayStack.show();
    
    ArrayStack.peek();
    ArrayStack.push("three");
    
    ArrayStack.show();
    
    ArrayStack.peek();
    ArrayStack.push("four");
    
    ArrayStack.show();
    ArrayStack.push("five"); 
    
    ArrayStack.show();
   
    ArrayStack.pop();
    ArrayStack.push("six"); 
    ArrayStack.push("seven"); 
    ArrayStack.push("eight"); 
    ArrayStack.push("nine");    
    ArrayStack.push("ten"); 
    
    ArrayStack.show();
   
    ArrayStack.peek();
    
    ArrayStack.push("eleven");
    
    ArrayStack.push("twelve");
    
    ArrayStack.show();
    }
    
}
