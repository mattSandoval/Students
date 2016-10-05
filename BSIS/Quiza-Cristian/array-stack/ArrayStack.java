/**
* Java implementation of a stack using array.
* For demo purpose, should hold a maximum of 10 string values.
*
* @author  [Crisrtian E. Quiza]
* @link    [https://github.com/Kirisaite]
* @version [version 1]
* @since   [last updated 04/10/2016]
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
  for(int i = capacity - 1; i >= 0; i--){
   System.out.println("Stack["+i+"] = "+ storage[i]);
    }
    System.out.println();
    }
    
    private boolean isEmpty() {
      if (storage[0] == null) {
        System.out.println("ERROR, Storage is empty.");
        return true;
      } 
      return false;
    }

    private boolean isFull() {
      if (top == capacity) {
       System.out.println("ERROR, Storage is full.");
        return true;
      } 
      return false;
    }

    public void push(String value) {
      if (isFull()) {
       System.out.println("ADD FAILED, Storage is full");
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
       System.out.println("REMOVE FAILED, Storage is empty.");
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
    
    public static void main(String [] args) {
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
      System.out.println("Thank you for using my Program...");
    } 
 }


