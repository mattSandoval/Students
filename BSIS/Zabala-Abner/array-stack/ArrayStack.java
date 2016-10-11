/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class ArrayStack {

  public int tail = 0;
  public int capacity;
  public int top;
  public static String[] storage;
  
  // constructor = initialize an object instance of the class
  public ArrayStack(int size) {
    capacity = size;  // Self-Added
    storage = new String[capacity];
  }

  public void show() {
    // the top of the stack starts from array[0] then newer item gets added on top of another until it reaches its capacity limit
    for (int i = capacity-1; i >= 0; i--) {
      if (i !=0) {
        System.out.println("   " + "["+ storage[i] + "]");
        System.out.println("     " + "||");}
      else {
        System.out.println("   " + "["+ storage[i] + "]"+"\t");
      }
    }
  }
  
 private boolean isEmpty(){
    if (storage[tail] == null) {
      // print error message
      System.out.println(" The Stack is Empty");
      System.out.println();
      return true;
    } 
    else {
    return false;
  }
 }
  private boolean isFull() {
    if (top == capacity) {
      // print error message
      System.out.println("The Stack is already Full");
      System.out.println();
      return true;
    } 
    else {
    return false;
  }
  }

  public void push(String value) {
    if (isFull()) {
      // print error message
      System.out.println("Trying to push on stack[" + top + "]");
      System.out.println("Push unsuccessful Stack is already full");

     } else {
      System.out.println("... trying to push on stack[" + top + "] ...");
      storage[top] = value;
      top++;  //Self Added
      System.out.println(value + " was successfully added.");
      System.out.println();
    }
  }

  public void pop() {
    if (isEmpty()) {
      // print error message
      System.out.println("Pop unsuccessful Stack is already empty");
    } else {
      System.out.println("... trying to pop stack[" + (top-1) + "] ...");
      storage[top] = "zero"; // Self-Added
      top--;
      System.out.println(storage[top] + " was successfully removed.");
      System.out.println();
    }
  }

  public void peek() {
      System.out.println("PEEK TOP = " + storage[top-1]);
      System.out.println();
  }

  public static void main(String[] args) {
      ArrayStack storage = new ArrayStack(10);
// construct a new array queue and assign 10 as the integer value for the size limit of the stack
    System.out.println("STORAGE CAPACITY = " +  storage.capacity );
    System.out.println();
    storage.show();
    storage.pop();
    // show empty stack
    // try removing on an empty stack
    // peek top element of an empty stack
    storage.push("one");
    // show the updated stack
    // peek if top element is "one"
    storage.push("two");
    // show the updated stack
    // peek if top element is "two"
    storage.push("three");
    // show the updated stack
    // peek if top element is "three"
    storage.push("four");
    // show the updated stack
    storage.push("five"); 
    // show the updated stack
    // try removing "five"
    storage.pop ();
    storage.push("six"); 
    storage.push("seven"); 
    storage.push("eight"); 
    storage.push("nine");    
    storage.push("ten"); 
    
    // show the updated stack
    // peek if top element is "ten"
    // try adding "eleven"
    // try adding "twelve"
    // show the updated stack
    storage.show();
    storage.push("eleven");
    storage.peek();
    storage.show();
    
  }  


}
