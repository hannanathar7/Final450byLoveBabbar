package Array;
import java.util.*;
public class KadaneAlgorithm {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		sc.close();
		int sum=0,max=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++)
        {
            sum=sum+a[i];
            if(sum>max)
            max=sum;
            if(sum<0)
            sum=0;
        }
			System.out.println(max);
		
		
		
		
	}
	

	
}
