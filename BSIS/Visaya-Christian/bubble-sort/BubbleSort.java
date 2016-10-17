import java.util.Scanner;
import java.util.Random;

class BubbleSort{
    
    static int Integer[];
    static int Capacity;
    static int SortedInteger[];
    static int Temp;
    
    public static void main(String [] args){
        
        Scanner Input = new Scanner(System.in);
        Random MyRand = new Random();
       
        System.out.println("\n\nHow many integers you want to generate?");
        Capacity = Input.nextInt();
        Integer = new int[Capacity];
        SortedInteger = new int[Capacity];
        
        System.out.println("\nUNSORTED\t\t\tSORTED\n");
        
        for(int a = 0; a < Capacity; a++){
            Integer[a] = MyRand.nextInt(1000);
            SortedInteger[a] = Integer[a];
        }
        
        for(int a = 0; a < Capacity - 1; a++){
            for(int b = 0; b < Capacity - a - 1; b++){
                if(SortedInteger[b] > SortedInteger[b + 1]){
                    Temp = SortedInteger[b];
                    SortedInteger[b] = SortedInteger[b + 1];
                    SortedInteger[b + 1] = Temp;
                }
            }
        }
        
        for(int a = 0; a < Integer.length; a++){
            System.out.println(Integer[a] + "\t\t\t\t" + SortedInteger[a]);
        }
        
    }
    
}