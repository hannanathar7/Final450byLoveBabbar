
package String;

import java.util.*;

public class SmallestWindowthatContainsallCharactersofString {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		sc.close();
		
		int l=s.length();
		Set<Character> set=new HashSet<Character>();
		
		for(int i=0;i<l;i++)
		{
			set.add(s.charAt(i));
		}
		
		int distinct=set.size();
		
		int start=0,c=0,min=Integer.MAX_VALUE,startidx=-1;
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		
		for(int i=0;i<l;i++)
		{
			char ch=s.charAt(i);
			if(map.containsKey(ch) && map.get(ch)==0)
			{
				map.put(ch,map.get(ch)+1);
				c++;
			}
			else if(map.containsKey(ch))
				map.put(ch,map.get(ch)+1);
			else
			{
				c++;
				map.put(ch,1);
			}
			
			while(c>=distinct)
				{
					if(i-start+1<min)
					{
						min=i-start+1;
						startidx=start;
					}
					if(map.get(s.charAt(start))==1)
						c--;
					map.put(s.charAt(start),map.get(s.charAt(start))-1);
					start++;
				}
		}
		
		String ans = s.substring(startidx,startidx+min);
		System.out.println(ans);
	}
	
	

}
