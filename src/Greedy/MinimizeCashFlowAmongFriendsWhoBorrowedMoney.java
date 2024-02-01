package Greedy;

import java.util.*;



public class MinimizeCashFlowAmongFriendsWhoBorrowedMoney {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		
		int a[][]=new int[n][n];
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
			
		sc.close();
		
		
		
		
		
		int amt[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				amt[i]=amt[i]+(a[j][i]-a[i][j]);
			}
		}
		
		minCashFlow(amt,n);
		
		
		
		
		
	}
	
	public static void minCashFlow(int amt[],int n)
	{
		
		int minIn=0,maxIn=0; 
		for(int i=1;i<n;i++)
		{
			if(amt[i]<amt[minIn])
				minIn=i;
		}
		
		for(int i=1;i<n;i++)
		{
			if(amt[i]>amt[maxIn])
				maxIn=i;
		}
		
		if(amt[minIn]==0 && amt[maxIn]==0)
			return;
		
		
		int min=Math.min(-amt[minIn],amt[maxIn]);
		
		amt[minIn]+=min;
		amt[maxIn]-=min;
		
		System.out.println(minIn+" pays "+min+" money to "+maxIn);
		
		minCashFlow(amt,n);
	}
	
	

}

