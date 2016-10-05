/**
* Java implementation of a queue using array.
* For demo purpose, should hold a maximum of 10 integers.
*
* @author  Cortez, Chyrine A.
* @link    github.com/cortezchyrine
* @version 0.1
* @since   [09/28/2016]
*/

package cortez;
import java.util.*;
public class Arrayqueue {

	public static void main(String[] args) {
		int a=0;
		int enq[] = new int[0]; 
		Scanner input = new Scanner(System.in);
		
			
		Queue1 arque = new Queue1(10);
			System.out.println("^*^*^*^*^*^*^*^*^*^*^*^*\n");
			System.out.println("Current Queue \n");
			arque.showQueue();
		
				
		System.out.println("^*^*^*^*^*^*^*^*^*^*^*^*\n");
			System.out.print("How many would you like to Enqueue? : ");
			a = input.nextInt();
			enq	= new int[a];
			System.out.println("Enqueuing\n");
		for (int i=0;i<=a;i++){
			arque.enqueue(i);	
		}
		
		System.out.println("^*^*^*^*^*^*^*^*^*^*^*^*\n");
		System.out.println("New Queue\n");
		arque.showQueue();
		
		System.out.println("^*^*^*^*^*^*^*^*^*^*^*^*\n");
		System.out.println("This is the front Index\n");
		arque.peekRear();
	
		System.out.println("Dequeuing\n");
			for (int i=0;i<a;i++){
				arque.dequeue(i);	
			}
	}	
}
