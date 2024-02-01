package Graph;

import java.util.*;

public class BipartiteGraphBFS {
	
	public boolean isBipartite(int[][] graph) {

        int v=graph.length;
        
        int color[]=new int[v];
        Arrays.fill(color,-1);

       

        for(int i=0;i<v;i++)
        {
            if(color[i]==-1)
            {
                if(check(i,color,graph)==false)
                return false;
            }
           

        }

        return true;
        
    }

    public boolean check(int i,int color[],int graph[][])
    {
        Queue<Integer> q=new LinkedList<>();
         q.add(i);
        color[i]=0;

        while(q.size()>0)
        {
            int ele=q.remove();
            for(int j=0;j<graph[ele].length;j++)
            {
              

                if(color[graph[ele][j]]==-1)
                {
                    color[graph[ele][j]]=1-color[ele];
                    q.add(graph[ele][j]);
                }
                else
                {
                    if(color[graph[ele][j]]==color[ele])
                    return false;
                }
            }
        }
        return true;
    }
	 
	 public static void main(String args[])
	 {
		
	 }
	 
	 
}
	
	

