package String;

import java.util.*;

public class LongestPrefixSufficKMP {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int n=s.length();
		int a[]=new int[n];
		a[0]=0;
		int i=0,j=1;
		
		while(j<n)
		{
			if(s.charAt(i)==s.charAt(j))
			{
				a[j]=i+1;
				i++;
				j++;
			}
			else 
			{
				if(i!=0)
					i=a[i-1];
				else
				{
					a[j]=0;
					j++;
				}
					
			}
		}
		int res=a[n-1];
		System.out.println(res);
		sc.close();
		
		
		
	}

}
