package BinaryTree;

import java.util.*;



public class AllDuplicateSubtreeinBinaryTree {

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
	
	ArrayList<String> dupSub(Node node) {
	    
	      
			HashMap<String,Integer> map=new HashMap<String,Integer>();
			ArrayList<String> list=new ArrayList<String>();
			solve(node,map);
			for(String s:map.keySet())
			{
				int v=map.get(s);
				if(v>=2)
				{
					list.add(s);
				}
			}
			return list;
		}
		
		public static String solve(Node node,HashMap<String,Integer> map)
		{
			String s="";
			
			if(node==null)
			{
				
				return "";
			}
		
			
			s=s+node.data+" ";
			s+=solve(node.left,map);
			s+=solve(node.right,map);
			
			if(map.containsKey(s.trim()))
				map.put(s.trim(),map.get(s.trim())+1);
			else
				map.put(s.trim(),1);
			
			return s;
		}
		

		public static void main(String[] args)
	    {
	       
	        Node root = new Node(1);
	        root.left = new Node(2);
	        root.right = new Node(3);
	        root.left.left = new Node(4);
	        root.right.left = new Node(2);
	        root.right.right = new Node(4);
	        root.right.left.left = new Node(4);
	        
	        AllDuplicateSubtreeinBinaryTree a=new AllDuplicateSubtreeinBinaryTree();
	        
	 
	       System.out.println(a.dupSub(root));
	    }
		
		
		
	
	
	
}
