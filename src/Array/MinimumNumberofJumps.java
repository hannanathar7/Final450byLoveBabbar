package Array;
import java.util.*;
public class MinimumNumberofJumps {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
	
		int jump=1,maxR=a[0],steps=a[0];
		
		if(n==1)
			jump=0;
		else if(a[0]<=0)
			jump=-1;
		else
		{
			for(int i=1;i<n;i++)
			{
				if(i==n-1)
				{
					break;
				}
				maxR=Math.max(maxR,i+a[i]);
				steps--;
				if(steps==0)
				{
					jump++;
					if(i>=maxR)
					{
						jump=-1;
						break;
					}
					steps=maxR-i;
				}
			}
		}
	
		
		System.out.println(jump);
		sc.close();
	}
}
