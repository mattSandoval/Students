/**
* Java implementation of a queue using array.
* For demo purpose, should hold a maximum of 10 integers.
*
* @author  Cortez, Chyrine A.
* @link    github.com/cortezchyrine
* @version 0.1
* @since   [10/05/2016]
*/

package cortez;
import java.util.*;
public class LinearSearch {

	public static void main(String[]args){
		
	int size,find;
	int []arr;
		Scanner input = new Scanner(System.in);
		Random rad = new Random();
		System.out.println("size many Output: ");
		size= input.nextInt();
		
		arr= new int[size];
		
		for (int i=0; i<=size-1;i++){
			arr[i]=rad.nextInt(1000);
			System.out.println(arr[i]);
		}
		System.out.println("Searching for: ");
		find=input.nextInt();
		for(int c=0;c<=size-1;c++){
			if(find==arr[c]){
				System.out.println("Index no: "+ c);
			break;
			}
			if (c==size-1){

				System.out.print("the Number you searched is not in the Given Random!!!");

			}

				}
	}
}
