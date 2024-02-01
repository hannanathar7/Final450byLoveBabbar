package Greedy;

import java.util.*;

class Item
{
	int weight,value;
	 Item(int w,int v)
	{
		weight=w;
		value=v;
	}
}


public class FractionalKnapsack {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int w[]=new int[n];
		int v[]=new int[n];
		for(int i=0;i<n;i++)
			w[i]=sc.nextInt();
		for(int i=0;i<n;i++)
			v[i]=sc.nextInt();
		int W=sc.nextInt();
		sc.close();
		
		Item a[]=new Item[n];
		
		for(int i=0;i<n;i++)
		{
			a[i]=new Item(w[i],v[i]);
		}
		

	       Arrays.sort(a, new Comparator<Item>(){
	          
	          public int compare(Item o1,Item o2)
	          {
	            double a1=(double)o1.value/(double)o1.weight;
	            double a2=(double)o2.value/(double)o2.weight;
	            
	            if(a1==a2)
	            return 0;
	            
	            else if(a1<a2)
	            return 1;
	            
	            else 
	            return -1;
	          }
	           
	       });
	        
		
		int currw=0;
		double profit=0.0;
		
		for(int i=0;i<n;i++)
		{
			if(currw+a[i].weight<=W)
			{
				currw=currw+a[i].weight;
				profit=profit+a[i].value;
			}
			else
			{
				int rem=W-currw;
				profit=profit+(((double)a[i].value/(double)a[i].weight)*(double)rem);
				break;
			}
		}
		
		
		System.out.println(profit);
		
		
	}
	
	

}




