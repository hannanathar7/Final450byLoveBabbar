package SearchingAndSorting;

import java.util.*;

public class FirstandLastPositionsofElementinSortedArray {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int k=sc.nextInt();
		sc.close();
		
		int lowidx=-1,highidx=-1;
		int res[]=new int[2];
		int low=0,high=n-1;
		while(low<=high)
		{
			int mid=low+(high-low)/2;
			if(k>a[mid])
				low=mid+1;
			else if(k<a[mid])
				high=mid-1;
			else
			{
				highidx=mid;
				low=mid+1;
			}
		}
		low=0;
		high=n-1;
		while(low<=high)
		{
			int mid=low+(high-low)/2;
			if(k>a[mid])
				low=mid+1;
			else if(k<a[mid])
				high=mid-1;
			else
			{
				lowidx=mid;
				high=mid-1;
			}
		}
		res[0]=lowidx;
		res[1]=highidx;
		
		for(int i=0;i<2;i++)
			System.out.print(a[i]+" ");
		
		
	}

}
