package Graph;

import java.util.*;

public class NegativeWeightCycle {
	
	public static class Node
	{
		int u,v,wt;
		
		Node(int uu,int vv, int wwt)
		{
			u=uu;
			v=vv;
			wt=wwt;
		}
	}
	
	public static void bellmanford(int n,ArrayList<Node> adj,int src)
	{
		int dis[]=new int[n];
		Arrays.fill(dis,1000000);
		
		dis[src]=0;
		
		for(int i=1;i<=n-1;i++)
		{
			for(Node node:adj)
			{
				if(dis[node.u]+node.wt<dis[node.v])
					dis[node.v]=dis[node.u]+node.wt;
			}
		}
		
		int flag=0;
		
		for(Node node:adj)
		{
			if(dis[node.u]+node.wt<dis[node.v])
			{
				flag=1;
				break;
			}
		}
		
		if(flag==1)
			System.out.println("Negative edge Cycle");
		
		else
		{
			for(int i=0;i<n;i++)
				System.out.print(dis[i]+" ");
		}
			
		
	}
	
	public static void main(String args[])
	{
		int n=6;
		ArrayList<Node> adj=new ArrayList<>();
		for(int i=1;i<=n;i++)
		{
			adj.add(new Node(3,2,6));
			adj.add(new Node(5,3,1));
			adj.add(new Node(0,1,5));
			adj.add(new Node(1,5,-3));
			adj.add(new Node(1,2,-2));
			adj.add(new Node(3,4,-2));
			adj.add(new Node(2,4,3));
			
			bellmanford(n,adj,0);
		}
	}

}
