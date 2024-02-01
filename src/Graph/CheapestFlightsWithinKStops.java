package Graph;

import java.util.*;

public class CheapestFlightsWithinKStops {
	
	public static class Node
	{
		int cost,city,k;
		
		Node(int c1,int c2,int c3)
		{
			cost=c1;
			city=c2;
			k=c3;
		}
	}
	
	public static class Pair
	{
		int v,wt;
		
		Pair(int c1,int c2)
		{
			v=c1;
			wt=c2;
		}
	}
	
	

	public int findCheapestPrice(int n, int[][] a, int src, int dst, int k) {
		
		ArrayList<ArrayList<Pair>> adj=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			adj.add(new ArrayList<Pair>());
		}
		
		for(int i=0;i<n;i++)
		{
			adj.get(a[i][0]).add(new Pair(a[i][1],a[i][2]));
		}

		PriorityQueue<Node> pq=new PriorityQueue<>((y,z)->(y.cost-z.cost));
		pq.add(new Node(0,src,0));
		
		while(pq.size()>0)
		{
				Node curr=pq.remove();
				int d=curr.city;
				int s=curr.k;
				int c=curr.cost;
				
				
				if(d==dst)
				{
					return c;
				}
				
				if(s>k)
				continue;
				
				for(Pair p:adj.get(d))
				{	
					pq.add(new Node(c+p.wt,p.v,s+1));
				}
		}
		
		return -1;
		
		
    }
 }
	
	

