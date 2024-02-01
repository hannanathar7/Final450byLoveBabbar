package String;

import java.util.*;

public class PrintAllAnagramsTogether {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s[]=new String[n];
		for(int i=0;i<n;i++)
			s[i]=sc.next();
	
		sc.close();
		ArrayList<List<String>> list=new ArrayList <List<String>>();
		
		HashMap<String,List<String>> map=new HashMap<String,List<String>>();
		
		for(int i=0;i<n;i++)
		{
			
			char ch[]=s[i].toCharArray();
			Arrays.sort(ch);
			String s1=new String(ch);
			if(map.containsKey(s1))
			{
				map.get(s1).add(s[i]);
			}
			else
			{
				List<String> list1=new ArrayList<String>();
				list1.add(s[i]);
				map.put(s1,list1);
			}
		}
		
		
		for(String s1:map.keySet())
		{
			List<String> list2=map.get(s1);
			list.add(list2);
		}
		
		System.out.println(list);
		
	}
	
	

}
