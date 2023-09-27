package CodingPractice;

public class CountNumberofWordsandCorrespondingCharacter {

	public static void main(String[] args) 
	{
    
		 String s="Hello World Arvind & Sharma";
		 
		 String[] a=s.split(" ");
		
		 int wordcount=0;
		 for (String c:a)
		 {
			 System.out.println("number of characters in "+c+" "+c.length());
			 wordcount++;
	    }
		 
		 System.out.println("Number of words in sentence"+" "+ wordcount);
	}

}
