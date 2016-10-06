/**
* Java implementation of a queue using array.
* For demo purpose, should hold a maximum of 10 integers.
*
* @author  [Leo O. Vibar]
* @link    [full github url]
* @version [version number]
* @since   [last updated dd/mm/yyyy]
*/

public class ArrayQueue {
  private int c;
  private int head = 1;
  private int tail = 1;
  private int[] s;
  public ArrayQueueJava(int size) {
    c = size;
    s = new int[c]; 
  } 

  public void show() {
    for (int i = 0; i < c; i++) {
      System.out.println("queue["+ i +"] = " + s[adjust(head+i)]);         
    }
    System.out.println();
    System.out.println("STORAGE STATUS: ");
    System.out.println("Size : " + c + " max");
    System.out.println("Empty: " + (c-tail) + " left");
    peekHead();
    peekTail();
    System.out.println();
  }
  
  private boolean isEmpty() {
    if (tail == 0) {
      System.out.println("STORAGE IS EMPTY.");
      return true;
    } 
    return false;
  }

  private boolean isFull() {
    if (tail == c) {
      System.out.println("STORAGE IS FULL.");
      return true;
    }
    return false;
  }

  public void enqueue(int value) {    
    System.out.println("Enqueueing " + value + " ...");
    if (isFull()) {      
      System.out.println("ADD FAILED.");
      System.out.println();
    } else {
      s[adjust(head+tail)] = value;
      tail++;
      System.out.println("Done! " + value + " has been added.");
      System.out.println();  
    }     
  }

  public int dequeue() {
    System.out.println("Dequeueing " + s[head] + " ...");
    if (isEmpty()) {      
      System.out.println("REMOVE FAILED.");
      System.out.println();
      return -1;
    } else {
      int temp = s[head];
      s[head] = 0;
      head = adjust(head+1);
      tail--;
      System.out.println("Done! " + temp + " has been removed.");
      System.out.println();
      return temp;      
    }    
  }

  private final int adjust(int i) {
    return (i + c) % c;
  }

  public int peekHead() {
    System.out.println("Head : " + s[head]);
    if (isEmpty()) {      
      return -1;
    }
    return 0;
  }

  public int peekTail() {
    if (isEmpty()) {
      System.out.println("Tail : " + s[adjust(c)]); 
      return -1;
    } else if (isFull()) {
      System.out.println("Tail : " + s[adjust(tail)]); 
      return 0;
    } else if (tail <= c) {
      System.out.println("Tail : " + s[c-1]);
      return 0;
    } else if (tail >= c) {
      System.out.println("Tail : " + s[adjust(tail+1)]);
      return 0;
    } else if (!isEmpty() && !isFull()) {
      System.out.println("Tail : " + s[c-1]);
      return 0;
    } else {
      System.out.println("Tail : " + s[adjust(tail)]);
      return 0;
    }
  }

   
    public static void main(String[] args) {
    ArrayQueueJava storage = new ArrayQueueJava(10);
    storage.enqueue(1);   
    storage.enqueue(2);    
    storage.enqueue(3);    
    storage.enqueue(4);    
    storage.enqueue(5);
    storage.enqueue(6); 
    storage.enqueue(7); 
    storage.enqueue(8); 
    storage.enqueue(9);    
    storage.enqueue(10); 
    storage.show(); // show full storage
    storage.enqueue(11);    
    storage.dequeue();
    storage.show();
    storage.enqueue(12); 
    storage.show(); // show full storage
    storage.dequeue(); 
    storage.dequeue(); 
    storage.dequeue(); 
    storage.dequeue(); 
    storage.dequeue(); 
    storage.dequeue(); 
    storage.dequeue(); 
    storage.dequeue(); 
    storage.dequeue(); 
    storage.dequeue(); 
    storage.show(); // show empty storage
    }
    
}
