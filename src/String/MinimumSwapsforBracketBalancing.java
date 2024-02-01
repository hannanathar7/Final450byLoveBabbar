package String;

import java.util.*;

public class MinimumSwapsforBracketBalancing {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		sc.close();
		
		int l=s.length();
		int left=0,right=0,imbalance=0,swap=0;
		for(int i=0;i<l;i++)
		{
			if(s.charAt(i)==']')
			{
				right++;
				imbalance=right-left;
			}
			
			else
			{
				left++;
				if(imbalance>0)
				{
					swap=swap+imbalance;
					imbalance--;
				}
			}
		}
		
		System.out.println(swap);
		
	}
	
	

}
