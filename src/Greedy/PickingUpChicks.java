package Greedy;

import java.util.*;


public class PickingUpChicks {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int t2=sc.nextInt();
		for(int t1=1;t1<=t2;t1++)
		{
			int n=sc.nextInt();
			int k=sc.nextInt();
			long b=sc.nextLong();
			long t=sc.nextLong();
			
			long a[]=new long[n];
			for(int i=0;i<n;i++)
				a[i]=sc.nextLong();
			
			long v[]=new long[n];
			for(int i=0;i<n;i++)
				v[i]=sc.nextLong();
			
			int pos=0,swap=0,notpos=0;
			
			for(int i=n-1;i>=0;i--)
			{
				long dis=b-a[i];
				long d=v[i]*t;
				
				if(d>=dis)
				{
					pos++;
					
					if(notpos>0)
						swap+=notpos;
				}
					
				
				else
					notpos++;
				
				if(pos>=k)
					break;
				
				
			}
			
			if(pos>=k)
				System.out.println("Case #"+t1+": "+swap);
			else
				System.out.println("Case #"+t1+": "+"IMPOSSIBLE");
			
		}
		sc.close();
		
		
		}
		
	
		
		
		
		
		
		
		
	
}





