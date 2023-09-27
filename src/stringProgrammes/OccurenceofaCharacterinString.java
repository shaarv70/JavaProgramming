package stringProgrammes;

public class OccurenceofaCharacterinString {

	public static void main(String[] args) 
	{
		// for example if we want to check the number of a in string
		
		String s= "Java Programming Java OOPS ";//My approach
		int i=0;
		int count =0;
		while(s!=null&& i<s.length())
		{
			if (s.charAt(i)=='a')
			{
				count++;
				
			}
             i++;		
		}

		System.out.println(count);
		
		
		
		// 2 approach - instructor
		
		int length=s.replace("a","" ).length();
		int orglength= s.length();
		System.out.println("Original length:"+(orglength-length));
				
				

	}






}
