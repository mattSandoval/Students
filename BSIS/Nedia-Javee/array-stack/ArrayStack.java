/**
* Java implementation of a stack using array.
* For demo purpose, should hold a maximum of 10 string values.
*
* @author  [your full name here]
* @link    [https://github.com/lvcc-dsa/Students/blob/master/BSIS/Nedia-Javee/array-stack/ArrayStack.java]
* @version [1.1]
* @since   [28/09/2016]
*/

public class ArrayStack {

  private int capacity;
  private int top = 0;
  private String[] storage;
  

  public ArrayStack(int size) {
    // assign the value of size to capacity
	capacity=size;
    storage = new String[capacity];
  }

  public void show() {
    // the top of the stack starts from array[0] then newer item gets added on top of another until it reaches its capacity limit
    for (int i = capacity-1; i >= 0; i--) {
      /* print like this: 
      stack[9]   = 10th value
      stack[8]   = 9th value
      stack[7]   = 8rd value
      ....  
      stack[1]   = 2nd value
      stack[0]   = 1st value
      */
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
      // print error message
      return true;
    } 
    return false;
  }

  public void push(String value) {
    if (isFull()) {
      // print error message
      System.out.println("Add Failed");
      System.out.println();
    } else {
      System.out.println("... trying to push on stack[" + top + "] ...");
      storage[top] = value;
      /* increment or decrement top*/
      top++;
      System.out.println(value + " was successfully added.");
      System.out.println();
    }
  }

  public void pop() {
    if (isEmpty()) {
      // print error message....
    System.out.println("Removing failed");
      System.out.println();
    } else {
      System.out.println("... trying to pop stack[" + (top-1) + "] ...");
      storage[top] = null;
      /* increment or decrement top*/;
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
	  ArrayStack ArrayStack= new ArrayStack (10);
    System.out.println("STORAGE CAPACITY = 	"+ArrayStack.capacity);
    System.out.println();
    // show empty stack
    ArrayStack.show();
    // try removing on an empty stack
    ArrayStack.pop();
    // peek top element of an empty stack
    ArrayStack.peek();
    ArrayStack.push("one");
    // show the updated stack
    ArrayStack.show();
    // peek if top element is "one"
    ArrayStack.peek();
    ArrayStack.push("two");
    // show the updated stack
    ArrayStack.show();
    // peek if top element is "two"
    ArrayStack.peek();
    ArrayStack.push("three");
    // show the updated stack
    ArrayStack.show();
    // peek if top element is "three"
    ArrayStack.peek();
    ArrayStack.push("four");
    // show the updated stack
    ArrayStack.show();
    ArrayStack.push("five"); 
    // show the updated stack
    ArrayStack.show();
    // try removing "five"
    ArrayStack.pop();
    ArrayStack.push("six"); 
    ArrayStack.show();
    ArrayStack.push("seven"); 
    ArrayStack.push("eight"); 
    ArrayStack.push("nine");    
    ArrayStack.push("ten"); 
    // show the updated stack
    ArrayStack.show();
    // peek if top element is "ten"
    ArrayStack.peek();
    // try adding "eleven"
    ArrayStack.push("eleven");
    // try adding "twelve"
    ArrayStack.push("twelve");
    // show the updated stack
    ArrayStack.show();
  }  

}public class ArrayStack {

  private int capacity;
  private int top = 0;
  private String[] storage;
  

  public ArrayStack(int size) {
    // assign the value of size to capacity
	capacity=size;
    storage = new String[capacity];
  }

  public void show() {
    // the top of the stack starts from array[0] then newer item gets added on top of another until it reaches its capacity limit
    for (int i = capacity-1; i >= 0; i--) {
      /* print like this: 
      stack[9]   = 10th value
      stack[8]   = 9th value
      stack[7]   = 8rd value
      ....  
      stack[1]   = 2nd value
      stack[0]   = 1st value
      */
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
      // print error message
      return true;
    } 
    return false;
  }

  public void push(String value) {
    if (isFull()) {
      // print error message
      System.out.println("Add Failed");
      System.out.println();
    } else {
      System.out.println("... trying to push on stack[" + top + "] ...");
      storage[top] = value;
      /* increment or decrement top*/
      top++;
      System.out.println(value + " was successfully added.");
      System.out.println();
    }
  }

  public void pop() {
    if (isEmpty()) {
      // print error message....
    System.out.println("Removing failed");
      System.out.println();
    } else {
      System.out.println("... trying to pop stack[" + (top-1) + "] ...");
      storage[top] = null;
      /* increment or decrement top*/;
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
	  ArrayStack ArrayStack= new ArrayStack (10);
    System.out.println("STORAGE CAPACITY = 	"+ArrayStack.capacity);
    System.out.println();
    // show empty stack
    ArrayStack.show();
    // try removing on an empty stack
    ArrayStack.pop();
    // peek top element of an empty stack
    ArrayStack.peek();
    ArrayStack.push("one");
    // show the updated stack
    ArrayStack.show();
    // peek if top element is "one"
    ArrayStack.peek();
    ArrayStack.push("two");
    // show the updated stack
    ArrayStack.show();
    // peek if top element is "two"
    ArrayStack.peek();
    ArrayStack.push("three");
    // show the updated stack
    ArrayStack.show();
    // peek if top element is "three"
    ArrayStack.peek();
    ArrayStack.push("four");
    // show the updated stack
    ArrayStack.show();
    ArrayStack.push("five"); 
    // show the updated stack
    ArrayStack.show();
    // try removing "five"
    ArrayStack.pop();
    ArrayStack.push("six"); 
    ArrayStack.show();
    ArrayStack.push("seven"); 
    ArrayStack.push("eight"); 
    ArrayStack.push("nine");    
    ArrayStack.push("ten"); 
    // show the updated stack
    ArrayStack.show();
    // peek if top element is "ten"
    ArrayStack.peek();
    // try adding "eleven"
    ArrayStack.push("eleven");
    // try adding "twelve"
    ArrayStack.push("twelve");
    // show the updated stack
    ArrayStack.show();
  }  

}
