package CodingPractice;

public class ReverseStringUsingRecursion {

	public static void main(String[] args) {
		
		String a="Geeks and Geeks";
		System.out.println(recursive(a));
		
		}

	
	private static String recursive(String s)
	{
		if(s.equals(null) || s.length()<=1) 
		{
			return s;	
		}
		
		
		return recursive(s.substring(1))+s.charAt(0);  //andyS,ndyaS,dynaS,ydnaS
	}
	
	
	
}
