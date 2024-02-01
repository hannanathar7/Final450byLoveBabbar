package StackAndQueue;

import java.util.*;

public class DuplicateBrackets {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		sc.close();
		
		boolean b=false;
		Stack<Character> st=new Stack<>();
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch==')')
			{
				char top=st.peek();
				if(top=='(')
				{
					b=true;
					break;
				}
				else
				{
					while(st.peek()!='(')
					{
						st.pop();
					}
					
					st.pop();
				}
			}
			else
			{
				st.push(ch);
			}
		}
		System.out.println(b);
		
		
	}
}
