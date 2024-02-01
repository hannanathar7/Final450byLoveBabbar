package StackAndQueue;

import java.util.*;

public class ImplementStackUsing2Queue {

	Queue<Integer> q1=new LinkedList<>();
	Queue<Integer> q2=new LinkedList<>();
	
	void push(int val)
	{
		q2.add(val);
		while(!q1.isEmpty())
			q2.add(q1.remove());
		Queue<Integer> q3=q1;
		q1=q2;
		q2=q3;
		
	}
	
	int pop()
	{
		return q1.remove();
	}
	
	 int top() 
	 {
       return q1.peek();
	 }

	  boolean isEmpty()
	  {
	     return q1.isEmpty();
	  }
	
	
	
	public static void main(String args[])
	{
		
	}
}
