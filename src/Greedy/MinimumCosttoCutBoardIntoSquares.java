package Greedy;

import java.util.*;



public class MinimumCosttoCutBoardIntoSquares {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int m=sc.nextInt();
		int n=sc.nextInt();
		
		int m1=m-1,n1=n-1;
		
		int a[]=new int[m1];
		int b[]=new int[n1];
		
		for(int i=0;i<m1;i++)
			a[i]=sc.nextInt();
		
		for(int i=0;i<n1;i++)
			b[i]=sc.nextInt();
		
		
		sc.close();
		
	
	      
	      Arrays.sort(a);
	      Arrays.sort(b);
	      
	      for(int i=0;i<m1/2;i++)
	      {
	    	  int temp=a[i];
	    	  a[i]=a[m1-i-1];
	    	  a[m1-i-1]=temp;
	      }
	      
	      
	      for(int i=0;i<n1/2;i++)
	      {
	    	  int temp=b[i];
	    	  b[i]=b[n1-i-1];
	    	  b[n1-i-1]=temp;
	      }
	      
	      int hor=1,ver=1,amt=0;
	      
	      int i=0,j=0;
	      
	      while(i<m1 && j<n1)
	      {
	    	  if(a[i]>=b[j])
	    	  {
	    		 amt+=a[i]*ver;
	    		 hor++;
	    		 i++;
	    	  }
	    	  else
	    	  {
	    		  amt+=b[j]*hor;
		    		 ver++;
		    		 j++;
	    	  }
	      }
	      
	      while(i<m1)
	      {
	    	  amt+=a[i]*ver;
	    		 hor++;
	    		 i++;
	      }
	      
	      while(j<n1)
	      {
	    	  amt+=b[j]*hor;
	    		 ver++;
	    		 j++;
	      }
	      
	      System.out.println(amt);
	     
	}
	
	

}

