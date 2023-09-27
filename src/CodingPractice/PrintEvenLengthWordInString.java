package CodingPractice;

import java.util.Arrays;

public class PrintEvenLengthWordInString {

	public static void main(String[] args) {
		
		String a="Hell World geeks";
		
		String[] v= a.split(" ");
		int sum=0;
		for( String p:v)
		{
			 String k= p.length()%2==0?p+ " is even":p+ " is odd";
			System.out.println(k);
			

}}}
