package CodingPractice;

public class NextGreaterElementinArray {

	public static void main(String[] args) {
		
		
	int[]a= {10,11,5,4,1};
	
	
	if(a.length<0 || a.length==1 )
	{
		System.out.println("No element present");
	}
	
	else {
	for (int i=0;i<a.length;i++)
	{   int j;
		int temp=-1;
		for ( j=i+1;j<a.length;j++)
		{
			if(a[i]<a[j])
			{
				temp=a[j];
				
				
			}
	
		}
		
		System.out.println("Next greater element for"+" "+ a[i]+" is : "+temp);
		
		
		
		
	}	
		
		
		
		
	}
	
	}

}
