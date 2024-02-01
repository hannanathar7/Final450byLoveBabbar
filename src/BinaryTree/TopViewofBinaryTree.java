package BinaryTree;


import java.util.*;

public class TopViewofBinaryTree {

	public static class Node
	{
		int data;
		Node left;
		Node right;
		
		Node(int d)
		{
			data=d;
			left=null;
			right=null;
		}
	}
	
	public static class Pair
	{
		Node node;
		int line;
		
		Pair(Node n,int l)
		{
			node=n;
			line=l;
		}
		
	}
	
	
	public static ArrayList<Integer> topView(Node node)
	{
		
		ArrayList<Integer> list=new ArrayList<>();
		Queue<Pair> q=new LinkedList<Pair>();
		Map<Integer, Integer> map=new TreeMap<Integer,Integer>();
		
		if(node==null)
			return list;
		
		q.add(new Pair(node,0));
		
		while(q.size()>0)
		{
		  
		   
		    Pair p=q.remove();
			Node curr=p.node;
			int line=p.line;
			
			if(!map.containsKey(line))
			{
				map.put(line,curr.data);
			}
			
			if(curr.left!=null)
				q.add(new Pair(curr.left,line-1));
			
			
			if(curr.right!=null)
				q.add(new Pair(curr.right,line+1));
		    
		}
		
		for(Integer i :map.keySet())
		{
			int v=map.get(i);
			list.add(v);
		}
		
		
		return list;
	
	}
	

	
	
	
	
	
	
}
