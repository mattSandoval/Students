package cortez;

public class Queue1 {

	int QSIZE;
	private int[] queue;
	private int nItems;

	public Queue1(int size){
		this.QSIZE = size;
		this.queue = new int[this.QSIZE];
	}


	public void showQueue() {
			for (int i=0; i<this.QSIZE; i++){
			System.out.printf("QUEUE["+i+"]="+this.queue[i]+"\n");
		}
	}


	public boolean isFull() {
		if (this.nItems == this.QSIZE){
		System.out.println("QUEUE is FULL");
		return true;
		}else{
		return false;

		}
	}


	public boolean isEmpty() {
		if (this.nItems == 0){
		System.out.println("QUEUE IS EMPTY");
		return true;
		} else{
		return false;
		}
	}


	public boolean enqueue(int num){
		System.out.println("Trying to enqueue" + num + "... ");
		if (!this.isFull()) {
		this.queue[nItems] = num;
		System.out.println("\t"+"Added "+num);
		this.nItems++;
		return true;
		} else {
		System.out.println("Failed to Enqueue " + num);
		return false;

		}
	}


	public boolean dequeue(int num) {
		System.out.println("Trying to dequeue" + num +  "... ");
		if (!this.isEmpty()) {
			this.nItems = 0;
			this.queue[nItems]++;
			System.out.println("\t"+"Removed "+num);

		return true;
		}
		else{
			System.out.print("failed");
			return false;
			}
	}
	


	public int peekFront(){
		return this.queue[0];
		}

		public int peekRear(){
			return this.queue[this.nItems-1];
		}
}
