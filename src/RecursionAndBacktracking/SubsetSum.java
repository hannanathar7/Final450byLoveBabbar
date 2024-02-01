package RecursionAndBacktracking;

import java.util.*;

public class SubsetSum {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Integer> a=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			a.add(sc.nextInt());
		}
		sc.close();
		
		ArrayList<Integer> list=new ArrayList<>();
		solve(0,0,a,n,list);
		Collections.sort(list);
		System.out.println(list);
		
	}
	
	public static void solve(int i,int sum,ArrayList<Integer> a,int n,ArrayList<Integer> list) {
		
		if(i==n)
		{
			list.add(sum);
			return;
		}
		
		
		solve(i+1,sum+a.get(i),a,n,list);
		solve(i+1,sum,a,n,list);
		
	}
		
	

}
