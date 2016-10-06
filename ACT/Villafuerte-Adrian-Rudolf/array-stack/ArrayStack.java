/**
* @author  [Adrian Rudolf Villafuerte]
* @link    [https://github.com/UpeTheGreat2024/array-stack]
* @version [version number]
* @since   [05/10/16]
*/

public class ArrayStack {

  
  private int capacity; 
  private int top = 0;
  private String[] upe; 
  
  public ArrayStack(int size) {
      capacity = size;
		  upe = new String[capacity];
   
  }

  public void show() {
    System.out.println("Current Stack Element: ");
		for (int a = capacity - 1; a >= 0; a--) {
		
			System.out.println("Stack[" + a + "]  =  " + upe[a]);

		}

	System.out.println("");	
	}
  private boolean isEmpty() {
    if (upe[0] == null) { 
      System.out.println("Stack is empty!");
			System.out.println("");
			return true;
      
    } 
    else{
    return false;
      }
    }

 
  private boolean isFull() {
    if (top == capacity) { 
      System.out.println("Stack is full "); 
      System.out.println("");
      return true;
    } 
    else{
    return false; 
  }
  }
  
  public void push(String eyd) {
    if (isFull()) {
      System.out.println("Failed to Add. Element not push. ");
      System.out.println("");
    } else {      
      System.out.println("... trying to push on stack[" + top + "] ...");
      upe[top]; 
      top++;
      System.out.println(eyd + " was successfully added.");
      System.out.println("");
    }
  }
  public void pop() {
    if (isEmpty()) { 
      System.out.println("Removed failed!! ");
      System.out.println(""); 
    } else {      
      System.out.println("... trying to pop stack[" + (top-1) + "] ...");
      top--;
      System.out.println(storage[top] + " was successfully removed."); // todo: what does pop do?
      System.out.println("");
      upe[top] = null;
    }
  }

 
  public void peek() {
    if (arr[top-1] == upe[0]) { 
      System.out.println("PEEK TOP = " upe[top]);
      System.out.println("");
    } else {
      System.out.println("PEEK TOP = " + upe[top-1]);
      System.out.println("");
    }
  }
  
  public static void main(String[] args) {
    ArrayStack Eydrian = new ArrayStack(10);
    System.out.println("STORAGE CAPACITY = " + Eydrian.capacity);
    System.out.println("");
   
    Eydrian.push("one");
    Eydrian.push("two");
    Eydrian.push("three");
    Eydrian.push("four");
    Eydrian.push("five"); 
    Eydrian.push("six"); 
    Eydrian.push("seven"); 
    Eydrian.push("eight"); 
    Eydrian.push("nine");    
    Eydrian.push("ten"); 
    Eydrian.pop();

		Eydrian.peek();

		Eydrian.show();
  }  

}
