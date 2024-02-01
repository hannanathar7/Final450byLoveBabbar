package StackAndQueue;

import java.util.*;

public class CircularTour {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int p[]=new int[n];
		for(int i=0;i<n;i++)
		{
			p[i]=sc.nextInt();
		}
		
		int d[]=new int[n];
		for(int i=0;i<n;i++)
		{
			d[i]=sc.nextInt();
		}
		sc.close();
		
		int start=0,extra=0,required=0;
		for(int i=0;i<n;i++)
		{
			extra+=p[i]-d[i];
			if(extra<0)
			{
				start=i+1;
				required=extra;
				extra=0;
			}
		}
		
		if(required+extra>=0)
			System.out.println(start);
		else
			System.out.println("-1");
		
	}
}
