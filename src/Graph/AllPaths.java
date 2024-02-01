package Graph;

import java.util.*;

public class AllPaths {
	
	

	 public static void allPath(int v,int src,int des, ArrayList<ArrayList<Integer>> adj) {
		
		 
		 boolean vis[]=new boolean[v];
		 String res="";
		 path(v,src,des,vis,adj,res+src);
		 
		 
	 }
	 
	 
	 public static void path(int v,int src,int des,boolean vis[],ArrayList<ArrayList<Integer>> adj,String res)
	 	{
		 	if(src==des)
		 	{
		 		System.out.println(res);
		 		return;
		 	}
		 	
		 	vis[src]=true;
		 	
		 	for(int x:adj.get(src))
		 	{
		 		if(vis[x]==false)
		 		{
		 			path(v,x,des,vis,adj,res+x);
		 		}
		 	}
		 	vis[src]=false;
		 	
		 	
	    }
	 
	 public static void main(String args[])
	 {
		 int v=7;
		 ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>();
		 for(int i=0;i<v;i++)
		 {
			 adj.add(new ArrayList<Integer>());
		 }
		 adj.get(0).add(1);
		 adj.get(0).add(3);
		 adj.get(1).add(0);
		 adj.get(1).add(2);
		 adj.get(2).add(1);
		 adj.get(2).add(3);
		 adj.get(3).add(0);
		 adj.get(3).add(2);
		 adj.get(3).add(4);
		 adj.get(4).add(3);
		 adj.get(4).add(5);
		 adj.get(4).add(6);
		 adj.get(5).add(4);
		 adj.get(5).add(6);
		 adj.get(6).add(4);
		 adj.get(6).add(5);
		 
		 
		 
		 allPath(v,0,6,adj);
	 }
	 
}
	
	

