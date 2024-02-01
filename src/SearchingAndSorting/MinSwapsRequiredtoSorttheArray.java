package SearchingAndSorting;

import java.util.*;

public class MinSwapsRequiredtoSorttheArray {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		
		sc.close();
		
	int b[]=Arrays.copyOf(a,n);
	Arrays.sort(b);
	
	HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
	
	for(int i=0;i<n;i++)
	{
		map.put(a[i],i);
	}
	
	int c=0;
	
	for(int i=0;i<n;i++)
	{
		if(a[i]!=b[i])
		{
			
		c++;
		map.put(a[i],map.get(b[i]));
		
		int temp=a[i];
		a[i]=a[map.get(b[i])];
		a[map.get(b[i])]=temp;
		
		map.put(b[i],i);
		}	
	}

	System.out.println(c);
		
		
		
			
		
		
		
	}
	

	
	
	

}
