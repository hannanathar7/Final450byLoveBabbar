package String;

import java.util.*;

public class AllSubsequencesofString {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		sc.close();
		
		int l=s.length();
		
		for(int i=0;i<(int)Math.pow(2, l);i++)
		{
			int t=i;
			String s1="";
			for(int j=0;j<s.length();j++)
			{
				int d=t%2;
				t=t/2;
				if(d!=0)
					s1=s1+s.charAt(j);
			}
			System.out.println(s1);
		}
		
		
		
		
	}
}
