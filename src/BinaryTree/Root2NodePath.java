package BinaryTree;

import java.util.ArrayList;

public class Root2NodePath {

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
