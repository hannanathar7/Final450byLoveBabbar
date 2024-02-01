package SearchingAndSorting;

import java.util.*;

public class FindRepeatingandMissing {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		sc.close();
		
		int repeating=0,missing=0;
		for(int i=0;i<n;i++)
		{
			int v=Math.abs(a[i]);
			if(a[v-1]>=0)
			{
				a[v-1]=a[v-1]*-1;
			}
			else
			{
				repeating=v;
			}
		}
		
		for(int i=0;i<n;i++)
		{
			if(a[i]>=0)
				missing=i+1;
		}
		int res[]=new int[2];
		res[0]=repeating;
		res[1]=missing;
		
		for(int i=0;i<2;i++)
			System.out.println(a[i]);
		
		
		
			
		
		
		
	}
	
	
	

}
