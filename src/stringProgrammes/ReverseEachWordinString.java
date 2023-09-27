package stringProgrammes;

public class ReverseEachWordinString {
    
	public static void main(String[] args) 
	{   
		//Revserse each word in a  string
		//approach 1
		String s= "Welcome to Java";
		String f[]=s.split(" ");
		String reversestring=" ";
/*		for (String ele:f)
		{
			String revword=" ";
			for (int i=ele.length()-1;i>=0;i--)
			{	
				revword=revword+ele.charAt(i);// after the loop is terminated and again outer for loop is initialized the value of revword is again empty.   
				
			}
		
			reversestring=reversestring+revword;
	     
		}
		System.out.println(reversestring);*/
		
		//Approach 2
		String rev=" ";
		for(String ele:f)
		{
			StringBuilder sb=new StringBuilder(ele);
			 rev=rev+sb.reverse().toString()+" ";
			
		}
		reversestring=reversestring+rev;
		System.out.println(reversestring);
		
		
	//reverse each word in String without changing first and last letter 
	/*	String str="Welcome to Java";
		String strarr[]=str.split("\\s+");
		String ans="";
		String a=" ";
		String reverse=null;
		String reverse2=null;
		 String reverse1=null;
		for (int i=0;i<strarr.length;i++)
		{
			if(i==0)
			{
				String rev= strarr[i].substring(1, 7);
				StringBuffer sd= new StringBuffer(rev);
				sd.reverse();
			     reverse1= sd.toString();
			}
		
			if (i==strarr.length-1)
			{
				String rev2= strarr[i].substring(0, 3);
				StringBuffer sd= new StringBuffer(rev2);
				sd.reverse();
			     reverse2= sd.toString();
			}
			
			if(i!=0 && i!=strarr.length-1)
			{
				StringBuffer sd= new StringBuffer(strarr[i]);
			
			sd.reverse();
		    reverse= sd.toString();
		    
			}
				
				
				
				
			}
		
		 ans=str.charAt(0)+reverse1+a+reverse+a+reverse2+str.charAt(str.length()-1);
		 System.out.println(ans);*/
		
	
		 
		 
	
	
	}
		

	}


