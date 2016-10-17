import java.util.Scanner;
import java.util.Random;

class BinarySearch{
    
    static int NumberLine[];
    
    static int BinarySearch(int Search, int Size){
        
        int Left = 0;
        int Right = Size;
        int Middle;
        
        while(Left <= Right){
            Middle = Left + (Right - Left) / 2;
            if(NumberLine[Middle] == Search){
                return Middle;
            }else if(Search < NumberLine[Middle]){
                Right = Middle - 1;
            }else{
                Left = Middle + 1;
            }
        }
        
        return -1;
        
    }
    
    static void BubbleSort(int Size){
        
        int Swap;
        System.out.print("\n");
        
        for(int a = 0; a < Size - 1; a++){
            for(int b = 0; b < Size - a - 1; b++){
                if(NumberLine[b] > NumberLine[b + 1]){
                    Swap = NumberLine[b];
                    NumberLine[b] = NumberLine[b + 1];
                    NumberLine[b + 1] = Swap;
                }
            }
        }
        
        for(int a = 0; a < Size; a++){
            System.out.println(NumberLine[a]);
        }
        
    };
    
    public static void main(String[] args){
        Scanner Input = new Scanner(System.in);
        Random MyRand = new Random();
        int Size;
        int Search;
        int Result;
        
        System.out.println("\nHow many random numbers you want to generate? ");
        Size = Input.nextInt();
        NumberLine = new int[Size];
        
        for(int a = 0; a < Size; a++){
            NumberLine[a] = MyRand.nextInt(1000);
        }
        System.out.println(Size + " random numbers generated.");
        
        BubbleSort(Size);
        
        System.out.println("\nPlease enter the number you want to search: ");
        Search = Input.nextInt();
        
        Result = BinarySearch(Search, Size);
        
        if(Result != -1){
            System.out.println("\nFOUND! " + Search + " is found at array[" + Result + "].");
        }else{
            System.out.println("\nNOT FOUND! " + Search + " is not in the array.");
        }
    }
    
}