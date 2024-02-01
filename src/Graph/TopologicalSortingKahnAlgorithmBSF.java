package Graph;

import java.util.*;

public class TopologicalSortingKahnAlgorithmBSF {
	
	

	 public ArrayList<Integer> TopologicalSortingBFSKahn(int v, ArrayList<ArrayList<Integer>> adj) {
		 
		 		
		 		ArrayList<Integer> list=new ArrayList<Integer>();
		 		Queue<Integer> q=new ArrayDeque<Integer>();
		 		int indeg[]=new int[v];
		 		
		 		for(int i=0;i<v;i++)
		 		{
					for(int j:adj.get(i))
					{
						indeg[j]=indeg[j]+1;
					}
				}
		 		
		 		for(int i=0;i<v;i++)
		 		{
		 			if(indeg[i]==0)
		 				q.add(i);
		 		}
		 		
		 		while(q.size()>0)
		 		{
		 			int curr=q.remove();
		 			list.add(curr);
		 			for(int j:adj.get(curr))
					{
		 				if(indeg[j]>0)
		 				{
		 				indeg[j]=indeg[j]-1;
						if(indeg[j]==0)
							q.add(j);
		 				}
					}
		 		}
		 		
		 		
				return list;
			 }
		 
		 
	        
	    }
	
	

