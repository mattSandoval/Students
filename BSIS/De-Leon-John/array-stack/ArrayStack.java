/**
* Java implementation of a stack using array.
*
* @author  [john deleon]
* @link    [@Johndeleon]
* @version [final build]
* @since   [9-29-16]
*/

import java.util.*;
public class ArrayStack {

	Scanner input= new Scanner(System.in);
	int numofel;
	int numtopop;
	String [] stack=new String[1000];
	
//-----------------------------------------------------	
	
	public void push(){
	
		for (int i=0;i<numofel;i++){
			System.out.println("index "+i+": ");
			stack[i]=input.next();
		}
		
	}
	
	
//-----------------------------------------------------
	
	
	public void show(){
		
		
		for (int i=numofel-1;i>=0;i--){
			System.out.println("\nindex "+i+": "+stack[i]);
		}
		
		
	}
	
//-------------------------------------------------------
	
	
	public void top(){
		int i=(numofel-1);
		while(stack[i]==null){
				
				i--;
			}

		
		System.out.println("the top index is index "+(i));
	}
	
//-----------------------------------------------------
	
	
	public void pop(){
		
			for(int k=numofel-1;k>=numofel-numtopop;k--){
			
			stack[k]=null;
		}
		
			
	}
	
//------------------------------------------------------
	public void full(){
		
		if (stack[numofel-1]==null){
			System.out.println("stack is not full");
		}
		else{
			System.out.println("stack is full");
		}
	}
//-----------------------------------------------------
	public void empty(){
		
		if (stack[0]==null){
			System.out.println("stack is empty");
		}
		else{
			System.out.println("stack is not empty");
		}
	}
	
	
	
	
	
//-----------------------------------------------------
	public static void main (String[] args){
		
	ArrayStack obj = new ArrayStack();
		
	
	System.out.println("enter number of elements ");
	obj.numofel=obj.input.nextInt();
	
	System.out.println("\nenter/(Push) "+obj.numofel+" string elements");
	obj.push();
	
	System.out.println("\nShowing stack...");
	obj.show();
	obj.full();
	
	System.out.println("\nPeek");
	obj.top();
	
	
	System.out.println("\nenter number of elements to pop");
	obj.numtopop=obj.input.nextInt();
	obj.pop();
	obj.show();
	obj.empty();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
