package String;

import java.util.*;

public class SecondMostRepeatedWordinString {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		String s[]=new String[n];
		for(int i=0;i<n;i++)
			s[i]=sc.next();
		sc.close();
		
		String ans="";
		
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		for(int i=0;i<n;i++)
		{
			if(map.containsKey(s[i]))
				map.put(s[i],map.get(s[i])+1);
			else
				map.put(s[i],1);
		}
		
		int max1=Integer.MIN_VALUE,max2=Integer.MIN_VALUE;
		
		for(String s1:map.keySet())
		{
			int v=map.get(s1);
			if(v>max1)
				max1=v;
		}
		
		for(String s1:map.keySet())
		{
			int v=map.get(s1);
			if(v>max2 && v<max1)
				max2=v;
		}
		
		for(String s1:map.keySet())
		{
			int v=map.get(s1);
			if(v==max2)
			{
				ans=s1;
			}
		}
		
		System.out.println(ans);
		
		
	}

}
