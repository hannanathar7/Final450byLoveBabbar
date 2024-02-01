package Graph;

import java.util.*;

public class KosarajuStronglyConnectedComponets {
	
	

	public static void kosaraju(int v, ArrayList<ArrayList<Integer>> adj)
    {
		 boolean vis[]=new boolean[v];
		 Stack<Integer> st=new Stack<>();
		 for(int i=0;i<v;i++)
		 {
			 if(vis[i]==false)
			 {
				 sort(i,vis,adj,st); 
			 }
		 }
		 
		 
		 ArrayList<ArrayList<Integer>> trans=new ArrayList<>();
		 
		 for(int i=0;i<v;i++)
		 {
			 trans.add(new ArrayList<Integer>());
		 }
		 
		 for(int i=0;i<v;i++)
		 {
			 vis[i]=false;
			 
			 for(Integer j:adj.get(i))
			 {
				 trans.get(j).add(i);
			 }
		 
		 }
		 
		 
		 while(st.size()>0)
		 {
			 int curr=st.pop();
			 if(vis[curr]==false)
			 {
				 System.out.print("SSC ");
				 revdfs(curr,trans,vis);
				 System.out.println();
			 }
		 }
		 
		 
		 
		 
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
	
	
	public static void revdfs(int i,ArrayList<ArrayList<Integer>> trans,boolean vis[])
 	{
	 	vis[i]=true;
	 	System.out.print(i+" ");
	 	
	 	for(Integer x:trans.get(i))
	 	{
	 		if(vis[x]==false)
	 		{
	 			revdfs(x,trans,vis);
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
			adj.get(1).add(2);
			adj.get(2).add(0);
			adj.get(1).add(3);
			adj.get(3).add(4);

				
			
			kosaraju(n,adj); 
			
	    }
	 
}
	
	

