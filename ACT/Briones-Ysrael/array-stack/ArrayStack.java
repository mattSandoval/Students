/**
* Java implementation of a stack using array.
* For demo purpose, should hold a maximum of 10 string values.
*
* @author  [Ysrael Carlos Briones]
* @link    [www.github.com/Bibleaffliction11]
* @version [version number]
* @since   [last updated 10/17/2016]
*/

import java.util.*;
public class ysra {
    

  private int capacity=5;
  private int top = 1;
  private String[] storage;
  
  public ysra(int size) {
    capacity =size;
    storage = new String[capacity];
  } 

  public void show() {
    for (int Y = capacity-1; Y >= 0; Y--) { 
      for (int S = capacity-1; S >= 0; S--) {
          System.out.println("stack["+Y--+"]="+storage[S]);
      }
    }
    System.out.println();
  }
  
  private boolean isEmpty() {
    if (storage[top] == null) {
      System.out.println("EMPTY! :(");
      return true;
    } 
    return false;
  }

  private boolean isFull() {
    if (top == capacity) {
      System.out.println("FULL! :(");
      return true;
    } 
    return false;
  }

  public void push(String value) {
    if (isFull()) {
      
      System.out.println("FAILED");
    } else {
      System.out.println("... Push[" + (top) + "] ...");
      storage[top] = value;
      top++;
      System.out.println(value + " was successfully added.");
      System.out.println();
    }
  }

  public void pop() {
    if (isEmpty()) {
      System.out.println();
    } else {
      System.out.println("... trying to pop stack[" + (top-1) + "] ...");
      storage[top] = storage[10];
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
    ysra storage = new ysra(10);
    System.out.println("STORAGE CAPACITY = " +storage.capacity);
    System.out.println();
    storage.peek();
    storage.pop();
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
