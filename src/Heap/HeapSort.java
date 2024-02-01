package Heap;

public class HeapSort {
	
	public static void main(String args[])
	{
		int a[]= { 1, 3, 5, 4, 6, 13, 10, 9, 8, 15, 17 };
		buildheap(a,a.length);
		heapsort(a,a.length);
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
	
	public static void heapsort(int a[],int n)
	{
		for(int i=n-1;i>=1;i--)
		{
			int temp=a[i];
			a[i]=a[0];
			a[0]=temp;
			
			heapify(a,0,i);
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
