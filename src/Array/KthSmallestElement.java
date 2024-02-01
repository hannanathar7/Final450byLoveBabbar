package Array;
import java.util.*;
public class KthSmallestElement {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int k=sc.nextInt();
		sc.close();
		k=k-1;
		int low=0;
		int high=n-1;
		int res=quickSelect(a,low,high,k);
		System.out.println(res);
		
		
		
	}
	
	public static int quickSelect(int a[],int low,int high,int k)
	{
			
			int pi=partition(a,low,high);
			if(k>pi)
			{
				return quickSelect(a,pi+1,high,k);
			}
			else if(k<pi)
			{
				return quickSelect(a,low,pi-1,k);
			}
			else
				return a[pi];
		
	}
	
	public static int partition(int a[],int low,int high)
	{
		int n=high-low+1;
		Random rand=new Random();
		int ran=rand.nextInt(n);
		ran=ran+low;
		
		int t=a[low];
		a[low]=a[ran];
		a[ran]=t;
		
		int pivot=a[low];
        int j = low;
      
       for(int i=low+1;i<=high;i++)
       {
    	   if(a[i]<=pivot)
    	   {
    		   j++;
    		   int temp=a[i];
    		   a[i]=a[j];
    		   a[j]=temp;
    	   }
       }
        int temp=a[low];
		a[low]=a[j];
		a[j]=temp;
        
        return j; 
	}
	
}
