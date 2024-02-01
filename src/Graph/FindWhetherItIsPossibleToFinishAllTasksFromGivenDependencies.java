package Graph;

import java.util.*;

public class FindWhetherItIsPossibleToFinishAllTasksFromGivenDependencies {
	
	

	 public static boolean detectCycle(int v, ArrayList<ArrayList<Integer>> adj) {
		 
			
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


	 public static boolean detect(int i,boolean vis[],boolean dfsvis[],ArrayList<ArrayList<Integer>> adj)
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
	 
	 
	 public static boolean find(int n, int[][] a) {
			
			
			ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>();
			for(int i=0;i<n;i++)
			{
				adj.add(new ArrayList<Integer>());
			}
			
			for(int i=0;i<a.length;i++)
			{
				adj.get(a[i][1]).add(a[i][0]);	
			}
			
			boolean b=detectCycle(n,adj);
			return(!b);
			
	 }
	 
	 public static void main(String args[])
	 {
		 
		 int n=2;
		 int a[][]= {{0,1},{1,0}};
		 System.out.println(find(n,a));
	 }
	 
	 
	 
}
	
	

