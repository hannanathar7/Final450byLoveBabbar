package SearchingAndSorting;

import java.util.*;

public class MajorityElement {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		sc.close();
		
		Arrays.sort(a);
		int ele=a[0],c=0,max=Integer.MIN_VALUE,maj=0;
		
		for(int i=0;i<n;i++)
		{
			if(a[i]==ele)
			{
				c++;
			}
			else
			{
			ele=a[i];
			c=1;
			}
			if(c>max)
			{
				maj=ele;
				max=c;
			}
		}
		if(max>n/2)
			System.out.println(maj);
		else
			System.out.println("-1");
			
		
		
		
	}
	
	
	

}
