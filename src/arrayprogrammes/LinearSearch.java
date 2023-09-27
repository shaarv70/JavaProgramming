package arrayprogrammes;

public class LinearSearch {

	public static void main(String[] args)     
	{
	    int []a= {20,40,60,6,98};
	    int search_num=56;
	    boolean flag=true;
	    
	    for (int s:a)
	    {
	    	if(search_num==s)
	    	{
	    		System.out.println("Number is found");
	    	    flag=true;
	    		break;
	    	}
            
	    	else 
	    	{
	    		flag=false;
	    	}
 	    }

	    if(flag==false)
	    {
	    	System.out.println("Element not found");
	    }
	}

}
