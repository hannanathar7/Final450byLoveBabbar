package SearchingAndSorting;

import java.util.*;

public class CountSquares {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		
		int ans=(int)Math.sqrt(n-1);
		
		System.out.println(ans);
	}

}
