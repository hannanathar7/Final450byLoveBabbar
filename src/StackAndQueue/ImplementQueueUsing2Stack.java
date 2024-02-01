package StackAndQueue;

import java.util.*;

public class ImplementQueueUsing2Stack {

	 Stack<Integer> input = new Stack<Integer>();
	    Stack<Integer> output = new Stack<Integer>();
	
	void push(int val)
	{
	input.push(val);	
		
	}
	
	
	int pop()
	{
		if(input.isEmpty() && output.isEmpty())
		   {
		       return -1;
		   }
		
		if(output.isEmpty())
		{
		while(!input.isEmpty())
		{
			output.push(input.pop());
			
		}
		}
		return output.pop();
	}
	
	 int top() 
	 {
		 if(output.isEmpty())
			{
			while(input.size()>0)
			{
				output.push(input.pop());
				
			}
			}
			return output.peek();
	 }

	  
	
	
	
	public static void main(String args[])
	{
		
	}
}
