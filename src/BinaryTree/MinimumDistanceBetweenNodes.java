package BinaryTree;

import java.util.ArrayList;




public class MinimumDistanceBetweenNodes {

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
	
	
	public int minimumDistance(Node node,int n1,int n2)
	{
		
		Node a=lca(node,n1,n2);
		
		ArrayList<Integer> list1=root2NodePath(a,n1);
		ArrayList<Integer> list2=root2NodePath(a,n2);
		
		return list1.size()-1+list2.size()-1;
	}
	
	public static Node lca(Node node,int n1,int n2)
	{
		if(node==null || node.data==n1 || node.data==n2)
			return node;
		
		Node left=lca(node.left,n1,n2);
		Node right=lca(node.right,n1,n2);
		
		if(left==null)
			return right;
		
		else if(right==null)
			return left;
		
		else
			return node;
	}
	
	
	
	
	public ArrayList<Integer> root2NodePath(Node node,int n)
	{
		ArrayList<Integer> list=new ArrayList<Integer>();
		solve(node,n,list);
		return list;
	
	}
	
	public  boolean  solve(Node node,int n,ArrayList<Integer> list)
	{
		if(node==null)
			return false;
		
		list.add(node.data);
		if(node.data==n)
			return true;
		
		if(solve(node.left,n,list) || solve(node.right,n,list))
			return true;
		
		list.remove(list.size()-1);
		return false;

	}
	
	
	
}
