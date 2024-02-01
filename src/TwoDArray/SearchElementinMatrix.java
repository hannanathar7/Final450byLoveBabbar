package TwoDArray;

import java.util.Scanner;

public class SearchElementinMatrix {

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
		int k=sc.nextInt();
		sc.close();
		
		boolean b=false;
		int low=0,high=(r*c-1);
		while(low<=high)
		{
			int mid=low+(high-low)/2;
			int r1=mid/c;
			int c1=mid%c;
			if(a[r1][c1]==k)
			{
				b=true;
				break;
			}
			else if(a[r1][c1]>k)
				high=mid-1;
			else
				low=mid+1;
		}
		System.out.println(b);
	}
}
