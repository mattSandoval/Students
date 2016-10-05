/**
* Java implementation of a stack using array.
* For demo purpose, should hold a maximum of 10 string values.
*
* @author  [Marella Inductivo]
* @link    [https://github.com/xxxMaIn]
* @version [version number]
* @since   [10/05/16]
*/

package arraystack;
public class ArrayStack{

  private int capacity;
  private int top = 0;
  private String[] storage;
  
  public Stack(int size) {
    capacity = size;
    storage = new String[capacity];
  }

  public void show() {
    for (int i = capacity-1; i >= 0; i--) {
        System.out.println("Storage ["+ i + "] = " + storage[i]);
    }
    System.out.println();
  }
  
  private boolean isEmpty() {
    if (storage[0] == null) {
      System.out.println("Storage is empty");
      return true;
    } 
    return false;
  }

  private boolean isFull() {
    if (top == capacity) {
      System.out.println("Storage is full");
      return true;
    } 
    return false;
  }

  public void push(String value) {
    if (isFull()) {
      System.out.println("Adding failed. Element did not push.");
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
      System.out.println("Remove Failed. No element to pop.");
    } else {
      System.out.println("... trying to pop stack[" + (top-1) + "] ...");
      storage[top-1] = null;
      top--;
      System.out.println(top + " was successfully removed.");
      System.out.println();
    }
  }

  public void peek() {
    if (storage[top]==storage[0]) {
      System.out.println("PEEK TOP = " + storage[top]);
      System.out.println();
    } else {
      System.out.println("PEEK TOP = " + storage[top-1]);
      System.out.println();
    }
  }
  
  public static void main(String[] args) {
    ArrayStack stack = new ArrayStack(10);
    System.out.println("STORAGE CAPACITY = " + "10" );
    System.out.println();

    stack.push("one");
    stack.push("two");
    stack.push("three");
    stack.push("four");
    stack.push("five");
    stack.push("six");
    stack.push("seven");
    stack.push("eight ");
    stack.push("nine");
    stack.push("ten");
    stack.show();
    stack.pop();
    stack.pop();
    stack.show();
    stack.peek();
    
  
  }  

    
}
   
   
