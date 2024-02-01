package String;

import java.util.*;

public class LongestCommonPrefix {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		
		//using sorting takes O(MAX*nlogn) time where MAX is maximum characters in any s[i]
		int n=sc.nextInt();
		String s[]=new String[n];
		for(int i=0;i<n;i++)
			s[i]=sc.next();
		sc.close();
		Arrays.sort(s);
		
		String s1=s[0];
		String s2=s[n-1];
		
		int minlen=Math.min(s1.length(),s2.length());
		
		int i=0,idx=-1;
		while(i<minlen)
		{
			if(s1.charAt(i)==s2.charAt(i))
			{
				idx=i;
				i++;
			}
			else
				break;
		}
		
		System.out.println(s1.substring(0,idx+1));
		
		
	}

}
