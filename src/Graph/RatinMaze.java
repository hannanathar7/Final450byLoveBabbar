package Graph;

import java.util.*;

public class RatinMaze {
	
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
		int vis[][]=new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				vis[i][j]=0;
			}
		}
		ArrayList<String> list=new ArrayList<>();
		if(a[0][0]==1)
		{
			solve(0,0,a,n,vis,list,"");
		}
		System.out.println(list);
		sc.close();
	}
	
	public static void solve(int i,int j,int a[][],int n,int vis[][],ArrayList<String> list,String ans) {
		
		if(i==n-1 && j==n-1)
		{
			list.add(ans);
			return;
		}
		
		if(i<n-1 && a[i+1][j]==1 && vis[i+1][j]==0)
		{
			vis[i][j]=1;
			solve(i+1,j,a,n,vis,list,ans+"D");
			vis[i][j]=0;
		}
		
		if(j>0 && a[i][j-1]==1 && vis[i][j-1]==0)
		{
			vis[i][j]=1;
			solve(i,j-1,a,n,vis,list,ans+"L");
			vis[i][j]=0;
		}
		
		if(j<n-1 && a[i][j+1]==1 && vis[i][j+1]==0)
		{
			vis[i][j]=1;
			solve(i,j+1,a,n,vis,list,ans+"R");
			vis[i][j]=0;
		}
		
		if(i>0 && a[i-1][j]==1 && vis[i-1][j]==0)
		{
			vis[i][j]=1;
			solve(i-1,j,a,n,vis,list,ans+"U");
			vis[i][j]=0;
		}
		
	}
	
	

}
