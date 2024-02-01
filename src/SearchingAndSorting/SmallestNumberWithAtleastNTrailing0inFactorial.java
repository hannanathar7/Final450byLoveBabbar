package SearchingAndSorting;

import java.util.*;

public class SmallestNumberWithAtleastNTrailing0inFactorial {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();		
		sc.close();
		
		
		int low=0,high=5*n,res=-1;
		while(low<=high)
		{
			int mid=low+(high-low)/2;
			if(trailingZero(mid,n))
			{
				res=mid;
				high=mid-1;
			}
				
			else
				low=mid+1;
		}
		
		System.out.println(res);
		
		
		
	}
	
	public static boolean trailingZero(int mid,int n)
	{
		int c=0;
		int f=5;
		while(f<=mid)
		{
			int q=mid/f;
			c=c+q;
			f=f*5;
		}
		if(c>=n)
			return true;
		else
			return false;
	}
	
	
	

}
