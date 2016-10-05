/**
* Java implementation of a queue using array.
* For demo purpose, should hold a maximum of 10 integers.
*
* @author  [Gerald M. De Guzman]
* @link    [igooop]
* @version [version number]
* @since   [last updated 05/10/2016]
*/

public class ArrayQueue {

	private int capacity;
	private int front;
    private int rear;
    private int [] Storage ;
    
    public ArrayQueue(){
        capacity = 5 ;
        Storage = new int [capacity];
        front = rear = 0 ;
    }
    public void show(){
    	for (int i = 0; i < capacity; i++){
    		System.out.println("queue["+ i +"] = " + Storage[i]); 
    	}
    		System.out.println();
    }	
    public void resize(){
        int s = size();
        capacity = 2 * capacity;
        int lastIndex = s + 1;
        int[] arr = new int [capacity];
        int i = 0 ;
        while( s > 0 ) {
            s--;
            arr[i++] = Storage[front++];
            if ( front == lastIndex ) 
                front = 0 ;
            }
        rear ++;
        front = 0 ; 
        Storage = arr ; 
    }
    public void showQueue(int x){
        int s = size ();
        if ( s == capacity - 1 )
            resize();
        Storage[rear++] = x ;
        if ( rear == capacity )
            rear = 0 ;
    }
    public Integer dequeue(){
        if (isEmpty())
              return null;
        int x = Storage[front++];
        if (front == capacity)
            front = 0 ;
        return x ;
    }
    public int size(){
        return (capacity - front + rear)% capacity;
    }
    public boolean isEmpty(){
        return front == rear ;
    }


public static void main(String [] args){
    
	ArrayQueue ca = new ArrayQueue() ;
    ca.showQueue(15);
    ca.showQueue(86);
    ca.showQueue(17);
    ca.showQueue(8);
    ca.showQueue(35);
    ca.showQueue(26);
    ca.showQueue(37);
    ca.showQueue(48);
    ca.showQueue(55);
    ca.showQueue(36);
    ca.dequeue();
    ca.dequeue();
    ca.show();
    
    while ( !ca.isEmpty() ){
        System.out.print(ca.dequeue() +",");
    }
}
}
