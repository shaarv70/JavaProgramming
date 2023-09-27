package CodingPractice;

public class PrintNumberofVowelsAndConsonantsinString {

	public static void main(String[] args) {
		
		int vowelcount=0;
		int consonantcount=0;
		
		String s="I love@ the. way you lie";
		
		String[] p=s.split(" ");
		
		for (String c:p)
		{
			
			char v[]=c.toCharArray();
			
			for (char b:v)
			{
				 if(b>='a' && b<='z')
				 {
					 
					switch(b)
					{ case 'a':
					case 'e':
					case 'i':
					case 'o':
					case 'u':
						vowelcount++;
						break;
						default:
							consonantcount++;
					
					
					}
					 
				}
				 
				
				
			}
	
		
		
		}
			
		
		System.out.println("vowelcount"+vowelcount);
		System.out.println("consonantcount"+consonantcount);
		
    
	}

}
