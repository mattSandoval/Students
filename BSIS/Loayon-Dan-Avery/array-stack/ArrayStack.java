
public class ArrayStack {
	private int capacity;
	private int stack[];
	private int top;
	
	public ArrayStack (int size){
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
		
		ArrayStack array = new ArrayStack(10);
		
		array.show();
		array.push(20);
		array.show();
		array.peekTop();
		array.push(55);
		array.show();
		array.peekTop();
		//trigger isFull()
		array.push(54);
		array.push(56);
		array.push(57);
		array.push(58);
		array.push(59);
		array.push(50);
		array.push(12);
		array.push(5232);
		array.push(5);
		//try pop
		array.pop();
		array.show();
		array.peekTop();
		array.pop();
		array.pop();
		array.show();
		array.peekTop();
		//trigger isEmpty()
		array.pop();
		array.pop();
		array.pop();
		array.pop();
		array.pop();
		array.pop();
		array.pop();
		array.pop();
		array.show();
	
		
	}

}
