class ArrayStack {

	private int capacity;
	private int top = 0;
	private String [] arr;

	public ArrayStack(int size) {
		capacity = size;
		arr = new String[capacity];
	}

	public void show() {
		System.out.println("Current Stack Element: ");
		for (int x = capacity - 1; x >= 0; x--) {
			 for (int y = capacity - 1; y >= 0; y--) {
			 	System.out.println("Stack[" + x + "]  =  " + arr[y]);
			 }
		
			System.out.println("Stack[" + x + "]  =  " + arr[x]);

		}

	System.out.println("");	
	}

	private boolean isEmpty() {
		if (arr[0] == null) {
			System.out.println("Stack is Empty.");
			System.out.println("");
			return true;
		} else {
			return false;
		}
	}

	private boolean isFull() {
		if (top == capacity) {
			System.out.println("Stack is Full.");
			System.out.println("");
			return true;
		} else {
			return false;
		}
	}

	public void push(String val) {
		if (isFull()) {
			System.out.println("Add failed. Element did not push.");
			System.out.println("");
		} else {
			System.out.println(". . . executing push on stack[" + top + "] . . .");
			arr[top] = val;
			top++;
			System.out.println(val + " was successfully added");
			System.out.println("");
		}
	}

	public void pop() {
		if (isEmpty()) {
			System.out.println("Remove failed. No element to pop.");
			System.out.println("");
		} else {
			System.out.println(". . . executing pop on stack[" + (top-1) + "] . . .");
			top--;
			System.out.println(arr[top] + " was successfully removed");
			System.out.println("");
			arr[top] = null;
		}
	}

	public void peek() {
		if (arr[top-1] == arr[0]) {
			System.out.println("Peek top = " + arr[top]);
			System.out.println("");	
		} else {
			System.out.println("Peek top = " + arr[top-1]);
			System.out.println("");	
		}
	}

	public static void main(String [] args) {

		ArrayStack arrObj = new ArrayStack(10);
		System.out.println("");
		System.out.println("Storage capacity = " + arrObj.capacity);
		System.out.println("");

		arrObj.push("firstPut");
		arrObj.push("secondPut");
		arrObj.push("thirdPut");
		arrObj.push("fourthPut");
		arrObj.push("fifthPut");
		arrObj.push("sixthPut");
		arrObj.push("seventhPut");
		arrObj.push("eightPut");
		arrObj.push("ninethPut");
		arrObj.push("tenthPut");
		arrObj.push("eleventhPut");

		arrObj.peek();

		arrObj.show();

	}
}
