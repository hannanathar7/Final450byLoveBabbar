package Array;
import java.util.*;
public class IntersectionoftwoSortedarray {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int a[]=new int[m];
		for(int i=0;i<m;i++)
			a[i]=sc.nextInt();
		int b[]=new int[n];
		for(int i=0;i<n;i++)
			b[i]=sc.nextInt();
		sc.close();
		int c[]=new int[Math.min(m,n)];
		Arrays.fill(c,-1);
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		int k=0;
		for(int i=0;i<m;i++)
			map.put(a[i],1);
		
		for(int i=0;i<n;i++)
		{
			if(map.containsKey(b[i]))
			{
				c[k]=b[i];
				k++;
			}
		}
		if(c[0]!=-1)
		System.out.print(c[0]+" ");
		for(int i=1;i<Math.min(m,n);i++)
		{
			if(c[i]!=c[i-1] && c[i]!=-1)
				System.out.print(c[i]+" ");
		}		
	}
}
