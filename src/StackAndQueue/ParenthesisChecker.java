package StackAndQueue;

import java.util.*;

public class ParenthesisChecker {

	
	
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		sc.close();
		
		if(s.length()%2==1)
		{
			System.out.println(false);
			return;
		}
	       

	        Stack<Character> st=new Stack<Character>();
	        for(int i=0;i<s.length();i++)
	        {
	            char ch=s.charAt(i);

	            if(ch=='(' || ch=='{' || ch=='[')
	            st.push(ch);

	            else 
	            {
	                 

	                if(st.size()==0)
	                {
	        			System.out.println(false);
	        			return;
	        		}

	                char ch1=st.pop();

	                if(( ch==')' && ch1=='(') || ( ch=='}' && ch1=='{') || ( ch==']' && ch1=='['))
	                continue;

	                else
	                {
	        			System.out.println(false);
	        			return;
	        		}
	               

	               
	            }

	        }

	        if(st.size()>0)
	        {
				System.out.println(false);
				return;
			}

	        else
	        {
				System.out.println(true);
				return;
			}
	      
	        
	    }
		
		
	
}
