package StackAndQueue;

import java.util.*;

public class RottenOranges {

	
	
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int m=sc.nextInt();
		int n=sc.nextInt();
		int a[][]=new int[m][n];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		sc.close();
		
		
		System.out.println(orangesRotting(a));
		
		
		
	}
	
	public static int orangesRotting(int[][] a) {

        int m=a.length;
        int n=a[0].length;

        int vis[][]=new int[m][n];
        Queue<Pair> q=new LinkedList<>();

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(a[i][j]==2)
                {
                    q.add(new Pair(i,j,0));
                    vis[i][j]=2;
                }
            }
        }
        int maxtime=0;
        int di[]={0,0,-1,1};
        int dj[]={-1,1,0,0};

        while(q.size()>0)
        {
            
            Pair p=q.remove();
            int r=p.row;
            int c=p.col;
            int t=p.time;
            maxtime=Math.max(maxtime,t);

            for(int i=0;i<4;i++)
            {
            int newi=r+di[i];
            int newj=c+dj[i];

            if(newi<m && newi>=0 && newj<n && newj>=0 && vis[newi][newj]!=2 && a[newi][newj]==1)
            {
                q.add(new Pair(newi,newj,t+1));
                vis[newi][newj]=2;
            }
            }           

        }

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(a[i][j]==1 && vis[i][j]!=2)
                {
                    return -1;
                }
            }
        }

        return maxtime;




        
    }

    public static class Pair
    {
        int row,col,time;

        Pair(int r,int c,int t)
        {
            row=r;
            col=c;
            time=t;
        }
    }
}
