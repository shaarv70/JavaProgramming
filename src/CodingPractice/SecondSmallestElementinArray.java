package CodingPractice;



public class SecondSmallestElementinArray {

	public static void main(String[] args) {
		
		int a[]= {5,2,3,6,1};
		
         int smallest=a[0];
       
         int secondsmallest=a[0];
         for (int i=0;i<a.length;i++)
         {
        	 if(a[i]<smallest)
        	 {
        		 smallest=a[i];
        	 }
         }
         System.out.println(smallest);
         for (int i=0;i<a.length;i++)
         {
        	 
        	 if(a[i]<secondsmallest && a[i]!=smallest )
        	 {   
        		 secondsmallest=a[i];
        	 }
         }	         
        		 System.out.println(secondsmallest);      //for third smallest we have to write again one more loop
        		 
	}}