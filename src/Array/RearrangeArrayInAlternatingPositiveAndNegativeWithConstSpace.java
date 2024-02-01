package Array;
import java.util.*;
public class RearrangeArrayInAlternatingPositiveAndNegativeWithConstSpace {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		sc.close();
		
		int j=n-1,i=0;
		
		while(i<j)
		{
			while(i<n && a[i]>0)
				i++;
			
			while(j>=0 && a[j]<0)
				j--;
			
			if(i<j)
			{
				int t=a[i];
				a[i]=a[j];
				a[j]=t;
			}
		}
		
		int k=0;
		while(k<n && i<n)
		{
			int t=a[i];
			a[i]=a[k];
			a[k]=t;
			i++;
			k=k+2;
		}
		
		for(i=0;i<n;i++)
			System.out.print(a[i]+" ");
		System.out.println();
	
	}
	

	
}
