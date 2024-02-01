 package Graph;

import java.util.*;

public class WordLadder {
	
	

public int ladderLength(String beg, String end, List<String> list) {
        
	Set<String> set=new HashSet<>();
	
	for(int i=0;i<list.size();i++)
	{
		set.add(list.get(i));
	}
	
	if(!list.contains(end))
		return 0;
	
    
	
	Queue<String> q=new ArrayDeque<String>();
	
	
	q.add(beg);
	
	int res=0;
	
	
	while(q.size()>0)
	{
		res++;
		int l=q.size();
		for(int k=0;k<l;k++)
		{
			char ch[]=q.remove().toCharArray();
			for(int i=0;i<ch.length;i++)
			{
				char orig=ch[i];
				for(char ch1='a';ch1<='z';ch1++)
				{
					ch[i]=ch1;
					if(new String(ch).equals(end))
						return res+1;
					if(set.contains(new String(ch)))
					{
						q.add(new String(ch));
						set.remove(new String(ch));
					}
					
				}
				ch[i]=orig;
				
			}
			
		}
	}
	
	return res;
	
}
}
	 

	
	

