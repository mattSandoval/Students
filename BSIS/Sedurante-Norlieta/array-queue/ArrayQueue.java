/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
* SOURCE CODE: ArrayStack.java
* AUTHOR NAME: Sedurante, Norlieta  I.
* GITHUB URL: [https://github.com/lvcc-dsa/Students/master/BSIS/Sedurante-Norlieta/array-queue/ArrayQueue.java]
* LAST UPDATE: [07/31/2016]
*
* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
*/

  
package arrayqueue;


public class ArrayQueue {

      private int capacity;
      private int top = 0;
      private String[] storage;
 
      



  

  public ArrayQueue(int size) {

    capacity = size;
    storage = new String[capacity];
  }

  public void show() {
   
    for (int i = 0; i<= capacity-1; i++) {
         System.out.println("stack[" + i +"] = " + storage[i] );
     
    }
    System.out.println();
  }
  
  private boolean isEmpty() {
    if (storage[0] == null) {
      
      System.out.println("storage is empty");
      return true;
    } 
    return false;
  }

  private boolean isFull() {
    if (top == capacity) {
 
        
         System.out.println("storage is full");
         
      return true;
    } 
    return false;
  }

  public void push(String value) {
    if (isFull()) {
    
        
      System.out.println();
    } else {
      System.out.println(" trying to push on stack[" + top + "] ...");
      storage[top] = value;
     
      top++;
      System.out.println(value + " was successfully added.");
      System.out.println();
    }
  }

  public void pop() {
    if (isEmpty()) {
   
      System.out.println();
    } else {
      System.out.println(" trying to pop stack[" + (top-1) + "] ...");
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
      int capacity;
      ArrayQueue  stack = new ArrayQueue(10);
   
    System.out.println("STORAGE CAPACITY = " +"capacity");
    System.out.println();
    stack.show();
    stack.pop();
    stack.peek();
   
    
    
    stack.push("one");
    stack.show();
    stack.peek();
  
    stack.push("two");
    stack.show();
    stack.peek();
 
    stack.push("three");
    stack.show();
    stack.peek();
 
    stack.push("four");
    stack.show();
  

    stack.push("five"); 
    stack.show(); 
    stack.pop();
    
  
    stack.push("six"); 
    stack.show();
   
    
    stack.push("seven"); 
   
    
    stack.push("eight"); 
   
    
    stack.push("nine");  
   
    stack.push("ten"); 
    stack.show();

    
    stack.push("eleven");
    stack.push("twelve");
    stack.show();

  }  

}
    
    

