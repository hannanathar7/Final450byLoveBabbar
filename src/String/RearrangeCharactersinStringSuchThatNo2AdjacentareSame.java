package String;

import java.util.*;

public class RearrangeCharactersinStringSuchThatNo2AdjacentareSame {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		sc.close();
		
		String s=sc.next();
		int l=s.length(),res;
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		for(int i=0;i<l;i++)
		{
			char ch1=s.charAt(i);
			if(map.containsKey(ch1))
				map.put(ch1,map.get(ch1)+1);
			else
				map.put(ch1,1);	
		}
		
		int max=Integer.MIN_VALUE;
		
		for(Character ch2:map.keySet())
		{
			int v=map.get(ch2);
			if(v>max)
			{
				max=v;
			
			}
		}
		
		int min=(l+1)/2;
		if(max>min)
			res=0;
		else 
			res=1;
			
		System.out.println(res);
		
	}
	
	

}
