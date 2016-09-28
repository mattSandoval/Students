/**
* Java implementation of a queue using array.
* For demo purpose, should hold a maximum of 10 integers.
*
* @author  [Dayrit Kent P.]
* @link    [https://github.com/lvcc-dsa/Students/edit/master/BSIS/Dayrit-Kent/array-queue/ArrayQueue.java]
* @version [KD v 0.1]
* @since   [28/09/2016]
*/
package Queue;

import ArrayStack.Stack;

public class ArrayQueue {
	
	 		private static int capacity;
	 		private int top = 9;
	 		private int down = 9;
	 		private String[] storage;
	 		
	 		
	 public ArrayQueue(int size) {
		 
		    capacity = size; 
		    storage = new String [capacity];
		  }

	 public void show() {
		  // the top of the stack starts from array[0] then newer item gets added on top of another until it reaches its capacity limit
		    for (int i = capacity-1; i >= 0; i--) {
		     System.out.println(" Queue["+i+"]= "+ storage[i]);
		  
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
	
		 if (storage[top] == null) {
		      System.out.println("the stroge is empty");
		      // print error message
		      System.out.println();
		      return true;
		    } 
		    return false;
		  }

	 private boolean isFull() {

		 if (down == -1) {
		       System.out.println("The stroge is full");
		      // print error message
		      return true;
		    } 
		    return false;
		  }
	 public void enqueue(String value) {
	
		 if (isFull()) { 
		     System.out.println("The stroge is full");

		      // print error message
		      System.out.println();
		    } else {
		      System.out.println("... trying to enqueue on stack[" + down + "] ...");
		      storage[down] = value;
		      	down--;
		      System.out.println(value + " was successfully added.");
		      System.out.println();
		    }
		  }

	 public void dequeue() {
		    if (isEmpty()) {
		     
		     System.out.println("the stroge is empty");
		      // print error message
		      System.out.println();
		    } else {
		   
		      System.out.println("... trying to dequeue stack[" + (top) + "] ...");
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
		    ArrayQueue queueobject = new ArrayQueue(10);
			  System.out.println("STORAGE CAPACITY = " + 10);
		    System.out.println();
		    // show empty stack
		    queueobject.show();
		    // try removing on an empty stack
		    queueobject.dequeue();
		    // peek top element of an empty stack
		    queueobject.enqueue("one");
		    // show the updated stack
		    queueobject.show();
		    // peek if top element is "one"
		    queueobject.peek();    
		    queueobject.enqueue("two");
		    // show the updated stack
		    queueobject.show();
		    // peek if top element is "two"
		    queueobject.enqueue("three");
		    // show the updated stack
		    queueobject.show();    
		    // peek if top element is "three"
		    queueobject.peek();    
		    queueobject.enqueue("four");
		    // show the updated stack
		    queueobject.show();   
		    queueobject.enqueue("five"); 
		    // show the updated stack
		    queueobject.show();
		    // try removing "five"
		   queueobject.dequeue();
		    queueobject.show();  
		    
		    queueobject.enqueue("six"); 
		    queueobject.enqueue("seven"); 
		    queueobject.enqueue("eight"); 
		    queueobject.enqueue("nine");    
		    queueobject.enqueue("ten"); 
		    // show the updated stack
		    queueobject.show();
		    // peek if top element is "ten"
		
		    // try adding "eleven"
		    queueobject.enqueue("eleven"); 
		    // try adding "twelve"
		    queueobject.enqueue("twelve");
		    // show the updated stack
		    queueobject.show();
		  }  

		}



