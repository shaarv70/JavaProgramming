package arrayprogrammes;

public class MaxAndMinElementInArray {

	public static void main(String[] args) 
	{
	    int a[]= {30,10,-45,89,76,999};
	    
	    int max=a[0];
	    int min=a[0];
	    
	    for(int c:a)
	    {
	    	if (c>max)
	    	{
	    	   max=c;
	    	}
	    }
	    
	    for(int d:a)
	    {
	    	if(d<min)
	    	{
	    		min=d;
	    	}
	    }

	System.out.println("Maximum element is: "+max);
	System.out.println("Minimum Element is: "+min);
	}

}
