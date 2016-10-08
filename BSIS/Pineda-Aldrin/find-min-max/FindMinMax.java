package min;

public class FindMinMax {
public static void main(String[]args) {
        
        int [] numbers = {12 , 53 , 13 , 45 , 19 , 88 } ;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
            
            for(int x = 0 ; x<numbers.length ; x++){
                
                if(numbers[x] < min ){
                       min = numbers[x] ;
                }
                if(numbers[x] > max ){
                        max = numbers[x];
                }    
                
            }
            System.out.println("Smallest Number is : " +min);
            System.out.println("Largest Number is : " +max);
            
        
        
    }
    

}
