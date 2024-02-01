package String;

import java.util.*;

public class NumberofCustomersWhoCouldNotgetaComputer {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		String s=sc.nextLine();
		sc.close();
		
		int l=s.length();
		
		int a[]=new int[26];
		int c=0,res=0;
		
		for(int i=0;i<l;i++)
		{
		int v=s.charAt(i)-'A';
		
			if(a[v]==0)
			{
				if(c<n)
				{
					c++;
					a[v]=2;
				}
				else
				{
					a[v]=1;
					res++;
				}
			}
			else if(a[v]==2)
			{
				a[v]=0;
				c--;
			}
			
		}
		
		System.out.println(res);
		
		
		
	}
	
	

}
