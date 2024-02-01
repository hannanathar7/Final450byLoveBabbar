package Array;
import java.util.*;
public class TripletthatSumtoaGivenValue {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		
		sc.close();
		Arrays.sort(a);
		boolean b=false;
		int flag=0;
		int sum=0;
		for(int i=0;i<n-2;i++)
		{
			
				int j1=i+1;
				int j2=n-1;
				while(j1<j2)
				{
					sum=a[i]+a[j1]+a[j2];
					if(sum==x)
					{
						b=true;
						flag=1;
						break;
					}
					else if(sum<x)
						j1++;
					else
						j2--;
				}
				if(flag==1)
					break;
			}
		System.out.println(b);
		
		
		
		
		
	}
	

	
}
