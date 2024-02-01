package Greedy;

import java.util.*;



public class CheckifIsPossibletoSurviveonIsland {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int d=sc.nextInt();
		int max=sc.nextInt();
		int f=sc.nextInt();
		
		sc.close();
		
	
	    if( (f>max) || (6*max<7*f && d>6) )
	    {
	    	System.out.println("No");
	    	return;
	    }
	    else
	    {
	    	System.out.println("Yes");
	    	int days=(f*d)/max;
	    	if((f*d)%max!=0)
	    		days++;
	    	
	    	System.out.println(days);
	    }
	}
	
	

}

