package StackAndQueue;

import java.util.*;

public class ReverseString {

	
	
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		sc.close();
		
		
		Stack<Character> st=new Stack<Character>();
		
		String res="";
		
		for(int i=0;i<s.length();i++)
		{
			st.push(s.charAt(i));
		}
		
		for(int i=0;i<s.length();i++)
		{
			res=res+st.pop();
		}
		
		
		System.out.println(res);
		
		
	}
}
