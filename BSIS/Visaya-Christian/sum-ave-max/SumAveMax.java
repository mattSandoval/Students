import java.util.Scanner;
import java.util.Random;

class SumAveMax{
    
    static int Capacity;
    static int Array[];
    static int Total;
    static int Max;
    static double Average;
    
    SumAveMax(){
        
        Scanner Input = new Scanner(System.in);
        Random MyRand  = new Random();
        
        System.out.println("\nEnter array size: ");
        Capacity = Input.nextInt();
        Array = new int[Capacity];
        
        System.out.print("\n");
        
        for(int a = 0; a < Array.length; a++){
            Array[a] = MyRand.nextInt(1000);
            System.out.println(Array[a]);
            Total += Array[a];
            if(Array[a] > Max)
                Max = Array[a];
        }
        
        System.out.print("\n");
        
    }
    
    static void Sum(){
        System.out.println("Sum = " + Total);
        
    }
    
    static void Max(){
        System.out.println("Max = " + Max);
        
    }    
    
    static void Average(){
        Average = Total / Capacity;
        System.out.println("Average = " + Average);
        
    }
    
    public static void main(String[] args){
        SumAveMax Functions = new SumAveMax();
        Functions.Sum();
        Functions.Max();
        Functions.Average();
        
    }
    
}