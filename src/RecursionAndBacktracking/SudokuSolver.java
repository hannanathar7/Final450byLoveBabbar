package RecursionAndBacktracking;

import java.util.*;

public class SudokuSolver {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		sc.close();
		int a[][]=new int[9][9];
		for(int i=0;i<9;i++)
		{
			for(int j=0;j<9;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
			solve(a);
		
		
		
	}
	
	public static boolean solve(int a[][]) {
		
		for(int i=0;i<9;i++)
		{
			for(int j=0;j<9;j++)
			{
				if(a[i][j]==0)
				{
					for(int k=1;k<=9;k++)
					{
						if(valid(a,i,j,k))
						{
							a[i][j]=k;
						
							if(solve(a)==true)
								return true;
							
								a[i][j]=0;
						}
						
					}
					return false;
				}
			}
		}
		return true;
		
	}
	
	public static boolean valid(int a[][],int row,int col,int k)
	{
		for(int i=0;i<9;i++)
		{
			if(a[row][i]==k)
				return false;
			
			if(a[i][col]==k)
				return false;
			
			if(a[3*(row/3)+i/3][3*(col/3)+i%3]==k)
				return false;
		}
		return true;
	}
	
	

}
