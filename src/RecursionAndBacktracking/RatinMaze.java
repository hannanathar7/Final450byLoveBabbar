package RecursionAndBacktracking;

import java.util.*;

public class RatinMaze {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[][]=new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		sc.close();
		ArrayList<String> res=new ArrayList<>();
	       int di[]={1,0,0,-1};
	       int dj[]={0,-1,1,0};
	       int vis[][]=new int[n][n];
	       String s="DLRU";
	       
	       if(a[0][0]==1)
	       solve(a,n,0,0,di,dj,"",s,vis,res);
	       
	        System.out.println(res);
	       
	    }
	    
	    public static void solve(int a[][],int n,int i,int j,int di[],int dj[],String ans,String s,int vis[][],ArrayList<String> res)
	    {
	        if(i==n-1 && j==n-1)
	        {
	            res.add(ans);
	            return;
	        }
	        
	        for(int idx=0;idx<4;idx++)
	        {
	            int nexti=i+di[idx];
	            int nextj=j+dj[idx];
	            
	            if(nexti>=0 && nextj>=0 && nexti<n && nextj<n && a[nexti][nextj]==1 && vis[nexti][nextj]==0)
	            {
	                vis[i][j]=1;
	                solve(a,n,nexti,nextj,di,dj,ans+s.charAt(idx),s,vis,res);
	                vis[i][j]=0;
	            }
	        }
	    }
	
	

}
