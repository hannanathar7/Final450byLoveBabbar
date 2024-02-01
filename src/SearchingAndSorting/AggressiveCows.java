package SearchingAndSorting;

import java.util.*;

public class AggressiveCows {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int cows=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		sc.close();
		 Arrays.sort(a);
		   
		 
		   int low=1,high=a[n-1]-a[0];


		   while(low<=high)
		   {
			   int mid=(low+high)/2;

			   int count=placeCows(a,cows,mid);

			   if(count>=cows)
			   low=mid+1;

			   else
			   high=mid-1;
		   }

		
		System.out.println(high);
		
		
		
	}
	
	public static int placeCows(int a[],int cows,int mid)
	{
		int c=1,last=a[0];

		for(int i=1;i<a.length;i++)
		{
			if(a[i]-last>=mid)
			{
				c++;
				last=a[i];
			}
		}

		return c;
	}
	
	
	

}
