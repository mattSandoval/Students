/**
* @author  [Gerald M. De Guzman]
* @link    [igooop]
* @version [version number]
* @since   [last updated 05/10/2016]
*/

public class ArrayStack {

	  private int capacity;
	  private int top = 0;
	  private String[] storage;
	  
	  
	  public ArrayStack(int size) {
	    capacity = size;
	    storage = new String[capacity];
	  }

	  public void show() {
	    for (int i = capacity-1; i >= 0; i--) {
	      
	        System.out.print("Stack" +"[" +i +"]" +" =" +storage[i] +"th" +" Value" ) ;
	 
	    }
	    System.out.println();
	  }
	  
	  private boolean isEmpty() {
	    if (storage[0] == null) {
	    
	      System.out.println("Storage is Empty ");
	      return true;
	    } 
	    return false;
	  }

	  private boolean isFull() {
	    if (top == capacity) {
	        System.out.print("Storage is Full ") ;
	      return true;
	    } 
	    return false;
	  }

	  public void push(String value) {
	    if (isFull()) {	      
	      System.out.println("Add Failed ");
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
	      System.out.println("Remove Failed ");
	    } else {
	      System.out.println("... trying to pop stack[" + (top-1) + "] ...");
	      storage[top] = null ;
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
	    ArrayStack storage = new ArrayStack(10);
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
	    storage.pop();
	    
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
	    storage.peek();
	    storage.push("eleven");
	    storage.push("twelve");
	    storage.show();

	  }  

	}
