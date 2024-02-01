package SearchingAndSorting;

import java.util.*;

public class PrintAllSubarraysWith0Sum {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long a[]=new long[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextLong();
		
		sc.close();
		
		HashMap<Long,Integer> map=new HashMap<Long,Integer>();
		long c=0,sum=0;
		map.put((long) 0,1);
		for(int i=0;i<n;i++)
		{
			sum=sum+a[i];
			if(map.containsKey(sum))
			{
				c+=map.get(sum);
				map.put(sum,map.get(sum)+1);
			}
			else
			{
				map.put(sum,1);
			}
		}
		
		System.out.println(c);
		
		
		
			
		
		
		
	}
	
	
	

}
