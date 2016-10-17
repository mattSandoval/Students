import java.util.Scanner; 
import java.util.ArrayList;

class Queue{

    static ArrayList<String> Queue = new ArrayList<>();

    static boolean Full(){
        if(Queue.size() == 10){
            return true;
        }
        
        return false;
        
    }

    static boolean Empty(){
        if(Queue.size() == 0){
            return true;
        }
        
        return false;
        
    }

    static void Enqueue(){
        if(Full() == false){ 
            Scanner Input = new Scanner(System.in);
            String Value;
            
            System.out.println("\nPlease enter a value: ");
            Value = Input.next();
            
            System.out.println("\nTrying to enqueue . . .");
            sleep(2000);
            Queue.add(Value);
            System.out.println(Value + " is successfully added!");
        }else{
            System.out.println("The queue is full! Try dequeue."); 
        }
        
    }

    static void Dequeue(){ 
        if(Empty() == false){ 
            int Head = 0;
            
            System.out.println("\n" + Queue.get(0) + " is successfully removed!\n");
            Queue.remove(Head);
        }else{
            System.out.println("\nThe queue is empty! Try enqueue."); 
        }
        
    }

    static void Show(){ 
        if(Empty() == false){
            System.out.println("\nYour head is " + Queue.get(0)); 
            
            System.out.println("Your tail is " + Queue.get(Queue.size() - 1)); 
            
            System.out.println("The size of your queue is " + Queue.size() + "\n");
            
            for(int a = 0; a < Queue.size(); a++){ 
                System.out.println("\t\t" + Queue.get(a));
            }
        }else{
            System.out.println("\nThe queue is empty! There is nothing to show!");
        }
        
    }

    public static void main(String[] args){
        Scanner Input = new Scanner(System.in);
        boolean Run = true;
        int Choice;
        
        while(Run == true){
                  System.out.println("\n\t\t1. Enqueue");
                  System.out.println("\t\t2. Dequeue");
                  System.out.println("\t\t3. Show");
                  System.out.println("\t\t4. Terminate");
                  Choice = Input.nextInt();
            
                  if(Choice == 1){
                      Enqueue();
                  }else if(Choice == 2){
                      Dequeue();
                  }else if(Choice == 3){
                      Show();
                  }else if(Choice == 4){
                      Run = false;
                  }else{
                      System.out.println("\nThe only choice is 1, 2, 3, 4."); 
                  }
        }

        System.out.println("\nProgram terminated! Thank you for using my program."); 
        
    }

    static void sleep(int time){
        try	{
            Thread.sleep(time);
        }catch(Exception e){
        }
        
    }

}