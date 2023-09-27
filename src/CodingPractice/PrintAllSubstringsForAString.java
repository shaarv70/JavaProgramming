package CodingPractice;

public class PrintAllSubstringsForAString {

	public static void main(String[] args) {
		
       String s="ONION";
       
       
       
       for (int i=0;i<s.length();i++)
       {
    	   System.out.println(s.charAt(i));
    	   StringBuilder sf= new StringBuilder();
    	    StringBuilder h=  sf.append(s.charAt(i));
    	   for (int j=i+1;j<s.length();j++)
    	   {
    		   
    		   
    		   System.out.println(h.append(s.charAt(j)));
    		   
    		   }
    	       
    	   h=null;
    	   
       }
		
		
	}

}
