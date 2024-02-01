package BinarySearchTree;

public class DeleteValueinBST {
	
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
	
	
	public Node delete(Node root,int key)
	{
		if(root==null)
			return root;
		
		if(root.data==key)
			return helper(root);
		
		Node dummy=root;
		while(root!=null)
		{
			if(key<root.data)
			{
				if(root.left!=null && root.left.data==key)
				{
					root.left=helper(root.left);
					break;
				}
				else
					root=root.left;
			}
			else
			{
				if(root.right!=null && root.right.data==key)
				{
					root.right=helper(root.right);
					break;
				}
				else
					root=root.right;
			}
		}
		
		return dummy;
		
	}
	
	public Node helper(Node node)
	{
		if(node.left==null)
			return node.right;
		
		else if(node.right==null)
			return node.left;
		
		Node rightChild=node.right;
		Node leftLastRight=LastRight(node.left);
		leftLastRight.right=rightChild;
		return node.left;
		
	}
	
	public Node LastRight(Node node)
	{
		if(node.right==null)
			return node;
		
		return LastRight(node.right);
	}
	
	
	
	
	
	

}
