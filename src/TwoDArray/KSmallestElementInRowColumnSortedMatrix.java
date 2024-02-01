package TwoDArray;

import java.util.Scanner;

public class KSmallestElementInRowColumnSortedMatrix {

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
		
		int low=a[0][0],high=a[r-1][c-1],ans=0;
		
		while(low<=high)
		{
			int mid=low+(high-low)/2;
			int count=0;
			for(int i=0;i<r;i++)
			{
				count+=Elementslessthanequaltomid(a[i],mid);
			}
			if(count<k)
				low=mid+1;
				
			else
			{	
				ans=mid;
				high=mid-1;
			}
		}
		System.out.println(ans);
		
	}
	
	public static int Elementslessthanequaltomid(int a[],int mid) {
		int low=0,high=a.length-1;
		while(low<=high)
		{
		int m=low+(high-low)/2;
		if(a[m]<=mid)
			low=m+1;
		else
			high=m-1;
		}
		return low;
		
	}
}
