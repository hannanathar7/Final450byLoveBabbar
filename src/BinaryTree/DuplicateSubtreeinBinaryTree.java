package BinaryTree;

import java.util.HashMap;

public class DuplicateSubtreeinBinaryTree {

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
	
	int dupSub(Node node) {
	    
	       int flag=0;
			HashMap<String,Integer> map=new HashMap<String,Integer>();
			solve(node,map);
			for(String s:map.keySet())
			{
				int v=map.get(s);
				if(v>=2)
				{
					flag=1;
					break;
				}
			}
			return flag;
		}
		
		public static String solve(Node node,HashMap<String,Integer> map)
		{
			String s="";
			
			if(node==null)
			{
				
				return "$";
			}
			
			if(node.left==null && node.right==null)
			{
				s=s+node.data;
				return s;
			}
			
			s=s+node.data;
			s+=solve(node.left,map);
			s+=solve(node.right,map);
			
			if(map.containsKey(s))
				map.put(s,map.get(s)+1);
			else
				map.put(s,1);
			
			return s;
		}
	
	
	
}
