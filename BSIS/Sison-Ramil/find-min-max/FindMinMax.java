package findminmax;
import java.util.*;

public class Findminmax{

	int [] array;
	int size, MAX;

	public Findminmax (int size) {
		MAX = size;
		array = new int [MAX];
	}
	public static void main (String [] args) {

	Scanner in = new Scanner(System.in);
	Random rand = new Random();

	int max = Integer.MIN_VALUE;
	int min = Integer.MAX_VALUE;
	int value;

		System.out.println();
		System.out.print("Enter array size: ");
		value = in.nextInt();
		System.out.println();

		Findminmax random = new Findminmax (value);

	for (int i = 0; i < value; i++) {
		random.array[i] = 1+(rand.nextInt(150));

		if (min > random.array[i]) {
			min = random.array[i];
			}
		if (max < random.array[i]) {
			max = random.array[i];
			}

		System.out.print(  random.array[i] +" ");
		}
		System.out.println();
		System.out.println();

		System.out.println("Largest number is " + max);
		System.out.println("Smallest number is " + min);
	}
}
