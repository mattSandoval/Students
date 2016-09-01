public class ArrayQueue {
	
	int QSIZE;
	private int[] queue;
	private int nItems;

	public ArrayQueue(int size) {
	this.QSIZE = 10;
	this.queue = new int[this.QSIZE];
	}

	public void showQueue() {
		for (int i = 0; i < this.QSIZE; i++) {
			System.out.print("QUEUE[" + i + "] = " + this.queue[i] + "\n");
		}
	}

	public boolean isFull() {
		if (this.nItems == this.QSIZE) {
			System.out.println("QUEUE is FULL");
			return true;
		}
		else {
			return false;
		}
	}

	public boolean isEmpty() {
		if (this.nItems == 0){
			System.out.println("QUEUE is EMPTY");
			return true;
		}
		else {
			return false;
		}
	}

	public boolean enqueue(int num) {
		if (!this.isFull()) {
			thi.queue[nItems] = num;
			System.out.println("\t" + "Added " + num);
			return true;
		}
		else {
			System.out.println("failed to enqueue " + num);
			return false;
		}
	}

	private void dequeue() {
	}

	public void rearrangeQueue() {
	}

	public int peekFront() {
		return this.queue[0];
	}

	public int peekRear() {
		return this.queue[this.nItems-1];
	}

}