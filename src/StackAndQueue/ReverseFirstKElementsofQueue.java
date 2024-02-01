package StackAndQueue;

import java.util.*;

public class ReverseFirstKElementsofQueue {

	
	
	
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
	
	public static void reverse2(Queue<Integer> q,int k)
	{
		if(q.isEmpty() || k==0)
		{
			return;
		}
		
		else
		{
			int a=q.remove();
			reverse2(q,k-1);
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
		q.add(5);
		
		int k=3;
		
		reverse(q);
		reverse2(q,q.size()-k);
		
		
		System.out.println(q);
		
		
		
	}
}
