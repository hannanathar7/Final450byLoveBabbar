package Graph;

import java.util.*;

public class BellmanFordAlgorithm {
	
	public static class Node
	{
		int u,v,wt;
		
		Node(int uu,int vv, int wwt)
		{
			u=uu;
			v=vv;
			wt=wwt;
		}
	}
	
	 static int[] bellman_ford(int n, ArrayList<ArrayList<Integer>> adj, int s) {
	        
	        
	        int dis[]=new int[n];
	        Arrays.fill(dis,100000000);
	        
	        dis[s]=0;
	        
	        for(int i=1;i<=n-1;i++)
	        {
	            for(ArrayList<Integer> list:adj)
	            {
	                int u=list.get(0);
	                int v=list.get(1);
	                int w=list.get(2);
	                
	                if(dis[u]!=100000000 && dis[u]+w<dis[v])
	                dis[v]=dis[u]+w;
	            }
	        }
	        
	        int flag=0;
	        
	         for(ArrayList<Integer> list:adj)
	            {
	                int u=list.get(0);
	                int v=list.get(1);
	                int w=list.get(2);
	                
	                if(dis[u]!=100000000 && dis[u]+w<dis[v])
	                {
	                    flag=1;
	                    break;
	                }
	            
	            }
	        
	        if(flag==0)
	        return dis;
	        
	        else
	        {
	            int r[]={-1};
	            return r;
	        }
	    }
	 
	
	public static void main(String args[])
	{
		
	}

}
