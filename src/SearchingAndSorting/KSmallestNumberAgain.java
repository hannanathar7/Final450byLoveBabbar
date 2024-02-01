package SearchingAndSorting;

import java.util.*;

public class KSmallestNumberAgain {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int t1=1;t1<=t;t1++)
		{
		int n=sc.nextInt();
		int q=sc.nextInt();
		ArrayList<ArrayList<Long>> list=new ArrayList<ArrayList<Long>>();
		for(int i=0;i<n;i++)
		{
			long a=sc.nextLong();
			long b=sc.nextLong();
			ArrayList<Long> list1=new ArrayList<Long>();
			list1.add(a);
			list1.add(b);
			list.add(list1);
		}
		
		Collections.sort(list,new Comparator<ArrayList<Long>>(){
			
			public int compare(ArrayList<Long> o1,ArrayList<Long> o2)
			{
				
				return o1.get(0).compareTo(o2.get(0));
			}
			
		});
		
		int idx=0;
		for(int i=1;i<n;i++)
		{
			if(list.get(i).get(0)<=list.get(idx).get(1))
			{
				list.get(idx).set(0,Math.min(list.get(idx).get(0),list.get(i).get(0)));
				list.get(idx).set(1,Math.max(list.get(idx).get(1),list.get(i).get(1)));
			}
			else
			{
				idx++;
				list.set(idx,list.get(i));
			}
				
		}
		
		for(int t3=1;t3<=q;t3++)
		{
			long k=sc.nextLong();
			long res=-1;
			
			for(int i=0;i<=idx;i++)
			{
				long num=list.get(i).get(1)-list.get(i).get(0)+1;
				if(k>num)
					k=k-num;
				else
				{
					res=list.get(i).get(0)+k-1;
					break;
				}
					
			}
			
			
			System.out.println(res);
		}
		
		}
		sc.close();	
	}
}



