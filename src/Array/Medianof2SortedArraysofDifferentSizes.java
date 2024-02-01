package Array;

import java.util.Scanner;

public class Medianof2SortedArraysofDifferentSizes {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int a[]=new int[n1];
		for(int i=0;i<n1;i++)
			a[i]=sc.nextInt();
		
		int n2=sc.nextInt();
		int b[]=new int[n2];
		for(int i=0;i<n2;i++)
			b[i]=sc.nextInt();
		
		sc.close();
		
		int low=0,high=n1;
		double median=0.0; //n1 should be smaller
		while(low<=high)
		{
			int cut1=(low+high)/2;
			int cut2=(n1+n2+1)/2-cut1;
			
			int l1,l2,r1,r2;
			
			if(cut1==0)
				l1=Integer.MIN_VALUE;
			else
				l1=a[cut1-1];
			
			if(cut2==0)
				l2=Integer.MIN_VALUE;
			else
				l2=b[cut2-1];

			if(cut1==n1)
				r1=Integer.MAX_VALUE;
			else
				r1=a[cut1];
			
			if(cut2==n2)
				r2=Integer.MAX_VALUE;
			else
				r2=a[cut2];
			
			if(l1<=r2 && l2<=r1)
			{
				if((n1+n2)%2==0)
				{
					median=(Math.max(l1,l2)+Math.min(r1,r2))/2.0;
					break;
				}
				else
				{
					median=Math.max(l1, l2);
					break;
				}
			}
			
			else if(l1>r2)
			{
				high=cut1-1;
			}
			else
			{
				low=cut1+1;
			}
				
			
		}
		System.out.println(median);
		
		
	}
	

}
