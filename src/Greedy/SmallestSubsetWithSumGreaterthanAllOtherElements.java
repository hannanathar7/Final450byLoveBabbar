package Greedy;

import java.util.*;


public class SmallestSubsetWithSumGreaterthanAllOtherElements {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		
		sc.close();
		
		int sum=0;
		
		for(int i=0;i<n;i++)
			sum+=a[i];
		
		
		
		Arrays.sort(a);
		
		for(int i=0;i<n/2;i++)
		{
			int t=a[i];
			a[i]=a[n-i-1];
			a[n-i-1]=t;
		}
		
		int csum=0;
		
		int res=0;
		for(int i=0;i<n;i++)
		{
			sum-=a[i];
			csum+=a[i];
			res++;
			if(csum>sum)
				break;
		}
		
		System.out.println(res);
		
		
		
		
		
	}
}



