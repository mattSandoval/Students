import java.util.Scanner;
import java.util.Random;

class LinearSearch{
    
    static int Integer[];
    static int Capacity;
    static int SearchNumber;
    static int Count;
    
    public static void main(String [] args){
        Scanner Input = new Scanner(System.in);
        Random MyRand = new Random();
        
        System.out.println("\n\nHow many integers you want to generate?");
        Capacity = Input.nextInt();
        Integer = new int[Capacity];
        
        System.out.print("\n");
        
        System.out.println("Please enter the number you want to search: ");
        SearchNumber = Input.nextInt();
        
        System.out.print("\n");
        
        for(int a = 0; a < Integer.length; a++){
            Integer[a] = MyRand.nextInt(1000);
            System.out.println(Integer[a]);
        }
            
        for(Count = 0; Count < Integer.length; Count++){
            if(Integer[Count] == SearchNumber){
                System.out.println("FOUND: " + SearchNumber + " is found at " + "Array[" + Count + "]");
                break;
            }
        }

        if(Count == Capacity){
            System.out.println("\nNOT FOUND: " + SearchNumber + " is not found.");
        }
        
    }
    
}