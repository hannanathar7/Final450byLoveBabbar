package StackAndQueue;

import java.util.*;

public class LargestAreainHistogram {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		sc.close();
		
		
        int nsi[]=new int[n];
        int psi[]=new int[n];

        Stack<Integer> st1=new Stack<Integer>();
        Stack<Integer> st2=new Stack<Integer>();

        int max=Integer.MIN_VALUE;

        for(int i=0;i<n;i++)
        {
            while(st1.size()!=0 && a[st1.peek()]>=a[i])
            st1.pop();

            if(st1.size()==0)
            {
                psi[i]=0;
                
            }
            else
            {
                psi[i]=st1.peek()+1;
            }

            st1.push(i);
        }

        for(int i=n-1;i>=0;i--)
        {
            while(st2.size()!=0 && a[st2.peek()]>=a[i])
            st2.pop();

            if(st2.size()==0)
            {
                nsi[i]=n-1;
                
            }
            else
            {
                nsi[i]=st2.peek()-1;
            }

            st2.push(i);
        }


    for(int i=0;i<n;i++)
    {
        int diff=nsi[i]-psi[i]+1;
        int area=diff*a[i];
        if(area>max)
        max=area;
    }
   

		System.out.println(max);
		
		
		
	}
}
