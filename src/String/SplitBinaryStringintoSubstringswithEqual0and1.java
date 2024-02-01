package String;

import java.util.*;

public class SplitBinaryStringintoSubstringswithEqual0and1 {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		sc.close();
		
		int l=s.length();
		int c1=0,c2=0,c=0;
		for(int i=0;i<l;i++)
		{
			if(s.charAt(i)=='0')
			{
				c1++;
			}
			else if(s.charAt(i)=='1')
			{
				c2++;
			}
			if(c1==c2)
			{
				c++;
			}
			
		}
		if(c1!=c2)
			System.out.println("-1");
		else
		System.out.println(c);
		
	}

}
