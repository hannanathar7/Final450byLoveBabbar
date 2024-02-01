package Graph;

import java.util.*;

public class DetectCycleInUndirectedGraphUsingBFS {
	
	public class Node{
		
		int i,par;
		
		Node(int v,int p)
		{
			i=v;
			par=p;
		}
	}
	
	

	 public boolean detectCycle(int v, ArrayList<ArrayList<Integer>> adj) {
		 
		
		 		boolean vis[]=new boolean[v];
		 		
		 		
				for(int i=0;i<v;i++)
				{
					if(vis[i]==false)
					{
						if(detect(i,vis,adj))
							return true;
					}
				}
				return false;
			 }
	 
	 
	 public boolean detect(int i,boolean vis[],ArrayList<ArrayList<Integer>> adj)
	 	{

		 	Queue<Node> q=new LinkedList<>();
		 	q.add(new Node(i,-1));
		 	vis[i]=true;
		 	
		 	while(q.size()>0)
		 	{
		 		Node curr=q.remove();
		 		int v=curr.i;
		 		int p=curr.par;
		 	
		 	for(int j:adj.get(v))
		 	{
		 		if(vis[j]==false)
		 		{
		 			q.add(new Node(j,v));
		 			vis[j]=true;
		 		}
		 		
		 		else if(j!=p)
		 			return true;
		 	}
		 	}
		 	
		 	
		 	return false;
	    }
	 
}
	
	

