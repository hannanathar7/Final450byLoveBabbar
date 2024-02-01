package Graph;

import java.util.*;

public class MinimumTimeTakenByEachJobtobeCompletedgivenbyDAG {
	
	

	 public static int[] TopologicalSortingBFSKahn(int v, ArrayList<ArrayList<Integer>> adj) {
		 
		 		
		 		int res[]=new int[v];
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
		 			{
		 				q.add(i);
		 				res[i]=1;
		 			}
		 		}
		 		
		 		while(q.size()>0)
		 		{
		 			int curr=q.remove();
		 			for(int j:adj.get(curr))
					{
		 				if(indeg[j]>0)
		 				{
		 				indeg[j]=indeg[j]-1;
						if(indeg[j]==0)
						{
							q.add(j);
							res[j]=res[curr]+1;
						}
		 				}
					}
		 			
		 		}
		 		
		 		
				return res;
			 }
	 
	 
	 public static void main(String args[])
	 {
		 int v=10;
		 ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>();
		 for(int i=0;i<v;i++)
		 {
			 adj.add(new ArrayList<Integer>());
		 }
		 adj.get(0).add(2);
		 adj.get(0).add(3);
		 adj.get(0).add(4);
		 
		 
		 
		 adj.get(1).add(2);
		 adj.get(1).add(8);
		 
		 adj.get(2).add(5);
		 
		 adj.get(3).add(5);
		 adj.get(3).add(7);
		 
		 adj.get(4).add(7);
		 
		 adj.get(5).add(6);
		 
		 adj.get(6).add(7);
		 
		 adj.get(7).add(9);
		 
		 
		 int a[]=TopologicalSortingBFSKahn(v,adj);
		 for(int i=0;i<a.length;i++)
			 System.out.print(a[i]+" ");
		 
		 
		 
	 }
		 
		 
	        
	    }
	
	

