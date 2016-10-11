/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
* DESCRIPTION: 
*
* A QUEUE is an ADT (abstract data type) in FIFO order (first in, first out).
* It has 2 main operations: (1) ENQUEUE or adding on the tail/back, and (2) DEQUEUE or removing on the head/front.
* It is a protected SINGLY LINKED LIST where enqueue and dequeue are only allowed on the top front or last element in the queue.
* Implementation can either be in ARRAY or LINKED LIST.
* It's algorithmic complexity is CONSTANT or O(1) for both ends (enqueue, dequeue).
*
* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
* TODO: 
* 
* Implement a QUEUE using ARRAY that can hold a maximum of 10 integers.
* Create operations ENQUEUE and DEQUEUE
* Allow ENQUEUE only if the queue is not yet full.
* Allow DEQUEUE only if the queue is not yet empty.
* Upon DEQUEUE, shift the element's position accordingly.
* Allow PEEK to see the topmost topmost element.
* Show the updated ARRAY QUEUE for every successful ENQUEUE and DEQUEUE.
*
* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
* PSEUDOCODE:
* 
* START PROGRAM
* 
*  SET capacity, head, tail, storage[]
* 
*  PROCEDURE show
*   FOR EACH element IN queue.capacity
*    PRINT queue[element]
* 
*  PROCEDURE isEmpty
*   IF queue[0] == null
*    PRINT queue is empty
*    return TRUE
*
*  PROCEDURE isFull
*  IF head == capacity
*    PRINT queue is full
*    return TRUE
* 
*  PROCEDURE enqueue
*   IF isFull
*    PRINT add failed. element did not enqueue.
*   ELSE
*     Queue temp = new Queue(element)
*     tail.next = temp
*     tail = temp
* 
*  PROCEDURE dequeue
*   IF isEmpty
*    PRINT remove failed. no element to dequeue.
*   ELSE
*    temp = head
*    head = head.next
*    remove temp
*   
*  PROCEDURE peek
*   IF isEmpty
*    PRINT 0
*   ELSE 
*    PRINT head.data
* 
*  PROCEDURE main
*  show that queue is empty
*  enqueue 10 integers until queue is full
*  show updated queue
*  try to enqueue again, return error message
*  dequeue last element
*  peek last element
*  dequeue all elements until queue is empty
*  show updated queue
*  try to dequeue again, return error message
* 
* END PROGRAM 
* 
* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
* SOURCE CODE: ArrayQueue.java
* AUTHOR NAME: [Zabala Abner L]
* GITHUB URL: [github.com/zabala.abner]
* LAST UPDATE: [11/11/1998]
*
* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
*/



public class ArrayQueue {

  public int tail = 0;
  public int capacity;
  private int top ;
  public static String[] storage;
  
  // constructor = initialize an object instance of the class
  public ArrayQueue(int size) {
    capacity = size;  // Self-Added
    storage = new String[capacity];
  }
  public void show(){
 // the top of the queue starts from array[0] then newer item gets added on top of another until it reaches its capacity limit
    for (int i = 0; i <=capacity-1; i++) {
       if (i <=capacity) {
         System.out.print("["+ storage[i] + "]");
         System.out.print(" -----");}
       else {
         System.out.print("["+ storage[i] + "]"+"\t");
       }
    }
  }

  private boolean isEmpty(){
    if (storage[tail] == null) {
      // print error message
      System.out.println(" The Queue is Empty");
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
      System.out.println("The Queue is already Full");
      System.out.println();
      return true;
    } 
    else {
    return false;
  }
  }
  public void add(String value) {
    if (isFull()) {
      // print error message
      System.out.println("Adding unsuccessful Stack is already full");
    } else {
      System.out.println("... trying to add to queue[" + (top+1) + "] ...");
      storage[top] = value;
      top++;  //Self Added
      System.out.println(value + " was successfully added.");
      System.out.println();
    }
  }

  public void removing() {
    if (isEmpty()) {
      // print error message
      System.out.println("Error the queue is already empty");
    } else {
      System.out.println("... trying to delete from queue[" + (top) + "] ...");
      storage[top-1] = null; // Self-Added
      top--;
      System.out.println(storage[top] + " was successfully removed.");
      System.out.println();
    }
  }

  public void peek() {
    if (storage[top] ==storage[0]) {
      System.out.println("PEEK TOP = " + storage[top]);
      System.out.println();
    } else {
      System.out.println("PEEK TOP = " + storage[top]);
      System.out.println();
    }
  }
  
  
public static void main(String[] args) {
      ArrayQueue storage = new ArrayQueue(5);
// construct a new array queue and assign 10 as the integer value for the size limit of the stack
    System.out.println("STORAGE CAPACITY = " +  storage.capacity );
    System.out.println();
    storage.show();
    storage.removing();
    // show empty stack
    // try removing on an empty stack
    // peek top element of an empty stack
    storage.add("one");
    storage.show();
    // show the updated stack
    // peek if top element is "one"
    storage.add("two");
    // show the updated stack
    // peek if top element is "two"
    storage.add("three");
    // show the updated stack
    storage.show();
    // peek if top element is "three"
    storage.add("four");
    storage.add("Five");
    storage.show();
    storage.removing();
    storage.show();
}
}
