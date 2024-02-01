package SearchingAndSorting;

import java.util.*;

public class ProductArrayPuzzle {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		
		sc.close();
		
		long mul=1;
		int c=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]==0)
				c++;
			else
				mul=mul*a[i];
		}

		long b[]=new long[n];
		for(int i=0;i<n;i++)
		{
			if(c>1)
				b[i]=0;
			else if(c==1 && a[i]!=0)
				b[i]=0;
			else if(c==1 && a[i]==0)
				b[i]=mul;
			else 
				b[i]=mul/a[i];
		}
		
		for(int i=0;i<n;i++)
		System.out.print(b[i]+" ");
		
		
		
			
		
		
		
	}
	
	
	

}
