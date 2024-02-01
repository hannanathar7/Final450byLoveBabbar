package Greedy;

import java.util.*;



public class MaximumProductSubSet {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		
		int n=sc.nextInt();
	
		int a[]=new int[n];
		
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		
		
		
		
		sc.close();
		
		if(n==1)
		{
			System.out.println(a[0]);
			return;
		}
	      
	      int neg=0,prod=1,zer=0,maxNeg=Integer.MIN_VALUE;
	      
	      for(int i=0;i<n;i++)
	      {
	    	  if(a[i]==0)
	    	  {
	    		  zer++;
	    		  continue;
	    	  }
	    		 
	    	  
	    	  if(a[i]<0)
	    	  {
	    		  neg++;
	    		  maxNeg=Math.max(maxNeg,a[i]);
	    	  }
	    	  
	    	  prod=prod*a[i];
	      }
	      
	      if(zer==n)
	      {
	    	  System.out.println("0");
	    	  return;
	    	 
	      }
	      
	      
	    if(neg%2==1)
	    {
	    	
	    	if(neg==1 && zer+neg==n && zer>0)
	    	{
	    		System.out.println("0");
				return;
	    	}
	    	
	    	prod=prod/maxNeg;
	    	  
	    		  
	      }
	    	 
	    System.out.println(prod);
	      
	      
	      
	      
	      
	     
	}
	
	

}

