/**
* Java implementation of a queue using array.
* For demo purpose, should hold a maximum of 10 integers.
*
* @author  [Sarah Pangan]
* @link    [https://github.com/Saaraah22]
* @version [version number]
* @since   [17/10/2016]
*/

public class ArrQueue {

    private int QSIZE;
    private int[] queue;
    private int nItems;
    
    public ArrQueue(int size){
        QSIZE = size;
        queue = new int[QSIZE];
    }

    public void showQueue(){
        int i;
        for(i = 0; i < QSIZE; i++){
            System.out.printf("Queue[%d] = %d\n", i, queue[i]);
        }   
    }

    private boolean isEmpty(){
        if(nItems == 0){
        System.out.println("QUEUE is EMPTY");
        
        return true;
        
        } else {
            
        return false;
        }
    }

    private boolean isFull(){
        if(nItems == QSIZE){
            System.out.println("Queue is FULL");
            return true;
        } else {
            
        return false;
        }
    }

    public boolean enqueue(int num){
        System.out.print("Trying to enqueue " + num + "... ");
        if(! isFull()){
            queue[nItems] = num;
            System.out.println("Added " + num);
            nItems++;
            return true;
        } else {
            System.out.println("Failed to enqueue " + num);
            return false;
        }
    }

    public void dequeue(){
        System.out.print("Dequeuing... ");
        if(! isEmpty()){
            int num = queue[0];
            System.out.println("Removed " + num);
            rearrangeQueue();
        } else {
            System.out.println("Failed to dequeue");
        }
    }

    private void rearrangeQueue(){
        System.out.println("Rearranging Queue");
        int[] temp = new int[nItems];
        int i;
        for(i = 0; i < (nItems - 1); i++){
            temp[i] = queue[i + 1];
        }
        nItems--;
        for(i = 0; i < QSIZE; i++){
            if(i <= nItems){
            queue[i] = temp[i];
        } else {
            queue[i] = 0;
            }
        }
    }

    public int peekFront(){
        return queue[0];
    } 

    public int peekRear(){
        return queue[nItems];
    }
   
    public static void main(String[] args) {
        ArrQueue storage = new ArrQueue(11);
       
        storage.enqueue(0);
        storage.enqueue(1);
        storage.enqueue(2);
        storage.enqueue(3);
        storage.enqueue(4);
        storage.enqueue(5);
        storage.enqueue(6);
        storage.enqueue(7);
        storage.enqueue(8);
        storage.enqueue(9);
       
        
        storage.showQueue();
        
         System.out.println("Rear: " + storage.peekRear());
         System.out.println("Front: " + storage.peekFront());
        
        
        
        
    }
}
