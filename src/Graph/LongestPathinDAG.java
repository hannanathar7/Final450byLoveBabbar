package Graph;


import java.util.*;



public class LongestPathinDAG {
	
	public static class Node
	{
		int v,wt;
		
		Node(int vv, int wwt)
		{
			
			v=vv;
			wt=wwt;
		}
	}
	
	

	 public static void longestPath(int v,ArrayList<ArrayList<Node>> adj,int src) {
		
		 
		 boolean vis[]=new boolean[v];
		 Stack<Integer> st=new Stack<>();
		 for(int i=0;i<v;i++)
		 {
			 if(vis[i]==false)
			 {
				 sort(i,vis,adj,st); 
			 }
		 }
		 
		 int dis[]=new int[v];
		 Arrays.fill(dis,Integer.MIN_VALUE);
		 dis[src]=0;
		 
		 while(st.size()>0)
		 {
			 int curr=st.pop();
			 if(dis[curr]!=Integer.MIN_VALUE)
			 {
				 for(Node n:adj.get(curr))
				 {
					 int u=dis[curr];
					 int wt=n.wt;
					 int vv=dis[n.v];
					 if(u+wt>vv)
						 dis[n.v]=dis[curr]+n.wt;
				 }
			 }
		 }
		 
		 for(int i=0;i<v;i++)
			 System.out.println(dis[i]);
		 
		 
		 
		 
		 
		 
	 }
	 
	 
	 public static void sort(int i,boolean vis[],ArrayList<ArrayList<Node>> adj,Stack<Integer> st)
	 	{
		 	vis[i]=true;
		 	
		 	for(Node n:adj.get(i))
		 	{
		 		if(vis[n.v]==false)
		 			sort(n.v,vis,adj,st);
		 	}
		 	
		 	st.push(i);
		 	
		 	
		 	
	    }
	 
	 public static void main(String args[])
		{
			int n=6;
			ArrayList<ArrayList<Node>> adj=new ArrayList<>();
			
			for(int i=1;i<=n;i++)
			{
				adj.add(new ArrayList<Node>());
			}
			
			adj.get(0).add(new Node(1,5));
			adj.get(1).add(new Node(5,5));
			adj.get(5).add(new Node(3,2));
			adj.get(3).add(new Node(2,20));
			adj.get(4).add(new Node(2,10));
			adj.get(5).add(new Node(2,50));
			adj.get(1).add(new Node(4,2));
			
			longestPath(n,adj,1);
			
		}
	 
}
	
	

