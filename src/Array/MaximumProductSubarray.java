package Array;
import java.util.*;
public class MaximumProductSubarray {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		sc.close();
		
		 long currmin=a[0],currmax=a[0],ans=a[0],prevmax=a[0],prevmin=a[0];
		 for(int i=1;i<n;i++)
		 {
			 currmax=Math.max(Math.max(prevmin*a[i],prevmax*a[i]),a[i]);
			 currmin=Math.min(Math.min(prevmin*a[i], prevmax*a[i]),a[i]);
			 ans=Math.max(ans,currmax);
			 prevmax=currmax;
			 prevmin=currmin;
		 }
		 
		
		
			System.out.println(ans);
		
		
		
		
	}
	

	
}
