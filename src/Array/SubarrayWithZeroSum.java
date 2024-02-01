package Array;
import java.util.*;
public class SubarrayWithZeroSum {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		sc.close();
		
		boolean b=false;
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		int sum=0;
		map.put(0,1);
		for(int i=0;i<n;i++)
		{
			sum=sum+a[i];
			if(map.containsKey(sum))
			{
				b=true;
				break;
			}
			else
			{
				map.put(sum,1);
			}
				
		}
		
		System.out.println(b);
		
		
		
		
		
	}
	

	
}
