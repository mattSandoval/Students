/**
* Java implementation of a stack using array.
* For demo purpose, should hold a maximum of 10 string values.
*
* @author  [Nicko Fernandez Reyes]
* @link    [https://github.com/samcoii22/]
* @version [version number]
* @since   [10/6/2016]
*/
public class ArrayQueue
{
    private static final int capacity = 5;
    int arrays [] = new int [capacity];
    int size = 0;
    int top=-1;
    int rear=0;
    
    public void push (int Element)
    {
        if (top < capacity-1)
        {
            top++;
            arrays[top] =Element;
            System.out.println("ELement " + Element + " ispushed " );
            
        }
        else
        {
            System.out.println(" Exceede! ");
        }
    }
    
    public void pop()
    {
        if(top >= rear)
        {
          rear++;
          System.out.println(" Poped ! ");
          
        }
        else
        {
          System.out.println(" insuficient stack ");   
        }
    }
    
    
       
    public void display ()
    {
        for ( int j=capacity-1;j>=0;j--)
        {
            for (int i=capacity-1;i>=0;i--)
            {
                System.out.println("stack ["+ j-- + "]="+ arrays [i]);
            }
        }
        System.out.println("");
    }
    

    
    public static void main(String[] args)
    {
       ArrayQueue queue = new ArrayQueue();
        queue.display();
        queue.pop();
        queue.push(1);
        queue.display();
        queue.push(2);
        queue.display();
        queue.push(3);
        queue.pop();
        queue.display();
        queue.push(4);
        queue.display();
        queue.push(13);
        queue.display();
    }
    
}
