package RecursionAndBacktracking;

import java.util.*;

public class ShortestSafeRouteinPathwithLandmines {
	
	
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int a[][]=new int[m][n];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		sc.close();
		int vis[][]=new int[m][n];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				vis[i][j]=0;
			}
		}

		int ans=Integer.MAX_VALUE;
		
		for(int i=0;i<m;i++)
		{
			if(isSafe(a,m,n,i,0))
			{
				int l=solve(a,vis,m,n,i,0,0);
				ans=Math.min(l,ans);
			}
		}
			System.out.println(ans);
		
	}
	
	public static int solve(int a[][],int vis[][],int m,int n,int i,int j,int move) {
		
		if(i<0 || j<0 || i>=m || j>=n || vis[i][j]==1 || (!isSafe(a,m,n,i,j)))
		{
			return Integer.MAX_VALUE;
		}
		
		if(j==n-1)
		{
			return move;
		}
		
		vis[i][j]=1;
		int l1=solve(a,vis,m,n,i-1,j,move+1);
		int l2=solve(a,vis,m,n,i+1,j,move+1);
		int l3=solve(a,vis,m,n,i,j+1,move+1);
		int l4=solve(a,vis,m,n,i,j-1,move+1);
		vis[i][j]=0;
		
		return min(l1,l2,l3,l4);
		
		
	}
	
	public static boolean isSafe(int a[][],int m,int n,int i,int j)
	{
		if(a[i][j]==0)
			return false;
		
		if(i-1>=0 && a[i-1][j]==0)
			return false;
		
		if(j+1<n && a[i][j+1]==0)
			return false;
		
		if(i+1<m && a[i+1][j]==0)
			return false;
		
		if(j-1>=0 && a[i][j-1]==0)
			return false;
			
		return true;
	}
	
	public static int min(int a,int b,int c,int d)
	{
		if(a<=b && a<=c && a<=d)
			return a;
		
		else if(b<=a && b<=c && b<=d)
			return b;
		
		else if(c<=a && c<=b && c<=d)
			return c;
		
		else
			return d;
	}
	
	

}
