/**
* Java implementation of a queue using array.
* For demo purpose, should hold a maximum of 10 integers.
*
* @author  [Janbert Q Artuza]
* @link    [https://github.com/janbertartuza23]
* @version [1.0]
* @since   [last updated 13/Oct/2016]
*/
public class arrayqueue{

 	private int capacity ;
 	private int top = 0;
 	private String storage[];
 
 	public arrayqueue(int size){
 		capacity = size;
 		storage = new String[capacity];
 	}
 
 	public void show(){
 		for (int a = capacity-1; a>=0 ; a--){
 			System.out.println("queue["+ a + "]= " + storage [a]);
 		} 
 		System.out.println();
 	}

      private boolean isempty(){
 		if (storage[0] == null){
 			System.out.println("the queue is none");
 			System.out.println();
 			return true;
 		}
 		return false;
 	}
 
 	  private boolean isfull(){
 		if(top == capacity){
 			System.out.println("the queue was loaded");
 			return true;
 		}
 		return false;
 	}
 
 
 	  public void enqueue(String value){
 		if(isfull ()){
 			System.out.println("add failed");
 			System.out.println();
 	}else{
 		System.out.println("trying to enqueue[" + top +"]");
 		storage[top]= value;
        top++;
 
 	    System.out.println(value + " was succesfully added..");
 	    System.out.println();
 		}
 	}
 
 	public void dequeue(){
 		if(isempty()){
 		   System.out.println("remove failed!!!");
 		   System.out.println();
 	}else{
 		System.out.println("trying to dequeue[" +(top) +"]");
 		storage[0] = null;
 		storage[top] = storage[top] + ("was succesfully removed..");
 	    System.out.println();
 	    }
    }
 
 	public void peek(){
 		if(storage[top] == (storage[0])){
 		   System.out.println("peek top"+ storage[top]);
 		   System.out.println();
 
 	}else{
 		System.out.println("Peek top" + storage[top-1]);
 		System.out.println();
 	     }
 	}
 
    public void main(String [] args){
 
 	arrayqueue storage = new arrayqueue(10);
 
 
 		   System.out.println("storage capacity = " + storage.capacity);
 		   System.out.println();
 
 
		storage.isempty();
        storage.dequeue();
        storage.peek();
        storage.enqueue("one");
        storage.show();
        storage.peek();
        storage.enqueue("two");
        storage.show();
        storage.peek();
        storage.enqueue("three");
        storage.show();
        storage.peek();
        storage.enqueue("four");
        storage.show();
        storage.peek();
        storage.enqueue("five");
        storage.show();
        storage.dequeue();
        storage.enqueue("six");
        storage.show();
        storage.enqueue("seven");
        storage.show();
        storage.enqueue("eight");
        storage.show();
        storage.enqueue("nine");
        storage.show();
        storage.enqueue("ten");
        storage.show();
        storage.dequeue();         
        storage.enqueue("eleven");
        storage.show();
        storage.enqueue("twelve");
        storage.show();
        storage.isfull();
 					}
} 
