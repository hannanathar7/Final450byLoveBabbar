package Graph;

import java.util.*;

public class BFSAlgorithm {
	
	

	 public ArrayList<Integer> bfsOfGraph(int v, ArrayList<ArrayList<Integer>> adj) {
		 
		 		ArrayList<Integer> list=new ArrayList<>();
		 		boolean vis[]=new boolean[v];
		 		
		 		for(int i=0;i<v;i++)
		 		{
		 			if(vis[i]==false)
		 			{
		 				Queue<Integer> q=new LinkedList<>();
		 				q.add(i);
		 				vis[i]=true;
				
				while(q.size()>0)
				{
					int curr=q.remove();
					list.add(curr);
					
					for(int j:adj.get(curr))
					{
						if(vis[j]==false)
						{
							vis[j]=true;
							q.add(j);
						}
					}
				}
		 		}
		 		}
				return list;
			 }
		 
		 
	        
	    }
	
	

