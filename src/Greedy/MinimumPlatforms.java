package Greedy;

import java.util.*;



public class MinimumPlatforms {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int dep[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		for(int i=0;i<n;i++)
			dep[i]=sc.nextInt();
		sc.close();
		
		Arrays.sort(arr);
		Arrays.sort(dep);
		int c=1,max=1;
		
		int i=1,j=0;
		
		while(i<n)
		{
			if(arr[i]<=dep[j])
			{
				c++;
				i++;
			}
			else
			{
				c--;
				j++;
			}
			
			max=Math.max(max,c);
		}
		System.out.println(max);
	}
	
	

}

