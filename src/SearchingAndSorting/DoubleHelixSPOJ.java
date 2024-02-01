package SearchingAndSorting;

import java.util.*;

public class DoubleHelixSPOJ {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int m=sc.nextInt();
		int b[]=new int[m];
		for(int i=0;i<m;i++)
			b[i]=sc.nextInt();
		sc.close();
	
		
		int s1=0,s2=0,max=0;
		int i=0,j=0;
		while(i<n && j<m)
		{
			if(a[i]<b[j])
			{
				s1=s1+a[i];
				i++;
			}
			else if(b[j]<a[i])
			{
				s2=s2+b[j];
				j++;
			}
			else
			{
				max=max+Math.max(s1,s2);
				s1=0;
				s2=0;
				max=max+a[i];
				i++;
				j++;
			}
		}
		
		while(i<n)
		{
			s1=s1+a[i];
			i++;
		}
		while(j<m)
		{
			s2=s2+b[j];
			j++;
		}
		max=max+Math.max(s1,s2);
	System.out.println(max);	
	}
	
	
	

}
