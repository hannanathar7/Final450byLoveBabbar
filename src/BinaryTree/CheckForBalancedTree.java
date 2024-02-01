package BinaryTree;

public class CheckForBalancedTree {

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
	
	public static boolean balance(Node node)
	{
		int res=Height(node);
		if(res==-1)
			return false;
		
		return true;
	}
	
	public static int Height(Node node)
	{
		if(node==null)
			return 0;
		
		int l=Height(node.left);
		if(l==-1)
			return -1;
		
		int r=Height(node.right);
		if(r==-1)
			return -1;
		
		if(Math.abs(l-r)>1)
			return -1;
		
		return 1+Math.max(l, r);
	}
	
	
	
}
