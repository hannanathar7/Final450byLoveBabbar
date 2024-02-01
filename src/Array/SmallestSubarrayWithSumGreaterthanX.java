package Array;

import java.util.*;


public class SmallestSubarrayWithSumGreaterthanX {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int x=sc.nextInt();
		sc.close();
		
		int sum=0,i=0,j=0,min=Integer.MAX_VALUE;
		while(j<n)
		{
			while(j<n && sum<=x)
			{
				sum=sum+a[j];
				j++;
			}
			
			while(i<=j && sum>x)
			{
				min=Math.min(min,j-i);
				sum=sum-a[i];
				i++;
			}
		}
		
		
		System.out.println(min);
		
		
		
	}

}
