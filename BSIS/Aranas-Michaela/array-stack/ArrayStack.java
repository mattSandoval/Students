/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
* DESCRIPTION: 
*
* A STACK is an ADT (abstract data type) in LIFO order (last in, first out).
* It has 2 main operations: (1) PUSH for adding, and (2) POP for removing elements.
* It is a protected SINGLY LINKED LIST where PUSH and POP are only allowed on the top front or last element in the stack.
* You may also PEEK to show the last element added.
* Implementation can either be in ARRAY or LINKED LIST.
* It's algorithmic complexity is CONSTANT or O(1).
*
* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
* TODO: 
* 
* Implement a STACK using ARRAY that can hold a maximum of 10 string values.
* Create operations PUSH, POP, and PEEK.
* Allow PUSH only if the stack is not yet full.
* Allow POP only if the stack is not yet empty.
* Allow PEEK to see the topmost element.
* Show the updated ARRAY STACK everytime you PUSH or POP.
*
* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
* PSEUDOCODE:
* 
* START PROGRAM
* 
*  SET capacity, top, storage[]
* 
*  PROCEDURE show
*   FOR EACH element IN stack.capacity
*    PRINT stack[element]
* 
*  PROCEDURE isEmpty
*   IF stack[0] == null
*    PRINT stack is empty
*    return TRUE
*
*  PROCEDURE isFull
*  IF top == capacity
*    PRINT stack is full
*    return TRUE
* 
*  PROCEDURE push(element)
*   IF isFull
*    PRINT add failed. 
*   ELSE
*     PRINT trying to push on stack[top]
*     storage[top] = element
*     top++
*     PRINT element was successfully added
*
*  PROCEDURE pop
*   IF isEmpty
*    PRINT remove failed.
*   ELSE
*    PRINT trying to push on stack[top]
*    storage[top] = null
*    top--
*    PRINT storage[top] was successfully removed
*   
*  PROCEDURE peek
*   IF isEmpty
*    PRINT NULL
*   ELSE 
*    PRINT storage[top]
* 
*  PROCEDURE main
*  show that stack is empty
*  push 10 string until stack is full
*  show updated stack
*  try to push again, return error message
*  pop last element
*  peek last element
*  pop all elements until stack is empty
*  show updated stack
*  try to pop again, return error message
* 
* END PROGRAM 
* 
* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
* 
* @author [Aranas, Michaela M.]
* @link [https://github.com/lvcc-dsa/Students/blob/master/BSIS/Aranas-Michaela/array-stack/ArrayStack.java]
* @version [1.0]
* @since [10/08/2016]
*
* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
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
         System.out.println("stack [" + i + "] =    " + storage [i]);
      }
      System.out.println();
   }
   
    private boolean isEmpty() {
      if (storage[0] == null) {
       System.out.println("STACK IS EMPTY.");
       return true;
      } 
      return false;
   }

   private boolean isFull() {
     if (top == capacity) {
       System.out.println("STACK IS FULL.");
       return true;
     } 
     return false;
   }

   public void push(String value) {
     if (isFull()) {
       System.out.println("ADD FAILED.");
       System.out.println();
     } else {
       System.out.println("... trying to push on stack[" + top + "] ...");
       storage[top] = value;
       top ++;
       System.out.println(value + " was successfully added.");
       System.out.println();
     }
   }

   public void pop() {
     if (isEmpty()) {
       System.out.println("REMOVE FAILED.");
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
     ArrayStack storage = new ArrayStack(10);
     System.out.println("STORAGE CAPACITY = " + storage.capacity );
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
