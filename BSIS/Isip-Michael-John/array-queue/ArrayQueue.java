/**
* Java implementation of a queue using array.
* For demo purpose, should hold a maximum of 10 integers.
*
* @author  [Michael John Isip]
* @link    [https://github.com/mj-isip23]
* @version [1.1]
* @since   [09-30-2016]
*/


public class ArrayQueue {

    private String[] arrayQueue;
    private int arraySize, head=0, tail=0;

    public ArrayQueue(int size) {
        arraySize = size;
        arrayQueue = new String[arraySize];
    }

    public static void main(String[] args){
      ArrayQueue obj = new ArrayQueue(10);
      System.out.println("Queue Size: " + obj.arraySize);

      //show on empty queue
      obj.Show();
      
      obj.Enqueue("one");
      obj.Enqueue("two");
      obj.Enqueue("three");
      obj.Enqueue("four");
      obj.Enqueue("five");
      obj.Enqueue("six");
      obj.Enqueue("seven");
      obj.Enqueue("eight");
      obj.Enqueue("nine");
      obj.Enqueue("ten");
      
      obj.Show();
      
      //enqueue on full queue
      obj.Enqueue("eleven");
      
      //dequeue last element
      obj.Dequeue();
      
      //peel last element
      obj.Peek();
      
      obj.Dequeue();
      obj.Dequeue();
      obj.Dequeue();
      obj.Dequeue();
      obj.Dequeue();
      obj.Dequeue();
      obj.Dequeue();
      obj.Dequeue();
      obj.Dequeue();

      obj.Show();
      
      //Dequeue on empty Queue
      obj.Dequeue();
}    

    public void Show(){
        System.out.println();        
        for(int i=0; i<arraySize; i++){
            System.out.println("Queue [" + i + "] = " + arrayQueue[i]);
        }
        System.out.println();
    }
    
    public boolean IsEmpty(){
        if((tail == -1) && (head == -1)){
            return true;
        } else {
            return false;
        }
    }
    
    public boolean IsFull(){
        if(arraySize-1 == tail){
            return true;
        } else {
            return false;
        }
    }
    
    public void Enqueue(String input){
        if(IsFull()){
            System.out.println("Queue is FULL. Failed enqueue..");
        } else if (IsEmpty()){
            head =0;
            tail=0;
            arrayQueue[tail] = input;
        } else {
            tail++;
            arrayQueue[tail] = input;
        }
    }
    
    public void Dequeue(){
        if(IsEmpty()){
            System.out.println("Queue is EMPTY. Failed dequeue..");
        } else if(head == tail){
            arrayQueue[head] = null;
            head= -1;
            tail = -1;
            System.out.println();
            System.out.println("Dequeue successful..");
        } else {
            arrayQueue[head] = null;
            head ++;
            System.out.println();
            System.out.println("Dequeue successful..");
        }
    }
    
    public void Peek(){
        System.out.println();
        System.out.println("Queue [" + tail + "] = " + arrayQueue[tail]);
    }
    
}
