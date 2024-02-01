package Greedy;

import java.util.*;



public class MaximizeSumOfAbsoluteDifference {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		
		int n=sc.nextInt();
	
		int a[]=new int[n];
		
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		
		
		
		sc.close();
		
	
		Arrays.sort(a);
		
		
		int sum=0;
		
		int i=0,j=n-1;
		boolean flag=true;
		
		while(i<j)
		{
			sum+=Math.abs(a[i]-a[j]);
			if(flag)
				i++;
			else
				j--;
			
			flag=!flag;
		}
		
		sum+=Math.abs(a[0]-a[n/2]);
		
	
		System.out.println(sum);
		
		
	      
	      
	      
	      
	     
	}
	
	

}

