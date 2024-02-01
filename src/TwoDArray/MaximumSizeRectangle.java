package TwoDArray;

import java.util.Scanner;

public class MaximumSizeRectangle {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		int a[][]=new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}	
		sc.close();
		
		for(int i=1;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				if(a[i][j]!=0)
					a[i][j]=a[i][j]+a[i-1][j];
			}
		}	
		
		
	}
}
