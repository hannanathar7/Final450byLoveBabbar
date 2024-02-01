
package BinaryTree;


public class MirrorTree {

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
	
	
	public static void mirror(Node node)
	{
		
		if(node==null)
		{
			return;
		}
		
		mirror(node.left);
		mirror(node.right);
		
		Node temp=node.left;
		node.left=node.right;
		node.right=temp;
	
	}
	
	
	
}
