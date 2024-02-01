package Graph;




public class NoOfIslands {
	
	

	public int numIslands(char[][] a) {
	       
	       int n=a.length;
	       int m=a[0].length;
	       boolean vis[][]=new boolean[n][m];
			int c=0;
			 for(int i=0;i<n;i++)
			 {
				 for(int j=0;j<m;j++)
				 {
				 if(vis[i][j]==false && a[i][j]=='1')
				 {
					 path(i,j,vis,a);
					 c++;
				 }
				 }
			 }
			 
			 return(c);
			 
			 
			 
		 }
		 
		 
		 public static void path(int i,int j,boolean vis[][],char a[][])
		 	{
			 	if(i<0 || j<0 || i>=a.length || j>=a[0].length || vis[i][j]==true || a[i][j]=='0')
			 		return;
			 	
			 	vis[i][j]=true;
			 	
			 	path(i-1,j,vis,a);
			 	path(i,j+1,vis,a);
			 	path(i,j-1,vis,a);
			 	path(i+1,j,vis,a);
			 	
			 	path(i-1,j-1,vis,a);
			 	path(i-1,j+1,vis,a);
			 	path(i+1,j-1,vis,a);
			 	path(i+1,j+1,vis,a);
	    }
	 
	 
	 public static void main(String args[])
	 {
		
	 }
	 
}
	
	

