/*
 * @author	[Josel Charille De Mesa]
 * @link	[@chadenggg]
 * @version	[Version number]
 * @since	[last updated 12/10/16]
 * 
 */

package BENGBENG;

public class ArrayQueue {
	
	private int QSIZE;
	private int[]queue;
	private int nItems = 0;

	public ArrayQueue(int size){
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
			if (this.QSIZE == 0){
				System.out.println("The Queue is Empty");
				return true;
			}	else{
				return false;
			}}

	public boolean enqueue (int num) {
			System.out.println("Trying to enqueue " + num + "...");
			if (!this.isFull()){
				this.queue[nItems] = num;
				System.out.println("\t" + "Added " + num);
				this.nItems+=1;
					return true;
			}	else{
				return false;
			}}

	public void dequeue() {
		 if (isEmpty()) {
		    	System.out.println("REMOVE FAILED, Storage is empty.");
		      System.out.println();
		    } else {
		      nItems = 0;
		      System.out.println("... trying to dequeue [" + (nItems) + "] ...");
		      System.out.println(queue[nItems] + " was successfully removed.");
		      System.out.println();
		      queue[nItems++] = 0;
		      nItems-=1;
		      for(int i=0;i<QSIZE-1;i++){
		    	  queue[i] =  queue[i+1];
		      }
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

	public static void main(String[]args){
		
		ArrayQueue ca = new ArrayQueue(10);
		  ca.showQueue();
		  ca.enqueue(23);
		  ca.dequeue();
		  ca.dequeue();
		  ca.showQueue();
		  ca.enqueue (21);
		  ca.enqueue (12);
		  ca.enqueue (3);
		  ca.enqueue (1);
		  ca.enqueue (2);
		  ca.enqueue (9);
		  ca.enqueue (10);
		  ca.peekFront();
		  ca.peekRear();
		  ca.showQueue();
		  ca.dequeue();
		  ca.dequeue();
		  ca.showQueue();
		  

	}
}
