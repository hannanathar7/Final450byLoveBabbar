package Array;
import java.util.*;
public class BestTimetoBuyandSellStockTwice {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		sc.close();
		
		int profit1=0,profit2=0,buy1=Integer.MAX_VALUE,buy2=Integer.MAX_VALUE;
		for(int i=0;i<n;i++)
		{
			buy1=Math.min(buy1,a[i]);
			profit1=Math.max(profit1,a[i]-buy1);
			buy2=Math.min(buy2,a[i]-profit1);
			profit2=Math.max(profit2,a[i]-buy2);
			
		}
		System.out.println(profit2);
		
		
		
		
	}
	

	
}
