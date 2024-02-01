package BinaryTree;

import java.util.ArrayList;

public class KthAncestorOfNode {

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
	
	
	public int kAncestor(Node root,int n,int k)
	{
		ArrayList<Integer> list=root2NodePath(root,n);
		
		return list.get(list.size()-k-1);
	}
	
	public ArrayList<Integer> root2NodePath(Node root,int n)
	{
		ArrayList<Integer> list=new ArrayList<Integer>();
		solve(root,n,list);
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
	
	public static void main(String args[])
	{
	   
	    Node root = new Node(1);
	    root.left = new Node(2);
	    root.right = new Node(3);
	    root.left.left = new Node(4);
	    root.left.right = new Node(5);
	 
	    KthAncestorOfNode a=new KthAncestorOfNode();
	    System.out.println(a.kAncestor(root,5,2));
	
	}
	
	
	
	
	
	
}
