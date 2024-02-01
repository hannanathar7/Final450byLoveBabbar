package RecursionAndBacktracking;

import java.util.*;

public class CombinationalSum {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int sum=sc.nextInt();
		sc.close();
		Arrays.sort(a);
		ArrayList<ArrayList<Integer>> list1=new ArrayList<>();
		solve(a,0,sum,list1,new ArrayList<>());
		
		System.out.println(list1);
		
	}
	
	public static void solve(int a[],int idx,int sum,ArrayList<ArrayList<Integer>> list1,ArrayList<Integer> list2) {
		
		if(idx==a.length)
		{
			if(sum==0)
			{
				if(!list1.contains(list2))
				list1.add(new ArrayList<>(list2));
			}
			return;
		}
		
		if(a[idx]<=sum)
		{
			list2.add(a[idx]);
			solve(a,idx,sum-a[idx],list1,list2);
			list2.remove(list2.size()-1);
		}
		solve(a,idx+1,sum,list1,list2);
	}
		
	

}
