package Graph;

import java.util.*;

public class KruskalsAlgorithm {
	
	
	public static class DisjointSet {
	    
		ArrayList<Integer> par=new ArrayList<>();
		ArrayList<Integer> rank=new ArrayList<>();

		
		DisjointSet(int n)
		{
			for(int i=0;i<=n;i++)
			{
				par.add(i);
				rank.add(0);
			}
		}
		
		public int findUPar(int u)
		{
			if(u==par.get(u))
				return u;
			
			int ulp=findUPar(par.get(u));
			par.set(u,ulp);
			return ulp;
		}
		
		public void UnionByRank(int u,int v)
		{
			int upu=findUPar(u);
			int upv=findUPar(v);
			
			if(upu==upv)
				return; // belong to the same component
			
			if(rank.get(upu)<rank.get(upv))
			{
				par.set(upu,upv);
			}
			else if(upv<upu)
			{
				par.set(upv, upu);
			}
			else
			{
				par.set(upu, upv);
				rank.set(upv, rank.get(upv)+1);
			}
		}
		
	}
	
	public static class Edge{
	    int u,v,wt;
	    
	    Edge(int uu,int vv,int ww)
	    {
	        u=uu;
	        v=vv;
	        wt=ww;
	    }
	}
		
	
	
	
	
 static int spanningTree(int n, int e, int edges[][]){
	    
	    
	   
	    ArrayList<Edge> list=new ArrayList<>();
	    
	    for(int i=0;i<e;i++)
	    {
	    	list.add(new Edge(edges[i][0],edges[i][1],edges[i][2]));
	    	list.add(new Edge(edges[i][1],edges[i][0],edges[i][2]));
	    }
	    
	    Collections.sort(list,new Comparator <Edge>() {
	    	
	    	public int compare(Edge e1,Edge e2)
	    	{
	    		return e1.wt-e2.wt;
	    	}
	    });
	    
	    
	    int sum=0;
	    
	    DisjointSet ds=new DisjointSet(n);
	    
	    for(Edge ed:list)
	    {
	    	int u=ed.u;
	    	int v=ed.v;
	    	int wt=ed.wt;
	    	
	    	if(ds.findUPar(u)!=ds.findUPar(v))
	    	{
	    		sum+=wt;
	    	ds.UnionByRank(u, v);
	    	}
	    	
	    }
	    
	    return sum;
	    
	}
	
	
		 		
		 		
		 		
	 
	 
	 
	 
	 public static void main(String args[])
	 {
		
	 }
	 
	 
}


	

