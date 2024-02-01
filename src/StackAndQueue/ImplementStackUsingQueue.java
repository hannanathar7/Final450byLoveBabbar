package StackAndQueue;

import java.util.*;

public class ImplementStackUsingQueue {

	Queue<Integer> queue=new LinkedList<>();
	
	
	void push(int val)
	{
		queue.add(val);
		for(int i=1;i<queue.size();i++)
		{
			int x=queue.remove();
			queue.add(x);
		}
	}
	
	int pop()
	{
		return queue.remove();
	}
	
	 int top() 
	 {
       return queue.peek();
	 }

	  boolean isEmpty()
	  {
	     return queue.isEmpty();
	  }
	
	
	
	public static void main(String args[])
	{
		
	}
}
