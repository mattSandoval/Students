/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
* DESCRIPTION: 
*
* A QUEUE is an ADT (abstract data type) in FIFO order (first in, first out).
* It has 2 main operations: (1) ENQUEUE for adding, and (2) DEQUEUE for removing elements.
* It is a protected SINGLY LINKED LIST where ENQUEUE and DEQUEUE are only allowed on the top front or last element in the queue.
* You may also PEEK to show the front element.
* Implementation can either be in ARRAY or LINKED LIST.
*
* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
* TODO: 
* 
* Implement a QUEUE using ARRAY that can hold a maximum of 10 string values.
* Create operations ENQUEUE, DEQUEUE, and PEEK.
* Allow PUSH only if the queue is not yet full.
* Allow DEQUEUE only if the queue is not yet empty.
* Allow PEEK to see the front element.
* Show the updated ARRAY QUEUE everytime you ENQUEUE or DEQUEUE.
*
* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
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
*    Queue temp = new Queue(element)
*     temp.next = head
*     head = temp
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
*    PRINT top
* 
*  PROCEDURE main
*  show that queue is empty
*  push 10 string until queue is full
*  show updated queue
*  try to enqueue again, return error message
*  dequeue head element
*  peek head element
*  dequeue all elements until stack is empty
*  show updated queue
*  try to enqueue again, return error message
* 
* END PROGRAM 
* 
* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
* @author [Aranas, Michaela M.]  
* @link [https://github.com/lvcc-dsa/Students/edit/master/BSIS/Aranas-Michaela/array-queue/ArrayQueue.java]
* @version [1.0]
* @since [28/07/2016]
*
* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
*/

public class ArrayQueue {
 private int capacity;
 private int rear, front = 0;
 private String[] storage;
 
  public ArrayQueue(int size) {
     capacity = size;
     storage = new String[capacity];
   }

  public void show() {
     for (int i = 0; i <= capacity - 1; i++) {
         System.out.println("queue [" + i + "] =    " + storage [i]);
     }
     System.out.println();
    }
   
   private boolean isEmpty() {
     if (storage[0] == null) {
       System.out.println("Queue is Empty.");         
       return true;
     } 
     return false;
   }

   private boolean isFull() {
     if ((rear-front) == capacity) {
       System.out.println("Queue is Full.");          
       return true;
     } 
     return false;
   }

   public void enqueue(String value) {
     if (isFull()) {
       System.out.println("Failed to add "+ value );       
       System.out.println();
     } else {
        System.out.println("... trying to enqueue on Queue[" + (rear-front) + "] ...");
        storage[rear-front] = value;
        rear++;
        System.out.println(value + " was successfully added.");
        System.out.println();
     }
   }

   public void dequeue() {
     if (isEmpty()) {
       System.out.println("Remove failed.");
     } else {
       System.out.println("... trying to dequeue[" + 0 + "] ...");
       /* increment or decrement top*/;
       System.out.println(storage[front] + " was successfully removed.");
       front++;
       for ( int j = 0; j < rear; j++ ){
         storage [j] = storage [j+front];
       }
       System.out.println();
     }
   }

   public void peek() {
     if (storage[front] == storage[0]) {
       System.out.println("PEEK TOP = " + storage[front]);
       System.out.println();
     } else {
       System.out.println("PEEK TOP = " + storage[0]);
       System.out.println();
     }
   }
   
   public static void main(String[] args) {
     ArrayQueue storage = new ArrayQueue(10);
     System.out.println("STORAGE CAPACITY = " + storage.capacity );
     System.out.println();
     storage.show(); 
     storage.dequeue(); 
     storage.peek(); 
     storage.enqueue("one");
     storage.show(); 
     storage.peek(); 
     storage.enqueue("two");
     storage.show(); 
     storage.peek(); 
     storage.enqueue("three");
     storage.show(); 
     storage.peek(); 
     storage.enqueue("four");
     storage.show(); 
     storage.enqueue("five"); 
     storage.show(); 
     storage.dequeue(); 
     storage.enqueue("six"); 
     storage.enqueue("seven"); 
     storage.enqueue("eight"); 
     storage.enqueue("nine");    
     storage.enqueue("ten"); 
     storage.show();  
     storage.peek(); 
     storage.enqueue("eleven");   
     storage.enqueue("twelve");  
     storage.show(); 
   }  
}
