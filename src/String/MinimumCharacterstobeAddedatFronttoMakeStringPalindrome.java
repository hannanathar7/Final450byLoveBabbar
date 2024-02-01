package String;

import java.util.*;

public class MinimumCharacterstobeAddedatFronttoMakeStringPalindrome {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		sc.close();
		
		int l1=s.length();
		
		StringBuilder sb=new StringBuilder();
		sb.append(s);
		sb.reverse();
		sb.toString();
		
		StringBuilder sb1=new StringBuilder();
		sb1.append(s);
		sb1.append("&");
		sb1.append(sb);
		sb1.toString();
		
		int l2=sb1.length();
		
		int lcs[]=new int[l2];
		lcs[0]=0;
		int i=0,j=1;
		
		while(j<l2)
		{
			if(sb1.charAt(i)==sb1.charAt(j))
			{
				lcs[j]=i+1;
				i++;
				j++;
			}
			else
			{
				if(i!=0)
					i=lcs[i-1];
				else
				{
					lcs[j]=0;
					j++;
				}
			}
		}
		
		int ans=l1-lcs[l2-1];
		System.out.println(ans);
	}
	
	

}
