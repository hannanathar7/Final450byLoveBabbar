package Array;
import java.util.*;
public class LongestConsecutiveSubsequence {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		sc.close();
		
		int max=1;
		if(n==1)
		{
			max=1;
		}
		else
		{
		HashSet<Integer> set=new HashSet<Integer>();
		
		for(int i=0;i<n;i++)
		{
			set.add(a[i]);
		}
		
		for(int i=0;i<n;i++)
		{
			if(!set.contains(a[i]-1))
			{
				int curr=a[i];
				int c=1;
				while(set.contains(curr+1))
				{
					curr++;
					c++;
				}
				max=Math.max(max,c);
			}
				
			}
				
		}
		
		System.out.println(max);
		
		
		
		
	}
	

	
}
