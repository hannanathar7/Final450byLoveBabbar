package TwoDArray;

import java.util.*;

public class CommonElementsinAllRowsofMatrix {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		int a[][]=new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}	
		sc.close();
		
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		
		for(int j=0;j<c;j++)
		{
			map.put(a[0][j],1);
		}
		
		for(int i=1;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				if(map.containsKey(a[i][j]) && map.get(a[i][j])==i)
					map.put(a[i][j],map.get(a[i][j])+1);
			}
		}
		
		for(Integer i:map.keySet())
		{
			int v=map.get(i);
			if(v==r)
				System.out.print(i+" ");
		}
		
		
	}
}
