package RecursionAndBacktracking;

import java.util.*;

public class NQueenProblem {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		char ch[][]=new char[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				ch[i][j]='.';
			}
		}
		
		ArrayList<ArrayList<String>> list=new ArrayList<ArrayList<String>>();
		int left[]=new int[n];
		int lowdiag[]=new int[2*n-1];
		int updiag[]=new int[2*n-1];
		solve(0,ch,list,n,left,lowdiag,updiag);
		System.out.println(list);
		
	}
	
	public static void solve(int col,char ch[][],ArrayList<ArrayList<String>> list,int n,int left[],int lowdiag[],int updiag[]) {
		
		if(col==n)
		{
			list.add(construct(ch));
			return;
		}
		
		for(int row=0;row<n;row++)
		{
			if(left[row]==0 && lowdiag[row+col]==0 && updiag[n-1+col-row]==0)
			{
				ch[row][col]='Q';
				left[row]=1;
				lowdiag[row+col]=1;
				updiag[n-1+col-row]=1;
				solve(col+1,ch,list,n,left,lowdiag,updiag);
				ch[row][col]='.';
				left[row]=0;
				lowdiag[row+col]=0;
				updiag[n-1+col-row]=0;
			}
		}
		
	}
	
	public static ArrayList<String> construct(char ch[][])
	{
		ArrayList<String> list=new ArrayList<String>();
		for(int i=0;i<ch.length;i++)
		{
			String s=new String(ch[i]);
			list.add(s);
		}
		return list;
	}
	
	

}
