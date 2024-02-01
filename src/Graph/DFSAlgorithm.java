package Graph;

import java.util.*;

public class DFSAlgorithm {
	
	

	 public ArrayList<Integer> dfsOfGraph(int v, ArrayList<ArrayList<Integer>> adj) {
		 
		 		ArrayList<Integer> list=new ArrayList<Integer>();
		 		boolean vis[]=new boolean[v];
		 		
				
						dfs(0,vis,adj,list);
						return list;
				}
				
			 
	 
	 
	 public void dfs(int i,boolean vis[],ArrayList<ArrayList<Integer>> adj,ArrayList<Integer> list)
	 	{
		 	list.add(i);
		 	vis[i]=true;
		 	
		 	for(int j:adj.get(i))
		 	{
		 		if(vis[j]==false)
		 			dfs(j,vis,adj,list);
		 	}
	    }
	 
}
	
	

