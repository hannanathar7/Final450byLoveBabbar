package String;

import java.util.*;

public class CheckWhether2StringsareIsomorphic {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		
		sc.close();
		boolean b=true;
		
		int l1=s1.length();
		int l2=s2.length();
		
		int c1[]=new int[26];
		int c2[]=new int[26];
		
		if(l1!=l2)
		{
			b=false;
			System.out.println(b);
			return;
		}
		
		for(int i=0;i<l1;i++)
		{
			c1[s1.charAt(i)-'a']++;
		}
		
		for(int i=0;i<l1;i++)
		{
			c2[s2.charAt(i)-'a']++;
		}
		
		for(int i=0;i<l1;i++)
		{
			if(c1[s1.charAt(i)-'a']!=c2[s2.charAt(i)-'a'])
			{
				b=false;
				break;
			}
		}
		
		System.out.println(b);
	}

}
