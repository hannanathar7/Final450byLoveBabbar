package LinkedList;

import java.util.*;

public class FirstNonRepeatingCharacterInStream {

	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		sc.close();
		
		StringBuilder sb=new StringBuilder();
		int count[]=new int[26];
		ArrayList<Character> visit=new ArrayList<Character>();
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			
			if(!visit.contains(ch))
			visit.add(ch);
			
			count[ch-'a']++;
			
			int f=0;
			for(int j=0;j<visit.size();j++)
			{
				if(count[visit.get(j)-'a']==1)
				{
					sb.append(visit.get(j));
					f=1;
					break;
				}
				
			}
			if(f==0)
			{
				sb.append('#');
			}
			
		}
		

		System.out.println(sb.toString());
		
	}
	
	
	
	
	
}
