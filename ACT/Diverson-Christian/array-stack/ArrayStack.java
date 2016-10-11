/**
* Java implementation of a stack using array.
* For demo purpose, should hold a maximum of 10 string values.
*
* @author  [your full name here]
* @link    [full github url]
* @version [version number]
* @since   [last updated dd/mm/yyyy]
*/

public class ArrayStack {

  // note: variable declarations
  private int capacity; // note: max length of array
  private int top = 0; // note: initialize a default value of top
  private String[] storage; // note: array is of string values
  
  // note: constructor = initialize an object instance of the class
  public ArrayStack(int size) {
    // todo: pass the value of size to capacity
    capacity = size;
    storage = new String[capacity]; // todo: update the array capacity
  }

  // note: will display the array
  public void show() {
    // note: the top of the stack starts from array[0] then newer item gets added on top of another until it reaches its capacity limit
    for (int i = capacity-1; i >= 0; i--) 
    {
      for (int j=capacity-1;j>=0;j--)
      {
        System.out.println("stack["+i--+"]="+storage[j]);
      }
     
    }
    System.out.println(); // note: prints optional new line for readability
  }
  
  // note: will check if it's true that the array is empty
  private boolean isEmpty() {
    if (storage[0] == null) { // note: compares if index[0] or top is null or empty
      System.out.println("IS EMPTY "); // todo: print error message here
      System.out.println(); // note: this prints optional new line for readability
      return true;
    } 
    return false; // note: defaults to false
  }

  // note: will check if it's true that the array is full
  private boolean isFull() {
    if (top == capacity) { // note: compares if top has reached capacity limit
      System.out.println("IS FULL "); // todo: print error message here
      return true;
    } 
    return false; // note: defaults to false
  }

  // note: will add value to the array
  public void push(String value) {
    System.out.println("... trying to push on stack[" + top + "] ...");
    if (isFull()) {
      System.out.println("PUSH FAILED "); // todo: print error message here
      System.out.println(); // note: prints optional new line for readability
    } else {      
      storage[top] = value; // todo: assign the value to top
      top++; // todo: should increment or decrement?
      System.out.println(value + " was successfully PUSHED."); // todo: what does push do?
      System.out.println(); // prints optional new line for readability
    }
  }

  // note: will remove value to the array
  public void pop() {
    System.out.println("... trying to pop stack[" + (top-1) + "] ...");
    if (isEmpty()) { // note: checks if empty, then stop
      System.out.println(" "); // print error message here
      System.out.println(); // prints optional new line for readability
    } else {
      System.out.println("trying to pop stack [" +(top-1)+"]...");      
      storage[top] = null; // todo: empty the value of top
      top--; // todo: should increment or decrement?
      System.out.println(storage[top] + " was successfully POPPED."); // todo: what does pop do?
      System.out.println();
    }
  }

  // note: will show the topmost value of the array
  public void peek() {
    if (storage[top] == storage[0]) 
    { 
      System.out.println("PEEK TOP ="+ storage[top]);
      System.out.println();
    } 
    else 
    {
      System.out.println("PEEK TOP = " + storage[top-1]);
      System.out.println();
    }
  }
  
  public static void main(String[] args) {
    // construct a new array queue and assign 10 as the integer value for the size limit of the stack
    ArrayStack storage = new ArrayStack(10);
    System.out.println("STORAGE CAPACITY = " + storage);
    System.out.println();
    // show empty stack
    storage.show();
    // try removing on an empty stack
    storage.pop();
    // peek top element of an empty stack
    storage.peek();
    storage.push("one");
    // show the updated stack
    storage.show();
    // peek if top element is "one"
    storage.peek();
    storage.push("two");
    // show the updated stack
    storage.show();
    // peek if top element is "two"
    storage.peek();
    storage.push("three");
    // show the updated stack
    storage.show();
    // peek if top element is "three"
    storage.peek();
    storage.push("four");
    // show the updated stack
    storage.show();
    storage.push("five"); 
    // show the updated stack
    storage.show();
    // try removing "five"
    storage.pop();
    storage.push("six"); 
    storage.push("seven"); 
    storage.push("eight"); 
    storage.push("nine");    
    storage.push("ten"); 
    // show the updated stack
    storage.show();
    // peek if top element is "ten"
    storage.peek();
    // try adding "eleven"
    storage.push("eleven");
    // try adding "twelve"
    storage.push("twelve");
    // show the updated stack
    storage.show();
  }  

}
