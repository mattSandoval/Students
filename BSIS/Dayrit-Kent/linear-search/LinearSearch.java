/**
* LINEAR SEARCH checks each item in a collection from start to end until a match is found. 
*
* @author  Dayrit Kent
* @link   https://github.com/lvcc-dsa/Students/edit/master/BSIS/Dayrit-Kent/linear-search/LinearSearch.java
* @version 1
* @since  10/6/16
*/package Linear;
import java.util.*;
public class LinearSearch {

	Scanner input = new Scanner(System.in);
	Random rad = new Random();

	int how,find;
	int []array;
	
void numbers(){
	System.out.println("How many Output: ");
	how= input.nextInt();
	
	array= new int[how];
	
	for (int i=0; i<=how-1;i++){
		array[i]=rad.nextInt(1000);
		System.out.println(array[i]);
	}
	
}
void searching(){

	System.out.println("Searching for: ");
	find=input.nextInt();
	for(int j=0;j<=how-1;j++){
		if(find==array[j]){
			System.out.println("Index no: "+ j);
		break;
		}
		if (j==how-1){

			System.out.print("the Number you searched is not in the Given Random!!!");

		}

			}

}
	
	
public static void main(String[]args){
	LinearSearch object = new LinearSearch();
	
	object.numbers();
	object.searching();
}
}
