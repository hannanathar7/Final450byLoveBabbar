package Greedy;

import java.util.*;




public class MaximumTrainsforStoppage {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int a[][]=new int[m][3];
		
		for(int i=0;i<m;i++)
		{
			a[i][0]=sc.nextInt();
			a[i][1]=sc.nextInt();
			a[i][2]=sc.nextInt();
		}
		
		int pla[]=new int[n+1];
		
		sc.close();
		
		ArrayList<train> list=new ArrayList<train>();
		
		for(int i=0;i<m;i++)
		{
			list.add(new train(a[i][0],a[i][1],a[i][2]));
		}
		
		Collections.sort(list,new Comparator<train>() {
			
			public int compare(train o1,train o2)
			{
				return o1.end-o2.end;
				
			}
		});
		
		
		int c=0;
		
		
		for(int i=0;i<m;i++)
		{
			int p=list.get(i).plat;
			if(pla[p]==0)
			{
				pla[p]=list.get(i).end;
				c++;
			}
			else
			{
				if(pla[p]<list.get(i).start)
				{
					pla[p]=list.get(i).end;
					c++;
				}
				
			}
		}
		
		System.out.println(c);
		
				
				
		
		
		
		
	}
	
	

}


class train
{
	int start,end,plat;
	
	train(int s,int e,int p)
	{
		start=s;
		end=e;
		plat=p;
	}
}




