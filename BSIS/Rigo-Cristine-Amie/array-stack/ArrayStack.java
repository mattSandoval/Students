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

  int capacity;
  private int top = 0;
  private String[] storage;
  

  public ArrayStack(int size) {
      capacity = size;
      storage = new String [capacity];
  }

  public void show() {
    for (int i = capacity-1; i >= 0; i--) {
        System.out.println("stack[" + i + "] = " + storage[i]);
    }
    System.out.println();
  }
  
  private boolean isEmpty() {
    if (storage[0] == null) {
      System.out.println("Stack is Empty");
      System.out.println();
      return true;
    } 
    return false;
  }

  private boolean isFull() {
    if (top == capacity) {
        System.out.println("Stack is Full");
        System.out.println();
      return true;
    } 
    return false;
  }

  public void push(String value) {
    if (isFull()) {
      System.out.println("Add failed , Element did not push");
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
      System.out.println("remove failed, Element did not pop");
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
       
        ArrayStack stackobject = new ArrayStack (10);
        
        System.out.println("STORAGE CAPACITY = " + stackobject.capacity);
        System.out.println();

    stackobject.pop();
    stackobject.isEmpty();
    stackobject.peek();
    stackobject.push("1");
    stackobject.show();
    stackobject.peek();
    stackobject.push("2");
    stackobject.show();
    stackobject.peek();
    stackobject.push("3");
    stackobject.push("4");
    stackobject.show();
    stackobject.push("5"); 
    stackobject.show();
    stackobject.pop();
    stackobject.push("6"); 
    stackobject.push("7"); 
    stackobject.push("8"); 
    stackobject.push("9");    
    stackobject.push("10"); 
    stackobject.show();
    stackobject.peek();
    stackobject.push("11");
    stackobject.push("12");
    stackobject.show();
  }
}
