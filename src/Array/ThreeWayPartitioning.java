package Array;
import java.util.*;
public class ThreeWayPartitioning {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int x=sc.nextInt();
		int y=sc.nextInt();
		sc.close();
		
		int left=0,right=n-1;
		for(int i=0;i<=right;)
		{
			if(a[i]<x)
			{
				int t=a[left];
				a[left]=a[i];
				a[i]=t;
				left++;
				i++;
				
			}
			else if(a[i]>y)
			{
				int t=a[right];
				a[right]=a[i];
				a[i]=t;
				right--;
				
			}
			else 
				i++;
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		
	}
	

	
}
