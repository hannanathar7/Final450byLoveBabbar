package SearchingAndSorting;

import java.util.*;

public class FindPairwithGivenDifference {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int k=sc.nextInt();
		sc.close();
		
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		boolean b=false;
		for(int i=0;i<n;i++)
		{
			if(map.containsKey(a[i]))
				map.put(a[i],map.get(a[i]+1));
			else
				map.put(a[i],1);
		}
		
		for(int i=0;i<n;i++)
		{
			if(map.containsKey(a[i]+k))
			{
				b=true;
				break;
			}
		}
		
		System.out.println(b);
		
		
		
			
		
		
		
	}
	
	
	

}
