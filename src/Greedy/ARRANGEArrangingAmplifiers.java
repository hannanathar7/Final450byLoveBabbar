package Greedy;

import java.util.*;


public class ARRANGEArrangingAmplifiers {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int t2=sc.nextInt();
		for(int t1=1;t1<=t2;t1++)
		{
			int n=sc.nextInt();
			
			
			long a[]=new long[n];
			for(int i=0;i<n;i++)
				a[i]=sc.nextLong();
			
			int ones=0;
			for(int i=0;i<n;i++)
			{
				if(a[i]==1)
					ones++;
			}
			
			Arrays.sort(a);
			
			for(int i=0;i<n/2;i++)
			{
				long t=a[i];
				a[i]=a[n-i-1];
				a[n-i-1]=t;
			}
			
			for(int i=1;i<=ones;i++)
				System.out.print("1");
			
			if(n-ones==2 && a[0]==3 && a[1]==2)
				System.out.println("2 3");
			
			else
			{
				for(int i=0;i<n-ones;i++)
					System.out.print(a[i]+" ");
			}
			
			
			
			
		}
		sc.close();
		
		
		}
		
	
		
		
		
		
		
		
		
	
}





