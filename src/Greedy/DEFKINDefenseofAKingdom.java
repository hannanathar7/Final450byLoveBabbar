package Greedy;

import java.util.*;


public class DEFKINDefenseofAKingdom {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		for(int t1=1;t1<=t;t1++)
		{
			
		
		int r=sc.nextInt();
		int c=sc.nextInt();
		int n=sc.nextInt();
		
		ArrayList<Integer> list1=new ArrayList<Integer>();
		ArrayList<Integer> list2=new ArrayList<Integer>();
		
		list1.add(0);
		list2.add(0);
		
		for(int i=0;i<n;i++)
		{
			list1.add(sc.nextInt());
			list2.add(sc.nextInt());
		}
		
		list1.add(r+1);
		list2.add(c+1);
		
		Collections.sort(list1);
		Collections.sort(list2);
		
		int max1=0;
		int max2=0;
		
		for(int i=0;i<list1.size()-1;i++)
		{
			max1=Math.max(max1,list1.get(i+1)-list1.get(i)-1);
			max2=Math.max(max2,list2.get(i+1)-list2.get(i)-1);
		}
		
		System.out.println(max1*max2);
		
		}
		
		sc.close();
		
		
		
		
		
		
		
	}
}



