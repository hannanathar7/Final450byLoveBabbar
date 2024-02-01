package Array;
import java.util.*;
public class UnionoftwoUnsortedarray {

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
		int c[]=new int[m+n];
		sc.close();
		int i=0,j=0,k=0;
		while(i<m)
		{
			c[k]=a[i];
			k++;
			i++;
		}
		while(j<n)
		{
			c[k]=b[j];
			k++;
			j++;
		}
		Arrays.sort(c);
		System.out.print(c[0]+" ");
		for(i=1;i<m+n;i++)
		{
			if(c[i]!=c[i-1])
				System.out.print(c[i]+" ");
		}
		
		
		
		
	}
}
