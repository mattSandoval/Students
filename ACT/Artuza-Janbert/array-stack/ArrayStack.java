/**
* Java implementation of a stack using array.
* For demo purpose, should hold a maximum of 10 string values.
*
* @author  [Janbert Q Artuza]
* @link    [https://github.com/janbertartuza23]
* @version [1.0]
* @since   [last updated 13/Oct/2016]
*/

import java.util.*;

public class arraystack{

	private int capacity;
	private int top = 0;
	private String[] storage;

   public arraystack(int size){
     capacity =size;
     storage = new String[10];
    }

   public void show() {
   	for (int a = capacity-1 ; a >= 0; a-- ) {
   		for (int b =capacity-1;b >= 0 ;b-- ) {
   			System.out.println("stack["+a--+"]="+storage[b]);
   			
   		}
   	}
     System.out.println();
   } 
private boolean isEmpty(){
	if (storage[0] == null){
		System.out.println ("storage is empty");
		return true;
	}
	return false;
   }

private boolean isFull() {
	if ( top == capacity) {
		System.out.print("storage is full");
		return true;
	}
	return false;
  }
  public void push(String value){
  	if (isFull()) {
  		System.out.println("pop failed");
  	}else {
  		System.out.println("trying to pop stack...["+ (top-1)+"]..");
         storage[top] = value;
         top++;
        System.out.println (value + "was successfully added");
        System.out.println();
  	}   
  }
  public void pop(String value){
  	if (isEmpty()) {
  		System.out.println("pop failed");
  	}else {
  		System.out.printlnP("trying to pop["+(top-1)+"].. ");
  		storage[top] = storage[top-1];
  		top--;
  		System.out.println(value +"wasa succesfully removed");
  		System.out.println();
  	}
  }
  public void peek(){
  	if (storage[top] == storage[0]) {
  		System.out.println("peek top"+storage [top]);
  		System.out.println();
  	}else {
  		System.out.println("peek top "+ storage [top-1]);
  		System.out.println();
  	}
  }
  public static void main(String[] args) {
  	int max = 10;
  	  arraystack storage = new arraystack(10);
  	  System.out.println("storage capacity"+ storage.capacity);
  	  System.out.println();

  storage.show();
 

    storage.peek();
    storage.push("one");
    storage.show();
  
    storage.push("two");
    storage.show();
   
    storage.push("three");
    storage.show();
  
    storage.push("four");
    storage.show();
   
    storage.push("five"); 
    storage.show();
   
    storage.push("six"); 
    storage.show();
    
    storage.push("seven"); 
    storage.show();
    
    storage.push("eight"); 
    storage.show();
    
    storage.push("nine");  
    storage.show();
    storage.push("ten"); 	  
  }
}
