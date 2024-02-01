package Graph;


import java.util.*;

public class NumberofOperationstoMakeNetworkConnected {
	
		public static int makeConnection(int n, int[][] a) {
			
			
			ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>();
			int edge=a.length;
			
			for(int i=0;i<n;i++)
			{
				adj.add(new ArrayList<Integer>());
			}
			
			for(int i=0;i<a.length;i++)
			{
				adj.get(a[i][0]).add(a[i][1]);
				adj.get(a[i][1]).add(a[i][0]);
			}
		
			
			int c=components(n,adj);
			
			
			
			if(edge<n-1)
				return -1;
			
			
			return c-1;
			
			
			
        
		}
		
		 public static int components(int v,ArrayList<ArrayList<Integer>> adj) {
				
			 
			 int c=0;
			 boolean vis[]=new boolean[v];
			 for(int i=0;i<v;i++)
			 {
				 if(vis[i]==false)
				 {
					 c++;
					 path(i,vis,adj);
				 }
			 }
			return c;
			 
			 
			 
		 }
	
	 
	 public static void path(int i,boolean vis[],ArrayList<ArrayList<Integer>> adj)
	 	{
		 	vis[i]=true;
		 	for(Integer x:adj.get(i))
		 	{
		 		if(vis[x]==false)
		 			path(x,vis,adj);
		 	}
		 		
	    }
	 
	 
	 public static void main(String args[])
	 {
		 int a[][]= {{1,4},{0,3},{1,3},{3,7},{2,7},{0,1},{2,4},{3,6},{5,6},{6,7},{4,7},{0,7},{5,7}};
		 System.out.println(makeConnection(11,a));
	 }
	 
}
	
	

