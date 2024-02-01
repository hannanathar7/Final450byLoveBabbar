
package RecursionAndBacktracking;

import java.util.*;

public class AllPossiblePathsfromTopLefttoBottomRight {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int a[][]=new int[m][n];
		int k=1;
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=k;
				k++;
			}
		}
		
		
		
		ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> list2=new ArrayList<Integer>();
		solve(0,0,a,m,n,list,list2);
		System.out.println(list);
		sc.close();
	}
	
	public static void solve(int i,int j,int a[][],int m,int n,ArrayList<ArrayList<Integer>> list1,ArrayList<Integer> list2) {
		
		if(i==m-1 && j==n-1)
		{
			list2.add(a[i][j]);
			list1.add(new ArrayList<Integer>(list2));
			list2.remove(list2.size()-1);
			return;
		}
		
		if(i>=m || j>=n)
			return;
		
		
		
		list2.add(a[i][j]);
		solve(i+1,j,a,m,n,list1,list2);
		solve(i,j+1,a,m,n,list1,list2);
		list2.remove(list2.size()-1);
		

		
		
		
		
		

	}
	
	

}
