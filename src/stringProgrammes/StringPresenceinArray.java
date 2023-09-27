package stringProgrammes;

public class StringPresenceinArray {

	public static void main(String[] args)
	{
	   String a[]= {"Rahul","Rohan","Raj","Roshan"};
	   
	   String k="Rahul";
	   
	   for (String c:a)
	   {
		   if (c.equals(k))
		   {
			   System.out.println("Specified string is present");
			   break;
		   }
		   else
		   {
			   System.out.println("Not present");
		   }
	   }

	}

}
