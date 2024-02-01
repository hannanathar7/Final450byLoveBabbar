package Greedy;

import java.util.*;



public class MaximizeSumOfAiXi {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		
		int n=sc.nextInt();
	
		int a[]=new int[n];
		
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		
		
		
		sc.close();
		
	Arrays.sort(a);
		
		long sum=0;
		long mod=1000000007;
		for(int i=0;i<n;i++)
		{
			long pro=(long)a[i]*i;
			sum=((sum+pro)%mod);
		}
		int finalSum=(int)(sum%mod);
		
		
		System.out.println(finalSum);
		
		
	      
	      
	      
	      
	     
	}
	
	

}

