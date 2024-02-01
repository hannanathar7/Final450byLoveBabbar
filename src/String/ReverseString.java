package String;

import java.util.*;

public class ReverseString {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		sc.close();
		
		char ch[]=s.toCharArray();
		int l=ch.length;
		for(int i=0;i<l/2;i++)
		{
			char t=ch[i];
			ch[i]=ch[l-i-1];
			ch[l-i-1]=t;
		}
		
		for(int i=0;i<l;i++)
			System.out.print(ch[i]);
		
	}

}
