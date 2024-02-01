package Greedy;

import java.util.*;



public class SmallestNumberWithGivenDigitsandSum {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int d=sc.nextInt();
		int s=sc.nextInt();
		sc.close();
		
		

        if(s>9*d || s<0)
        System.out.println("-1");
    
    int a[]=new int[d];
    a[0]=1;
    
    for(int i=1;i<d;i++)
    a[i]=0;
    
    s--;
    int i=d-1;
    while(s>0)
    {
        if(s>=9)
        {
            a[i]=a[i]+9;
            s=s-9;
            i--;
        }
        else
        {
            a[i]=a[i]+s;
            break;
        }
    }
    
    StringBuilder sb=new StringBuilder();
    for(i=0;i<d;i++)
    sb.append(a[i]);
    

		
		
		System.out.println(sb.toString());
		
		
	}
	
	

}

