package Array;
import java.util.*;
public class MinimumMergeOperationstoMakeArrayPalindrome {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		sc.close();
		
		int i=0,j=n-1,ans=0;
		while(i<j)
		{
			if(a[i]==a[j])
			{
				i++;
				j--;
			}
			else if(a[i]>a[j])
			{
				j--;
				a[j]=a[j]+a[j+1];
				ans++;
			}
			else
			{
				i++;
				a[i]=a[i]+a[i-1];
				ans++;
			}
		}
		System.out.println(ans);
				
		
		
		
	}
	

	
}
