package Array;
import java.util.*;
public class ArraySubsetofAnotherArray {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		
		int m=sc.nextInt();
		int b[]=new int[m];
		for(int i=0;i<m;i++)
			b[i]=sc.nextInt();
		
		
		sc.close();
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		String s="Yes";
		for(int i=0;i<n;i++)
		{
			map.put(a[i],1);
		}
		
		for(int i=0;i<m;i++)
		{
			if(!(map.containsKey(b[i])))
			{
				s="No";
				break;
						
			}
		}
		System.out.println(s);
		
		
		
		
		
	}
	

	
}
