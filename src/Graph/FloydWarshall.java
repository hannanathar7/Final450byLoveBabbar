package Graph;



public class FloydWarshall {
	
	
	
	 public void shortest_distance(int[][] a)
	    {
	        int n=a.length;
	        
	       for(int i=0;i<n;i++)
	       {
	           for(int j=0;j<n;j++)
	           {
	               if(a[i][j]==-1)
	               a[i][j]=(int) 1e9;
	               
	           }
	       }
	       
	       for(int k=0;k<n;k++)
	       {
	           for(int i=0;i<n;i++)
	         {
	           for(int j=0;j<n;j++)
	           {
	               a[i][j]=Math.min(a[i][j],a[i][k]+a[k][j]);
	               
	           }
	       }
	       }
	       
	       
	       boolean negcycle=false;
	       for(int i=0;i<n;i++)
	       {
	           if(a[i][i]<0)
	           {
	               negcycle=true;
	           }
	       }
	       
	       	System.out.println(negcycle);
	       
	     
	       for(int i=0;i<n;i++)
	       {
	           for(int j=0;j<n;j++)
	           {
	               if(a[i][j]==(int) 1e9)
	               a[i][j]=-1;
	               
	           }
	       }
	       
	       
	       
	       for(int i=0;i<n;i++)
	       {
	           for(int j=0;j<n;j++)
	           {
	              System.out.print(a[i][j]+" ");
	           }
	           System.out.println();
	       }
	       
	       
	       
	       
	       
	    }
	 
	
	public static void main(String args[])
	{
		
	}

}
