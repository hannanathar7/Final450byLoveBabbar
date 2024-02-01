package String;

import java.util.*;

public class StringisPalindromeorNot {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		sc.close();
		
		
		int l=s.length(),flag=0;
		for(int i=0;i<l/2;i++)
		{
			if(s.charAt(i)!=s.charAt(l-i-1))
			{
				flag=1;
				break;
			}
		}
		
		
		if(flag==0)
			System.out.println("1");
		else
			System.out.println("0");
		
	}

}
