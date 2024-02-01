package Graph;

import java.util.*;

public class OliverandtheGame {
	
	

	 public static void main(String args[])
	 {
		 Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		 
		 ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
		 
		 for(int i=0;i<=n;i++)
		 {
			 adj.add(new ArrayList<Integer>());
		 }
		 
		 for(int i=1;i<=n-1;i++)
		 {
			int x=sc.nextInt();
			int y=sc.nextInt();
			 adj.get(x).add(y);
			 adj.get(y).add(x);
		 }
		 
		 int intime[]=new int[n+1];
		 int outtime[]=new int[n+1];
		
		 int timer[]=new int[1];
		
			dfs(1,0,adj,intime,outtime,timer);
			
			
			int q=sc.nextInt();
			
			for(int i=1;i<=q;i++)
			{
				int d=sc.nextInt();
				int x=sc.nextInt();
				int y=sc.nextInt();
				
				if(check(x,y,intime,outtime)==false && check(y,x,intime,outtime)==false)
				{
					System.out.println("NO");
					continue;
				}
				
				if(d==0)
				{
					if(check(y,x,intime,outtime)==false)
						System.out.println("NO");
					else
						System.out.println("YES");
						
				}
				else
				{
					if(check(x,y,intime,outtime)==false)
						System.out.println("NO");
					else
						System.out.println("YES");
				}
					
			}
			
			
		 
		 sc.close();
	 }
	 
	 
	 public static void dfs(int i,int par,ArrayList<ArrayList<Integer>> adj,int intime[],int outtime[],int timer[])
	 	{
		 	
		 	timer[0]++;
		 	intime[i]=timer[0];
		 	
		 	for(int j:adj.get(i))
		 	{
		 		if(j!=par)	
		 		dfs(j,i,adj,intime,outtime,timer);
		 	}
		 	
		 	timer[0]++;
		 	outtime[i]=timer[0];
		 	
	    }
	 
	 public static boolean check(int x,int y,int intime[],int outtime[])
	 {
		 if(intime[x]>intime[y] && outtime[x]<outtime[y])
			 return true;
		 
		 return false;
	 }
	 
}
	
	

