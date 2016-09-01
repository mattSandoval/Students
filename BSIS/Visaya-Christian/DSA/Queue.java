//SOURCE CODE: Stack.java
//AUTHOR NAME: Christian S. Visaya
//GITHUB URL:
//LAST UPDATE:

import java.util.Scanner;
import java.util.ArrayList; // Need this in declaring ArrayList.

class Queue{

          static ArrayList<String> Queue = new ArrayList<>(); //ArrayList na mag hohold ng mga value and represent as stack.

          static boolean Full(){
                    if(Queue.size() == 10){
                              return true;
                    }
                    return false;
          } // This is the method that will check if the stack is full.

          static boolean Empty(){
                    if(Queue.size() == 0){
                              return true;
                    }
                    return false;
          } //This is the method that will check if the stack is empty.

          static void Enqueue(){ // This method will add value to queue.
                    if(Full() == false){ // If false, it will execute the adding part.
                              Scanner Input = new Scanner(System.in);
                              String Value;
                              System.out.println("\nPlease enter a value: ");
                              Value = Input.next();
                              System.out.println("\nTrying to enqueue . . .");
                              sleep(2000;)
                              Queue.add(Value);
                              System.out.println(Value + " is successfully added!");
                    }else{
                              System.out.println("The queue is full! Try dequeue."); // This will print the status of your stack is full.
                    }
          }

          static void Dequeue(){ // This will remove one element in the head.
                    if(Empty() == false){ // If false, will continue.
                              int Head = 0;
                              System.out.println("\n" + Queue.get(0) + " is successfully removed!\n");
                              Queue.remove(Head);
                    }else{
                              System.out.println("\nThe queue is empty! Try enqueue."); // Prints "Can't add".
                    }
          }

          static void Show(){ // This method will show all the existing queue.
                    if(Empty() == false){ // If false, wil continue/
                              System.out.println("\nYour head is " + Queue.get(0)); // Prints the head of your queue, it is the very first you've inputed.
                              System.out.println("Your tail is " + Queue.get(Queue.size() - 1)); // This will print the last element that you've inputted, known as tail.
                              System.out.println("The size of your queue is " + Queue.size() + "\n"); // This will display the current size of your queue.
                              for(int a = 0; a < Queue.size(); a++){ // The displaying algorithm.
                                        System.out.println("\t\t" + Queue.get(a));
                              }
                    }else{
                              System.out.println("\nThe queue is empty! There is nothing to show!"); // Prints that there is nothng to show because the queue is empty.
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
                                        System.out.println("\nThe only choice is 1, 2, 3, 4."); // Informs the user that there is an appropriate choices.
                              }
                    }
                    System.out.println("\nProgram terminated! Thank you for using my program."); // Goodbye message.
          }

          static void sleep(int time){ // This method is just a loading effect each time theuser pop or push.
                    try	{
                        Thread.sleep(time);
                    }catch(Exception e){
                    }
          }

}
