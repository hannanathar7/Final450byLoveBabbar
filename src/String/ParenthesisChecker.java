package String;

import java.util.*;

public class ParenthesisChecker {

	
	
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		sc.close();
		
		boolean b=true;
		Stack<Character> st=new Stack<Character>();
		
		if(s.length()%2==1)
		{
			System.out.println("false");
			return;
		}
		
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch=='{' || ch=='(' || ch=='[')
			{
				st.push(ch);
			}
			
			else if(st.isEmpty())
			{
				 b=false;
				 return;
			}
			
			else
			{
				char ch1=st.pop();
				switch(ch)
				{
				case ')':
					
					if(ch1!='(')
					{
						 b=false;
					 	return;
					}
					break;
					
				case '}':
					
					if(ch1!='{')
					{
						 b=false;
					 	return;
					}
						
					break;
					
				case ']':
					
					if(ch1!='[')
					{
						 b=false;
					 	return;
					}
						
					break;
					
				}
			}
		}
        if(st.isEmpty())
            b=true;
        else
        	b=false;
        
        System.out.println(b);
		
		
	}
}
