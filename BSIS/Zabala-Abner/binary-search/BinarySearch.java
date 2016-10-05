import java.util.Random;
import java.util.Scanner;

public class BinarySearch {
private int [] array;
private int capacity;
private BinarySearch (int size){
capacity = size;
array = new int [capacity];

}
public void getArray(){
Scanner input = new Scanner(System.in);
Random rand = new Random();
for (int i = 0; i < capacity; i++){
int x = rand.nextInt(100);
array[i] = x;
}
System.out.println();
}
public void sort(){
int swap;
for(int x = 0;x < capacity-1;x++){
for(int y = 0;y < capacity-x-1;y++){
if(array[y] > array[y+1]){
swap = array[y];
array[y] = array[y+1];
array[y+1] = swap;
}
}
}
System.out.println(" Sorted Array");
}
public void show(){
int END = 0;
for (int i = 0; i < capacity; i++){ 
System.out.print(array[i]+" ");
END+=1;
if(END == 10){
System.out.println();
END = 0;
}
} 
}
public void search(){
Scanner input = new Scanner(System.in);
int left,right,middle,search;
middle = 0;
left = 0;
right = capacity-1;
System.out.println("Plese enter the number to search : ");
search = input.nextInt();
while(left <= right){
middle = (left+right)/2;
if(array[middle] == search){
System.out.print("the value found at array["+(middle+1)+"]");
break;
}
else if(array[middle] < search){
left = middle + 1;
}
else {
right = middle-1;
}
}
if(array[middle]!=search){
System.out.print("the value not found!!");
}
}
public static void main (String[] Args){
int size;
Scanner input = new Scanner (System.in);
System.out.print("Enter array size: " );
size = input.nextInt();

BinarySearch show = new BinarySearch (size);
show.getArray();
show.show();
show.sort();
show.show();
show.search();

}
}