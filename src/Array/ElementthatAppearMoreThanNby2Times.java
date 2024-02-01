package Array;
import java.util.*;
public class ElementthatAppearMoreThanNby2Times {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		sc.close();
		int c=0,maj=0;
		for(int i=0;i<n;i++)
		{
			
			if(a[i]==maj)
				c++;
			
			else if(c==0)
				{
				maj=a[i];
				c=1;
				}
			else
				c--;
		}
		
        int count=0,res=-1; 
		for(int i=0;i<n;i++)
		{
		    if(a[i]==maj)
		    count++;
		}
		if(count>n/2)
		{
		    res=maj;
		}
		System.out.println(res);
		
		
		
		
	}
	

	
}
