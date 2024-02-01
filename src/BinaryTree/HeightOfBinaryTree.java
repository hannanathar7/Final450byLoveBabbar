package BinaryTree;

public class HeightOfBinaryTree {

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
	
	
	public static int Height(Node node)
	{
		if(node==null)
			return 0;
		
		int l=Height(node.left);
		int r=Height(node.right);
		
		return 1+Math.max(l, r);
	}
	
	
	
}
