package StackAndQueue;

import java.util.*;

public class InterleaveFirstHalfofQueuewithSecondHalf {
	
	public static void interleave(Queue<Integer> q)
	{
		Stack<Integer> s=new Stack<>();
		
		int k=q.size()/2;
		
		for(int i=1;i<=k;i++)
			s.push(q.remove());
		
		while(s.size()>0)
		{
			q.add(s.pop());
		}
		
		for(int i=1;i<=k;i++)
			q.add(q.remove());
		
		for(int i=1;i<=k;i++)
			s.push(q.remove());
		
		while(s.size()>0)
		{
			q.add(s.pop());
			q.add(q.remove());
		}
	}
	
	
	public static void main(String args[])
	{
		
		Queue<Integer> q=new LinkedList<>();
		q.add(11);
	    q.add(12);
	    q.add(13);
	    q.add(14);
	    q.add(15);
	    q.add(16);
	    q.add(17);
	    q.add(18);
	    q.add(19);
	    q.add(20);
	    
	    interleave(q);
	    
	   
		System.out.println(q);
		
	}

}
