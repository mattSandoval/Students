package SumAverageMax;


	 import java.util.Scanner;
	 import java.util.Random;

	 public class Sum_Average_Max{
	   public int []array;
	   public int sum=0;
	   public int average;
	   public int max=0;
	   public void show(){
	     int start=0;
	     System.out.println("Program LOADING");
	     for(int i=0; i<array.length; i++){
	      System.out.print(array[i]+" "); 
	      start+=1;
	      if (start==10){
	      System.out.println();
	      start=0;
	      }
	    }
	      
	   }
	   public void getSum(){
	     
	     for(int a=0; a<array.length; a++){
	       sum+=array[a];
	     
	    }
	       System.out.println("\nThe Sum is  "+sum);
	   }
	   public void getAve(){
	     average=sum/array.length;
	   System.out.println("The Average is "+average);
	   }
	   public void getMax(){
	    for(int i=0; i<array.length;i++){
	   if(array[i]>max)
	     max=array[i];
	   }
	    System.out.println("The Max is "+max);
	   }
	   public static void main (String [] args){
	     Scanner input= new Scanner(System.in);
	     Sum_Average_Max print=new Sum_Average_Max();
	     Random rand= new Random();
	     int arraySize=0;
	    
	     System.out.print("What is the maximum number of arrays: ");
	     arraySize=input.nextInt();
	     print.array=new int [arraySize];
	     
	     for(int a=0; a<arraySize; a++){
	      print.array[a]=rand.nextInt(100);
	      
	     }
	     
	     print.show();
	     print.getSum();
	     print.getAve();
	     print.getMax();
	     
	    
	    
	   }
	 }

