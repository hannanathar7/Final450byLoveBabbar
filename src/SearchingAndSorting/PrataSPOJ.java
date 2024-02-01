package SearchingAndSorting;

import java.util.*;

public class PrataSPOJ {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		
		sc.close();

		
		int low=0,high=Integer.MAX_VALUE,res=-1;
		while(low<=high)
		{
			int mid=low+(high-low)/2;
			if(canCookPrathas(a,n,m,mid))
			{
				res=mid;
				high=mid-1;
			}
				
			else
				low=mid+1;
		}
		
		System.out.println(res);
		
		
		
	}
	
	public static boolean canCookPrathas(int a[],int n,int m,int mid)
	{
		int p=0,time=0;
		for(int i=0;i<n;i++)
		{
			time=a[i];
			int j=2;
			while(time<=mid)
			{
				p++;
				time=time+a[i]*j;
				j++;
			}
			if(p>=m)
				return true;
		}
		return false;
}
}
