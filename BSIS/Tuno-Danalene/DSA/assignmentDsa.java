
public class Queue
{
	int QSIZE;
    private int[] queue;
    private int nItems;


}

	public ArrayQeue(int size)
		{
			QSIZE = size;
			queue = new int[QSIZE];
		}

	public void showQueue()
			{
				for (int i=0; i< QSIZE; i++ ) 
				{
					System.out.printf("QUEUE[" + i +"] =" + queue[i]);
				}
			}

	private boolean isFull()
			{
		        if(nItems == QSIZE){
		            System.out.println("QUEUE IS FULL");
		            return true;
		        } 
		        else 
		        { 
		        return false;
		        }
		    }

	private boolean isEmpty()
		{
	        if(nItems == 0)
	        {
	        System.out.println("QUEUE is EMPTY");
	        return true;
	        } 
	        else
	        {  
	        return false;
	        }
	    }

	public boolean enqueue(int number)
		{
	        System.out.print("Trying to enqueue " + number + "... ");
	        if(! isFull())
	        {
	            queue[nItems] = number;
	            System.out.println("Added " + number);
	            nItems++;
	            return true;
	        } 
	        else 
	        {
	            System.out.println("Failed to enqueue " + num);
	            return false;
	        }
	    }

	 public void dequeue()
	 	{
	        System.out.print("Trying dequeuing... ");
	        if(! isEmpty())
	        {
	            int number = queue[0];
	            System.out.println("Removed " + number);
	            rearrangeQueue();
	        } ]
	        else 
	        {
	            System.out.println("Failed in dequeueing..");
	        }
	    }

	  private void rearrangeQueue() {
			}
			public int peekRear() {
				return this.queue[this.nItems-1];
			}
				
	}