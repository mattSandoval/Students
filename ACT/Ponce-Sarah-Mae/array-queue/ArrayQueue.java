/**
* Java implementation of a queue using array.
* For demo purpose, should hold a maximum of 10 integers.
*
* @author  [Sarah Mae Ponce]
* @link    [https://github.com/Saranghae08]
* @version [version number]
* @since   [06/10/2016]
*/

public class ArrayQueue {

	 private int capacity;
	    int ArrQue[];
	    int front = 0;
	    int rear = -1;
	    int Size = 0;
	     
	    public ArrayQueue(int QueueSize){
	        this.capacity = QueueSize;
	        ArrQue = new int[this.capacity];
}
	    public void enqueue(int item) {
	        if (isQueueFull()) {
	            System.out.println("Overspill! Incapable to add element in Queue: "+item);
	    }
	        else {
	            rear++;
	            if(rear == capacity-1){
	               rear = 0;
	            }
	            ArrQue[rear] = item;
	            Size++;
	            System.out.println("Element " + item + " is pushed to Queue!");
	    }
	}
		public void dequeue() {
			if (isQueueEmpty()) {
				System.out.println("Underflow! Incapable to remove element from Queue");
		}
			else {
				front++;
				if(front == capacity-1){
					System.out.println("Pop operation done! Removed: "+ ArrQue[front-1]);
					front = 0;
        }
        else {
            System.out.println("Pop operation done! Removed: "+ ArrQue[front-1]);
        }
        Size--;
    }
}
		public boolean isQueueFull(){
	        boolean status = false;
	        if (Size == capacity){
	            status = true;
	 }
	       return status;
}
		public boolean isQueueEmpty(){
	        boolean status = false;
	        if (Size == 0){
	            status = true;
	        }
	        return status;
	    }
	     
	    public static void main(String a[]){
	         
	        ArrayQueue Queue = new ArrayQueue(4);
	        Queue.enqueue(8);
	        Queue.dequeue();
	        Queue.enqueue(51);
	        Queue.enqueue(4);
	        Queue.enqueue(69);
	        Queue.dequeue();
	        Queue.dequeue();
	        Queue.enqueue(28);
	        Queue.dequeue();
	        Queue.enqueue(95);
	        Queue.enqueue(47);
	        Queue.enqueue(26);
	        Queue.enqueue(345);
	    }
	}
