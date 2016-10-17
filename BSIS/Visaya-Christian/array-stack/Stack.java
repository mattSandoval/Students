import java.util.Scanner;
import java.util.ArrayList;

class Stack{

    static ArrayList<String> Stack = new ArrayList<>();
    
    static boolean Empty(){
        if(Stack.size() == 0){
            return true;
        }
        
        return false;
        
    }

    static boolean Full(){
        if(Stack.size() == 10){
            return true;
        }
        
        return false;
        
    }

    static void PUSH(){
        if(Full() == false){ 
            Scanner Input = new Scanner(System.in);
            String Value;

            System.out.println("\nPlease enter a value: ");
            Value = Input.next();

            System.out.println("\nTrying to push . . .");
            sleep(2000);

            System.out.println(Value + " is successfully pushed!");
            Stack.add(Value);
        }else{
            System.out.println("The stack is full! Can't push anymore.");
        }
        
    }

    static void POP(){
        if(Empty() == false){
            System.out.println("\nTrying to pop . . .");
            sleep(2000);

            System.out.println(Stack.get(Stack.size() - 1) + " is successfully popped!");
            Stack.remove(Stack.size() - 1);
        }else{
            System.out.println("The stack is empty! Can't pop anymore!");
        }
        
    }

    static void DISPLAY(){
        if(Empty() == false){
            System.out.println("\n\nThe hieght of your stack is " + Stack.size()); 
            System.out.println("The top of your stack is " + Stack.get(Stack.size() - 1) + "\n"); 
            
            for(int c = Stack.size() - 1; c >= 0; c--){ 
                System.out.println("\t\t" + Stack.get(c));
            }
        }else{
            System.out.println("\nNothing to display! The Stack is empty! Try pushing!");
        }
        
    }

    public static void main(String[] args){
        Scanner Input = new Scanner(System.in);
        boolean Run = true;
        int Choice;
        
        while(Run == true){
            System.out.println("\n\n\t\t1. PUSH");
            System.out.println("\t\t2. POP");
            System.out.println("\t\t3. DISPLAY");
            System.out.println("\t\t4. TERMINATE");
            Choice = Input.nextInt();
            
            if(Choice == 1){
                PUSH();
            }else if(Choice == 2){
                POP();
            }else if(Choice == 3){
                DISPLAY();
            }else if(Choice == 4){
                Run = false;
            }else{
                System.out.println("Choices are 1, 2 and 3 only.");
            }
        }
        
        System.out.println("\nProgram Terminated! Thank you for using my program!");
        
    }

    static void sleep(int time){
        try	{
            Thread.sleep(time);
        }catch(Exception e){
        }
        
    }

}