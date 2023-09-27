package CodingPractice;

public class BuyAndSellStock {

	
	public static void main(String Args[]) {
		

   int a[]= {7,2,4,5,1,3,6,4};
   
   int maxProfit=0;
   int currentProfit=0;
   int buyPrice=a[0];
   int currentPrice=a[0];   

   for (int i=0;i<a.length;i++)
   {
	   //7,2
       
	for (int j=i+1;j<a.length;j++){
		  
		if(a[i]>a[j]){
	
          buyPrice=a[j]; 
          currentProfit=0;//0
          break;
       }
        
		else{
			currentProfit=a[j]-a[i];  
			buyPrice=a[i];//0,2
		}
		
		
		if(currentProfit>maxProfit)
		  {
			  maxProfit=currentProfit;   //0
		  }
	}
        
	if(currentPrice>buyPrice)
	{
		currentPrice=buyPrice;
		
	}

   
   
   }
   
   System.out.println(maxProfit);
   System.out.println(currentPrice);  


}}
