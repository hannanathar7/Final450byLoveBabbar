package Graph;

import java.util.*;

public class CreateGraph {
	
	

	public static void create(int v)
	{
		List<List<Integer>> list=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<v;i++)
		{
			list.add(new ArrayList<Integer>());
		}
		
		for(int i=0;i<v;i++)
		{
			int e=sc.nextInt();
			for(int j=0;j<e;j++)
			{
				int x=sc.nextInt();
				list.get(i).add(x);
			}
			
		}
		sc.close();
		
		
		for(int i=0;i<v;i++)
		{
			System.out.println(list.get(i));
		}
		
	}
	
	public static void main(String args[])
	{
		create(6);
	}
}
