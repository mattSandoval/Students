/**
@author [Noella Amor Napilot]
@ling [@AmorNapilot]
@date-update [10-06-16]
*/
public class MinMax
{
    public static void main(String[] args) {
        int [] numbers = {88, 33, 55, 23, 64, 123};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length;i++){
           if (min > numbers[i])
           min = numbers[i];
           if (numbers[i] > max)
            max = numbers[i];
        }
        System.out.println("The smallest number is " + min);
        System.out.println("The largest number is " + max);
    }
}
