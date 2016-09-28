/**
* Java implementation of a stack using array.
* For demo purpose, should hold a maximum of 10 string values.
*
* @author  [Ruthille Dagdag]
* @link    [https://github.com/lvcc-dsa/Students/edit/master/BSIS/Dagdag-Ruthille/array-stack/ArrayStack.java]
* @version [version number]
* @since   [28 september 2016]
*/

public class ArrayStack {

 
  private int capacity; 
  private int top = 0; 
  private String[] storage; 
  
  public ArrayStack(int size) {
    
    storage = new String[size]; 
  }

  public void show() {
    
    for (int i = capacity-1; i >= 0; i--) {
      System.out.println("stack[" + i + "] = " + storage[i] );
    }
    System.out.println(); 
  }
  
  private boolean isEmpty() {
    if (storage[0] == null) { 
      System.out.println("Storage is empty "); 
      System.out.println();
      return true;
    } 
    return false; 
  }

  
  private boolean isFull() {
    if (top == capacity) { 
      System.out.println("Storage is full");
      return true;
    } 
    return false; 
  }

  public void push(String value) {
    System.out.println("... trying to push on stack[" + top + "] ...");
    if (isFull()) {
      System.out.println("ADD FAILED "); 
      System.out.println(); 
    } else {      
      storage[top]; 
      top++; 
      System.out.println(value + " was successfully added."); 
      System.out.println(); }
  }
 

  public void pop() {
    System.out.println("... trying to pop stack[" + (top-1) + "] ...");
    if (isEmpty()) { 
      System.out.println("POP FAILED"); 
      System.out.println(); 
    } else {      
      storage[top]; 
      top;
      System.out.println(storage[top] + " was successfully removed."); // todo: what does pop do?
      System.out.println();
    }
  }

  // note: will show the topmost value of the array
  public void peek() {
    if (isEmpty()) { 
      System.out.println("PEEK TOP = NULL");
      System.out.println();
    } else {
      System.out.println("PEEK TOP = " + storage[top]);
      System.out.println();
    }
  }
  
  public static void main(String[] args) {
    // construct a new array queue and assign 10 as the integer value for the size limit of the stack
    System.out.println("STORAGE CAPACITY = " + /* return the size limit */);
    System.out.println();
    // show empty stack
    // try removing on an empty stack
    // peek top element of an empty stack
    storage.push("one");
    // show the updated stack
    // peek if top element is "one"
    storage.push("two");
    // show the updated stack
    // peek if top element is "two"
    storage.push("three");
    // show the updated stack
    // peek if top element is "three"
    storage.push("four");
    // show the updated stack
    storage.push("five"); 
    // show the updated stack
    // try removing "five"
    storage.push("six"); 
    storage.push("seven"); 
    storage.push("eight"); 
    storage.push("nine");    
    storage.push("ten"); 
    // show the updated stack
    // peek if top element is "ten"
    // try adding "eleven"
    // try adding "twelve"
    // show the updated stack
  }  

}
