package SearchingAndSorting;

import java.util.*;

public class SubsetSumSPOJ {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=sc.nextInt();
		int b=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		sc.close();
	
		
		ArrayList<Integer> list1=subsequences(arr,0,n/2-1);
		ArrayList<Integer> list2=subsequences(arr,n/2,n-1);
		
		
		
		Collections.sort(list2);
		
		int c=0;
		for(int i=0;i<list1.size();i++)
		{
			int low=binarySearch(list2,0,list2.size()-1,a-list1.get(i));
			int high=binarySearch(list2,0,list2.size()-1,b-list1.get(i));
			c+=high-low;
		}
		System.out.println(c);
	}
	
	public static ArrayList<Integer> subsequences(int a[],int start,int end)
	{
		ArrayList<Integer> list=new ArrayList<Integer>();
		int l=end-start+1;
		
		for(int i=0;i<(int)Math.pow(2,l);i++)
		{
			int t=i;
			int s=0;
			for(int j=start;j<=end;j++)
			{
				int d=t%2;
				t=t/2;
				if(d!=0)
					s=s+a[j];
			}
			list.add(s);
		}
		return list;
	}
	
	public static int binarySearch(ArrayList<Integer> list,int low,int high,int k)
	{
		
		while(low<=high)
		{
			int mid=low+(high-low)/2;
			if(k<list.get(mid))
			{
				 high=mid-1;
			}
			else if(k>list.get(mid))
			{
				low=mid+1;
			}
			else
			{
				low=mid+1;
			}
				
		}
		return low;
	}
	
	
	

}
