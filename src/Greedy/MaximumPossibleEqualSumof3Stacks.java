package Greedy;

import java.util.*;


public class MaximumPossibleEqualSumof3Stacks {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		
		int a[]=new int[n1];
		int b[]=new int[n2];
		int c[]=new int[n3];
		
		for(int i=0;i<n1;i++)
			a[i]=sc.nextInt();
		
		for(int i=0;i<n2;i++)
			b[i]=sc.nextInt();
		
		for(int i=0;i<n3;i++)
			c[i]=sc.nextInt();
		
		sc.close();
		
		int s1=0,s2=0,s3=0;
		
		for(int i=0;i<n1;i++)
			s1+=a[i];
		
		for(int i=0;i<n2;i++)
			s2+=b[i];
		
		for(int i=0;i<n3;i++)
			s3+=c[i];
		
		int i=0,j=0,k=0;
		
		while(s1!=s2 && s2!=s3)
		{
			if(s1==0 || s2==0 || s3==0)
			{
				System.out.println("0");
				return;
			}
			else
			{
				if(s1>=s2 && s1>=s3)
				{
					s1-=a[i];
					i++;
				}
				else if(s2>=s1 && s2>=s3)
				{
					s2-=b[i];
					j++;
				}
				else
				{
					s3-=c[i];
					k++;
				}
			}
		}
		
		
		
		System.out.println(s1);
		
		
		
		
		
	}
}



