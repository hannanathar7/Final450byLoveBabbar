package SearchingAndSorting;

import java.util.*;

public class EKOSPOJ {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long m=sc.nextLong();
		long a[]=new long[n];
		long max=Long.MIN_VALUE;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextLong();
			if(a[i]>max)
				max=a[i];
		}
		sc.close();
	
		
		long low=0,high=max,res=-1;
		while(low<=high)
		{
			long mid=low+(high-low)/2;
			long s=cutTrees(a,n,mid);
			if(s<m)
			{
				high=mid-1;	
			}
			else if(s>=m)
			{
				res=mid;
				low=mid+1;		
			
			}
		}
		
		System.out.println(res);
	}
	
	public static long cutTrees(long a[],int n,long mid)
	{
		long sum=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]>mid)
			{
				sum=sum+a[i]-mid;
			}
		}
		return sum;
	}
	
	
	

}
