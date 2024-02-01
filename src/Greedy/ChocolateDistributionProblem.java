package Greedy;

import java.util.*;


public class ChocolateDistributionProblem {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		ArrayList<Integer> list=new ArrayList<>();
	
		
		for(int i=0;i<n;i++)
			list.add(sc.nextInt());
		
		sc.close();
		
		Collections.sort(list);
        int i=0,j=m-1;
        long min=Integer.MAX_VALUE;
        while(j<n)
        {
            int diff=list.get(j)-list.get(i);
            min=Math.min(diff,min);
            i++;
            j++;
        }
		System.out.println(min);
		
		
		
		
		
	}
}



