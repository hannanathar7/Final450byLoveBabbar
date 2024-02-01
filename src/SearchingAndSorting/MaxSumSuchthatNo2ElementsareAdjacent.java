package SearchingAndSorting;

import java.util.*;

public class MaxSumSuchthatNo2ElementsareAdjacent {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
				sc.close();
		
		int v1=a[0];
		if(n==1)
		{
			System.out.println(v1);
			return;
		}
		int v2=Math.max(a[0],a[1]);
		if(n==2)
		{
			System.out.println(v2);
			return;
		}
		int max=0;
		for(int i=2;i<n;i++)
		{
			max=Math.max(v1+a[i],v2);
			v1=v2;
			v2=max;
		}
		System.out.println(max);
		
		
		
		
			
		
		
		
	}
	
	
	

}
