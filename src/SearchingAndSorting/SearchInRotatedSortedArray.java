package SearchingAndSorting;

import java.util.*;

public class SearchInRotatedSortedArray {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int k=sc.nextInt();
		sc.close();
		
		int low=0,high=n-1,res=-1;
		while(low<=high)
		{
			int mid=low+(high-low)/2;
			if(k==a[mid])
			{
				res=mid;
				break;
			}
			else if(a[low]<=a[mid])
			{
				if(k>=a[low] && k<a[mid])
					high=mid-1;
				else
					low=mid+1;
			}
				
			else if(a[mid]<=a[high])
			{
			if(k>a[mid] && k<=a[high])
				low=mid+1;
			else
				high=mid-1;
			}
		}
		System.out.println(res);
		
		
	}

}
