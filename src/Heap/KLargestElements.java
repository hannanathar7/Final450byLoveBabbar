package Heap;

import java.util.*;

public class KLargestElements {
	
	public static void main(String args[])
	{
		
	}
	
	public static void maximum(int a[],int k,int n)
	{
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		
		for(int i=0;i<n;i++)
		{
			if(i<k)
				pq.add(a[i]);
			else
			{
				if(a[i]>pq.peek())
				{
					pq.remove();
					pq.add(a[i]);
				}
			}
			
		}
		
		int res[]=new int[k];
		int i=0;
		while(pq.size()>0)
		{
			res[i]=pq.remove();
			i++;
		}
		
	
	}

}
