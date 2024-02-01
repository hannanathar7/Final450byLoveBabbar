package String;

import java.util.*;

public class AllPermutationsofString {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		sc.close();
		
		int l=s.length();
		int f=fact(l);
		ArrayList<String> list=new ArrayList<String>();
		for(int i=0;i<f;i++)
		{
			int t=i;
			String s1="";
			StringBuilder sb=new StringBuilder(s);
			for(int j=l;j>=1;j--)
			{
				int r=t%j;
				s1=s1+sb.charAt(r);
				sb.deleteCharAt(r);
				t=t/j;
			}
			list.add(s1);
		}
		
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i));
	}
	
	public static int fact(int n)
	{
		int f=1;
		for(int i=n;i>=1;i--)
		{
			f=f*i;
		}
		return f;
	}
	
	

}
