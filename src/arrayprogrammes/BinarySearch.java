package arrayprogrammes;

public class BinarySearch {

	public static void main(String[] args) 
	{   
	  //Prerequisite-element should be in sorted order
		//m- is the median index of the array
		//h- higher bound
		//l - lower bound
		int s[]= {10,11,12,13,14,15};
		boolean flag=false;
		int key =11;
		int l=0;
		int h= s.length-1;
		
		while (l<=h)
		{
			int m= (l+h)/2;
			if (key==s[m])
			{
				System.out.println("Element found ");
				flag=true;
				break;
			}
		
		    if (s[m]<key)
		    {
		       l=m+1;
		    }
		    
		    if(s[m]>key)
		    {
		    	h=m-1;
		    	
		    }
		}
		 if (flag==false)
		 {
			 System.out.println("Element not found");
		
		}
		
		
	    

	}

}
