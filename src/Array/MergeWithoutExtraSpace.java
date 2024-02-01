package Array;
import java.util.*;
public class MergeWithoutExtraSpace {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int a[]=new int[m];
		for(int i=0;i<m;i++)
			a[i]=sc.nextInt();
		int n =sc.nextInt();
		int b[]=new int[n];
		for(int i=0;i<n;i++)
			b[i]=sc.nextInt();
		sc.close();
		
		int i=m-1,j=0;
		while(i>=0 && j<n)
		{
			if(a[i]>b[j])
			{
				int t=a[i];
				a[i]=b[j];
				b[j]=t;
				i--;
				j++;
			}
			else
				break;
		}
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		
		for(i=0;i<m;i++)
			System.out.print(a[i]+" ");
		for(i=0;i<n;i++)
			System.out.print(b[i]+" ");
		
		
		
		
		
	}
	

	
}
