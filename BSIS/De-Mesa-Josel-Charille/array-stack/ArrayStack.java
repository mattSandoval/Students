/*
 * @author	[Josel Charille De Mesa]
 * @link	[@chadenggg]
 * @version	[Version number]
 * @since	[last updated 12/10/16]
 * 
 */

package BENGBENG;

public class ArrayStack {

	  private int capacity;
	  private int top = 0;
	  private String[] storage;
	  
	  // constructor = initialize an object instance of the class
	  public ArrayStack(int size) {
	    // assign the value of size to capacity
	      capacity = size;
	    storage = new String[capacity];
	  }

	  public void show() {
	    // the top of the stack starts from array[0] then newer item gets added on top of another until it reaches its capacity limit
	    for (int i = capacity-1; i >= 0; i--) {
	      
	        System.out.print("Stack" +"[" +i +"]" +" =" +storage[i] +"th" +" Value" ) ;
	        
	        
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
	      // print error message
	      System.out.println("Storage is Empty ");
	      return true;
	    } 
	    return false;
	  }

	  private boolean isFull() {
	    if (top == capacity) {
	      // print error message
	        System.out.print("Storage is Full ") ;
	      return true;
	    } 
	    return false;
	  }

	  public void push(String value) {
	    if (isFull()) {
	      // print error message
	      System.out.println("Add Failed ");
	    } else {
	      System.out.println("... trying to push on stack[" + top + "] ...");
	      storage[top] = value;
	      top++;
	      /* increment or decrement top*/
	      System.out.println(value + " was successfully added.");
	      System.out.println();
	    }
	  }

	  public void pop() {
	    if (isEmpty()) {
	      // print error message
	      System.out.println("Remove Failed ");
	    } else {
	      System.out.println("... trying to pop stack[" + (top-1) + "] ...");
	      storage[top] = null ;
	      top--;
	      /* increment or decrement top*/;
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
	      ArrayStack storage = new ArrayStack(10);
	    // construct a new array queue and assign 10 as the integer value for the size limit of the stack
	    System.out.println("STORAGE CAPACITY = " + storage.capacity );
	    System.out.println();
	    storage.show();
	    storage.peek();
	    storage.pop();

	    storage.push("one");
	    storage.show();
	    storage.peek();
	    
	    storage.push("two");
	    storage.show();
	    storage.peek();
	    
	    storage.push("three");
	    storage.show();
	    storage.peek();
	    
	    storage.push("four");
	    storage.show();
	    
	    storage.push("five"); 
	    storage.show();
	    storage.peek();
	    
	    storage.push("six"); 
	      storage.show();
	    
	    storage.push("seven");
	      storage.show();
	    
	    storage.push("eight");
	      storage.show();
	    
	    storage.push("nine");
	      storage.show();
	    
	    storage.push("ten"); 
	      storage.show();
	    
	  }  

	}
