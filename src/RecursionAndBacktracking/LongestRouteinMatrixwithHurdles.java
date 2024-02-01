package RecursionAndBacktracking;

import java.util.*;

public class LongestRouteinMatrixwithHurdles {
	
	
	
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
		int si=sc.nextInt();
		int sj=sc.nextInt();
		int di=sc.nextInt();
		int dj=sc.nextInt();
		sc.close();
		
		int vis[][]=new int[m][n];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				vis[i][j]=0;
			}
		}

		int ans=Integer.MIN_VALUE;
		
		int l=solve(a,vis,m,n,si,sj,di,dj,0);
		ans=Math.max(l,ans);
	
			System.out.println(ans);
		
	}
	
	public static int solve(int a[][],int vis[][],int m,int n,int si,int sj,int di,int dj,int move) {
		
		if(si<0 || sj<0 || si>=m || sj>=n || vis[si][sj]==1 || a[si][sj]==0)
		{
			return Integer.MIN_VALUE;
		}
		
		if(si==di && sj==dj)
		{
			return move;
		}
		
		vis[si][sj]=1;
		int l1=solve(a,vis,m,n,si-1,sj,di,dj,move+1);
		int l2=solve(a,vis,m,n,si+1,sj,di,dj,move+1);
		int l3=solve(a,vis,m,n,si,sj+1,di,dj,move+1);
		int l4=solve(a,vis,m,n,si,sj-1,di,dj,move+1);
		vis[si][sj]=0;
		
		return max(l1,l2,l3,l4);
		
		
	}
	
	
	public static int max(int a,int b,int c,int d)
	{
		if(a>=b && a>=c && a>=d)
			return a;
		
		else if(b>=a && b>=c && b>=d)
			return b;
		
		else if(c>=a && c>=b && c>=d)
			return c;
		
		else
			return d;
	}
	
	

}
