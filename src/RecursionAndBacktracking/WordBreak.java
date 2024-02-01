package RecursionAndBacktracking;

import java.util.*;

public class WordBreak {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<String> dict=new ArrayList<String>();
		for(int i=0;i<n;i++)
		dict.add(sc.next());
		String s=sc.next();
		sc.close();
		ArrayList<String> list=new ArrayList<String>();
		String ans="";
		solve(dict,s,list,ans);
		System.out.println(list);
		
	}
	
	public static void solve(ArrayList<String> dict,String s,ArrayList<String> list,String ans) {
		
		if(s.length()==0)
		{
			list.add(ans.trim());
			return;
		}
		
		for(int i=0;i<s.length();i++)
		{
			String left=s.substring(0,i+1);
			if(dict.contains(left))
			{
				String right=s.substring(i+1);
				solve(dict,right,list,ans+left+" ");
			}
		}
		
	}
	
}
