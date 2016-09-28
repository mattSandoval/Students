/**
* Java implementation of a queue using array.
* For demo purpose, should hold a maximum of 10 integers.
*
* @author  Cortez, Chyrine A.
* @link    github.com/cortezchyrine
* @version 1.1
* @since   [09/28/2016]
*/

package queue;

/*
SOURCE CODE: ArrayQueue.java
AUTHOR NAME: Cortez, Chyrine A.
GITHUB URL: github.com/cortezchyrine
LAST UPDATE: [08/18/2016]
*/
import java.util.*;

public class ArrayQueue {
	public static void main(String[] args) {
		int a=0;
		int enq[] = new int[0]; 
		Scanner input = new Scanner(System.in);
		
			
		Queue2 arque = new Queue2(10);
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
