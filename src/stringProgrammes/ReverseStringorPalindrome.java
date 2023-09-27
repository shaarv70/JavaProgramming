package stringProgrammes;

public class ReverseStringorPalindrome {

	public static void main(String[] args)
	{
		String s="naman";
		String rev=null;
		
		for (int i=s.length()-1;i>=0;i--)
		{     
	           	
	           rev=rev+s.charAt(i);
	        
		}
		System.out.println(rev);
      if (rev.equals(s))
      {
    	  System.out.println("String is plaindrome ");
      }
      else System.out.println("Not palindrome");
    /*
     second method convcert the string into array   
		char a[]=s.tochararray()
		String rev=""
		for conmdition
		{   rev= rev+a[i]
		            }
		            
		            
	    Third approach:
	    
	    StringBuffer sd= new StringBuffer("I Love U");
	    syso(sb.reverse());	            
		            
		            
		            
		            
		            
		            
		            
		            
		            */
}}
