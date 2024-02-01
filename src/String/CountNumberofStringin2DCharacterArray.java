package String;

import java.util.Scanner;

public class CountNumberofStringin2DCharacterArray {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int m=sc.nextInt();
		int n=sc.nextInt();
		char ch[][]=new char[m][n];
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				ch[i][j]=sc.next().charAt(0);
			}
		}
		
		String s=sc.next();
		
		sc.close();
		
		int l=s.length();
		int c=0;
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				c+=found(i,j,s,ch,l,0);
			}
		}
		System.out.println(c);
	}
	
	public static int found(int i,int j,String s,char ch[][],int l,int idx)
	{
		int c=0;
		if(i>=0 && j>=0 && i<ch.length && j<ch[0].length && ch[i][j]==s.charAt(idx))
		{
			char temp=ch[i][j];
			ch[i][j]=0;
			idx++;
			if(idx==l)
				c=1;
			else
			{
				c+=found(i+1,j,s,ch,l,idx);
				c+=found(i-1,j,s,ch,l,idx);
				c+=found(i,j+1,s,ch,l,idx);
				c+=found(i,j-1,s,ch,l,idx);
			}
			ch[i][j]=temp;
		}
		return c;
	}
	
}
	
