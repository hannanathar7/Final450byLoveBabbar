package TwoDArray;

import java.util.Scanner;

public class RotateMatrixby90Degree {

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
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				if(i<j)
				{
					int temp=a[i][j];
					a[i][j]=a[j][i];
					a[j][i]=temp;
				}
			}
		}
		
		for(int i=0;i<r;i++)
		{
			int left=0,right=c-1;
			while(left<right)
			{
				int temp=a[i][left];
				a[i][left]=a[i][right];
				a[i][right]=temp;
				
				left++;
				right--;
			}
		}
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		
		sc.close();
	}
}
