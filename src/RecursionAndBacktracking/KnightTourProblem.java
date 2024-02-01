package RecursionAndBacktracking;

import java.util.*;

public class KnightTourProblem {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		int a[][]=new int[n][n];
		solve(0,0,a,0,n);
	}
	
	public static void solve(int i,int j,int a[][],int move,int n) {
		
		if(i<0 || j<0 || i>=n || j>=n || a[i][j]!=0)
		{
			return;
		}
		
		if(move==n*n-1)
		{
			a[i][j]=move;
			display(a,n);
			a[i][j]=0;
			return;
		}
		
		a[i][j]=move;
		solve(i-2,j+1,a,move+1,n);
		solve(i-1,j+2,a,move+1,n);
		solve(i+1,j+2,a,move+1,n);
		solve(i+2,j+1,a,move+1,n);
		solve(i+2,j-1,a,move+1,n);
		solve(i+1,j-2,a,move+1,n);
		solve(i-1,j-2,a,move+1,n);
		solve(i-2,j-1,a,move+1,n);
		a[i][j]=0;
	}
	
	public static void display(int a[][],int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		
	}
	
	

}
