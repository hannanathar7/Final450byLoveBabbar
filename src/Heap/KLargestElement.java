package Heap;

import java.util.*;

public class KLargestElement {
	
	public static void main(String args[])
	{
		
	}
	
	public static void maximum(int a[],int k)
	{
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		int n=a.length;
		for(int i=0;i<k;i++)
	        pq.add(a[i]);

	        for(int i=k;i<n;i++)
	        {
	            if(a[i]>pq.peek())
	            {
	                pq.remove();
	                pq.add(a[i]);
	            }
	        }

	        
		
		System.out.println(pq.peek());
	
	}

}
