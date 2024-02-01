package BinaryTree;



public class CheckIfTreesAreIsomorphic {

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
	
	
	public boolean isomorphic(Node node1,Node node2)
	{
		if(node1==null && node2==null)
			return true;
		
		if(node1==null || node2==null)
			return false;
		
		if(node1.data!=node2.data)
			return false;
		
		boolean a=isomorphic(node1.left,node2.left) && isomorphic(node1.right,node2.right);
		boolean b=isomorphic(node1.left,node2.right) && isomorphic(node1.right,node2.left);
		
		return a||b;
		
	}
	
	
	
	
	
	
	
}
