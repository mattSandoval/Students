public class Que {
	int QSIZE;
	private int[]queue;
	private int nItems;

	public Que(int size){
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
				System.out.println ("The Queue is Empty");
				return true;
			}	else{
				return false;
			}}

	public boolean enqueue (int num) {
			System.out.println("Trying to enqueue " + num + "...");
			if (!this.isFull()){
				this.queue[nItems] = num;
				System.out.println("\t" + "Added " + num);
				this.nItems++;
					return true;
			}	else{
				return false;
			}}

	public void dequeue() {
		 if (isEmpty()) {
		    	System.out.println("REMOVE FAILED, Storage is empty.");
		      System.out.println();
		    } else {
		      System.out.println("... trying to dequeue [" + (nItems) + "] ...");
		      queue[nItems] = 0;
		      nItems--;
		      System.out.println(queue[nItems] + " was successfully removed.");
		      System.out.println();
		    }
		 }
	
	public int peekFront() {
	return this.queue[0];
	}
	public int peekRear() {
			return this.queue[this.nItems-1];
	}

	public static void main(String[]args){
		
		Que queueDemo = new Que(10);
				
		
		
		queueDemo.enqueue(1);
		queueDemo.enqueue(2);
		queueDemo.dequeue();
		queueDemo.enqueue(3);
		queueDemo.enqueue(4);
		queueDemo.enqueue(5);
		queueDemo.enqueue(6);
		queueDemo.enqueue(7);
		queueDemo.enqueue(8);
		queueDemo.enqueue(9);
		queueDemo.enqueue(10);
		queueDemo.showQueue();
		queueDemo.enqueue(11);
		queueDemo.showQueue();
		queueDemo.enqueue(12);
		
		
	}
}
