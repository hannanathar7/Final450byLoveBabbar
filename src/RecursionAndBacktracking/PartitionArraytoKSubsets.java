package RecursionAndBacktracking;

import java.util.*;

public class PartitionArraytoKSubsets {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
		int k=sc.nextInt();
		sc.close();
		
		int sum=0;
		for(int i=0;i<n;i++)
		sum+=a[i];
		
		if(k>n || sum%k!=0)
		{
			System.out.println("-1");
			return;
		}
		
		if(k==1)
		{
			for(int i=0;i<n;i++)
				System.out.print(a[i]+" ");
		}
		
		int subset[]=new int[k];
		ArrayList<ArrayList<Integer>> list1=new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> list2=new ArrayList<Integer>();
		
		for(int i=0;i<k;i++)
		{
			list1.add(new ArrayList<Integer>());
		}
		solve(a,n,0,k,subset,0,list1,list2);
		
		
	}
	
	public static void solve(int a[],int n,int idx,int k,int subset[],int sf,ArrayList<ArrayList<Integer>> list1,ArrayList<Integer> list2) {
		
		if(idx==n)
		{
			if(sf==k)
			{
				boolean f=true;
				for(int i=0;i<k-1;i++)
				{
					if(subset[i]!=subset[i+1])
					{
						f=false;
						break;
					}
				}
				
				if(f)
				{
					for(ArrayList<Integer> l:list1)
					{
						System.out.print(l+" ");
					}
					System.out.println();
				}

			}
			return;
		}
		
		
		for(int i=0;i<k;i++)
		{
			if(list1.get(i).size()>0)
			{
				list1.get(i).add(a[idx]);
				subset[i]+=a[idx];
				solve(a,n,idx+1,k,subset,sf,list1,list2);
				subset[i]-=a[idx];
				list1.get(i).remove(list1.get(i).size()-1);
			}
			else
			{
				list1.get(i).add(a[idx]);
				subset[i]+=a[idx];
				solve(a,n,idx+1,k,subset,sf+1,list1,list2);
				subset[i]-=a[idx];
				list1.get(i).remove(list1.get(i).size()-1);
				break;
			}
		}
	}
		
	

}
