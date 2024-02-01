package Array;
import java.util.*;
public class ElementthatAppearMoreThanNby3Times {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		sc.close();
		ArrayList<Integer> list=new ArrayList<Integer>();
		int c1=0,c2=0,e1=-1,e2=-1;
		for(int i=0;i<n;i++)
		{
			if(a[i]==e1)
				c1++;
			else if(a[i]==e2)
				c2++;
			else if(c1==0)
				{
				e1=a[i];
				c1++;
				}
			else if(c2==0)
			{
				e2=a[i];
				c2++;
				
			}
			else
			{
				c1--;
				c2--;
			}
		}
        int count1=0,count2=0; 
		for(int i=0;i<n;i++)
		{
		    if(a[i]==e1)
		    count1++;
		    else if(a[i]==e2)
		    	count2++;
		}
		if(count1>n/3)
		{
		    list.add(e1);
		}
		if(count2>n/3)
		{
			list.add(e2);
		}
		
		for(int i=0;i<list.size();i++)
		{
			System.out.print(list.get(i)+" ");
		}
		
		
		
		
	}
	

	
}
