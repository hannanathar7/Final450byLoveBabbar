package Heap;

import java.util.*;

public class SlidingWindowMaximum {
	
	public static void main(String args[])
	{
		
	}
	
	public static void maximum(int a[],int k,int n,ArrayList<Integer> list)
	{
		Deque<Integer> dq=new ArrayDeque<Integer>();
		
		for(int i=0;i<n;i++)
		{
			if(dq.size()>0 && dq.peek()==i-k)
				dq.poll();
			
			while(dq.size()>0 && a[i]>a[dq.peekLast()])
				dq.pollLast();
			
			dq.offer(i);
			if(i>=k-1)
				list.add(a[dq.peek()]);
			
		}
		
	
	}

}
