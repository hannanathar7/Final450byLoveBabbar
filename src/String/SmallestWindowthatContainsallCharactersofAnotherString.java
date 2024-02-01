package String;

import java.util.*;

public class SmallestWindowthatContainsallCharactersofAnotherString {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		sc.close();
		
		int l1=s1.length();
		int l2=s2.length();
		HashMap<Character,Integer> map2=new HashMap<Character,Integer>();
		
		for(int i=0;i<l2;i++)
		{
			if(map2.containsKey(s2.charAt(i)))
				map2.put(s2.charAt(i),map2.get(s2.charAt(i))+1);
				
			else
				map2.put(s2.charAt(i),1);
		}
		
		
		int start=0,c=0,min=Integer.MAX_VALUE,startidx=-1;
		
		HashMap<Character,Integer> map1=new HashMap<Character,Integer>();
		
		for(int i=0;i<l1;i++)
		{
		
			char ch=s1.charAt(i);
			if(map1.containsKey(ch))
			map1.put(ch,map1.get(ch)+1);
			else
			map1.put(ch,1);
			
			
			if(map2.containsKey(ch))
			{
				if(map1.get(ch)<=map2.get(ch))
				c++;
			}
			
			
			
			
			while(c>=l2)
				{
					if(i-start+1<min)
					{
						min=i-start+1;
						startidx=start;
					}
					if(map2.containsKey(s1.charAt(start)))
					{
					if(map1.get(s1.charAt(start)) == map2.get(s1.charAt(start)))
						c--;
					}
					map1.put(s1.charAt(start),map1.get(s1.charAt(start))-1);
					start++;
				}
		}
		String ans="-1";
		
		if(startidx!=-1)
			ans=s1.substring(startidx,startidx+min);
		 
		System.out.println(ans);
	}
	
	

}
