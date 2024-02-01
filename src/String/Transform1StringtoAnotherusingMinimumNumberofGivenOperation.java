package String;

import java.util.*;

public class Transform1StringtoAnotherusingMinimumNumberofGivenOperation {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		
		sc.close();
		int flag=0;
		
		int l1=s1.length();
		int l2=s2.length();
		
		int c1[]=new int[26];
		int c2[]=new int[26];
		
		if(l1!=l2)
		{
			System.out.println("NO");
			return;
		}
		
		for(int i=0;i<l1;i++)
		{
			c1[s1.charAt(i)-'A']++;
		}
		
		for(int i=0;i<l1;i++)
		{
			c2[s2.charAt(i)-'A']++;
		}
		
		for(int i=0;i<26;i++)
		{
			if(c1[i]!=c2[i])
			{
				flag=1;
				break;
			}
		}
		
		if(flag==1)
		{
			System.out.println("NO");
			return;
		}
		
		int i=l1-1,j=l1-1,res=0;
		
		while(i>=0)
		{
			if(s1.charAt(i)==s2.charAt(j))
			{
				i--;
				j--;
			}
			else
			{
				res++;
				i--;
			}
		}
		System.out.println(res);
		
		
		
		
	}

}
