package Graph;

import java.util.*;

public class MColoringProblem {
	
	public static boolean graphColoring(List<Integer>[] g, int[] color, int i, int m) 
    {
		int n=g.length;
		
		if(check(i,g,color,m,n)==true)
			return true;
		
		return false;
       
    }
	
	public static boolean check(int i,List<Integer>[] g, int[] color, int m,int n)
	{
		if(i==n)
			return true;
		
		for(int j=1;j<=m;j++)
		{
			if(safe(i,g,color,j,m,n))
			{
				color[i]=j;
				if(check(i+1,g,color,m,n)==true)
					return true;
				color[i]=0;
			}
		}
		
		return false;
	}
	
	public static boolean safe(int i,List<Integer>[] g, int[] color,int j, int m,int n)
	{
		for(int k:g[i])
		{
			if(color[k]==j)
				return false;
		}
		
		return true;
	}

}
