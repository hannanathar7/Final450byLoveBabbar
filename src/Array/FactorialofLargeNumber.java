
package Array;

import java.util.*;
public class FactorialofLargeNumber {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		sc.close();
		
		List<Integer> list=new LinkedList<Integer>();
		list.add(1);
		for(int i=2;i<=n;i++)
		{
			multiply(list,i);
		}
		for(int i=0;i<list.size();i++)
		{
			System.out.print(list.get(i));
		}
		
	
		
		
		
	}
	
	public static void multiply(List<Integer> list,int n)
	{
		int c=0;
		for(int i=list.size()-1;i>=0;i--)
		{
			int p=list.get(i)*n+c;
			c=p/10;
			list.set(i,p%10);
		}
		if(c>0)
		{
			list.add(0,c);
		}
	}
	

	
}
