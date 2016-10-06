/**
* @author  Rose Ann D. Linao
* @link    https://github.com/RoseAnnLinao
* @version 1.2
* @since   06/10/2016
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
      System.out.println("stack["+ i +"] = " + storage[i]);
    }
    System.out.println();
  }
  
  private boolean isEmpty() {
    if (storage[0] == null) {
      System.out.println("STORAGE IS EMPTY.");
      System.out.println();
      return true;
    } 
    return false;
  }

  private boolean isFull() {
    if (top == capacity) {
      System.out.println("STORAGE IS FULL.");
      System.out.println();
      return true;
    } 
    return false;
  }

  public void push(String value) {
    System.out.println("... trying to push on stack[" + top + "] ...");
    if (isFull()) {
      System.out.println("ADD FAILED.");
      System.out.println();
    } else {      
      storage[top] = value;
      top++;
      System.out.println(value + " was successfully added.");
      System.out.println();
    }
  }

  public void pop() {
    System.out.println("... trying to pop stack[" + (top-1) + "] ...");
    if (isEmpty()) {
      System.out.println("REMOVE FAILED.");
      System.out.println();
    } else {      
      storage[top] = null;
      top--;
      System.out.println(storage[top] + " was successfully removed.");
      System.out.println();
    }
  }

  public void peek() {
    if (!isEmpty()) {
      System.out.println("PEEK TOP = " + storage[top]);
      System.out.println();
    }
  }
  
  public static void main(String[] args) {
    ArrayStack storage = new ArrayStack(10);
    System.out.println("STORAGE CAPACITY = " + storage.capacity);
    System.out.println();
    storage.show(); // show empty stack
    storage.pop(); // can't remove on empty stack
    storage.peek(); // peek top element
    storage.push("one"); //
    storage.show(); 
    storage.peek(); // top element is "one"
    storage.push("two");
    storage.show();
    storage.peek(); // top element is "two"
    storage.push("three");
    storage.show();
    storage.peek(); // top element is "three"
    storage.push("four");
    storage.show();
    storage.push("five"); 
    storage.show(); 
    storage.pop(); // try removing "five"
    storage.push("six"); 
    storage.push("seven"); 
    storage.push("eight"); 
    storage.push("nine");    
    storage.push("ten"); 
    storage.show();
    storage.peek(); // top element is "ten"
    storage.push("eleven"); // will be added since stack[4] with value "five" was previously removed.
    storage.push("twelve"); // can't add on full stack
    storage.show();
  }  

}
