package Heap;

import java.util.*;

public class MergeKSortedArrays {
	
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int a[][]=new int[n][n];
		sc.close();
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		ArrayList<Integer> res=mergeKArrays(a,n);
		System.out.println(res);
	}
	
	public static ArrayList<Integer> mergeKArrays(int[][] a,int n) 
    {
        
        ArrayList<Integer> res=new ArrayList<>();
        
        PriorityQueue<Triplet> pq=new PriorityQueue<>((Triplet o1,Triplet o2)->(o1.val-o2.val));
        for(int i=0;i<n;i++)
        {
            pq.add(new Triplet(a[i][0],i,0));
        }
        
        while(pq.size()>0)
        {
            Triplet t=pq.remove();
            int val=t.val;
            int i=t.i;
            int j=t.j;
            
            res.add(val);
            
            if(j+1<n)
            pq.add(new Triplet(a[i][j+1],i,j+1));
        }
        
        return res;
        
    }
      
      
      
      public static class Triplet
	    {
	        int val,i,j;
	        
	        Triplet(int v,int ii,int jj)
	        {
	            val=v;
	            i=ii;
	            j=jj;
	        }
	    }
	
	
}
