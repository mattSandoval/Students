/* @author [Danalene Laxamana Tuno]
* @link    [https://github.com/dandanalene]
* @version [10.7]
* @since   [last updated 10/16/2016]
*/

public class ArrayStack {
    
  private String[] arrayStack;
  private int arraySize;
  private int top=0;
    
    
  public ArrayStack(int size)
   {
      arraySize = size;
      arrayStack = new String[arraySize];
  }
  
  public void Show()
  {
      for(int i=arraySize-1; i>=0; i--)
      {
          System.out.println("Stack [" + i + "] = " + arrayStack[i]);
      }
      System.out.println();      
  }
  
  public void Peek()
  {
      if(IsEmpty())
      {
          System.out.println("Peek is null. Stack is EMPTY!");
          System.out.println();
      } else 
      {
          System.out.println("TOP: Stack [" + (top-1) + "] = " + arrayStack[top-1]);          
          System.out.println();
      }
  }
  
  public void Push(String input)
  {
      if (IsFull())
      {
          System.out.println("Cannot PUSH anymore. Stack is FULL!");
          System.out.println();
      } else 
      {
          arrayStack[top] = input;
          top++;
          System.out.println("Stack [" + (top-1) + "] = " + arrayStack[top-1]);
          System.out.println("--- Successful PUSH.");          
          System.out.println();
      }
  }
  
  public void Pop()
  {
      if(IsEmpty())
      {
          System.out.println("Cannot POP an element. Stack is EMPTY!");
          System.out.println();
      } else 
      {
          System.out.println("Stack [" + (top-1) + "] = " + arrayStack[top-1]);
          arrayStack[top-1] = null;
          top--;
          System.out.println("--- Successful POP.");
          System.out.println();
      }
  }
  
  public boolean IsEmpty()
  {
      if (top == 0)
      {
          return true;
      } else 
      {
          return false;
      }
  }
  
  public boolean IsFull()
  {
      if(top == arraySize)
      {
          return true;
      } else
      {
          return false;
      }
  }

public static void main(String[] args) {
      ArrayStack dan = new ArrayStack(10);
      
      System.out.println("SIZE = " + obj.arraySize);
      System.out.println();

      dan.Show();
      dan.Push("D");
      dan.Peek();
      dan.Pop();
      dan.Show();
      dan.Peek();
      dan.Pop();
      dan.Push("one");
      dan.Push("two");
      dan.Push("three");
      dan.Push("four");
      dan.Push("five");
      dan.Push("six");
      dan.Push("seven");
      dan.Push("eight");
      dan.Push("nine");
      dan.Push("ten");
      dan.Push("eleven");
      
      dan.Show();
  }  
}
