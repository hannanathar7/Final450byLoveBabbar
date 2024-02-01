package RecursionAndBacktracking;

import java.util.*;

public class TugOfWar {
	
	static String ans="";
	static int min=Integer.MAX_VALUE;
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		sc.close();
		ArrayList<Integer> list1=new ArrayList<Integer>();
		ArrayList<Integer> list2=new ArrayList<Integer>();
		int s1=0,s2=0;
		solve(a,0,n,list1,list2,s1,s2);
		System.out.println(ans);
	}
	
	public static void solve(int a[],int i,int n,ArrayList<Integer> list1,ArrayList<Integer> list2,int s1,int s2) {
		
		
		if(i==n)
		{
			int d=Math.abs(s1-s2);
			if(d<min)
			{
				min=d;
				ans=list1+" "+list2;
			}
			return;
		}
		
		if(list1.size()<(n+1)/2)
		{
			list1.add(a[i]);
			solve(a,i+1,n,list1,list2,s1+a[i],s2);
			list1.remove(list1.size()-1);
		}
		
		
		if(list2.size()<(n+1)/2)
		{
			list2.add(a[i]);
			solve(a,i+1,n,list1,list2,s1,s2+a[i]);
			list2.remove(list2.size()-1);
		}
		
	}
	
	
	

}
