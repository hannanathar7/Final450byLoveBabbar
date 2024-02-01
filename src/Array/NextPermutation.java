package Array;

import java.util.Scanner;

public class NextPermutation {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		sc.close();
		
		int idx1=-1;
		for(int i=n-1;i>=1;i--)
		{
			if(a[i]>a[i-1])
			{
				idx1=i-1;
				break;
			}
		}
		if(idx1==-1)
			reverse(a,0);
		else
		{
			for(int i=n-1;i>idx1;i--)
			{
				if(a[i]>a[idx1])
				{
					int temp=a[i];
					a[i]=a[idx1];
					a[idx1]=temp;
					break;
				}
			}
			
			reverse(a,idx1+1);
		}
		
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
		
		
	}
	
	public static void reverse(int a[],int i)
	{
		int j=i,k=a.length-1;
		while(j<k)
		{
			int temp=a[j];
			a[j]=a[k];
			a[k]=temp;
			j++;
			k--;
		}
	}
}
