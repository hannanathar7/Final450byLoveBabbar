package Greedy;

import java.util.*;



public class MaximizeSumAfterKNegations {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		
		int n=sc.nextInt();
	
		long a[]=new long[n];
		
		for(int i=0;i<n;i++)
			a[i]=sc.nextLong();
		
		int k=sc.nextInt();
		
		
		
		sc.close();
		
		Arrays.sort(a);
		long sum=0;
		int i=0;
		while(i<n && a[i]<0 && k>=1)
		{
			a[i]=-a[i];
			k--;
			i++;
		}
		
		Arrays.sort(a);
		
		if(k%2==1)
		{
			a[0]=-a[0];
		}
		
		for(i=0;i<n;i++)
	      sum+=a[i];
		
		
		System.out.println(sum);
		
		
	      
	      
	      
	      
	     
	}
	
	

}

