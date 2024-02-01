package StackAndQueue;

import java.util.*;

public class EvaluationPostfixExpression {

	
	
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		sc.close();
		
		Stack<Integer> st=new Stack<Integer>();
		
		
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			
			if(Character.isDigit(ch))
			{
				st.push(Character.getNumericValue(ch));
			}
			
			else
			{
				int a=st.pop();
				int b=st.pop();
				
				switch(ch)
				{
				
				case '+':
					st.push(a+b);
					break;
					
				case '-':
					st.push(b-a);
					break;
					
				case '*':
					st.push(a*b);
					break;
					
				case '/':
					st.push(b/a);
					break;
				}
			}
			
			
			
		}
		
		
		int res=st.peek();
		System.out.println(res);
		
		
	}
}
