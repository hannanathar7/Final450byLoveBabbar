package Graph;

import java.util.*;

public class AlienDictionary {
	
	
	
	 public static String findOrder(String [] dict, int n, int k)
	    {
		 ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>();
		 
		 for(int i=0;i<k;i++)
		 {
			 adj.add(new ArrayList<Integer>());
		 }
		 
		 	for(int i=0;i<n-1;i++)
	        { 
	        	String x=dict[i];
	        	String y=dict[i+1];
	        	
	        	for(int j=0;j<Math.min(x.length(),y.length());j++)
	        	{
	        		if(x.charAt(j)!=y.charAt(j))
	        		{
	        			adj.get(x.charAt(j)-'a').add(y.charAt(j)-'a');
	        			break;
	        		}
	        	}
	        	
	        	
	        }
		 	Stack<String> st=new Stack<>();
		 	topological(k,adj,st);
		 	String res="";
		 	while(st.size()>0)
		 		res=res+st.pop();
		 	
		 
		 	return res;
	        
	        
	    }
	 
	 
 public static void topological(int v,ArrayList<ArrayList<Integer>> adj,Stack<String> st) {
		
		 
		 boolean vis[]=new boolean[v];
		 for(int i=0;i<v;i++)
		 {
			 if(vis[i]==false)
			 {
				 sort(i,vis,adj,st); 
			 }
		 }
		 
	 }
	 
	 
	 public static void sort(int i,boolean vis[],ArrayList<ArrayList<Integer>> adj,Stack<String> st)
	 	{
		 	vis[i]=true;
		 	
		 	for(Integer x:adj.get(i))
		 	{
		 		if(vis[x]==false)
		 			sort(x,vis,adj,st);
		 	}
		 	
		 	int a=i+'a';
		 	char ch=(char)a;
		 	st.push(String.valueOf(ch));
	    }
	 
	
	 public static void main(String args[])
	 {
		 String a[]={"baa","abcd","abca","cab","cad"};
		 findOrder(a,5,4);
		 
	 }
	
	

	
}
	
	

