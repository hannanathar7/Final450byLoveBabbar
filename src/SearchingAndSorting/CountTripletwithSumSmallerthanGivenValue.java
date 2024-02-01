package SearchingAndSorting;

import java.util.*;

public class CountTripletwithSumSmallerthanGivenValue {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long a[]=new long[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextLong();
		int k=sc.nextInt();
		sc.close();
		
		long c=0;
		Arrays.sort(a);
		for(int i=0;i<n-2;i++)
		{
				int j1=i+1,j2=n-1;
				while(j1<j2)
				{
			
					long sum=a[i]+a[j1]+a[j2];
					if (sum<k) {
					c=c+j2-j1;
					j1++;
					}
					
					else
						j2--;
					
				}
			}
		
		System.out.println(c);
		
		
		
			
		
		
		
	}
	
	
	

}
