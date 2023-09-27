package arrayprogrammes;

public class PrintEvenandOddFromArray {

	public static void main(String[] args) 
	{
		 int []a= {100,200,300,500,6,7};
		 
		 for (int c:a)  //for printing even numbers
		 {
             if(c%2==0)
             {
            	 System.out.println("Even  numebr:"+ "\t" + c);
             }
		 }
			 

	}

}
