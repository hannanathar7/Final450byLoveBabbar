package RecursionAndBacktracking;


import java.util.*;

public class KPermutationofFirstNNaturalNumbers {
	
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		sc.close();
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		int f=1;
		for(int i=1;i<n;i++)
		{
			list.add(i);
			f=f*i;
		}
		list.add(n);
		k=k-1;
		String ans="";
		
		while(true)
		{
			ans=ans+list.get(k/f);
			list.remove(k/f);
			
			if(list.size()==0)
				break;
			
			k=k%f;
			f=f/list.size();
		}
		System.out.println(ans);
		
	}
	
	

}
