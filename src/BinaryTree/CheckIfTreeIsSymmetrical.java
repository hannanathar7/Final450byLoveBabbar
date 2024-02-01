package BinaryTree;



public class CheckIfTreeIsSymmetrical {

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
	
	public boolean symmetrical(Node root)
	{
		if(root==null)
			return true;
		
		return check(root.left,root.right);
	}
	
	public boolean check(Node n1,Node n2)
	{
		if(n1==null || n2==null)
			return (n1==n2);
		
		
		if(n1.data!=n2.data)
			return false;
		
		return check(n1.left,n2.right) && check(n1.right,n2.left);
		
		
		
		
	}
	
	
	
	
	
	
	
}
