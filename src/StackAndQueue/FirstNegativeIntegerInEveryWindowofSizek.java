package StackAndQueue;

import java.util.*;

public class FirstNegativeIntegerInEveryWindowofSizek {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);																															
		int n=sc.nextInt();
		long a[]=new long[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextLong();
		}
		int k=sc.nextInt();
		sc.close();
		
		Queue<Long> q=new ArrayDeque<>();
		ArrayList<Long> list=new ArrayList<>();
		
		
		for(int i=0;i<k-1;i++)
		{
			if(a[i]<0)
				q.add(a[i]);
		}
		
		for(int i=k-1;i<n;i++)
		{
			if(a[i]<0)
				q.add(a[i]);
			
			if(q.isEmpty())
			{
				list.add((long) 0);
			}
			else
			{
				list.add(q.peek());
				
				if(a[i+1-k]==q.peek())
					q.remove();
				
			}	
			
		}
		
		System.out.println(list);
		
	}
}
