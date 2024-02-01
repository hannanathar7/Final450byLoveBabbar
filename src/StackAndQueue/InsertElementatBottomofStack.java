package StackAndQueue;

import java.util.*;

public class InsertElementatBottomofStack {

	
	
	public static void insertatBottom(int x, Stack<Integer> st)
	{
		if(st.isEmpty())
		{
			st.push(x);
			return;
		}
		
		else
		{
			int a=st.pop();
			insertatBottom(x,st);
			st.push(a);
		}
		
	}
	
	
	
	public static void main(String args[])
	{
		
	
		Stack<Integer> st=new Stack<>();
		
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		
		insertatBottom(5,st);
		
		System.out.println(st);
		
		
		
	}
}
