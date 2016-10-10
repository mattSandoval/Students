/**
* Java implementation of a stack using array.
* For demo purpose, should hold a maximum of 10 string values.
*
* @author  Lemuel Rafael C. Florentino
* @link    www.github.com/lemlemz22
* @version v1.0
* @update   October 10, 2016
*/

import java.util.Arrays;
public class ArrayStack {

  private int capacity;
  private int top = 0;
  private String[] storage;
  
  public ArrayStack(int size) {
    stackSize = size;
    storage = new String[size];
  }

  
  public void show() {
    for (int i = capacity; i >= 0; i--) {
    }
    System.out.println("stack[" + i + "] = " + stackArray[i]);
  }
  
  private boolean isEmpty() {
    if (storage[0] == null) {
      System.out.println("STORAGE is EMPTY.");
      System.out.println();
      return true;
    } 
    return false;
  }

  private boolean isFull() {
    if (top == capacity) {
      System.out.println("STORAGE is FULL");
      return true;
    } 
    return false;
  }

  public void push(String value) {
    System.out.println("... trying to push on stack[" + top + "] ...");
    if (isFull()) {
      System.out.println("ADD FAILED.");
      System.out.println(); // note: prints optional new line for readability
    } else {      
      storage[top] = 0;
      top++;
      System.out.println(value + " was successfully _________.");
      System.out.println();
    }
  }

  public void pop() {
    System.out.println("... trying to pop stack[" + (top-1) + "] ...");
    if (isEmpty()) { 
      System.out.println("POP FAILED.");
      System.out.println(); 
    } else {      
      storage[top] = null; 
      top--;
      System.out.println(storage[top] + " was successfully removed.");
      System.out.println();
    }
  }

  public void peek() {
    if (isEmpty()) { 
      System.out.println("PEEK TOP = NULL");
      System.out.println();
    } else {
      System.out.println("PEEK TOP = " + storage[top-1]);
      System.out.println();
    }
  }
  
  public static void main(String[] args) {
    storage theStack = new storage (10);
    System.out.println("STORAGE CAPACITY = " + 10);
    System.out.println();
			theStack.show();
			theStack.pop();
			theStack.peek();
    storage.push("one");
			theStack.show();
			theStack.peek();
    storage.push("two");
			theStack.show();
			theStack.peek();
    storage.push("three");
			theStack.show();
			theStack.peek();
    storage.push("four");
			theStack.show();
			theStack.peek();
    storage.push("five"); 
			theStack.show();
			theStack.peek();
    storage.push("six");
      theStack.show();
			theStack.peek();
    storage.push("seven"); 
			theStack.show();
			theStack.peek();
    storage.push("eight");
    	theStack.show();
			theStack.peek();
    storage.push("nine");
    	theStack.show();
			theStack.peek();
    storage.push("ten"); 
			theStack.show();
			theStack.peek();
    // try adding "eleven"
    // try adding "twelve"
    // show the updated stack
  }  

}
