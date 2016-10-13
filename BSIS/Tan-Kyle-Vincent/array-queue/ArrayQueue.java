/*
* @author: Kyle Vincent Q. Tan
* @link: https://github.com/elyk18
* @version: v1
* @since: 10/07/2016
*/

class ArrayQueue {

	private int capacity;
	private int index = 0;
	private String [] arr;

	public ArrayQueue(int size) {
		capacity = size;
		arr = new String[capacity];		
	}

	public void show() {
		System.out.println("Current Stack Element: ");
		for (int x = 0; x <= capacity - 1; x++) {
			System.out.println("Queue[" + x + "] = " + arr[x]);
		}

		System.out.println("");
	}

	private boolean isEmpty() {
		if (arr[0] == null) {
			System.out.println("Attempting to remove an element.");
			System.out.println("");
			return true;			
		} else {
			return false;
		}
	}

	private boolean isFull() {
		if (index == capacity) {
			System.out.println("Attempting to add an element.");
			return true;
		} else {
			return false;
		}
	}

	public void enqueue(String val) {
		if (isFull()) {
			System.out.println("Add failed. Array currently full.");
			System.out.println("");
		} else {
			System.out.println("Executing Enqueue on queue[" + index + "]. . .");
			arr[index] = val;
			index++;
			System.out.println(val + " was added successfully.");
			System.out.println("");
		}

		show();
	}

	public void dequeue() {
		if (isEmpty()) {
			System.out.println("Remove failed. Array currently empty.");
			System.out.println("");
		} else {
			System.out.println("Executing Dequeue on queue[0]. . .");
			System.out.println("Element " + arr[0] + " was removed successfully.");
			System.out.println("");
			if (index- 1 == capacity - 1) {
				for (int i = 0; i <= index - 2; i++) {
					arr[i] = arr[i+1];
				}
				arr[capacity-1] = null;				
			} else {
				for (int i = 0; i <= index - 1; i++) {
					arr[i] = arr[i+1];
				}
			}
			index--;
		}

		show();
	}

	public void peek() {
		if (arr[index-1] == arr[0]) {
			System.out.println("Peek top = " + arr[index]);
			System.out.println("");
		} else {
			System.out.println("Peek top = " + arr[index-1]);
			System.out.println("");
		}
	}

	public static void main(String [] args) {

		ArrayQueue arrObj = new ArrayQueue(6);
		System.out.println("");
		System.out.println("Storage capacity = " + arrObj.capacity);
		System.out.println("");

		arrObj.enqueue("firstinput");
		arrObj.enqueue("secondinput");
		arrObj.enqueue("thirdinput");
		arrObj.enqueue("fourthinput");
		arrObj.enqueue("fifthinput");
		arrObj.enqueue("sixthinput");
		arrObj.dequeue();
		arrObj.dequeue();

		arrObj.peek();
	}
}
