/**
* Java implementation of a stack using array.
* For demo purpose, should hold a maximum of 10 string values.
*
* @author  [your full name here]
* @link    [full github url]
* @version [version number]
* @since   [last updated dd/mm/yyyy]
*/

/**
 * CODED BY:
 * CALINGASAN, RONMAR E.
 * BSIS - 2
 * 
 * 
 * **/
public class Stack {
	private int capacity;
	private int stack[];
	private int top;
	
	public Stack (int size){
		capacity = size;
		stack = new int[capacity];
	}
	
	public void show(){
		for(int i=capacity-1;i>=0;i--){
			System.out.println("Index["+i+"]: "+stack[i]);
			
			
		}System.out.println();
	}
	
	public boolean isFull(){
		if(top==capacity){
			System.out.println("Stack is Full!");
			System.out.println();
			return true;
		}return false;
		
	}
	
	
	public boolean isEmpty(){
		if(top == 0){
			System.out.println("Stack is Empty!");
			System.out.println();
			return true;
		}return false;
	}
	
	
	public void push(int value){
		if(isFull()==true){
			System.out.println("Error Pushing!");
		}
		else{
			System.out.println("Trying to push: "+value);
			stack[top] = value;
			top++;
		}System.out.println();
	}
	
	public void pop(){
		if(isEmpty()==true){
			System.out.println("Error Popping!");
			
		}else{
			System.out.println("Trying to pop: "+stack[top-1]+"...");
			stack[top-1] = 0;
			top--;
		}
		
	}
	
	public void peekTop(){
		System.out.println("TOP value: "+stack[top-1]);
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stackApp = new Stack(10);
		
		stackApp.show();
		stackApp.push(20);
		stackApp.show();
		stackApp.peekTop();
		stackApp.push(55);
		stackApp.show();
		stackApp.peekTop();
		//trigger isFull()
		stackApp.push(54);
		stackApp.push(56);
		stackApp.push(57);
		stackApp.push(58);
		stackApp.push(59);
		stackApp.push(50);
		stackApp.push(12);
		stackApp.push(5232);
		stackApp.push(5);
		//try pop
		stackApp.pop();
		stackApp.show();
		stackApp.peekTop();
		stackApp.pop();
		stackApp.pop();
		stackApp.show();
		stackApp.peekTop();
		//trigger isEmpty()
		stackApp.pop();
		stackApp.pop();
		stackApp.pop();
		stackApp.pop();
		stackApp.pop();
		stackApp.pop();
		stackApp.pop();
		stackApp.pop();
		stackApp.show();
	
		
	}

}
