 package Array;
import java.util.*;
public class CountInversions {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long a[]=new long[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextLong();
		int in=0;
		in=mergesort(a,0,n-1);
		
		System.out.println(in);
		sc.close();
	}
	
	public static int mergesort(long a[],int l,int r)
	{
		int in=0;
		if(l<r)
		{
		int m=(l+r)/2;
		in+=mergesort(a,l,m);
		in+=mergesort(a,m+1,r);
		in+=merge(a,l,m,r);
		}
		
		return in;
	}
	
	public static int merge(long a[],int l,int m,int r)
	{
			int swap=0;	
			int n1 = m - l + 1;
	        int n2 = r - m;
	 
	        long L[] = new long[n1];
	        long R[] = new long[n2];
	        
	        
	        
	        for (int i = 0; i < n1; ++i)
	            L[i] = a[l + i];
	        for (int j = 0; j < n2; ++j)
	            R[j] = a[m + 1 + j];
	        
	        int i = 0, j = 0;
	        
	        int k = l;
	        while (i < n1 && j < n2) {
	            if (L[i] <= R[j]) {
	                a[k] = L[i];
	                i++;
	            }
	            else {
	                a[k] = R[j];
	                j++;
	                swap=swap+n1-i;
	            }
	            k++;
	        }
	 
	        
	        while (i < n1) {
	            a[k] = L[i];
	            i++;
	            k++;
	        }
	 
	    
	        while (j < n2) {
	            a[k] = R[j];
	            j++;
	            k++;
	        }
	        return swap;
	}
}
