package Graph;

import java.util.*;

public class BridgeInGraph {
	
	

	 public static void printBridges(int v, ArrayList<ArrayList<Integer>> adj) {
		
		 boolean vis[]=new boolean[v];
		 int tin[]=new int[v];
		 int min[]=new int[v];
		 
		 for(int i=0;i<v;i++)
		 {
			 if(vis[i]==false)
			 {
				dfs(i,-1,vis,tin,min,0,adj); 
			 }
		 }
	 }
	 
	 public static void dfs(int i,int par,boolean vis[], int tin[], int min[],int timer,ArrayList<ArrayList<Integer>> adj)
	 	{
		 	
		 	vis[i]=true;
		 	tin[i]=min[i]=timer++;
		 	
		 	for(int j:adj.get(i))
		 	{
		 		if(j==par)
		 			continue;
		 		
		 		if(vis[j]==false)
		 		{
		 			
		 			dfs(j,i,vis,tin,min,timer,adj); 
		 			min[i]=Math.min(min[i],min[j]);
		 			if(min[j]>tin[i])
		 				System.out.println("Bridge is "+i+" "+j);
		 		}
		 		else
		 		{
		 			min[i]=Math.min(min[i],tin[j]);
		 		}
		 	}
	    }
	 
	 
	 public static void main(String args[])
	    {
	        int n = 5;
	        ArrayList<ArrayList<Integer> > adj = new ArrayList<ArrayList<Integer> >();
			
			for (int i = 0; i < n; i++) 
				adj.add(new ArrayList<Integer>());
				
			adj.get(0).add(1);
			adj.get(1).add(0);

			adj.get(0).add(2);
			adj.get(2).add(0);

			adj.get(1).add(2);
			adj.get(2).add(1);

			adj.get(1).add(3);
			adj.get(3).add(1);

			adj.get(3).add(4);
			adj.get(4).add(3);
				
			
			printBridges(n,adj); 
			
	    }
	 
}
	
	

