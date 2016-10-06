/*Rangel Angelo C. Macapagal
  ACT-2
  DSA    */



public class ArrayQueue_Macapagal {

       private int capacity ;
       private int top = 0;
       private String storage[];
        
      
    public ArrayQueue_Macapagal(int size){
        capacity=size;
        storage= new String[capacity];
        
    }
    public void show(){
        for(int i=capacity-1; i>=0; i--){
            System.out.println("Queue[" + i + "] =" + storage[i]);
        }
       System.out.println();
    }
        
        private boolean isEmpty(){
            if (storage[0] == null){
                System.out.println("The Queue was Empty!");
                System.out.println();
                return true;
            }
            return false;
        }
        
        private boolean isFull(){
            if(top == capacity){
                System.out.println("The Queue was being Full!");
                return true;
            }
            return false;
        }
        
        public void enqueue(String value){
            if (isFull ()) {
                System.out.println("Add Failed!!!!");
                System.out.println();
            }else{
                System.out.print("> > > Trying to enqueue[" + top +"] > > >");
                storage[top]=value;
                top++;
                System.out.println(value + " was succesfully added.");
                System.out.println();
            }
        }
        public void dequeue(){
            if(isEmpty()){
                System.out.print("Remove Failed!");
                System.out.println();
            }else{
                System.out.println("> > > Trying to dequeue[" + (top) + "] > > >");
                storage[0]=null;
                storage[top]=storage[top-1];
                top--;
                System.out.println(storage[top] + " was succesfully removed.");
                System.out.println();
            }
        }
        
        public void peek(){
            if(storage[top]==(storage[0])){
                System.out.println("Peek Top " + storage[top]);
                System.out.println();
            }else{
                System.out.println("Peek Top " + storage[top-1]);
                System.out.println();
            }
        }
        
        public static void main(String [] args){
        
            ArrayQueue_Macapagal storage=new  ArrayQueue_Macapagal(10);
          
            
            System.out.println("Storage Capacity = " + storage.capacity);
            System.out.println();
           
            storage.isEmpty();
            storage.dequeue();
            storage.peek();
            storage.enqueue("one");
            storage.show();
            storage.peek();
            storage.enqueue("two");
            storage.show();
            storage.peek();
            storage.enqueue("three");
            storage.show();
            storage.peek();
            storage.enqueue("four");
            storage.show();
            storage.peek();
            storage.enqueue("five");
            storage.show();
         
            storage.enqueue("six");
            storage.show();
            storage.enqueue("seven");
            storage.show();
            storage.enqueue("eight");
            storage.show();
            storage.enqueue("nine");
            storage.show();
            storage.enqueue("ten");
            storage.show();
           
            storage.enqueue("eleven");
            storage.show();
            storage.enqueue("twelve");
            storage.show();
            storage.isFull();
               
           
        }
}
