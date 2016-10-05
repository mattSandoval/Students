public class ArrayQueue {
    
    private int capacity;
    private int head;
    private int tail;
    private int list[];
   
    public ArrayQueue(int size){
        capacity = size;
        list = new int[capacity];
    }
    public void show(){
        for (int i = 0; i < capacity; i++){
            System.out.println("queue["+ i +"] = " + list[i]);
        }
        System.out.println();
    }
    private boolean isEmpty(){
        if (tail == 0){
            System.out.println(" ");
            System.out.println();
            return true;
        }
        return false;
    }
    private boolean isFull(){
        if (tail == capacity){
            System.out.println(" ");
            System.out.println();
            return true;
        }
        return false;
    }
    
    public void enqueue(int value){
        if(isFull()){
            System.out.println("...trying to enqueue on queue[" + (tail-1) + "]...");
            System.out.println("   ");
            System.out.println();
        }
        else{
            System.out.println("...trying to enqueue on queue[" + tail + "]...");
            list[tail] = value;
            tail++;
            System.out.println(value + " was successfully added.");
            System.out.println();
        }   
    }
    public void dequeue(){
        if (isEmpty()){
            System.out.println("...trying to dequeue head...");
            System.out.println("   ");
            System.out.println();
        }
        else{
            System.out.println("...trying to dequeue head...");
            int temp = list[0];
            list[0] = 0;
            tail--;
            System.out.println(temp + " was successfully removed.");
            System.out.println();     
        }
        for (int x = 0; x < tail; x++){
            list[x] = list[x + 1];
        }
        for (int y = tail; y < capacity; y++){
            list[y] = 0;
        }
    }
    
    public int peekHead(){
        System.out.println("Head :" + list[head]);
        if (isEmpty()){
            return-1;
        }
        System.out.println();
        
        return 0;
    }
    public int peekTail(){
        System.out.println("Tail : " + list[tail-1]);
        if (isEmpty()){
            return -1;
        }
        System.out.println();
        
        return 0;
    }

   
    public static void main(String[] args) {
        
        ArrayQueue storage = new ArrayQueue(10);
        
        storage.enqueue(10);
        storage.enqueue(20);
        storage.enqueue(30);
        storage.enqueue(40);
        storage.enqueue(50);
        storage.enqueue(60);
        storage.enqueue(70);
        storage.enqueue(80);
        storage.enqueue(90);
        storage.enqueue(100);
        storage.show();
        storage.dequeue();
        storage.show();
        storage.dequeue();
        storage.show();
        
        
    }
    
}
