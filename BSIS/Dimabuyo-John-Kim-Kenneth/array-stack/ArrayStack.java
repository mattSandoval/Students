import java.util.*;

class ArrayStack {
	public int [] array = new int [10];
	public int top = 0;
	public int i = 0;
	public int capacity = 10;
	public int o = 0;

	public void push() {
		Random rand = new Random();

		if (isFull()) {

		} else {
			array [i] =  1+rand.nextInt(100);
			i++;
			top++;
		}
	}

	public boolean isFull() {
		if (top == capacity) {
			System.out.println("Your inventory is FULL");
			System.out.println();
			return true;
		} else {
			return false;
		}
	}

	public void show() {
		for (int i=0; i < array.length ; i++ ) {
			System.out.println ("ArrayStack [" + i + "] : " + array[i]);
		}
		System.out.println();
	}

	public void pop() {
		if (isEmpty()) {
			
		} else {
			array[0] = 0;
			// swapping time!
			for (int a = 0; a < (i-1) ; a++ ) {
				array [a] = array[a+1];
				array[a+1] = 0;
			}
			o++;
		}
	}

	public boolean isEmpty() {
		if (array[0] == 0) {
			System.out.println ("Your inventory is EMPTY");
			System.out.println();
			return true;
		} else
		return false;
	}

	public void setter() {
		i = i - o;
		top = top - o;
		o = 0;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayStack call = new ArrayStack();

		int ans;

		System.out.println ("Welcome to my Array Stack program :)");

		while (true) {
			System.out.print ("Press 1 if you want to push and 0 to pop : ");
			ans = in.nextInt();
			System.out.println();

			if (1 == ans) {
				call.setter();
				call.push();
				call.show();
			} else {
				call.pop();
				call.show();
			}
		}

	}
}