package StackAndQueue;

import java.util.*;

public class MinimumStack {

	static int min=Integer.MAX_VALUE;
	
	
	
	public boolean isFull(Stack<Integer>s, int n)
    {
       if(s.size()==n)
    	   return true;
       
       return false;
    	}

public boolean isEmpty(Stack<Integer>s)
    {
       if(s.isEmpty())
       return true;
       
       return false;
    }
	
	public void push(int a,Stack<Integer> s)
	{
		if(s.isEmpty())
		{
			min=a;
			s.push(a);
			
		}
		else
		{
			int x=a;
			if(a<min)
			{	
				x=2*a-min;
				min=a;
			}
			s.push(x);
		}
	
	}
	
	public int pop(Stack<Integer> s)
        {
        	int a=s.peek();
        	
        	if(a<min)
        	{
        		min=2*min-a;
        	}
        	
        	return a;
        }
	
	
	public int min(Stack<Integer> s)
        {
           return min;
        }
	
	
}
