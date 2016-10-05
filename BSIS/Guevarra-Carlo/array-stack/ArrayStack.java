/**
* Java implementation of a stack using array.
* For demo purpose, should hold a maximum of 10 string values.
*
* @author  [Carlo Guevarra]
* @link    [https://github.com/trunks07]
* @version [1.00]
* @since   [last updated 05/10/2016]
*/
public class Stack {
	
		  private int capacity;
		  private int top = 0;
		  private String[] storage;
		  
		  public Stack(int size) {
			capacity = size;
		    storage = new String[capacity];
		  }

		public void show() {
		    for (int i = capacity-1; i >= 0; i--) {
		      System.out.println("Satck["+i+"] = "+storage[i]);
		    }
		    System.out.println();
		  }
		  
		  private boolean isEmpty() {
		    if (storage[0] == null) {
		      System.out.println("Error , the storage is empty!!");
		      System.out.println();
		      return true;
		    } 
		    return false;
		  }

		  private boolean isFull() {
		    if (top == capacity) {
		      System.out.println("Error , the storage is full!!");
		      System.out.println();
		      return true;
		    } 
		    return false;
		  }

		  public void push(String value) {
		    if (isFull()) {
		      System.out.println("Error, adding failed!!");
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
		      System.out.println("Error, removing failed");
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
			Stack storage = new Stack(10);
		    System.out.println("STORAGE CAPACITY = " + storage.capacity);
		    System.out.println();
		    storage.show();
		    storage.pop();
		    storage.peek();
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
		    storage.push("seven"); 
		    storage.push("eight"); 
		    storage.push("nine");    
		    storage.push("ten"); 
		    storage.show();
		    storage.peek();
		    storage.push("eleven");
		    storage.push("twelve");
		    storage.show();
		  }  

		}
