package CodingPractice;

import java.util.Arrays;

public class MergeElementinArray {

	public static void main(String[] args) {
		
		int nums1[]= {1,2,3,};
		int m=nums1.length;
		
		int nums2[]= {2,5,6};
		int n=nums2.length;
		
		int[] merge=new int[m+n];
	      
	      int temp=0;
	        for (int i=0;i<m;i++)
	        {
	              
	               merge[i]=nums1[i];
	                
	        }
	      
	       for (int j=0;j<n;j++)
	      {
	              
	               merge[m+j]=nums2[j];
	               
	        }
	      
	       for (int l=0;l<merge.length;l++)
	        {
	          for (int o=l+1;o<merge.length;o++)
	          {
	              if (merge[l]>merge[o])
	           {
	                  temp=merge[l];
	                  merge[l]=merge[o];
	                  merge[o]=temp;

	           }
	          }
	           
	       
	       
	       
	        }

System.out.println(Arrays.toString(merge));
	}

}
