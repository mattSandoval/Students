/**
* Java implementation of a stack using array.
* For demo purpose, should hold a maximum of 10 string values.
*
* @author  [Nicko Fernandez Reyes]
* @link    [https://github.com/samcoii22/]
* @version [version number]
* @since   [10/6/2016]
*/

public class ArrayStack
{
 private static final int capacity = 10;
 int arr[] = new int[capacity];
 int top = -1;

 public void push(int pushedElement)
 {
  if (top < capacity - 1)
  {
   top++;
   arr[top] = pushedElement;
   System.out.println("Element " + pushedElement + " is pushed to Stack !");
   printElements();
  } 
  else
  {
   System.out.println("Stack Overflow !");
  }
 }

 public void pop() 
 {
  if (top >= 0)
  {
   top--;
   System.out.println("Pop operation done !");
  } 
  else
  {
   System.out.println("Stack Underflow !");
  }
 }

 public void printElements()
 {
  if (top >= 0) 
  {
   
   for (int i = 0; i <= top; i++) 
   {
    System.out.println("Elements in stack [ "+ i +" ]= " + arr[i]);
   }
  }
 }

 public static void main(String[] args) 
 {
   ArrayStack stack = new  ArrayStack();

  stack.pop();
  stack.push(23);
  stack.push(2);
  stack.pop();
  stack.push(73);
  stack.push(21);
  //System.out.println("\")
  stack.printElements();
 }

}
