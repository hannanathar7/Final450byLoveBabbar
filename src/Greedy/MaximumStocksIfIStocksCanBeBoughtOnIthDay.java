package Greedy;

import java.util.*;




public class MaximumStocksIfIStocksCanBeBoughtOnIthDay {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int a[]=new int[n];
		
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		
		int k=sc.nextInt();
		sc.close();
		
		ArrayList<stock> list=new ArrayList<stock>();
		
		for(int i=0;i<n;i++)
		{
			list.add(new stock(a[i],i+1));
		}
		
		Collections.sort(list,new Comparator<stock>() {
			
			public int compare(stock o1,stock o2)
			{
				if(o1.price<o2.price)
					return -1;
				
				else if(o1.price==o2.price)
					return o1.pos-o2.pos;
				
				else
					return 1;
				
			}
		});
		
		int c=0;
		
		for(int i=0;i<n;i++)
		{
			if(list.get(i).price*list.get(i).pos<=k)
			{
				c+=list.get(i).pos;
				k-=list.get(i).price*list.get(i).pos;
			}
			else
			{
				int q=k/(list.get(i).price);
				c+=q;
				k-=list.get(i).price*q;
			}
				
			
		}
		
		
		
		System.out.println(c);
				
				
				
		
		
		
		
	}
	
	

}


class stock
{
	int price,pos;
	
	stock(int pr,int po)
	{
		price=pr;
		pos=po;
	
	}
}



