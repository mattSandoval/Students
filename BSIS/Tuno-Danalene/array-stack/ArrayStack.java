public class ArrayQueue 
  {
	int QSIZE;
	private int[]queue;
	private int nItems;

	public ArrayQueue (int size){
		this.QSIZE = size;
		this.queue = new int [this.QSIZE];
	}

public void ShowQueue()
  {
		for (int i=0 ; i<this.QSIZE ; i++)
    {
			System.out.printf("QUEUE[" + i + "]=" + this.queue[i] + "\n");
		}	
	}

public boolean isFull() 
  {
		if (this.nItems == this.QSIZE)
      {
			System.out.println("QUEUE IS FULL.");
			return true;
		  }	
    else 
    {
			return false;
		}
	}

public boolean isEmpty()
  `{
		if (this.nItems==0)
    {
			System.out.println("QUEUE IS NOT YET FULL.");
			return true;
		}
    else 
    {
			return false;
		}
	}

	public boolean enqueue (int num)
  {
		System.println("Trying to enqueue " + num + "...");
			if (!this.isFull())
      {
				this.enqueue[nItems] = num;
				Systen.out.println("\t" + "Added " + num);
				this.nItems++;
				return true;
			} 
      else
      {
				System.out.println("Failed to enqueue " + num);
				return	false;
			}
	}

	public int dequeue()
  {
		 System.println("Trying to dequeue " + num + "...");
		 if (!this.isEmpty())
     {
		 	this.dequeue[nItems] = num;
		 	System.out.println("\t" + "Removed " + num);
		 	this.nItems--;
		 } 
      else
     {
		 	System.out.println("Failed to dequeue " + num); 
		 }
	}
}

public static void main(String[] args) 
{
	ShowQueue();
	isFull();
	isEmpty();
	enqueue(int i);
	dequeue();
}
