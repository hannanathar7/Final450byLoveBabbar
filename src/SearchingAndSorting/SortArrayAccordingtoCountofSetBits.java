package SearchingAndSorting;

import java.util.*;

public class SortArrayAccordingtoCountofSetBits {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Integer a[]=new Integer[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		
		sc.close();
		
		Arrays.sort(a, (a1, a2) -> -Integer.compare(Integer.bitCount(a1), Integer.bitCount(a2)));
		
		for(int i=0;i<n;i++)
		System.out.print(a[i]+" ");
		
		
		
			
		
		
		
	}
	
	
	

}
