public class ArrayQueue {
	
	private int QSIZE;
	private int[]queue;
	private int nItems = 0;

	public ArrayQueue (int size) {
		this.QSIZE= size;
		this.queue = new int[this.QSIZE];
	}

	private void showQueue(){
			for (int i=0; i< this.QSIZE;i++){
			System.out.println("Queue["+i+"] = " + this.queue[i]);
			
			}
			System.out.println();
	}

	public boolean isFull() {
			if (this.nItems == this.QSIZE) {
				System.out.println ("Storage is full! Add failed.\n");
				return true;
			} else {
				return false;
			}
	}
			
	public boolean isEmpty() {
			if (this.nItems == 0){
				return true;
			} else {
				return false;
			}
	}

	public boolean enqueue (int num) {
			System.out.println("Trying to enqueue " + num + "...");
			if (!this.isFull()){
				this.queue[nItems] = num;
				System.out.println(num +" was successfully added.\n");
				this.nItems++;
				return true;
			} else {
				return false;
			}
	}

	public void dequeue() {
		 	if (isEmpty()) {
		 		System.out.println("Trying to dequeue...\nStorage is empty! Removed failed.");
		    } else {
		    
			    int num=queue[0];
			    System.out.println("Trying to dequeue...");
			    queue[0]=0;
			    System.out.println(num + " was successfully removed.");
			    System.out.println();
			    
			    for (int a=0; a<nItems-1; a++) {
			    	this.queue[a]=queue[a+1];	  
			    }
			    
			    queue[nItems-1]=0;
			    this.nItems--;
			    
		    }
	}

	public int peekFront() {
			System.out.println("The front number is: "+queue[0]+".");
			return 0;
	}
	
	public int peekRear() {
		System.out.println("The Rear number is: "+queue[this.nItems-1]+".\n");
			return 0;
	}

	public static void main(String[]args){
		
		ArrayQueue implement = new ArrayQueue(10);
		
			implement.showQueue();
			implement.enqueue (7);
			implement.enqueue (14);
			implement.enqueue (21);
			implement.enqueue (28);
			implement.enqueue (35);
			implement.enqueue (42);
			implement.enqueue (49);
			implement.enqueue (56);
			implement.enqueue (63);
			implement.enqueue (70);
			implement.showQueue();
			implement.enqueue (77);
			implement.dequeue();
			implement.peekFront();
			implement.peekRear();
			implement.dequeue();
			implement.dequeue();
			implement.dequeue();
			implement.dequeue();
			implement.dequeue();
			implement.dequeue();
			implement.dequeue();
			implement.dequeue();
			implement.dequeue();
			implement.showQueue();
			implement.dequeue();
			
	}
}
