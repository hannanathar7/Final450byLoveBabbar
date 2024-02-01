package SearchingAndSorting;

import java.util.*;

public class FindPivotMinElementinSortedRotatedArray {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		
		sc.close();
		
		
		
		int low=0,high=n-1,res=-1;
		
		if(a[low]<=a[high])
		{
			System.out.println(low);
			return;
			
		}
		
		while(low<=high)
		{
			int mid=low+(high-low)/2;
			if(a[mid]>a[mid+1])
			{
				res=mid+1;
				break;
			}
			if(a[mid]<a[mid-1])
			{
				res=mid;
				break;
			}
			
			if(a[mid]<a[high])
				high=mid-1;
			else
				low=mid+1;
		}
		
		System.out.println(res);
		
		
	}

}
