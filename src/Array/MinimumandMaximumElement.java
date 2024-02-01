package Array;
import java.util.*;
public class MinimumandMaximumElement {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long a[]=new long[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextLong();
		long max=a[0],min=a[0];
		for(int i=1;i<n;i++)
		{
			if(a[i]>max)
				max=a[i];
			else if(a[i]<min)
				min=a[i];
		}
		System.out.println("Maximum element is "+max+"\n"+"Minimum element is "+min);
		sc.close();
	}
}
