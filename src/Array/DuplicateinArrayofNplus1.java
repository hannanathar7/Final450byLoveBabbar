package Array;
import java.util.*;
public class DuplicateinArrayofNplus1 {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		sc.close();
		
		
		 int res=-1;
		for(int i=0;i<n;i++)
		{
			int j=Math.abs(a[i]);
			if(a[j]>=0)
			{
				a[j]=-a[j];
			}
			else
				res=j;
		 }
			System.out.println(res);
		
		
		
		
	}
	

	
}
