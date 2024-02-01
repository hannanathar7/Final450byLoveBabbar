package Heap;

public class MinHeapToMaxHeap {
	
	public static void main(String args[])
	{
		int a[]= {3, 5, 9, 6, 8, 20, 10, 12,18,9};
		buildheap(a,a.length);
		for(int i=0;i<a.length;i++)
		System.out.print(a[i]+" ");
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
