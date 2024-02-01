package BinaryTree;

import java.util.*;
public class ReverseLevelOrderTraversal {

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
	
	
	public static ArrayList<Integer> reverseLevelOrder(Node node)
	{
		ArrayList<Integer> list=new ArrayList<Integer>();
		Queue<Node> q=new ArrayDeque<>();
		
		if(node==null)
		{
			return list;
		}
		q.add(node);
		while(q.size()>0)
		{
			int size=q.size();
			for(int i=1;i<=size;i++)
			{
				Node curr=q.remove();
				list.add(curr.data);
				
				
				if(curr.right!=null)
					q.add(curr.right);
				
				if(curr.left!=null)
					q.add(curr.left);
				
				
			}
		}
		
		Collections.reverse(list);
		return list;
	}
	
	
	
}
