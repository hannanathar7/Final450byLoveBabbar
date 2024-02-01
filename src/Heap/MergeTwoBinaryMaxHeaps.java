package Heap;

public class MergeTwoBinaryMaxHeaps {
	
	public static void merge(int a[],int b[],int n,int m)
	{
		int c[]=new int[n+m];
		for(int i=0;i<n;i++)
			c[i]=a[i];
		
		for(int i=0;i<m;i++)
			c[i+n]=b[i];
		
		buildheap(c,c.length);
		for(int i=0;i<c.length;i++)
		System.out.print(c[i]+" ");
	}
	
	public static void buildheap(int a[],int n)
	{
		for(int i=n/2-1;i>=0;i--)
		{
			heapify(a,i,n);
		}
	}
	
	public static void heapify(int a[],int i,int n)
	{
		int largest=i;
		int left=2*i+1;
		int right=2*i+2;
		
		if(left<n && a[left]>a[largest])
			largest=left;
		
		if(right<n && a[right]>a[largest])
			largest=right;
		
		if(largest!=i)
		{
			int temp=a[i];
			a[i]=a[largest];
			a[largest]=temp;
			
			heapify(a,largest,n);
		}
	}

}
