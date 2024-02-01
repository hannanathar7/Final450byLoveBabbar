package String;

import java.util.*;

public class LongestPalindromicSubstring {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		sc.close();
		
		int low,high,start=0,max=1,end=0;
		for(int i=1;i<s.length();i++)
		{
			low=i-1;
			high=i;
			
			while(low>=0 && high<=s.length()-1 && s.charAt(low)==s.charAt(high))
			{
				if(high-low+1>max)
				{
					start=low;
					end=high;
					max=high-low+1;
				}
				low--;
				high++;
			}
			
			low=i-1;
			high=i+1;
			
			while(low>=0 && high<=s.length()-1 && s.charAt(low)==s.charAt(high))
			{
				if(high-low+1>max)
				{
					start=low;
					end=high;
					max=high-low+1;
				}
				low--;
				high++;
			}
			
			
		}
		
		System.out.println(s.substring(start,end+1));
		
	}
}
