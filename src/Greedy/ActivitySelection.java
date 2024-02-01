package Greedy;

import java.util.*;




public class ActivitySelection {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int start[]=new int[n];
		int end[]=new int[n];
		for(int i=0;i<n;i++)
			start[i]=sc.nextInt();
		for(int i=0;i<n;i++)
			end[i]=sc.nextInt();
		sc.close();
		
		ArrayList<meet> list=new ArrayList<meet>();
		
		for(int i=0;i<n;i++)
		{
			list.add(new meet(start[i],end[i]));
		}
		
		Collections.sort(list,new Comparator<meet>() {
			
			public int compare(meet o1,meet o2)
			{
				return o1.end-o2.end;
				
			}
		});
		
		
		int res=1;
		int lim=list.get(0).end;
		
		for(int i=1;i<n;i++)
		{
			if(list.get(i).start>lim)
			{
				res++;
				lim=list.get(i).end;
			}
		}
		
		System.out.println(res);
				
				
				
		
		
		
		
	}
	
	

}


class meet
{
	int start,end;
	
	meet(int s,int e)
	{
		start=s;
		end=e;
	
	}
}



