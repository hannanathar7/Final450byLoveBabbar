package Graph;


import java.util.*;



public class FindIfThereisPathofMorethanKLengthFromSource {
	
	public static class Node
	{
		int v,wt;
		
		Node(int vv, int wwt)
		{
			
			v=vv;
			wt=wwt;
		}
	}
	
	

	 public static boolean find(int v,ArrayList<ArrayList<Node>> adj,int src,int k,boolean vis[]) {
		
		vis[src]=true;
		
		if(k<=0)
			return true;
		
		for(Node n:adj.get(src))
		{
			if(vis[n.v]==true)
				continue;
			
			if(n.wt>=k)
				return true;
			
			if(find(v,adj,n.v,k-n.wt,vis))
				return true;
		}
		
		vis[src]=false;
		 return false; 
		 
	 }
	 
	 
	 
	 
	 public static void main(String args[])
		{
			int n=6;
			ArrayList<ArrayList<Node>> adj=new ArrayList<>();
			
			for(int i=0;i<n;i++)
			{
				adj.add(new ArrayList<Node>());
			}
			
			adj.get(0).add(new Node(1,5));
			adj.get(1).add(new Node(0,5));
			
			adj.get(1).add(new Node(5,5));
			adj.get(5).add(new Node(1,5));
			
			adj.get(5).add(new Node(3,2));
			adj.get(3).add(new Node(5,2));
			
			adj.get(3).add(new Node(2,20));
			adj.get(2).add(new Node(3,20));
			
			adj.get(4).add(new Node(2,10));
			adj.get(2).add(new Node(4,10));
			
			adj.get(5).add(new Node(2,50));
			adj.get(2).add(new Node(5,50));
			
			adj.get(1).add(new Node(4,2));
			adj.get(4).add(new Node(1,2));
			
			boolean vis[]=new boolean[n];
			int src=0;
			int k=81;
			
			System.out.println(find(n,adj,src,k,vis));
			
		}
	 
}
	
	

