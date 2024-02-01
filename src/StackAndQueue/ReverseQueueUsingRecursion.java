package StackAndQueue;

import java.util.*;

public class ReverseQueueUsingRecursion {

	
	
	
	public static void reverse(Queue<Integer> q)
	{
		if(q.isEmpty())
		{
			return;
		}
		
		else
		{
			int a=q.remove();
			reverse(q);
			q.add(a);
		}
		
	}
	
	public static void main(String args[])
	{
		
	
		Queue<Integer> q=new LinkedList<>();
		
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		
		
		reverse(q);
		
		
		System.out.println(q);
		
		
		
	}
}
