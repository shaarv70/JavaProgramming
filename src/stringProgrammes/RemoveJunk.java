package stringProgrammes;

public class RemoveJunk {

	public static void main(String[] args) 
	{
	    
		String s1= "ãøàe-ré1ürkçå'  latin is good"; // for junk characters
		System.out.println(s1.replaceAll("[^a-zA-Z0-9]", ""));

	    String s2= "@@@@@2##@@#@ latin is good #@@#$$$@@$";// special characters
	    System.out.println(s2.replaceAll("[^a-zA-Z]", ""));// if we insert 0-9 here then it will print 2 also
	    
	
	}

}
