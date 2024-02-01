package Array;
import java.util.*;
public class ChocolateDistributionProblem {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int m=sc.nextInt();
		sc.close();
		Arrays.sort(a);
		int min=Integer.MAX_VALUE;
		
		for(int i=0;i<=n-m;i++)
		{
			int diff=a[i+m-1]-a[i];
			min=Math.min(min,diff);
		}
		System.out.println(min);
		
		
		
		
	}
	

	
}
