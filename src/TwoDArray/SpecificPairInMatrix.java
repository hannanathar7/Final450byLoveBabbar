package TwoDArray;

import java.util.Scanner;

public class SpecificPairInMatrix {

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
		
		int maxvalue=Integer.MIN_VALUE;
		
		int b[][]=new int[r][c];
		
		b[r-1][c-1]=a[r-1][c-1];
		
		int max=a[r-1][c-1];
		
		for(int j=c-2;j>=0;j--)
		{
			if(a[r-1][j]>max)
				max=a[r-1][j];
			b[r-1][j]=max;
		}
		
		max=a[r-1][c-1];
		
		for(int i=r-2;i>=0;i--)
		{
			if(a[i][c-1]>max)
				max=a[i][c-1];
			b[i][c-1]=max;
		}
		
		for(int i=r-2;i>=0;i--)
		{
			for(int j=c-2;j>=0;j--)
			{
				if(b[i+1][j+1]-a[i][j]>maxvalue)
					maxvalue=b[i+1][j+1]-a[i][j];
				
				b[i][j]=Math.max(a[i][j],Math.max(b[i+1][j],b[i][j+1]));
			}
		}
		System.out.println(maxvalue);
	}
}
