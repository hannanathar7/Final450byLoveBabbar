package String;

import java.util.*;

public class CountandSayUsingStringBuilder {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		
		StringBuilder sb=new StringBuilder("1");
		
		

		for(int i=2;i<=n;i++)
		{
			int c=1;
			StringBuilder sb1=new StringBuilder();
			sb.append("&");
			for(int j=1;j<sb.length();j++)
			{
				if(sb.charAt(j)==sb.charAt(j-1))
				{
					c++;
				}
				else
				{
					sb1.append(c);
					sb1.append(sb.charAt(j-1));
					c=1;
				}
			}
			sb=sb1;	
		}
		
		System.out.println(sb);
		
		
		
	}
	
	
	
	
}
