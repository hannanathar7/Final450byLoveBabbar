package Array;
import java.util.*;
public class MinimumSwapstoBringElementsLessEqualKTogether {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int k=sc.nextInt();
		
		sc.close();
		
		int c=0,g=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]<=k)
				c++;
		}
		for(int i=0;i<c;i++)
		{
			if(a[i]>k)
				g++;
		}
		int ans=g;
		
		int i=0,j=c;
		while(j<n)
		{
			if(a[i]>k)
				g--;
			if(a[j]>k)
				g++;
			ans=Math.min(ans,g);
			i++;
			j++;
		}
		System.out.println(ans);
				
		
		
		
	}
	

	
}
