package Array;

import java.util.Scanner;

public class Reversethearray {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long a[]=new long[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextLong();
		
		for(int i=0;i<n/2;i++)
		{
			long temp=a[i];
			a[i]=a[n-i-1];
			a[n-i-1]=temp;
		}
		
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
		sc.close();
	}

}
