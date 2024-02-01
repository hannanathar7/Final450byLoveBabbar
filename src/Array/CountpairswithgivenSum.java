package Array;
import java.util.*;
public class CountpairswithgivenSum {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		sc.close();
		
HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		
		for(int i=0;i<n;i++)
		{
			if(map.containsKey(a[i]))
			{
				map.put(a[i],map.get(a[i])+1);
			}
			else
				map.put(a[i],1);
		}
		
		int c=0;
		for(int i=0;i<n;i++)
		{
			map.put(a[i],map.get(a[i])-1);
			int x=k-a[i];
			if(map.containsKey(x))
			{
				c=c+map.get(x);
			}
			
				
		}
		
		System.out.println(c);
		
		
		
	}
	

	
}
