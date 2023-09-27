package CodingPractice;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SumofElementsinArraybyJava8 {

	public static void main(String[] args) {
		
		//1 approach
		int[] a= {2,3,4,5,76};
		int sum= Arrays.stream(a).sum();
		System.out.println(sum);

	   //2 approach
		 int sum2=IntStream.of(a).sum();
	     System.out.println(sum2);
	
	    //3 approach
	     int sum3=   Arrays.stream(a).reduce((x,y)->x+y).getAsInt();
	    System.out.println(sum3);
	
	
	
	}

}
