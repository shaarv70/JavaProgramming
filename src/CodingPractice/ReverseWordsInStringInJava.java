package CodingPractice;

public class ReverseWordsInStringInJava {

	public static void main(String[] args) {
		
		String s= "Welcome to java world";
		
		
		String[] a= s.split(" ");
		String rev="";
		
		
		for(int i=a.length-1;i>=0;i--)
		{
			rev=rev+a[i]+" ";
			
		}
		
		System.out.println(rev.toString());
}}
