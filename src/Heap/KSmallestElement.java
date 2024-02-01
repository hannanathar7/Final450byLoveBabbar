package Heap;

import java.util.*;

public class KSmallestElement {
	
	public static void main(String args[])
	{
		
	}
	
	public static void minimum(int a[],int k,int n)
	{
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>(Collections.reverseOrder());
		
		for(int i=0;i<n;i++)
		{
			if(i<k)
				pq.add(a[i]);
			else
			{
				if(a[i]<pq.peek())
				{
					pq.remove();
					pq.add(a[i]);
				}
			}
			
		}
		
		System.out.println(pq.peek());
	
	}

}
