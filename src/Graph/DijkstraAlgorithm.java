
package Graph;

import java.util.*;


public class DijkstraAlgorithm {
	
	
	static int[] dijkstra(int v, ArrayList<ArrayList<ArrayList<Integer>>> adj, int s)
    {
       int dis[]=new int[v];
       Arrays.fill(dis,Integer.MAX_VALUE);
       
       PriorityQueue<Pair> pq=new PriorityQueue<>((Pair a,Pair b)->(a.di-b.di));
       
       dis[s]=0;
       pq.add(new Pair(0,s));
       
       while(pq.size()>0)
       {
           Pair p=pq.remove();
           int di=p.di;
           int vi=p.v;
           
           for(int i=0;i<adj.get(vi).size();i++)
           {
               int ele=adj.get(vi).get(i).get(0);
               int d=adj.get(vi).get(i).get(1);
               
               if(di+d<dis[ele])
               {
                   dis[ele]=di+d;
                   pq.add(new Pair(dis[ele],ele));
               }
           }
       }
       
       return dis;
       
       
       
    }
    
    public static class Pair{
        
        int di,v;
        
        Pair(int d,int ii)
        {
            di=d;
            v=ii;
            
            
        }
    }
		 		
		 		
	 
		 		
		 	
	 
	public static void main(String args[])
	 {
		
		
	 }
	 
	 
}
	
	

