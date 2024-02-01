package Greedy;

import java.util.*;

class Job
{
	int id,deadline,profit;
	
	Job(int i,int d,int p)
	{
		id=i;
		deadline=d;
		profit=p;
	}
}


public class JobSequencing {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Job a[]=new Job[n];
		for(int i=0;i<n;i++)
		{
			a[i]=new Job(sc.nextInt(),sc.nextInt(),sc.nextInt());
		}
		sc.close();
		int d=0;
		
		for(int i=0;i<n;i++)
		{
			if(a[i].deadline>d)
				d=a[i].deadline;
		}
		
		int c=0,profit=0;
		
		Arrays.sort(a,new Comparator<Job>() {
			
			public int compare(Job o1,Job o2)
			{
				return o2.profit-o1.profit;
			}
		});
		
		
		int b[]=new int[d+1];
		for(int i=1;i<d+1;i++) 
			b[i]=-1;
		
		for(int i=0;i<n;i++)
		{
			for(int j=a[i].deadline;j>=1;j--)
			{
				if(b[j]==-1)
				{
					b[j]=a[i].id;
					c++;
					profit=profit+a[i].profit;
					break;
				}
			}
		}
		
		
		
		System.out.println(profit);
		System.out.println(c);
		
		
	}
	
	

}

