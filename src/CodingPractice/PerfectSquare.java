package CodingPractice;

public class PerfectSquare {

	public static void main(String[] args) {
		
		//Numbers 4,16,36,25,144,81,

		//for example we want to checkl whether the number ois perfect square or not 
    
		 int a=784;
		 int square=0;
		 int flag=0;
	      for (int i=1;i<a/2;i++)
	      {
	    	  square=i*i;
	    	  if(square==a)
	    	  {
	    		  System.out.println("Number is perfect square of: "+i);
	    		  flag=1;
	    		  break;
	    	  }
	    	
	      
	    }
	      
	      if(flag==0)
	      {
	    	  System.out.println("Number is not perfect sqaure ");
	      }
	      
	

}}
