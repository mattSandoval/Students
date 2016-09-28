/**
* Java implementation of a queue using array.
* For demo purpose, should hold a maximum of 10 integers.
*
* @author  [your full name here]
* @link    [full github url]
* @version [version number]
* @since   [last updated dd/mm/yyyy]
*/

public class ArrayQueue {
	  private int capacity;
	  private int top = 0;
	  private int tail = 0;
	  private String[] storage;
	  
	  // constructor = initialize an object instance of the class
	  public ArrayQueue(int size) {
	    // assign the value of size to capacity
		capacity=size;
	    storage = new String[capacity];
	  }

	  public void show() {
	    // the top of the stack starts from array[0] then newer item gets added on top of another until it reaches its capacity limit
	    for (int i = 0; i < capacity; i++) {
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

	  public void enQueue(String value) {
	    if (isFull()) {
	      // print error message
	      System.out.println("Add Failed");
	      System.out.println();
	    } else {
	      System.out.println("... trying to enQueue on stack[" + top + "] ...");
	      storage[top] = value;
	      /* increment or decrement top*/
	      top++;
	      System.out.println(value + " was successfully added.");
	      System.out.println();
	    }
	  }

	  public void deQueue() {
	    if (isEmpty()) {
	      // print error message....
	    System.out.println("Removing failed");
	      System.out.println();
	    } else {
	      System.out.println("... trying to deQueue storage[" + (tail) + "] ...");
	      System.out.println(storage[tail] + " was successfully removed.");
	      System.out.println();
	      storage[tail] = null;
	      for(int i=0;i<top;i++){
	    	  storage[i]=storage[i+1];
	      }
	      /* increment or decrement top*/;
	      top--;
	    }
	  }

	  public void peekFront() {
	    if (storage[top] == storage[0]) {
	      System.out.println("PEEK TOP = " + storage[top]);
	      System.out.println();
	    } else {
	      System.out.println("PEEK TOP = " + storage[top-1]);
	      System.out.println();
	    }
	  }
	  public void peekRear(){
		  System.out.println("PEEK REAR = " + storage[tail]);
	  }
	  
	  public static void main(String[] args) {
	    // construct a new array queue and assign 10 as the integer value for the size limit of the stack
		  ArrayQueue ArrayQueue= new ArrayQueue (10);
	    System.out.println("STORAGE CAPACITY = 	"+ArrayQueue.capacity);
	    System.out.println();
	    // show empty stack
	    
	    ArrayQueue.show();
	    // try removing on an empty stack
	    ArrayQueue.deQueue();
	    // peek top element of an empty stack
	    ArrayQueue.peekFront();
	    ArrayQueue.peekRear();
	    ArrayQueue.enQueue("one");
	    // show the updated stack
	    ArrayQueue.show();
	    // peek if top element is "one"
	    ArrayQueue.peekFront();
	    ArrayQueue.peekRear();
	    ArrayQueue.enQueue("two");
	    // show the updated stack
	    ArrayQueue.show();
	    // peek if top element is "two"
	    ArrayQueue.peekFront();
	    ArrayQueue.peekRear();
	    ArrayQueue.enQueue("three");
	    // show the updated stack
	    ArrayQueue.show();
	    // peek if top element is "three"
	    ArrayQueue.peekFront();
	    ArrayQueue.peekRear();
	    ArrayQueue.enQueue("four");
	    // show the updated stack
	    ArrayQueue.show();
	    ArrayQueue.enQueue("five"); 
	    // show the updated stack
	    ArrayQueue.show();
	    // try removing "five"
	    ArrayQueue.deQueue();
	    ArrayQueue.enQueue("six"); 
	    ArrayQueue.enQueue("seven"); 
	    ArrayQueue.enQueue("eight"); 
	    ArrayQueue.enQueue("nine");    
	    ArrayQueue.enQueue("ten"); 
	    // show the updated stack
	    ArrayQueue.show();
	    // peek if top element is "ten"
	    ArrayQueue.peekFront();
	    ArrayQueue.peekRear();
	    // try adding "eleven"
	    ArrayQueue.enQueue("eleven");
	    // try adding "twelve"
	    ArrayQueue.enQueue("twelve");
	    // show the updated stack
	    ArrayQueue.show();
	  }  

}
