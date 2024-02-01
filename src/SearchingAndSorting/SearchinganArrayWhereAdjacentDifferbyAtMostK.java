package SearchingAndSorting;

import java.util.*;

public class SearchinganArrayWhereAdjacentDifferbyAtMostK {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		
		int k=sc.nextInt();
		int x=sc.nextInt();
		sc.close();
		
		int i=0,res=-1;
		while(i<n)
		{
			if(a[i]==x)
			{
				res=i;
				break;
			}
			
			else
			{
				int diff=x-a[i];
				int q=diff/k;
				if(q>=1)
				i=i+q;
				else
					i=i+1;
			}
		}
		System.out.println(res);
		
		
	}
}
