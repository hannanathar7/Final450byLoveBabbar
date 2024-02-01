package SearchingAndSorting;

import java.util.*;

public class PaintersPartitionProblem {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int m=sc.nextInt();
		sc.close();
	
		
		int sum=0;
		for(int i=0;i<n;i++)
			sum=sum+a[i];
		
		int low=a[0],high=sum,res=-1;
		while(low<=high)
		{
			int mid=low+(high-low)/2;
			if(canPaint(a,n,m,mid))
			{
				res=mid;
				high=mid-1;
			}
				
			else
				low=mid+1;
		}
		
		System.out.println(res);
		
		
		
	}
	
	public static boolean canPaint(int a[],int n,int m,int mid)
	{
		int s=1,sum=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]>mid)
			{
				return false;
			}
			sum=sum+a[i];
			if(sum>mid)
			{
				s++;
				if(s>m)
					return false;
				sum=a[i];
			}
		}
		return true;
	}
	
	
	

}
