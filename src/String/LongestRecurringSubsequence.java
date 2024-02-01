package String;

import java.util.*;

public class LongestRecurringSubsequence {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		sc.close();
		
		int max=0;
		for(int i=0;i<s.length()-1;i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				String s1=s.substring(0,j);
				String s2=s.substring(j,j+i+1);
				int l=s1.length();
				if((s1.equals(s2)) && l>max)
						max=l;
			}
		}
		System.out.println(max);
		
	}
}
