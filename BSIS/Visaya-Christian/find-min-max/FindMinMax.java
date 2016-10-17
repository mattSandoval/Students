import java.util.Scanner;
import java.util.Random;

class FindMinMax{
    
    static int Array[];
    static int Capacity;
    static int Max = 500;
    static int Min = 500;
    
    public static void main(String[] args){
        
        Scanner Input = new Scanner(System.in);
        Random MyRand = new Random();
        
        System.out.println("\nPlease enter the Array capacity: ");
        Capacity = Input.nextInt();
        Array = new int[Capacity];
        
        System.out.print("\n");
        
        for(int a = 0; a < Array.length; a++){
            Array[a] = MyRand.nextInt(1000);
            System.out.println(Array[a]);
        }
        
        for(int a = 0; a < Array.length; a++){
            if(Array[a] > Max){
                Max = Array[a];
            }
            if(Array[a] < Min){
                Min = Array[a];
            }
        }
        
        System.out.println("\nThe smallest number is " + Min);
        System.out.println("The biggest number is " + Max);
        
    }
    
}