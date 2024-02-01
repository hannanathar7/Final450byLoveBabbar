package SearchingAndSorting;

import java.util.*;

public class KElementof2SortedArrays {
	
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
		
		int k=sc.nextInt();
		
		sc.close();
		
		int low=Math.max(0,k-n2),high=Math.min(n1,k),res=0; // n1 must be smaller
		while(low<=high)
		{
			int cut1=(low+high)/2;
			int cut2=k-cut1;
			
			int l1,l2,r1,r2;
			
			if(cut1==0)
			l1=Integer.MIN_VALUE;
			else
				l1=a[cut1-1];
			
			if(cut1==n1)
				r1=Integer.MAX_VALUE;
			else
				r1=a[cut1];
			
			if(cut2==0)
				l2=Integer.MIN_VALUE;
				else
					l2=b[cut2-1];
				
				if(cut2==n2)
					r2=Integer.MAX_VALUE;
				else
					r2=b[cut2];
				
				if(l1<=r2 && l2<=r1)
				{
					res=Math.max(l1,l2);
					break;
				}
				else if(l1>r2)
					high=cut1-1;
				else
					low=cut1+1;
				
		}
		System.out.println(res);
		
		
	}

}
