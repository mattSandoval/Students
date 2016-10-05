/**
* Java implementation of a stack using array.
* For demo purpose, should hold a maximum of 10 string values.
*/
//Array_Stack.java
//Dayrit Kent P.
//https://github.com/KDpogz
//10/6/16

package ArrayStack;

public class Stack { 

  private static int capacity;
  private int top = 0;
  private String[] storage;
  
  public Stack(int size) {
    capacity = size; 
    storage = new String [capacity];
  }

  public void show() {
    // the top of the stack starts from array[0] then newer item gets added on top of another until it reaches its capacity limit
    for (int i = capacity-1; i >= 0; i--) {
     System.out.println(" Stack["+i+"]= "+ storage[i]);
  
      /* print like this: 
      stack[9]   = 10th value
      stack[8]   = 9th value
      stack[7]   = 8rd value
      ....  
      stack[1]   = 2nd value
      stack[0]   = 1st value
      */
    }
    System.out.println();
  } 
  
  private boolean isEmpty() {
    if (storage[0] == null) {
      System.out.println("the stroge is empty");
      // print error message
      System.out.println();
      return true;
    } 
    return false;
  }

  private boolean isFull() {
    if (top == capacity) {
       System.out.println("The stroge is full");
      // print error message
      return true;
    } 
    return false;
  }

  public void push(String value) {
    if (isFull()) { 
     System.out.println("The stroge is full");

      // print error message
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
     
     System.out.println("the stroge is empty");
      // print error message
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
    // construct a new array queue and assign 10 as the integer value for the size limit of the stack
    Stack stackobject = new Stack(10);
	  System.out.println("STORAGE CAPACITY = " + 10);
    System.out.println();
    // show empty stack
    stackobject.show();
    // try removing on an empty stack
    stackobject.pop();
    // peek top element of an empty stack
    stackobject.push("one");
    // show the updated stack
    stackobject.show();
    // peek if top element is "one"
    stackobject.peek();    
    stackobject.push("two");
    // show the updated stack
    stackobject.show();
    // peek if top element is "two"
    stackobject.push("three");
    // show the updated stack
    stackobject.show();    
    // peek if top element is "three"
    stackobject.peek();    
    stackobject.push("four");
    // show the updated stack
    stackobject.show();   
    stackobject.push("five"); 
    // show the updated stack
    stackobject.show();
    // try removing "five"
    stackobject.pop();
    stackobject.push("six"); 
    stackobject.push("seven"); 
    stackobject.push("eight"); 
    stackobject.push("nine");    
    stackobject.push("ten"); 
    // show the updated stack
    stackobject.show();
    // peek if top element is "ten"
    stackobject.peek();
    // try adding "eleven"
    stackobject.push("eleven"); 
    // try adding "twelve"
    stackobject.push("twelve");
    // show the updated stack
    stackobject.show();
  }  

}
