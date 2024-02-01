package Heap;

import java.util.*;

public class MinimumCostOfRopes {
	
	public static void main(String args[])
	{
		
	}
	
	long minCost(long a[], int n) 
    {
       PriorityQueue<Long> pq=new PriorityQueue<>();
       for(int i=0;i<n;i++)
    	   pq.add(a[i]);
       long res=0;
       while(pq.size()>1)
       {
    	   long first=pq.remove();
    	   long second=pq.remove();
    	   long sum=first+second;
    	   res=res+sum;
    	   pq.add(sum);
       }
       return res;
       
    }

}
