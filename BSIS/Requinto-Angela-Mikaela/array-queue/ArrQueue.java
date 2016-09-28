/**
* Java implementation of a queue using array.
* /*
 ArrQueue.java
 Angela Mikaela R. Requinto
 Bsis-2
 Github.com/AngelaRequinto
 august 23,,2016
 */
package arrqueue;

public class ArrQueue {

    private int capacity;
    private int nItems=0;
    private String[]storage;
    
    public ArrQueue(int size){

    capacity = size;
    storage=new String[capacity];
    }
    
    public void show(){
    
        for (int i=0; i<=capacity-1; i++){
        System.out.println("Queue["+i+"] "+storage[i]);
        
    }
        System.out.println();
    }
    
    
    public boolean isEmpty(){
     if (nItems==0) {
      System.out.println("Queue is empty");
      System.out.println();
      return true;
    } 
    return false;
    }
   
    private boolean isFull() {
    if (nItems == capacity) {
        System.out.println("Stack is Full");
      return true;
    } else{
    return false;
    }
   }
    
    public void enqueue(String value){
       
       System.out.println("Trying to enqueue number"+value+ "... "); 
       if (isFull()){
           System.out.println("Added failed");
           
        }
       else{
           storage[nItems]= value;
           nItems++;
           System.out.println(value+" Added");
           
       }
    }
    public void dequeue(){
    
        System.out.print("Trying to dequeue...");
        if( isEmpty()){
        System.out.println("Queue is Empty");
       } else{
            storage[nItems]=null;
            nItems--;
            System.out.println("Storage ["+nItems+"] removed");
           
          }
      }
    
    public void peekfront(){
    System.out.println("Head = "+storage[nItems]);
    }
    public void peekrear(){
    System.out.println("Tail = "+storage[0]);
    }
    
    
    public static void main(String[] args) {
        
        ArrQueue ArrQueue= new ArrQueue (10);
        
        System.out.println("STORAGE CAPACITY:  " +ArrQueue.capacity );
        System.out.println();
        
        ArrQueue.show();
        ArrQueue.isEmpty();
        ArrQueue.enqueue("one");
        ArrQueue.show();
        ArrQueue.show();
        ArrQueue.dequeue();
        ArrQueue.enqueue("two");
        ArrQueue.dequeue();
        ArrQueue.enqueue("three");
        ArrQueue.show();
        ArrQueue.enqueue("four");
        ArrQueue.peekfront();
        ArrQueue.peekrear();
        ArrQueue.enqueue("five");
        ArrQueue.dequeue();
        ArrQueue.enqueue("six");
        ArrQueue.enqueue("seven");
        ArrQueue.show();
        ArrQueue.dequeue();
        ArrQueue.enqueue("eight");
        ArrQueue.enqueue("nine");
        ArrQueue.enqueue("ten");
        ArrQueue.show();
        ArrQueue.isFull();
        ArrQueue.peekfront();
        ArrQueue.peekrear();
  
      
         }

  
    }
