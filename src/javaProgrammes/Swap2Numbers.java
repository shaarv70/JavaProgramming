package javaProgrammes;

public class Swap2Numbers {

	public static void main(String[] args) 
	{
	     int a= 30;
	     int b = 40;
	     
	     //First logic (Without third variable)
	     
	   /*  System.out.println("a:"+a+"\n"+"b:"+b);
	     a=a+b;
	     b= a-b;
	     a= a-b;
	     System.out.println("a:"+a+"\n"+"b:"+b);*/
	     
	     //Second Logic (Without third variable)(values must not be zero)
	     
	     System.out.println("a:"+a+"\n"+"b:"+b);
	     a= a*b;
	     b=a/b;
	     a=a/b;
	     System.out.println("a:"+a+"\n"+"b:"+b);
	     
	     //Third Logic - single statement
	     
	     b=a+b-(a=b);
	     
	     
	     
	     

	}

}
