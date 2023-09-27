package arrayprogrammes;

public class MissingNumberinArray {

	public static void main(String[] args)
	
	//prerequisite : Array should not have duplicates,array no need to be in sorted order,values should be in range 
	{
	     int a[]= {1,2,4,5};
	     int sum1=0;
	     int sum2=0;
	     for(int c:a)
	     {
	    	 sum1=sum1+c;
	     }
	     for (int i=1;i<=5;i++)
	     {
	    	 sum2=sum2+i;
	    	 
	     }
      System.out.println("Missing number"+(sum2-sum1));
	}

}
