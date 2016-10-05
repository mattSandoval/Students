import java.util.*;

public class ArrayQueueNew {
	private int array [] = new int [10];
	private int top = 0;
	private int i = 0;
	private int capacity = 10;
	
	public void enqueue () {
		if (isFull()) {
			
		}
		else {
			Random rand = new Random();
			array [i] = rand.nextInt(100);
			i++;
			top++;
		}
	}
	
	public void show(){
		for (int a = 0 ; a < 10; a++) {
			System.out.println("Array [" + a + "] : " + array[a]);
		}
		System.out.println();
	}
	
	public void dequeue() {
		if (isEmpty()) {
			
		} else {
			i--;
			array[i] = 0;
			top--;
		}
	}
	
	private boolean isEmpty () {
		if (array[0] == 0) {
			System.out.println("Your inventory is EMPTY");
			System.out.println();
			return true;
		}
		return false;
	}
	
	public boolean isFull () {
		if (top == capacity) {
			System.out.println("Your inventory is Full");
			System.out.println();
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		ArrayQueueNew call = new ArrayQueueNew();
		Scanner in = new Scanner (System.in);
		
		int ans;
		
		System.out.println("Welcome to my Program Array Queue! :D");
		
		while (true) {
			System.out.print("Please press 1 to enqueue and 0 to dequeue: ");
			ans = in.nextInt();
			
			if(ans == 1) {
				call.enqueue();
				call.show();
			}
			if (ans == 0) {
				call.dequeue();
				call.show();
			}
		}
		
	}
}
