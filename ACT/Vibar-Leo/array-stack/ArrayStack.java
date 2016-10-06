/**
* Java implementation of a stack using array.
* For demo purpose, should hold a maximum of 10 string values.
*
* @author  [Leo O. Vibar]
* @link    [full github url]
* @version [version number]
* @since   [last updated dd/mm/yyyy]
*/

public class ArrayStack {
 private int c;
 private int t = 0;
 private String[] s;

 
  public ArrayStackJava(int size) {
    c = size;
    s= new String[c];
  } 

  public void show() {          
    for (int i = c-1; i >= 0; i--) {
      System.out.println("stack["+ i +"] = " + s[i]);
    }
    System.out.println();
  }
  
  private boolean isEmpty() {
    if (s[0] == null) {
      System.out.println("STORAGE IS EMPTY.");
      System.out.println();
      return true;
    } 
    return false;
  }

  private boolean isFull() {
    if (t == c) {
      System.out.println("STORAGE IS FULL.");
      System.out.println();
      return true;
    } 
    return false;
  }

  public void push(String value) {
    System.out.println("... trying to push on stack[" + t + "] ...");
    if (isFull()) {
      System.out.println("ADD FAILED.");
      System.out.println();
    } else {      
      s[t] = value;
      t++;
      System.out.println(value + " was successfully added.");
      System.out.println();
    }
  }

  public void pop() {
    System.out.println("... trying to pop stack[" + (t-1) + "] ...");
    if (isEmpty()) {
      System.out.println("REMOVE FAILED.");
      System.out.println();
    } else {      
      s[t] = null;
      t--;
      System.out.println(s[t] + " was successfully removed.");
      System.out.println();
    }
  }

  public void peek() {
    if (!isEmpty()) {
      System.out.println("PEEK TOP = " + s[t]);
      System.out.println();
    }
  }
  
    public static void main(String[] args) {
    ArrayStackJava storage = new ArrayStackJava(10);
    System.out.println("STORAGE CAPACITY = " + storage.c);
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
    
    
