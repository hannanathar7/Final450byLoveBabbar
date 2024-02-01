package Array;
import java.util.*;
public class MinimiseMaximumDifferencebetweenHeights {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		sc.close();
		
		Arrays.sort(a);
		int max,min;
		int first=a[0];
		int last=a[n-1];
		int res=last-first;
		
		
		for(int i=1;i<n;i++)// we are taking pairs of elements at a time;
		{
			int x=a[i-1];
			int y=a[i];
			if(y>=k)
			{
				max=Math.max(x+k,last-k);
				min=Math.min(first+k,y-k);
				
				res=Math.min(res,max-min);
			}
		}
		
		
		 System.out.println(res);
		
		
		
		
	}
	

	
}
