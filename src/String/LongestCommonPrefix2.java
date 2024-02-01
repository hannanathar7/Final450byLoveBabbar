package String;

import java.util.*;

public class LongestCommonPrefix2 {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		
		//using character by character matching takes O(mn) time where m is the minimum length in s[i]
		int n=sc.nextInt();
		String s[]=new String[n];
		for(int i=0;i<n;i++)
			s[i]=sc.next();
		sc.close();
		
		System.out.println(longestCommonPrefix(s));
		
		
	}
	
	
	 public static String longestCommonPrefix(String[] s) {

	        int minlen=minLength(s);
	        StringBuilder sb=new StringBuilder("");

	        for(int i=0;i<minlen;i++)
	        {
	            char ch1=s[0].charAt(i);

	            for(int j=1;j<s.length;j++)
	            {
	                char ch2=s[j].charAt(i);
	                if(ch1!=ch2)
	                return sb.toString();
	            }
	            sb.append(ch1);
	        }
	        return sb.toString();
	        
	    }

	    public static int minLength(String s[])
	    {
	        int min=Integer.MAX_VALUE;
	        for(int i=0;i<s.length;i++)
	        {
	            if(s[i].length()<min)
	            min=s[i].length();
	        }
	        return min;
	    } 

}
