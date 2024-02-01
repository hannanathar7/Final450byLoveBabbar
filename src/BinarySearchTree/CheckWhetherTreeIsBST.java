package BinarySearchTree;

public class CheckWhetherTreeIsBST {
	
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
	
	
	public boolean check(Node root)
	{
		int min=Integer.MIN_VALUE;
		int max=Integer.MAX_VALUE;
		
		return validate(root,min,max);
		
	}
	
	public boolean validate(Node node,int min,int max)
	
	{
		if(node==null)
			return true;
		
		if(node.data<=min || node.data>=max)
			return false;
		
		return validate(node.left,min,node.data) && validate(node.right,node.data,max);
	
	}
	
	
	
	
	
	
	
	

}
