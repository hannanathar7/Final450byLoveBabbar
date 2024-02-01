package Graph;

import java.util.*;

public class BipartiteGraphDFS {
	
	 public boolean isBipartite(int[][] graph) {

	        int v=graph.length;
	        
	        int color[]=new int[v];
	        Arrays.fill(color,-1);

	       

	        for(int i=0;i<v;i++)
	        {
	            if(color[i]==-1)
	            {
	                color[i]=0;
	                if(dfs(i,color,graph)==false)
	                return false;
	            }
	           

	        }

	        return true;
	        
	    }

	    public boolean dfs(int i,int color[],int graph[][])
	    {
	     
	           
	            for(int j=0;j<graph[i].length;j++)
	            {
	              
	                if(color[graph[i][j]]==-1)
	                {
	                    color[graph[i][j]]=1-color[i];
	                    if(dfs(graph[i][j],color,graph)==false)
	                    return false;
	                }
	                else
	                {
	                    if(color[graph[i][j]]==color[i])
	                    return false;
	                }
	            }
	        
	        return true;
	    }
	 
	 public static void main(String args[])
	 {
		
	 }
	 
	 
}
	
	

