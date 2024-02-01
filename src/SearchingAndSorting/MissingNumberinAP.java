package SearchingAndSorting;

import java.util.*;

public class MissingNumberinAP {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		sc.close();
		
		int diff=(a[n-1]-a[0])/n;
		int low=0,high=n-1,res=-1;
		while(low<=high)
		{
			int mid=low+(high-low)/2;
			if(a[mid+1]-a[mid]!=diff)
			{
				res=a[mid]+diff;
				break;
			}
			if(a[mid]-a[mid-1]!=diff)
			{
				res=a[mid]-diff;
				break;
			}
			
			if(a[mid]==a[0]+diff*mid)
				low=mid+1;
			else
				high=mid-1;
		}
		
		System.out.println(res);
		
		
		
	}
	
	
	
	
	

}
