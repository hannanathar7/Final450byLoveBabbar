package StackAndQueue;

import java.util.*;

public class FirstNonRepeatingCharacterInStream {

	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		sc.close();
		
		StringBuilder sb=new StringBuilder();
		int count[]=new int[26];
		
		Queue<Character> q=new ArrayDeque<>();
		
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			count[ch-'a']++;
			q.add(ch);
			
			while(q.size()>0 && count[q.peek()-'a']!=1)
				q.remove();
			
			
			if(q.isEmpty())
				sb.append('#');
			else
				sb.append(q.peek());
			
			
			
		}
		

		System.out.println(sb.toString());
		
	}
	
	
	
	
	
}
