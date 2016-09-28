public class ArrayQueue {	
	int capacity;
	int top = 0;
	String[] storage;
	  
	  public ArrayQueue(int size) {
	    capacity = size;
	    storage = new String[capacity];
	  }

	  public void show() {
	    // the top of the stack starts from array[0] then newer item gets added on top of another until it reaches its capacity limit
	    for (int i = 0; i <= 9; i++) {
	      /* print like this: 
	      stack[9]   = 10th value
	      stack[8]   = 9th value
	      stack[7]   = 8rd value
	      ....  
	      stack[1]   = 2nd value
	      stack[0]   = 1st value
	      */
	      System.out.println("queue [" + i + "] = " + storage [i]);
	    }
	  }
	  
	  private boolean isEmpty() {
	    if (storage[0] == null) {
	      // print error message
	      System.out.println("Your inventory is empty");
	      return true;
	    } 
	    return false;
	  }

	  private boolean isFull() {
	    if (top == capacity) {
	      // print error message
	      System.out.println ("Your inventory is full");
	      return true;
	    } 
	    return false;
	  }

	  public void push(String value) {
	    if (isFull()) {
	      // print error message
	      System.out.println("Again and again it is full");
	    } else {
	      System.out.println("... trying to push on stack[" + top + "] ...");
	      storage[top] = value;
	      /* increment or decrement top*/;
	      top++;
	      System.out.println(value + " was successfully added.");
	      System.out.println();
	    }
	  }

	  public void pop() {
	    if (isEmpty()) {
	    } else {
	      System.out.println("... trying to pop stack[" + (top-1) + "] ...");
	      storage[top] = null; /*???*/
	      top --;/* increment or decrement top*/;
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
	    ArrayStack storage = new ArrayStack(10);
	    System.out.println("STORAGE CAPACITY = " + 10/* return the size limit */);
	    System.out.println();
	    storage.show();// show empty stack
	    storage.pop();// try removing on an empty stack
	    storage.peek();// peek top element of an empty stack
	    storage.push("one");
	    storage.show();// show the updated stack
	    storage.peek(); // peek if top element is "one"
	    storage.push("two");
	    storage.show(); // show the updated stack
	    storage.peek(); // peek if top element is "two"
	    storage.push("three");
	    storage.show(); // show the updated stack
	    storage.peek(); // peek if top element is "three"
	    storage.push("four");
	    storage.show(); // show the updated stack
	    storage.push("five"); 
	    storage.show(); // show the updated stack
	    storage.pop(); // try removing "five"
	    storage.push("six"); 
	    storage.push("seven"); 
	    storage.push("eight"); 
	    storage.push("nine");    
	    storage.push("ten"); 
	    storage.show(); // show the updated stack
	    storage.peek(); // peek if top element is "ten"
	    storage.push ("eleven"); // try adding "eleven"
	    storage.push ("twelve"); // try adding "twelve"
	    storage.show(); // show the updated stack
	  }  
}
