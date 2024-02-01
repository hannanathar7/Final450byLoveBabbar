package SearchingAndSorting;

import java.util.*;

public class ValueEqualtoIndexValue {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		
		sc.close();
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
			if(a[i]==i+1)
				list.add(a[i]);
		}
		System.out.println(list);
		
		
	}

}
