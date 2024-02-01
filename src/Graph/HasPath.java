package Graph;

import java.util.*;

public class HasPath {
	
	

	 public static boolean hasPath(int v,int src,int des, ArrayList<ArrayList<Integer>> adj) {
		
		 boolean b=false;
		 boolean vis[]=new boolean[v];
		 b=path(v,src,des,vis,adj);
		 
		 return b;
		 
	 }
	 
	 
	 public static boolean path(int v,int src,int des,boolean vis[],ArrayList<ArrayList<Integer>> adj)
	 	{
		 	if(src==des)
		 		return true;
		 	
		 	vis[src]=true;
		 	
		 	for(int x:adj.get(src))
		 	{
		 		if(vis[x]==false)
		 		{
		 			boolean b=path(v,x,des,vis,adj);
		 			if(b==true)
		 				return true;
		 		}
		 	}
		 	
		 	return false;
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
		 
		 
		 
		 System.out.println(hasPath(v,0,6,adj));
	 }
	 
}
	
	

