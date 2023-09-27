package CodingPractice;

import java.util.Arrays;



public class ReverseWordsinString {

	public static void main(String[] args) {
		
		String s="Hello World";
		
		String[] p=s.split(" ");
		
		String rev ="";//olleH
		 
		 
		for (String h:p) {
			
			String n="";
			
			
		   for (int i=h.length()-1;i>=0;i--)
			{
			     n=n+h.charAt(i);   //This line means here we are adding the characters to space	
			    	 
			}
			
		   rev=rev+n+" ";
	            	   
		}
		System.out.println(rev);
     
		
		
	}

}
