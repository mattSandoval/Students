/**
* Java implementation of a queue using array.
* For demo purpose, should hold a maximum of 10 integers.
*
* @author  [Jaison Ramos]
* @link    [https://github.com/jan-jaison25/DSA/commit/a30a83c2fce1e96e7c8145f4f6d26bf719a650b9]
* @version [version number]
* @since   [last updated 06/102016]
*/

public class ArrayQueue{
	private int capacity ;
 	private int top = 0;
 	private String storage[];
 
 	public ArrayQueue(int size){
 		capacity = size;
 		storage = new String[capacity];
	}

 	public void show(){
 		for (int a = capacity-1; a>=0; a--){
 			System.out.println("Queue["+ a + "]= " + storage [a]);
 
 		} 
 		System.out.println();
 	}
 
 		private boolean isEmpty(){
 			if (storage[0] == null){
 				System.out.println("The Queue is None!!");
 				System.out.println();
 				return true;
			}
			return false;
 		}
 
 			private boolean isFull(){
 				if(top == capacity){
 					System.out.println("The Queue was Loaded!!!");
 					return true;
 				}
 				return false;
 			}
 
 
 				public void enqueue(String value){
 					if(isFull ()){
 						System.out.println("Add Failed!");
 						System.out.println();
 					}else{
 						System.out.println(">> >> >>trying to enqueue[" + top +"]>> >> >>");
 						storage[top]= value;
 
 						top++;
 
 						System.out.println(value + " Was Succesfully added..");
 						System.out.println();
 					}
 				}
 
 				public void dequeue(){
 					if(isEmpty()){
 						System.out.println("Remove Failed!!!");
 						System.out.println();
 					}else{
					System.out.println(">> >> >>Trying to dequeue[" +(top) +"]>> >> >>");
 						storage[0] = null;
 						storage[top] = storage[top] + ("Was Succesfully Removed..");
 						System.out.println();
 					}
 				}
 
 					public void peek(){
 						if(storage[top] == (storage[0])){
 							System.out.println("Peek top"+ storage[top]);
 							System.out.println();
 
 						}else{
 							System.out.println("Peek top" + storage[top-1]);
 							System.out.println();
 						}
 					}
 
 					public void main(String [] args){
 
 						ArrayQueue storage = new ArrayQueue(10);
 
 
 						System.out.println("Storage capacity = " + storage.capacity);
 						System.out.println();
 
 
 						storage.isEmpty();
 			            storage.dequeue();
 			            storage.peek();
 			            storage.enqueue("One");
 			            storage.show();
 			            storage.peek();
 			            storage.enqueue("Two");
 			            storage.show();
 			            storage.peek();
 			            storage.enqueue("Three");
 			            storage.show();
 			            storage.peek();
 			            storage.enqueue("Four");
 			            storage.show();
 			            storage.peek();
 			            storage.enqueue("Five");
 			            storage.show();
 			            storage.dequeue();
 			            storage.enqueue("Six");
 			            storage.show();
 			            storage.enqueue("Seven");
 			            storage.show();
 			            storage.enqueue("Eight");
 			            storage.show();
 			            storage.enqueue("Nine");
 			            storage.show();
 			            storage.enqueue("Ten");
 			            storage.show();
 			            storage.dequeue();         
 			            storage.enqueue("eleven");
 			            storage.show();
 			            storage.enqueue("twelve");
   		            storage.show();
 			            storage.isFull();
 					}
 } 
