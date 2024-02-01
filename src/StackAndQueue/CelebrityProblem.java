package StackAndQueue;

import java.util.*;

public class CelebrityProblem {

	
	
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int a[][]=new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		sc.close();
		
		Stack<Integer> st=new Stack<Integer>();
		for(int i=0;i<n;i++)
			st.push(i);
		
		while(st.size()>=2)
		{
			int i=st.pop();
			int j=st.pop();
			
			if(a[i][j]==1)
			{
				st.push(j);
			}
			else
			{
				st.push(i);
			}
		}
		
		int res=st.pop();
		
		
		for(int i=0;i<n;i++)
		{
			if(i!=res)
			{
			if(a[res][i]==1)
			{
				res=-1;
				break;
			}
			
			if(a[i][res]==0)
			{
				res=-1;
				break;
			}
			}
		}
		
		System.out.println(res);
		
		
		
	}
}
