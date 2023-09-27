package CodingPractice;



public class FindFirstNonRepeatedNumberfromUnsortedIntegerArray {

	public static void main(String[] args) {
		
	
	int a[]= {1,2,4,3,5,1,2};
	
    for (int i=0;i<a.length;i++)
	{
		int number=0;
		for (int j=i+1;j<a.length;j++)
		{
		     if(a[i]==a[j])	
		     {
		    	number++;
		    	 break;
		     }
		}
		
		if(number==0)
		{
			System.out.println(a[i]);
			break;
		}
		
	}
	
	
	
	}}