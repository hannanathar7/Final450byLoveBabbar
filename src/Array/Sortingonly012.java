package Array;
import java.util.*;
public class Sortingonly012 {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		sc.close();
		int low=0,high=n-1,mid=0;
		while(mid<=high)
		{
			if(a[mid]==0)
			{
				int temp=a[low];
				a[low]=a[mid];
				a[mid]=temp;
				low++;
				mid++;
			}
			else if(a[mid]==1)
				mid++;
			else
			{
				int temp=a[high];
				a[high]=a[mid];
				a[mid]=temp;
				high--;
			}
		}
		
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
			
		
		
		
		
	}
	

	
}
