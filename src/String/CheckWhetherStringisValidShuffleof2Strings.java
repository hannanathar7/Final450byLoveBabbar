package String;

import java.util.*;

public class CheckWhetherStringisValidShuffleof2Strings {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		String s3=sc.nextLine();
		sc.close();
		int flag=0;
		
		if(s3.length()!=s1.length()+s2.length())
		{
			flag=1;
		}
		else
		{
			int i=0,j=0,k=0;
			while(k<s3.length())
			{
				if(i<s1.length() && s1.charAt(i)==s3.charAt(k))
				{
					i++;
					k++;
				}
				else if(j<s2.length() && s2.charAt(j)==s3.charAt(k))
				{
					j++;
					k++;
				}
				else
				{
					flag=1;
					break;
				}
			}
		}
		
		
		if(flag==1)
			System.out.println("NO");
		else
			System.out.println("YES");
		
	}

}
