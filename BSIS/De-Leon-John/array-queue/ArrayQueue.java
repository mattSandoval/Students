/**
* Java implementation of a queue using array.
* 
*
* @author  [john deleon]
* @link    []
* @version [final build]
* @since   [9-29-16]
*/

public class ArrayQueue {
  
  int [] array= new int[1000];
	int numofel;
	Scanner input= new Scanner(System.in);
	int numtodeq;



	
//--------------------------------------------------------	
	public void enqueue(){
		
		System.out.println("enqueue "+numofel+" elements");
		for (int i=0;i<numofel;i++){
			System.out.print("index "+i+": ");
			array[i]=input.nextInt();
		}
		

		
	}

//------------------------------------------------------
	
	public void showqueue(){
		for (int i=0;i<numofel;i++){
			System.out.println("index "+i+": "+array[i]);
		}
	}
	
//------------------------------------------------------
	
	public void dequeue(){
	
		System.out.println("dequeue "+numtodeq+" elements\n");

		for (int i=0;i<numtodeq;i++){
		
			for(int k=0;k<numofel-1;k++){
				array[k]=array[k+1];
			}


		}

		
	}
	
//-------------------------------------------------------

	public void	rearrange(){
		for(int k=numofel-numtodeq;k<numofel;k++){
			
			array[k]=0;
		}
		
	}
	
	
	
//-------------------------------------------------------	
	public void peekfront(){
		
		System.out.println(array[0]);
	}
//-------------------------------------------------------
	
	public void peekrear(){
		System.out.println(array[numofel-1]);
	}
	
//-------------------------------------------------------
	
	public void isfull(){
		if(array[numofel-1]!=0){
			System.out.println("\nqueue is full, cannot input anymore");
		}
		else
		{
			System.out.println("\n queue is not full");
		}
	}
	
//-------------------------------------------------------	
	
	public void isempty(){
		if(array[0]==0){
			System.out.println("\nqueue is empty");
		}
		else
		{
			System.out.println("\nqueue is not empty");
		}
	}
//---------------------------------------------------------	
	
	public static void main (String []args){
	
		ArrayQueue obj=new ArrayQueue();
		
		

		System.out.print("enter number of integers to enter\n");
		obj.numofel=obj.input.nextInt();
		obj.enqueue();
		obj.isfull();
		
		System.out.println("\nshow Queue\n");
		obj.showqueue();
		
		System.out.println("\npeek front\n");
		obj.peekfront();
		
		System.out.println("\npeek rear\n");
		obj.peekrear();
		
		
		System.out.println("\nhow many to dequeue");
		obj.numtodeq=obj.input.nextInt();
		obj.dequeue();
		obj.rearrange();
		obj.showqueue();
		obj.isempty();
	}

}
