package SearchingAndSorting;

import java.util.*;

public class Find4ElementsthatSumtoaGivenValue {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int k=sc.nextInt();
		sc.close();
		
		ArrayList<ArrayList<Integer>> list2=new ArrayList<ArrayList<Integer>>();
		Arrays.sort(a);
		for(int i=0;i<n-3;i++)
		{
			if(i>0 && a[i]==a[i-1])
				continue;
			for(int j=i+1;j<n-2;j++)
			{
				if(j>i+1 && a[j]==a[j-1])
					continue;
	
				int k1=j+1,k2=n-1;
				while(k1<k2)
				{
					int oldl=k1;
					int oldr=k2;
					
					int sum=a[i]+a[j]+a[k1]+a[k2];
					if (sum==k) {
						ArrayList<Integer> list=new ArrayList<Integer>();
						list.add(a[i]);
						list.add(a[j]);
						list.add(a[k1]);
						list.add(a[k2]);
						list2.add(list);
					while(k1<k2 && a[k1]==a[oldl])
					{
						k1++;
					}
					
					while(k1<k2 && a[k2]==a[oldr])
					{
						k2--;
					}
					
					}
					
					else if(sum<k)
						k1++;
					else 
						k2--;
					
				}
			}
		}
		
		System.out.println(list2);
		
		
		
			
		
		
		
	}
	
	
	

}
