package StackAndQueue;

import java.util.*;

public class StackPermutation {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int push[]=new int[n];
		for(int i=0;i<n;i++)
		{
			push[i]=sc.nextInt();
		}
		
		int pop[]=new int[n];
		for(int i=0;i<n;i++)
		{
			pop[i]=sc.nextInt();
		}
		sc.close();
		
		Stack<Integer> st=new Stack<Integer>();
		int j=0;
		for(int e:push)
		{
			st.push(e);
			while(!st.isEmpty() && st.peek()==pop[j])
			{
				st.pop();
				j++;
			}
		}
		if(j==n-1)
		System.out.println("true");
		else
		System.out.println("false");
		
		
		
	}
}
