/* @author [Danalene Laxamana Tuno]
* @link    [https://github.com/dandanalene]
* @version [10.7]
* @since   [last updated 10/16/2016]
*/

public class ArrayQueue
        {
            int QSIZE;
            private int[]queue;
            private int dan;

	public ArrayQueue (int size)
        {
            this.QSIZE = size;
            this.queue = new int [this.QSIZE];
	      }

	    public void ShowQueue()
        {
            for (int i=0 ; i<this.QSIZE; i++)
                {
                    System.out.printf("Queue[" + i + "]=" + this.queue[i] + "\n");
		            }	
	      }

	    public boolean isEmpty()
        {
            if (this.dan==0) 
                {
                    System.out.println("...EMPTY...");
                    return true;
		            }	
            else 
                {
                    return false;
		            }
	      }

        public boolean isFull() 
                {
                    if (this.dan == this.QSIZE) 
                        {
                            System.out.println("...FULL...");
                            return true;
                        }	
                    else
                        {
                            return false;
                        }
                }

	      public boolean enqueue (int num)
            {
		            System.out.println("/ttrying to enqueue " + num + "...");
                    if (!this.isFull())
                        {
                            this.queue[dan] = num;
                            System.out.println("\t" + "Added " + num);
                            this.dan++;
                            return true;
		                   	} 
                    else 
                        {
                            System.out.println("Failed to enqueue " + num);
                            return false;
			                  }
            }

	        private void dequeue() 
                  {
		                System.out.println("/ttrying to dequeue...");
		                    if (!this.isEmpty())
                          {
		 	                        int num = queue[0];
                              System.out.println("Removed" + num);
                              rearq();
                          } 
                       else 
                          {
                            System.out.println("Failed to dequeue "); 
                          }
                   }

          private void rearq()
              {
                  System.out.println("Rearranging queue...");
                  int[] temp = new int [dan];

                  int i;
                  for(i=0; i<(dan-1); i++)
                    {
                        temp[1] = queue[i + 1];
                    }

                  dan--;

                  for(i=0; i < this.QSIZE; i++)
                    {
                        if (i <= dan)
                            {
                                queue[1] = temp[1];
                            }
                        else 
                            {
                                queue[i] = 0;
                            }
                    }
              }
        
    public static void main(String[] args) 
      {
          ArrayQueue storage = new ArrayQueue(11);

          storage.isEmpty();
          System.out.println();

          storage.enqueue(0);
          storage.ShowQueue();
      }


}
