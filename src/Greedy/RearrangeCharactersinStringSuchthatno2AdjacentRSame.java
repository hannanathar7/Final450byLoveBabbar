package Greedy;

import java.util.*;


public class RearrangeCharactersinStringSuchthatno2AdjacentRSame {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		sc.close();
		
	int f[]=new int[26];
		
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			f[ch-'a']++;
		}
			
		PriorityQueue<pair> pq=new PriorityQueue<pair>((a,b)->(b.freq-a.freq));
		
		
		
		for(int i=0;i<26;i++)
		{
			if(f[i]>(s.length()+1)/2)
			{
			  System.out.println("-1");
				return;
			}
			
			if(f[i]>0)
			pq.add(new pair((char)('a'+i),f[i]));
		}
		
		
		StringBuilder sb=new StringBuilder();
		pair p=pq.remove();
		sb.append(p.ch);
		p.freq--;
		while(pq.size()>0)
		{
			pair t=pq.remove();
			sb.append(t.ch);
			t.freq--;
			if(p.freq>0)
			{
				pq.add(p);
			}
			p=t;
		}
		
		System.out.println(sb.toString());

				
				
				
		
		
		
		
	}
	
	

}


class pair
{
	char ch;
	int freq;
	
	pair(char c,int f)
	{
		ch=c;
		freq=f;
	
	}
}



