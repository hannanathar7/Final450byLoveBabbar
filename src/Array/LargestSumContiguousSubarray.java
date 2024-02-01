package Array;
import java.util.*;
public class LargestSumContiguousSubarray {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		sc.close();
		 int maxsum=Integer.MIN_VALUE,currsum=0;
		 for(int i=0;i<n;i++)
		 {
			 currsum=currsum+a[i];
			  if(currsum>maxsum)
				 maxsum=currsum;
			 if(currsum<0)
				 currsum=0;
		 }
			System.out.println(maxsum);
		
		
		
		
	}
	

	
}
