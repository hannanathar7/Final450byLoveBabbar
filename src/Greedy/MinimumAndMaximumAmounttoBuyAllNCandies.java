package Greedy;

import java.util.*;



public class MinimumAndMaximumAmounttoBuyAllNCandies {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		
		int can[]=new int[n];
		
		for(int i=0;i<n;i++)
			can[i]=sc.nextInt();
		
		
		
		sc.close();
		
		ArrayList<Integer> list=new ArrayList<Integer>();
	      
	      Arrays.sort(can);
	      
	      int i=-1;
	      int j=n-1;
	      int sum=0;
	      
	      while(i<n-1 && i<j)
	      {
	         i++;
	         sum+=can[i]; 
	         j=j-k;
	      }
	      
	      list.add(sum);
	      
	      
	      for ( i = 0; i < n / 2; i++) {
	  
	            
	            int temp = can[i];
	  
	          
	           can[i] = can[n - i - 1];
	  
	            
	            can[n - i - 1] = temp;
	      }
	      
	      sum=0;
	      i=-1;
	      j=n-1;
	      
	      while(i<n-1 && i<j)
	      {
	         i++;
	         sum+=can[i]; 
	         j=j-k;
	      }
	      
	      list.add(sum);
	      
	      System.out.println(list);
	}
	
	

}

