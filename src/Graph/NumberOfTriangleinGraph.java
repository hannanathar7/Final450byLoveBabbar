
package Graph;




public class NumberOfTriangleinGraph {
	
	
	
	
	public static int countTriangle(int graph[][],boolean isDirected)
	{
		int c=0;
		int v=graph.length;
		
		for(int i=0;i<v;i++)
		{
			for(int j=0;j<v;j++)
			{
				for(int k=0;k<v;k++)
				{
					if(graph[i][j]==1 && graph[j][k]==1 && graph[k][i]==1)
						c++;
				}
			}
		}
		
	
		
		if(isDirected==true)
			c=c/3;
		else
			c=c/6;
		
		return c;
		
	}
	
	public static void main(String args[])
	   {

	       int graph[][] = {{0, 1, 1, 0},
	                        {1, 0, 1, 1},
	                        {1, 1, 0, 1},
	                        {0, 1, 1, 0}
	                       };
	     
	      
	       int digraph[][] = { {0, 0, 1, 0},
	                           {1, 0, 0, 1},
	                           {0, 1, 0, 0},
	                           {0, 0, 1, 0}
	                         };

	    System.out.println("The Number of triangles in undirected graph : "+countTriangle(graph, false));
	 
	    System.out.println("The Number of triangles in directed graph : "+countTriangle(digraph, true));
	 
	   }
	 
	 
}
	
	

