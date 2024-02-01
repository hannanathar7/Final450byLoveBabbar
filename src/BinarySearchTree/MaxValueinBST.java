package BinarySearchTree;

public class MaxValueinBST {
	
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
	
	
	public int max(Node root)
	{
		if(root.right==null)
			return root.data;
		
			return max(root.right);
		
	}

}
