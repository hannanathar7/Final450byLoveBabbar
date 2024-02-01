package StackAndQueue;

import java.util.*;

public class LongestValidParentheses {

	
	
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		sc.close();
		
		
		Stack<Integer> st=new Stack<>();
		st.push(-1);
		int max=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch=='(')
				st.push(i);
			else
			{
				st.pop();
				if(st.isEmpty())
					st.push(i);
				else
					max=Math.max(max,i-st.peek());
			}
		}
		System.out.println(max);
		
		
	}
}
