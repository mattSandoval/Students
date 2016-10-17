/**
* Java implementation of a queue using array.
* For demo purpose, should hold a maximum of 10 integers.
*
* @author  [Adrian Vilalfuerte]
* @since   [last updated 18/10/2016]
*/

public class ArrayQueue {
  
  // note: variable declarations
  private int capacity; // note: optional, you may also use array.length
  private int head; // note: value of front item
  private int tail; // note: counter number of tail
  private int[] storage; // note: array is of integer values
  
  // note: constructor = initialize an object instance of the class
  public ArrayQueue(int size) {
    capacity = size; // note: optional, can directly pass a new int[size]
    storage = new int[capacity];
    // todo: initialize values for tail, head, and tail
  } 

  // note: will display the array
  public void show() {
    // note: the top of the queue starts from array[0] then newer item gets added on the tail and removes in the front
    for (int i = 0; i < capacity; i++) {
      System.out.println("queue["+ i +"] = " + storage[]); // todo: use adjust(head+i) to adjust each item's position
    }
      System.out.println(); // note: prints optional new line for readability
  }
  
  // note: will check if it's true that the array is empty
  private boolean isEmpty() {
    if (tail == 0) { // note: checks if numbers tail has reached 0 or empty
      System.out.println(" "); // todo: print error message here
      System.out.println(); // note: this prints optional new line for readability
      return true;
    } 
    return false; // note: defaults to false
  }

  private boolean isFull() {
    if (tail == capacity) { // note: compares if number of tail has reached capacity limit
      System.out.println(" "); // todo: print error message here
      System.out.println(); // note: this prints optional new line for readability
      return true;
    } 
    return false; // note: defaults to false
  }

  // note: will add value to the tail of array
  public void enqueue(int value) {
    if (isFull()) {
      System.out.println("... trying to enqueue on queue[" + (tail-1) + "] ...");
      System.out.println(" "); // todo: print error message here
      System.out.println(); // note: prints optional new line for readability
    } else {
      System.out.println("... trying to enqueue on queue[" + tail + "] ...");
      storage[adjust(head + tail)]; // todo: assign the value to the adjusted position of head
      tail; // todo: should increment or decrement?
      System.out.println(value + " was successfully _________."); // todo: what does enqueue do?
      System.out.println(); // note: prints optional new line for readability
    }
  }

  // note: will remove value to the head of array
package Package;
public class QUEUE {
private int QueSIZE;
private int[]que;
private int i = 0;
public QUEUE (int isize) {
this.QueSIZE= isize;
this.que = new int[this.QueSIZE];
}
public void showQueue(){
for (int x=0; x< this.QueSIZE;x++){
System.out.println("QUEUE["+x+"] = " + this.que[x]);
}
System.out.println();
}
public boolean isFull() {
if (this. i == this.QueSIZE) {
System.out.println ("The Queue is already full");
return true;
} else{
return false;
}}
public boolean isEmpty() {
if (this.i == 0){
System.out.println("The Queue is Empty");
return true;
} else{
return false;
}}
public boolean enqueue (int num) {
System.out.println("Trying to enqueue " + num + "...");
if (!this.isFull()){
this.que[i] = num;
System.out.println("\t" + "Added " + num);
this.i++;
return true;
} else{
return false;
}}
public void dequeue() {
if (isEmpty()) {
System.out.println("REMOVE FAIL! , Storage is empty.");
System.out.println();
} else {
int num=que[0];
System.out.println("... trying to dequeue [0] ...");
que[0] = 0;
System.out.println(num + " was successfully removed.");
System.out.println();
for (int a=0; a<i-1; a++) {
this.que[a]=que[a+1];
}
i--;
}
}
public int peekFront() {
System.out.println("The front number : "+que[0]);
return this.que[0];
}
public int peekRear() {
System.out.println("The rear number : "+que[this.i-1]);
return this.que[this.i-1];
}
private void rearangeQueue() {
int c, d, swap;
for (c = 0; c < (QueSIZE-1); c++){
for (d = 0; d < QueSIZE -c -1; d++){
if (this.que[d] > this.que [d+1]){
swap = this.que[d];
this.que[d] = this.que[d+1];
this.que[d+1] = swap;
}
}
}
System.out.println("Sorted list of Numbers");
for (c = 0; c < QueSIZE; c++){
System.out.println("QUEUE["+c+"] = " + this.que[c]);
}
}
public static void main(String[]args){
QUEUE queueFunction = new QUEUE(10);
queueFunction.showQueue();
queueFunction.enqueue(9);
queueFunction.showQueue();
queueFunction.dequeue();
queueFunction.dequeue();
queueFunction.enqueue (10);
queueFunction.showQueue();
queueFunction.enqueue (90);
queueFunction.enqueue (11);
queueFunction.enqueue (1);
queueFunction.enqueue (4);
queueFunction.enqueue (19);
queueFunction.enqueue (20);
queueFunction.showQueue();
queueFunction.peekFront();
queueFunction.peekRear();
queueFunction.showQueue();
queueFunction.enqueue (43);
queueFunction.enqueue (24);
queueFunction.dequeue();
queueFunction.enqueue (14);
queueFunction.enqueue (33);
queueFunction.enqueue(89);
queueFunction.showQueue();
queueFunction.rearangeQueue();
}
}
