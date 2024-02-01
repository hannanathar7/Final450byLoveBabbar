package SearchingAndSorting;

import java.util.*;

public class BishuAndSoldiers {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		Arrays.sort(a);
		int q=sc.nextInt();
		for(int i=1;i<=q;i++)
		{
			int q1=sc.nextInt();
			int res[]=new int[2];
			int sum=0;
			int idx=binarySearch(a,0,n-1,q1);
			
			res[0]=idx;	
			
			for(int j=0;j<idx;j++)
				sum=sum+a[j];
			
			res[1]=sum;
			
			for(int j=0;j<2;j++)
				System.out.print(res[j]+" ");
			System.out.println();
		}
		sc.close();

		
	}
	
	public static int binarySearch(int a[],int low,int high,int k)
	{
		
		while(low<=high)
		{
			int mid=low+(high-low)/2;
			if(k<a[mid])
			{
				 high=mid-1;
			}
			else if(k>a[mid])
			{
				low=mid+1;
			}
			else
			{
				low=mid+1;
			}
				
		}
		return low;
	}
	
	
	

}
