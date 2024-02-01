package Graph;

import java.util.*;

public class SpreadInfection {
	
	public static class Node{
		
		int i,time;
		
		Node(int v,int t)
		{
			i=v;
			time=t;
		}
	}
	
	

	 public static int spread(int v, ArrayList<ArrayList<Integer>> adj,int t,int src) {
		 
		 		int c=0;
		 		Queue<Node> q=new LinkedList<>();
		 		boolean vis[]=new boolean[v];
		 		q.add(new Node(src,1));
		 		
		 		while(q.size()>0)
		 		{
		 			Node curr=q.remove();
		 			int i=curr.i;
		 			int time=curr.time;
		 			
		 			if(time>t)
		 				break;
		 			
		 			if(vis[i]==false)
		 			{
		 				vis[i]=true;
		 				c++;
		 			}
		 			
		 			for(Integer j:adj.get(i))
		 			{
		 				if(vis[j]==false)
		 					q.add(new Node(j,time+1));
		 			}
		 		}
		 		
		 		return c;
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
		 adj.get(0).add(3);
		 adj.get(3).add(0);
		 
		 adj.get(1).add(2);
		 adj.get(2).add(1);
		 
		 adj.get(2).add(3);
		 adj.get(3).add(2);
		 
		 adj.get(3).add(4);
		 adj.get(4).add(3);
		 
		 adj.get(4).add(5);
		 adj.get(4).add(6);
		 adj.get(5).add(4);
		 adj.get(6).add(4);
		 
		 
		 adj.get(5).add(6);
		 adj.get(6).add(5);
		 
		 int t=3,src=6;
		 
		 System.out.println(spread(v,adj,t,src));
	 }
	 
	 
}
	
	

