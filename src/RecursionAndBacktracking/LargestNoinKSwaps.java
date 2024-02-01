package RecursionAndBacktracking;

import java.util.*;

public class LargestNoinKSwaps {
	
	public static String max;
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int k=sc.nextInt();
		sc.close();
		max=s;
		solve(s.toCharArray(),k);
		System.out.println(max);
		
	}
	
	public static void solve(char ch[],int k) {
		
		if(k==0)
		{
			return;
		}
		
		for(int i=0;i<ch.length-1;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[j]>ch[i])
				{
					char temp=ch[i];
		            ch[i]=ch[j];
		            ch[j]=temp;
		            
		            String s=new String(ch);
		            if(s.compareTo(max)>0)
		            max=s;
		            
					solve(ch,k-1);
					
					temp=ch[i];
		            ch[i]=ch[j];
		            ch[j]=temp;
				}
			}
		}
		
	}
	
	
}
