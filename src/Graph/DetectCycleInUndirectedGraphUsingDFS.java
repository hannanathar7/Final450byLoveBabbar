package Graph;

import java.util.*;

public class DetectCycleInUndirectedGraphUsingDFS {
	
	

	 public boolean detectCycle(int v, ArrayList<ArrayList<Integer>> adj) {
		 
		
		 		boolean vis[]=new boolean[v];
		 		
		 		
				for(int i=0;i<v;i++)
				{
					if(vis[i]==false)
					{
						if(detect(i,-1,vis,adj))
							return true;
					}
				}
				return false;
			 }
	 
	 
	 public boolean detect(int i,int parent,boolean vis[],ArrayList<ArrayList<Integer>> adj)
	 	{

		 	vis[i]=true;
		 	
		 	
		 	for(int j:adj.get(i))
		 	{
		 		if(vis[j]==false)
		 		{
		 			if(detect(j,i,vis,adj))
		 				return true;
		 		}
		 		
		 		else if(j!=parent)
		 			return true;
		 	}
		 	
		 	
		 	return false;
	    }
	 
}
	
	

