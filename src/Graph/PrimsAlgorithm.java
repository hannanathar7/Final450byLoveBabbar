package Graph;

import java.util.*;




public class PrimsAlgorithm {
	
	
static int spanningTree(int v, int e, int edges[][]){
	    
	    
	    ArrayList<ArrayList<Pair>> adj=new ArrayList<>();
	    
	    for(int i=0;i<v;i++)
	    adj.add(new ArrayList<>());
	    
	    for(int i=0;i<e;i++)
	    {
	        adj.get(edges[i][0]).add(new Pair(edges[i][1],edges[i][2]));
	        adj.get(edges[i][1]).add(new Pair(edges[i][0],edges[i][2]));
	    }
	    
	    PriorityQueue<Pair> pq=new PriorityQueue<>((Pair p1,Pair p2)->(p1.wt-p2.wt));
	    pq.add(new Pair(0,0));
	    
	    boolean vis[]=new boolean[v];
	    int sum=0;
	    
	    while(pq.size()>0)
	    {
	        Pair p=pq.remove();
	        int i=p.i;
	        int wt=p.wt;
	        
	        if(vis[i]==true)
	        continue;
	        
	        vis[i]=true;
	        sum+=wt;
	        
	        for(Pair a:adj.get(i))
	        {
	            if(vis[a.i]==false)
	            pq.add(new Pair(a.i,a.wt));
	        }
	        
	        
	    }
	    
	    return sum;
	    
	}
	
	public static class Pair{
	    int i,wt;
	    
	    Pair(int ii,int w)
	    {
	        i=ii;
	        wt=w;
	    }
	}
		 		
		 		
		 		
	 
	 
	 
	 
	 public static void main(String args[])
	 {
		
	 }
	 
	 
}
	
	

