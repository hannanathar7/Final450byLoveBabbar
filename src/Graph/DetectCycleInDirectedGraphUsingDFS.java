package Graph;

import java.util.*;

public class DetectCycleInDirectedGraphUsingDFS {
	
	

	 public boolean detectCycle(int v, ArrayList<ArrayList<Integer>> adj) {
		 
		
		 		boolean vis[]=new boolean[v];
		 		boolean dfsvis[]=new boolean[v];
		 		
				for(int i=0;i<v;i++)
				{
					if(vis[i]==false)
					{
						if(detect(i,vis,dfsvis,adj))
							return true;
					}
				}
				return false;
			 }
	 
	 
	 public boolean detect(int i,boolean vis[],boolean dfsvis[],ArrayList<ArrayList<Integer>> adj)
	 	{

		 	vis[i]=true;
		 	dfsvis[i]=true;
		 	
		 	for(int j:adj.get(i))
		 	{
		 		if(vis[j]==false)
		 		{
		 			if(detect(j,vis,dfsvis,adj))
		 				return true;
		 		}
		 		
		 		else if(dfsvis[j]==true)
		 			return true;
		 	}
		 	
		 	dfsvis[i]=false;
		 	return false;
	    }
	 
}
	
	

