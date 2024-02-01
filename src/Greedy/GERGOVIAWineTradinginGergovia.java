package Greedy;

import java.util.*;


public class GERGOVIAWineTradinginGergovia {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		while( n!=0)
		{
		
		int a[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		ArrayList<wine> list1=new ArrayList<>();
		ArrayList<wine> list2=new ArrayList<>();
		
		for(int i=0;i<n;i++)
		{
			if(a[i]>0)
				list1.add(new wine(a[i],i));
			else
				list2.add(new wine(a[i],i));
		}
		
		int i=0,j=0;
		int res=0;
		
		while(i<list1.size() && j<list2.size())
		{
			int min=Math.min(list1.get(i).val,-list2.get(j).val);
			list1.get(i).val-=min;
			list2.get(j).val+=min;
			int diff=Math.abs(list1.get(i).idx-list2.get(j).idx);
			res+=(min*diff);
			if(list1.get(i).val==0)
				i++;
			if(list2.get(j).val==0)
				j++;
		}
		
		System.out.println(res);
		
		sc.close();
		
		
		}
		
	
		
		
		
		
		
		
		
	}
}

class wine
{
	int val,idx;
	
	wine(int v,int i)
	{
		val=v;
		idx=i;
	}
}



