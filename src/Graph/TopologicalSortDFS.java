package Graph;


import java.util.*;

public class TopologicalSortDFS {
	
	

	 public static void topological(int v,ArrayList<ArrayList<Integer>> adj) {
		
		 
		 boolean vis[]=new boolean[v];
		 Stack<Integer> st=new Stack<>();
		 for(int i=0;i<v;i++)
		 {
			 if(vis[i]==false)
			 {
				 sort(i,vis,adj,st); 
			 }
		 }
		 while(st.size()>0)
		 System.out.print(st.pop());
		 
		 
		 
	 }
	 
	 
	 public static void sort(int i,boolean vis[],ArrayList<ArrayList<Integer>> adj,Stack<Integer> st)
	 	{
		 	vis[i]=true;
		 	
		 	for(Integer x:adj.get(i))
		 	{
		 		if(vis[x]==false)
		 			sort(x,vis,adj,st);
		 	}
		 	
		 	st.push(i);
		 	
		 	
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
		 adj.get(1).add(2);
		 adj.get(0).add(3);
		 adj.get(2).add(3);
		 adj.get(4).add(3);
		 adj.get(4).add(5);
		 adj.get(4).add(6);
		 adj.get(5).add(6);
		
		 
		 
		 
		 topological(v,adj);
	 }
	 
}
	
	

