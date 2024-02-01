package StackAndQueue;

import java.util.*;

public class MinSumofSquaresofCharacterCountsinStringAfterRemovingkCharacters {

	
	
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		sc.close();
		
		
		int a[]=new int[26];
		
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			a[ch-'a']=a[ch-'a']+1;
		}
		
		
		
	}
}
