package SearchingAndSorting;

import java.util.*;

public class BookAllocation {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int m=sc.nextInt();
		sc.close();
	
		
		if(m>n)
		{
	      System.out.println("-1");
	      return;
		}
		
	        int low=Integer.MIN_VALUE,high=0;
	        int c;
	        
	        for(int i=0;i<n;i++)
	        {
	            if(a[i]>low)
	            low=a[i];
	            
	            high+=a[i];
	        }
	        
	        while(low<=high)
	        {
	            int mid=(low+high)/2;
	            
	            c=NoofStudents(a,mid);
	            
	            if(c>m)
	            low=mid+1;
	            
	            else
	            high=mid-1;
	            
	        }
	        System.out.println(low);
	    }
	    
	    public static int NoofStudents(int a[],int limit)
	    {
	        int stu=1;
	        int sum=0;
	        for(int i=0;i<a.length;i++)
	        {
	            if(sum+a[i]<=limit)
	            sum+=a[i];
	            
	            else
	            {
	                stu++;
	                sum=a[i];
	            }
	        }
	        return stu;
	    }
	
	
	

}
