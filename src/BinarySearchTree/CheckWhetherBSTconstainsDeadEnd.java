package BinarySearchTree;

public class CheckWhetherBSTconstainsDeadEnd {
	
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
		int min=1;
		int max=Integer.MAX_VALUE;
		
		return validate(root,min,max);
		
	}
	
	public boolean validate(Node node,int min,int max)
	
	{
		if(node==null)
			return false;
		
		if(min==max)
			return true;
		
		return validate(node.left,min,node.data-1) || validate(node.right,node.data+1,max);
	
	}
	
	
	
	
	
	
	
	

}
