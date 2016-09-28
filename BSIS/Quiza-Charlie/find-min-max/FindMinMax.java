public class FindMinMax {

	public static void main (String[] args){
		
		int[] num = {88, 33, 55, 23 , 64, 123 };
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE; 
		
		for (int i= 0; i < num.length; i++) { 
			
			if (num [i] < min )
				min = num [i];
			if (num[i] > max)
				
				max = num [i]; 
				
						
			
	}
	System.out.println("Smallest number is " + min+".");
	System.out.println("Largest number is " + max+".");
}
}
