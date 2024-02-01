package String;

import java.util.*;

public class SearchaWordin2DCharacterArray {

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
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		int l=s.length();
		int c=0;
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				c=found(i,j,s,ch,l,0);
				
				if(c>=1)
				{
					list.add(i);
					list.add(j);
				}
					
				
			}
		}
		
		
		
		int a[][]=new int[list.size()/2][2];
		int k=0;
		for(int i=0;i<list.size()-1;i=i+2)
		{
			a[k][0]=list.get(i);
			a[k][1]=list.get(i+1);
			k++;
		}
		
		
		
		for(int i=0;i<list.size()/2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
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
				c+=found1(i+1,j,s,ch,l,idx);
				c+=found2(i-1,j,s,ch,l,idx);
				c+=found3(i,j+1,s,ch,l,idx);
				c+=found4(i,j-1,s,ch,l,idx);
				c+=found5(i-1,j-1,s,ch,l,idx);
				c+=found6(i-1,j+1,s,ch,l,idx);
				c+=found7(i+1,j-1,s,ch,l,idx);
				c+=found8(i+1,j+1,s,ch,l,idx);
			}
			ch[i][j]=temp;
		}
		return c;
	}
	
	public static int found1(int i,int j,String s,char ch[][],int l,int idx)
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
				c+=found1(i+1,j,s,ch,l,idx);
			}
			ch[i][j]=temp;
		}
		return c;
	}
	
	public static int found2(int i,int j,String s,char ch[][],int l,int idx)
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
				
				c+=found2(i-1,j,s,ch,l,idx);
				
			}
			ch[i][j]=temp;
		}
		return c;
	}
	
	public static int found3(int i,int j,String s,char ch[][],int l,int idx)
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
				
				c+=found3(i,j+1,s,ch,l,idx);
				
			}
			ch[i][j]=temp;
		}
		return c;
	}
	
	public static int found4(int i,int j,String s,char ch[][],int l,int idx)
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
				
				c+=found4(i,j-1,s,ch,l,idx);
				
			}
			ch[i][j]=temp;
		}
		return c;
	}
	
	public static int found5(int i,int j,String s,char ch[][],int l,int idx)
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
				c+=found5(i-1,j-1,s,ch,l,idx);
				
			}
			ch[i][j]=temp;
		}
		return c;
	}
	
	public static int found6(int i,int j,String s,char ch[][],int l,int idx)
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
				c+=found6(i-1,j+1,s,ch,l,idx);	
			}
			ch[i][j]=temp;
		}
		return c;
	}
	
	public static int found7(int i,int j,String s,char ch[][],int l,int idx)
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
				
				c+=found7(i+1,j-1,s,ch,l,idx);
				
			}
			ch[i][j]=temp;
		}
		return c;
	}
	
	public static int found8(int i,int j,String s,char ch[][],int l,int idx)
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
				
				c+=found8(i+1,j+1,s,ch,l,idx);
			}
			ch[i][j]=temp;
		}
		return c;
	}
	
}
	
