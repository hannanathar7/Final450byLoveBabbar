package BinarySearchTree;

public class MinValueinBST {
	
	public class Node
	{
		Node left,right;
		int data;
		
		Node(int d)
		{
			data=d;
			left=null;
			right=null;
		}
	}
	
	
	public int min(Node root)
	{
		if(root.left==null)
			return root.data;
		
			return min(root.left);
		
	}

}
