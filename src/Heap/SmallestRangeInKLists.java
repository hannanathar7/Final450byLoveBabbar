package Heap;

import java.util.*;

public class SmallestRangeInKLists {
	
	
	static int[] findSmallestRange(int[][] a,int n,int k)
	{
	   int res[]= {-100000,100000};
	   int max=Integer.MIN_VALUE;
	   PriorityQueue<int[]> pq=new PriorityQueue<>((x,y)->(x[0]-y[0]));
	   for(int i=0;i<k;i++)
	   {
		   if(a[i][0]>max)
			   max=a[i][0];
		   
		   int arr[]= {a[i][0],0,i};
		   pq.add(arr);
	   }
	   
	   while(true)
	   {
		   int arr[]=pq.poll();
		   if(max-arr[0]<res[1]-res[0])
		   {
			   res[0]=arr[0];
			   res[1]=max;
		   }
		   arr[1]=arr[1]+1;
		   int arr2[]=a[arr[2]];
		   if(arr[1]==arr2.length)
			   break;
		   else
		   {
			   arr[0]=arr2[arr[1]];
			   max=Math.max(max,arr2[arr[1]]);
			   pq.add(arr);
		   }
		   
	   }
	   
	   return res;
	}
	
	
}
