/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
* SOURCE CODE: Queue.java
* AUTHOR NAME: Sedurante, Norlieta I.
* GITHUB URL: [https://github.com/norlietasedurante/DSA-Queue2]
* LAST UPDATE: [08/23/2016]
*
* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
*/
package queue;
public class Queue {

   
      private int capacity;
      private int front = 0;
      private String[] storage;
      private int tail=0;
 
  public Queue(int size) {
   
    capacity = size;
    storage = new String[capacity];
  }

  public void show() {

    for (int i = 0; i <=capacity-1; i++) {
         System.out.println("Queue [" + i +"] = " + storage[i] );
    
    }
    System.out.println();
  }
  
  private boolean isEmpty() {
    if (storage[0] == null) {
     
      System.out.println("");
      
      return true;
    } 
    return false;
  }

  private boolean isFull() {
    if (front == capacity) {
     
         System.out.println("Storage is Full");
         
      return true;
    } 
    return false;
  }

  public void Enqueue(String value) {
    if (isFull()) {
     
      System.out.println("Your Storage is FULL!");
      
      System.out.println();
    } else {
      System.out.println("Tyring to Enqueue on stack[" + front + "]" );
      
      storage[front] = value;
   
      front++;
      
      System.out.println(value + " was successfully added. ");
      
      System.out.println();
    }
  }

  public void dequeue() {
    if (isEmpty()) {
     
      System.out.println(" Your Storage is Empty ");
      
    } 
    else {
        
      System.out.println("Tyring to Dequeue stack[" + (front-1) + "]");
      
      storage[tail] = storage[front-1] ;
      storage[front] = storage[front];
      
      
    
      front--;
      System.out.println(storage[front]+ " was successfully removed.");
      System.out.println();
      
    }
  }

  public void peekRear() {
    if (storage[front] == storage[0]) {
      System.out.println(" PEEK REAR = " + storage[front+1]);
      
      System.out.println();
    } else {
      System.out.println(" PEEK REAR = " + storage[front-1]);
      System.out.println();
    }
  }
  public void peekfront() {
    if (storage[front] == storage[0]) {
      System.out.println(" PEEK Front = " + storage[front]);
      
      System.out.println();
    } else {
      System.out.println(" PEEK Front = " + storage[front-1]);
      System.out.println();
    }
  }
  
 
  
  public static void main(String[] args) {
      int capacity;
      
     Queue  queue = new Queue(10);
   
    System.out.println("STORAGE CAPACITY = " + "Capacity of Storage");
    
    System.out.println();
    queue.show();
    queue.dequeue();

    System.out.println();
 
    queue.peekRear();

    
    queue.Enqueue("1");
    queue.show();
    queue.peekfront();
    queue.dequeue(); 
    
    
    queue.Enqueue("2"); 
    queue.show();
    queue.peekfront();
    queue.dequeue();
    
 
    queue.Enqueue("3");
    queue.show();
    queue.dequeue();
    queue.peekfront();
    queue.peekRear();
  
    queue.Enqueue("4");
    queue.show();
    queue.peekfront(); 
   
     
    queue.Enqueue("5"); 
    queue.show();
    queue.peekRear();
    queue.dequeue();
   
    queue.Enqueue("6"); 
    queue.show();
    queue.peekRear(); 
    queue.dequeue();
   
    
    queue.Enqueue("7"); 
    queue.show();
    queue.peekRear();
    queue.dequeue();
   
    
    
    queue.Enqueue("8"); 
    queue.show();
    queue.peekRear();
    
    queue.Enqueue("9");  
    queue.show();
    queue.peekRear();
    
    queue.Enqueue("10"); 
    queue.show(); 
    queue.peekRear();
    
    queue.Enqueue("11");
    queue.Enqueue("12");
    queue.show();
    queue.peekRear();
   
    queue.Enqueue("13"); 
    queue.Enqueue("14");
    queue.show();
    queue.peekRear();
    
    queue.Enqueue("15"); 
    queue.Enqueue("16");
    queue.show();
  
        
     
   
    
  }
    
}
