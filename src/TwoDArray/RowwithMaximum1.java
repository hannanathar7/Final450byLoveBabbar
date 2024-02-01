package TwoDArray;

import java.util.Scanner;

public class RowwithMaximum1 {

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
		
		int j=c-1,row=-1;
		for(int i=0;i<r;i++)
		{
			while(j>=0 && a[i][j]==1)
			{
				row=i;
				j--;
				
			}
		}
		
		System.out.println(row);
		
		}
}
