package StackAndQueue;

import java.util.*;

public class SortStackUsingRecursion {

	
	
	public static void insertatCorrectPosition(int x, Stack<Integer> st)
	{
		if(st.isEmpty() || st.peek()<x)
		{
			st.push(x);
		}
		
		else
		{
			int a=st.pop();
			insertatCorrectPosition(x,st);
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
			insertatCorrectPosition(a,st);
		}
		
	}
	
	public static void main(String args[])
	{
		
	
		Stack<Integer> st=new Stack<>();
		
		st.push(11);
		st.push(2);
		st.push(35);
		st.push(-1);
		
		
		solve(st);
		
		
		System.out.println(st);
		
		
		
	}
}
