package TwoDArray;

import java.util.Scanner;

public class SpiralMatrix {

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
		int left=0,right=c-1,top=0,bottom=r-1,count=r*c,dir=1;
		
		while(top<=bottom && left<=right)
		{
			if(count>0)
			{
			if(dir==1)
			{
				for(int i=left;i<=right;i++)
				{
					System.out.print(a[top][i]+" ");
					count--;
				}
				dir=2;
				top++;
			}
			}
			
			if(count>0)
			{
			if(dir==2)
			{
				for(int i=top;i<=bottom;i++)
				{
					System.out.print(a[i][right]+" ");
					count--;
				}
				dir=3;
				right--;
			}
			}
			
			if(count>0)
			{
			if(dir==3)
			{
				for(int i=right;i>=left;i--)
				{
					System.out.print(a[bottom][i]+" ");
					count--;
				}
				dir=4;
				bottom--;
			}
			}
			
			if(count>0)
			{
			if(dir==4)
			{
				for(int i=bottom;i>=top;i--)
				{
					System.out.print(a[i][left]+" ");
					count--;
				}
				dir=1;
				left++;
			}
			}
		}
		sc.close();
	}
}
