/**
* Java implementation of a queue using array.
* For demo purpose, should hold a maximum of 10 integers.
*
* @author  [Cristine Amie Rigo]
* @link    [https://github.com/amierigo/DSA/blob/master/ArrayQueue.java]
* @version [26.1]
* @since   [09-28-16]
*/

public class ArrayQueue {
  
  private int capacity; 
  private int head; 
  private int tail;
  private int[] storage; 

  public ArrayQueue(int size) {
    capacity = size; 
    storage = new int[capacity];
  } 

  public void show() {
    for (int i = 0; i < capacity; i++) {
      System.out.println("queue["+ i +"] = " + storage[i]); 
    }
      System.out.println(); 
  }
   
  private boolean isEmpty() {
    if (tail == 0) {
      System.out.println("Queue is Empty"); 
      System.out.println();
      return true;
    } 
    return false; 
  }
  
  private boolean isFull() {
    if (tail == capacity) {
      System.out.println("Queue is Full"); 
      System.out.println(); 
      return true;
    } 
    return false; 
  }

  
  public void enqueue(int value) {
    if (isFull()) {
      System.out.println("... trying to enqueue on queue[" + (tail-1) + "] ...");
      System.out.println("Failed to enqueue"); 
      System.out.println(); 
    } else {
      System.out.println("... trying to enqueue on queue[" + tail + "] ...");
      storage[adjust(head + tail)]=num;
      tail++;
      System.out.println(value + " was successfully _________."); 
      System.out.println(); 
    }
  }
    
 
  public int dequeue() {    
    if (isEmpty()) { 
      System.out.println("... trying to dequeue head ...");
      System.out.println("Failed to dequeue"); 
      System.out.println(); 
    } else {  
      System.out.println("... trying to dequeue head ...");
      int temp = head; 
      storage[head] = 0; 
      adjust(head + 1) = head; 
      tail--; 
      System.out.println(head + " was successfully removed."); 
      System.out.println();
      return temp; 
    }
    return 0; 
  }
   
  
  private final int adjust(int i) {
    return (i + capacity) % capacity; 
  }

  public int peekHead() {
    System.out.println("Head : " + storage[head]);
    if (isEmpty()) {
      return -1;
    }    
    System.out.println();
    return 0;
  }

  
  public int peekTail() {
    System.out.println("Tail : " + storage[tail-1]);
    if (isEmpty()) {      
      return -1;
    }
    System.out.println();
    return 0;
  }

  public static void main(String[] args) {
    ArrayQueue get = new ArrayQueue(10);
    System.out.println("STORAGE CAPACITY [" + storage.capacity + "]");
    System.out.println();
    
    storage.enqueue(10);   
    storage.enqueue(20);    
    storage.enqueue(30);    
    storage.enqueue(40);    
    storage.enqueue(50);
    storage.enqueue(60); 
    storage.enqueue(70); 
    storage.enqueue(80); 
    storage.enqueue(90);    
    storage.enqueue(100); 
    storage.dequeue(); 
    storage.dequeue();
    storage.show();
  }  

}
