/**
* Java implementation of a queue using array.
* For demo purpose, should hold a maximum of 10 integers.
*
* @author  [Crisrian E. Quiza]
* @link    [https://github.com/Kirisaite]
* @version [version 1]
* @since   [October 4,2016]
*/

public class QUEUE {
 private int QSIZE;
 private int[]queue;
 private int nItems = 0;

 public QUEUE(int size){
  this.QSIZE= size;
  this.queue = new int[this.QSIZE];
 }

 public void showQueue(){
   for (int i=0; i< this.QSIZE;i++){
   System.out.println("QUEUE["+i+"] = " + this.queue[i]);
   
  }
   System.out.println();
 }

 public boolean isFull() {
   if (this.nItems == this.QSIZE) {
    System.out.println ("The Queue is already full");
    return true;
   } else{
    return false;
   }}
   
 public boolean isEmpty() {
   if (this.nItems == 0){
    System.out.println("The Queue is Empty");
    return true;
   } else{
    return false;
   }}

 public boolean enqueue (int num) {
   System.out.println("Trying to enqueue " + num + "...");
   if (!this.isFull()){
    this.queue[nItems] = num;
    System.out.println("\t" + "Added " + num);
    this.nItems++;
     return true;
   } else{
    return false;
   }}

 public void dequeue() {
   if (isEmpty()) {
       System.out.println("REMOVE FAILED, Storage is empty.");
        System.out.println();
      } else {
        System.out.println("... trying to dequeue [" + (nItems-1) + "] ...");
        queue[nItems] = 0;
        nItems--;
        System.out.println(queue[nItems] + " was successfully removed.");
        System.out.println();
      }
   }

 public int peekFront() {
   System.out.println("The front number is : "+queue[0]);
   return this.queue[0];
 }
 public int peekRear() {
  System.out.println("The rear number is : "+queue[this.nItems-1]);
   return this.queue[this.nItems-1];
 }
 private void rearangeQueue() {
  
    int c, d, swap;
    


 for (c = 0; c < (QSIZE-1); c++){
  for (d = 0; d < QSIZE -c -1; d++){
   if (this.queue[d] > this.queue [d+1]){
    swap       = this.queue[d];
    this.queue[d]   = this.queue[d+1];
    this.queue[d+1] = swap;
   }
  }
 }
   System.out.println("Sorted list of Numbers");
   
   for (c = 0; c < QSIZE; c++){
    System.out.println("QUEUE["+c+"] = " + this.queue[c]);
   }
     }

 public static void main(String[]args){
  
  QUEUE queueDemo = new QUEUE(10);
    queueDemo.showQueue();
    queueDemo.enqueue(23);
    queueDemo.showQueue();
    queueDemo.dequeue();
    queueDemo.dequeue();
    queueDemo.enqueue (21);
    queueDemo.showQueue();
    queueDemo.enqueue (12);
    queueDemo.enqueue (3);
    queueDemo.enqueue (1);
    queueDemo.enqueue (2);
    queueDemo.enqueue (9);
    queueDemo.enqueue (10);
    queueDemo.showQueue();
    queueDemo.peekFront();
    queueDemo.peekRear();
    queueDemo.showQueue();
    queueDemo.enqueue (78);
    queueDemo.enqueue (15);
    queueDemo.dequeue();
    queueDemo.enqueue (13);
    queueDemo.enqueue (22);
    queueDemo.enqueue(25);
    queueDemo.showQueue();
    queueDemo.rearangeQueue();
 }
}
