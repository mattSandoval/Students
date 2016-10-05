/**
* Java implementation of a queue using array.
* For demo purpose, should hold a maximum of 10 integers.
*
* @author  [Javee Nedia]
* @link    [https://github.com/lvcc-dsa/Students/blob/master/BSIS/Nedia-Javee/array-queue/ArrayQueue.java]
* @version [1.1]
* @since   [28/09/2016]
*/

public class ArrayQueue {
	  private int capacity;
	  private int top = 0;
	  private int tail = 0;
	  private String[] storage;
	  
	  public ArrayQueue(int size) {
		capacity=size;
	    storage = new String[capacity];
	  }

	  public void show() {
	    for (int i = 0; i < capacity; i++) {
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
	      System.out.println("ERROR")
	      return true;
	    } 
	    return false;
	  }

	  public void enQueue(String value) {
	    if (isFull()) {
	      System.out.println("Add Failed");
	      System.out.println();
	    } else {
	      System.out.println("... trying to enQueue on stack[" + top + "] ...");
	      storage[top] = value;
	      top++;
	      System.out.println(value + " was successfully added.");
	      System.out.println();
	    }
	  }

	  public void deQueue() {
	    if (isEmpty()) {
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
		  ArrayQueue ArrayQueue= new ArrayQueue (10);
	    System.out.println("STORAGE CAPACITY = 	"+ArrayQueue.capacity);
	    System.out.println();
	    ArrayQueue.show();
	    ArrayQueue.deQueue();
	    ArrayQueue.peekFront();
	    ArrayQueue.peekRear();
	    ArrayQueue.enQueue("one");
	    ArrayQueue.show();
	    ArrayQueue.peekFront();
	    ArrayQueue.peekRear();
	    ArrayQueue.enQueue("two");
	    ArrayQueue.show();
	    ArrayQueue.peekFront();
	    ArrayQueue.peekRear();
	    ArrayQueue.enQueue("three");
	    ArrayQueue.show();
	    ArrayQueue.peekFront();
	    ArrayQueue.peekRear();
	    ArrayQueue.enQueue("four");
	    ArrayQueue.show();
	    ArrayQueue.enQueue("five"); 
	    ArrayQueue.show();
	    ArrayQueue.deQueue();
	    ArrayQueue.enQueue("six"); 
	    ArrayQueue.enQueue("seven"); 
	    ArrayQueue.enQueue("eight"); 
	    ArrayQueue.enQueue("nine");    
	    ArrayQueue.enQueue("ten"); 
	    ArrayQueue.show();
	    ArrayQueue.peekFront();
	    ArrayQueue.peekRear();
	    ArrayQueue.enQueue("eleven");
	    ArrayQueue.enQueue("twelve");
	    ArrayQueue.show();
	  }  

}
