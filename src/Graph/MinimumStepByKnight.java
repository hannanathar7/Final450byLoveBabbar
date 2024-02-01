package Graph;

import java.util.*;

 


public class MinimumStepByKnight {
	
	class Pair{
		
		int i,j;
		
		Pair(int x,int y)
		{
			i=x;
			j=y;
		}
		
	}
	
	public int minStepToReachTarget(int KnightPos[], int TargetPos[], int n)
    {
        int si=KnightPos[0]-1;
        int sj=KnightPos[1]-1;
        int x=TargetPos[0]-1;
        int y=TargetPos[1]-1;
        
        int a[][]=new int[n][n];
        
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(si,sj));
        
        while(q.size()>0)
        {
        	Pair curr=q.remove();
        	int i=curr.i;
        	int j=curr.j;
        	
        	if(i-2<n && j+1<n && i-2>=0 && j+1>=0 && a[i-2][j+1]==0)
        	{
        		q.add(new Pair(i-2,j+1));
        		a[i-2][j+1]=a[i][j]+1;
        	}
        	
        	if(i-1<n && j+2<n && i-1>=0 && j+2>=0 && a[i-1][j+2]==0 )
        	{
        		q.add(new Pair(i-1,j+2));
        		a[i-1][j+2]=a[i][j]+1;
        	}
        	
        	if(i+1<n && j+2<n && i+1>=0 && j+2>=0 && a[i+1][j+2]==0)
        	{
        		q.add(new Pair(i+1,j+2));
        		a[i+1][j+2]=a[i][j]+1;
        	}
        	
        	if(i+2<n && j+1<n && i+2>=0 && j+1>=0 && a[i+2][j+1]==0)
        	{
        		q.add(new Pair(i+2,j+1));
        		a[i+2][j+1]=a[i][j]+1;
        	}
        	
        	if(i+2<n && j-1<n && i+2>=0 && j-1>=0 && a[i+2][j-1]==0)
        	{
        		q.add(new Pair(i+2,j-1));
        		a[i+2][j-1]=a[i][j]+1;
        	}
        	
        	if(i+1<n && j-2<n && i+1>=0 && j-2>=0 && a[i+1][j-2]==0)
        	{
        		q.add(new Pair(i+1,j-2));
        		a[i+1][j-2]=a[i][j]+1;
        	}
        	
        	if(i-1<n && j-2<n && i-1>=0 && j-2>=0 && a[i-1][j-2]==0)
        	{
        		q.add(new Pair(i-1,j-2));
        		a[i-1][j-2]=a[i][j]+1;
        	}
        	
        	if(i-2<n && j-1<n && i-2>=0 && j-1>=0 && a[i-2][j-1]==0)
        	{
        		q.add(new Pair(i-2,j-1));
        		a[i-2][j-1]=a[i][j]+1;
        	}
        	
        }
        
        return a[x][y];
        
        
    }

}
