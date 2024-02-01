package Graph;


import java.util.*;

public class isGraphConnected {
	
	

	 public static boolean components(int v,ArrayList<ArrayList<Integer>> adj) {
		
		 
		 boolean vis[]=new boolean[v];
		 ArrayList<ArrayList<Integer>> comps=new ArrayList<ArrayList<Integer>>();
		 for(int i=0;i<v;i++)
		 {
			 if(vis[i]==false)
			 {
				 ArrayList<Integer> list=new ArrayList<>();
				 path(i,vis,list,adj);
				 comps.add(list);
			 }
		 }
		 return((comps.size()==1));
		 
		 
		 
	 }
	 
	 
	 public static void path(int i,boolean vis[],ArrayList<Integer> list,ArrayList<ArrayList<Integer>> adj)
	 	{
		 	vis[i]=true;
		 	list.add(i);
		 	
		 	for(Integer x:adj.get(i))
		 	{
		 		if(vis[x]==false)
		 			path(x,vis,list,adj);
		 	}
		 	
		 	
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
		 adj.get(1).add(0);
		 
		
		 adj.get(2).add(3);
		 adj.get(3).add(2);
		 
		 adj.get(4).add(5);
		 adj.get(4).add(6);
		 adj.get(5).add(4);
		 adj.get(5).add(6);
		 adj.get(6).add(4);
		 adj.get(6).add(5);
		 
		 
		 
		 System.out.println(components(v,adj));
	 }
	 
}
	
	

