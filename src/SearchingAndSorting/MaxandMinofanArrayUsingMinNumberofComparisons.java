package SearchingAndSorting;

import java.util.Scanner;

public class MaxandMinofanArrayUsingMinNumberofComparisons {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		
		int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE,i;
		if(n%2==0)
		{
			if(a[0]>a[1])
			{
				max=a[0];
				min=a[1];
			}
			else
			{
				max=a[1];
				min=a[0];
			}
			i=2;
		}
		else
		{
			max=a[0];
			min=a[0];
			i=1;
		}
		
		while(i<n-1)
		{
			if(a[i]>a[i+1])
			{
				if(a[i]>max)
					max=a[i];
				if(a[i+1]<min)
					min=a[i+1];
			}
			else
			{
				if(a[i+1]>max)
					max=a[i+1];
				if(a[i]<min)
					min=a[i];
			}
			i++;
		}
		
		System.out.println(max+" "+min);
		sc.close();
	}

}
