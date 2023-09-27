package CodingPractice;

public class PrintFirstLetterofEachWord {

	public static void main(String[] args) {
		
		String s="Learn with Arvind Sharma";
		
		String a[]=s.split(" ");
		
		for(String c:a)
		{
			System.out.println(c.charAt(0));
			
		}

	}

}
