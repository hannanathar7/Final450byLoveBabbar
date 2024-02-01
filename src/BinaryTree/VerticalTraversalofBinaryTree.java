package BinaryTree;


import java.util.*;

public class VerticalTraversalofBinaryTree {

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
	
	public static class Tuple
	{
		Node node;
		int line;
		int level;
		
		Tuple(Node n,int l1,int l2)
		{
			node=n;
			line=l1;
			level=l2;
		}
		
	}
	
	
	public static List<List<Integer>> verticalTraversal(Node root)
	{
		List<List<Integer>> list=new ArrayList<>();
		
		Queue<Tuple> q=new LinkedList<Tuple>();
		TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>> map=new TreeMap<>();
		
		if(root==null)
			return list;
		
		q.add(new Tuple(root,0,0));
		while(q.size()>0)
		{
			Tuple t=q.remove();
			Node curr=t.node;
			int line=t.line;
			int level=t.level;
			
			if(!map.containsKey(line))
				map.put(line,new TreeMap<>());
			
			if(!map.get(line).containsKey(level))
				map.get(line).put(level,new PriorityQueue<>());
			
			map.get(line).get(level).add(curr.data);
			
			if(curr.left!=null)
				q.add(new Tuple(curr.left,line-1,level+1));
			
			if(curr.right!=null)
				q.add(new Tuple(curr.right,line+1,level+1));
			
		}
		
		for(TreeMap<Integer,PriorityQueue<Integer>> v: map.values())
		{
			list.add(new ArrayList<>());
			for(PriorityQueue<Integer> v1:v.values())
			{
				while(v1.size()>0)
				{
					list.get(list.size()-1).add(v1.remove());
				}
			}
		}
		
		return list;
	
	}
	

	
	
	
	
	
	
}
