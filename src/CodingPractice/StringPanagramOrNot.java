package CodingPractice;

public class StringPanagramOrNot {

	public static void main(String[] args) {
		
		//String which contains all alphabet characters is called panagram
		
		String s="Hello world";
		String a="The quick brown fox jumps over the lazy dog";//Panagram string exmaple
		boolean isfinal=false;
		if (a.length()<26)
		{
			System.out.println("String is not panagram");
		}
		
		else
		{
			for (char c='a';c<='z';c++) {
				if(a.indexOf(c)<0)     //It will return negative index only in case when that character is not present in String
				{
					isfinal=true;
				     break;
				}
				
			}
		
			if (isfinal==true)
			{
				System.out.println("string is not panagram");
			}
			else
				System.out.println("String is panagram");
		
		}
		
			

	}

}
