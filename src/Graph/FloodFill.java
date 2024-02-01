package Graph;



 


public class FloodFill {
	
	public int[][] floodFill(int a[][], int sr,int sc,int nc)
    {
       
        int n=a.length;
        int m=a[0].length;
        boolean vis[][]=new boolean[n][m];
        int cc=a[sr][sc];
        fill(a,vis,sr,sc,n,m,cc,nc);
        return a;
        
        
    }
	
	public void fill(int a[][],boolean vis[][],int i,int j,int n,int m,int cc,int nc)
	{
		if(i<0 || j<0 || i>=n || j>=m || vis[i][j]==true || a[i][j]!=cc)
			return;
		
		a[i][j]=nc;
		vis[i][j]=true;
		
		fill(a,vis,i-1,j,n,m,cc,nc);
		fill(a,vis,i+1,j,n,m,cc,nc);
		fill(a,vis,i,j-1,n,m,cc,nc);
		fill(a,vis,i,j+1,n,m,cc,nc);
		
	}
	
	

}
