//SOURCE CODE: Stack.java
//AUTHOR NAME: Christian S. Visaya
//GITHUB URL:
//LAST UPDATE:

import java.util.Scanner;
import java.util.ArrayList; // Need this in declaring ArrayList.

class Stack{

          static ArrayList<String> Stack = new ArrayList<>(); //ArrayList na mag hohold ng mga value and represent as stack.

          static boolean Empty(){
                    if(Stack.size() == 0){
                              return true;
                    }
                    return false;
          } //This is the method that will check if the stack is empty.

          static boolean Full(){
                    if(Stack.size() == 10){
                              return true;
                    }
                    return false;
          } // This is the method that will check if the stack is full.

          static void PUSH(){ // The method Push, same as enqueue, add a stack.
                    if(Full() == false){ // false, continue to add value in stack.
                              Scanner Input = new Scanner(System.in);
                              String Value;
                              System.out.println("\nPlease enter a value: ");
                              Value = Input.next();
                              System.out.println("\nTrying to push . . .");
                              sleep(2000);
                              System.out.println(Value + " is successfully pushed!");
                              Stack.add(Value);
                    }else{
                              System.out.println("The stack is full! Can't push anymore."); // This will print the status of your stack is full.
                    }
          }

          static void POP(){ // Same as dequeue, it will remove element in your ArrayList.
                    if(Empty() == false){ // false, continue to remove element in your ArrayList.
                              System.out.println("\nTrying to pop . . .");
                              sleep(2000);
                              System.out.println(Stack.get(Stack.size() - 1) + " is successfully popped!");
                              Stack.remove(Stack.size() - 1);
                    }else{
                              System.out.println("The stack is empty! Can't pop anymore!"); // Prints "Can't push!".
                    }
          }

          static void DISPLAY(){ //This method will display all the status of your stack.
                    if(Empty() == false){ // If false, will continue.
                              System.out.println("\n\nThe hieght of your stack is " + Stack.size()); // Prints the hieght of your stack./
                              System.out.println("The top of your stack is " + Stack.get(Stack.size() - 1) + "\n"); // Prints the peek or the top of the stack.
                              for(int c = Stack.size() - 1; c >= 0; c--){ // Display every element in the form of book, decsending.
                                        System.out.println("\t\t" + Stack.get(c));
                              }
                    }else{
                              System.out.println("\nNothing to display! The Stack is empty! Try pushing!"); // Prompts the user that there is nothing to display because the stack is empty.
                    }
          }

          public static void main(String[] args){ // Holds the main menu.
                    Scanner Input = new Scanner(System.in);
                    boolean Run = true; // This will indicate if the user are going to continue each time he/she execute a command.
                    int Choice; // The choice of the user.
                    while(Run == true){ // Acts as the main menu.
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
                                        System.out.println("Choices are 1, 2 and 3 only."); // inform the user that the only choice is 1 - 4.
                              }
                    }
                    System.out.println("\nProgram Terminated! Thank you for using my program!"); // Goodbye message.
          }

          static void sleep(int time){ // This method is just a loading effect each time theuser pop or push.
                    try	{
                        Thread.sleep(time);
                    }catch(Exception e){
                    }
          }

}
