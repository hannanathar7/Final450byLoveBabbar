package String;

import java.util.*;

public class RemoveConsecutiveCharacters {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		sc.close();
		
		int l=s.length();
		
		if(l==1)
		{
			System.out.println(s);
			return;
		}
		
		char ch[]=s.toCharArray();
		
		int j=0,i=1;
		while(i<l)
		{
			if(ch[j]==ch[i])
				i++;
			else
			{
				j++;
				ch[j]=ch[i];
				i++;
			}
		}
		
		String res="";
		for(i=0;i<=j;i++)
		{
			res=res+ch[i];
		}
		
		System.out.println(res);
	}
	
	

}
