package StackAndQueue;

import java.util.*;

public class ReverseStackUsingRecursion {

	
	
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
	
	public static void solve(Stack<Integer> st)
	{
		if(st.isEmpty())
		{
			return;
		}
		
		else
		{
			int a=st.pop();
			solve(st);
			insertatBottom(a,st);
		}
		
	}
	
	public static void main(String args[])
	{
		
	
		Stack<Integer> st=new Stack<>();
		
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		
		solve(st);
		
		
		System.out.println(st);
		
		
		
	}
}
