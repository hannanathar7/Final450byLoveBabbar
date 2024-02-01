package BinaryTree;


public class LCAofBinaryTree {

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
	
	
	public static Node lca(Node node,int n1,int n2)
	{
		if(node==null || node.data==n1 || node.data==n2)
			return node;
		
		Node left=lca(node.left,n1,n2);
		Node right=lca(node.right,n1,n2);
		
		if(left==null)
			return right;
		
		else if(right==null)
			return left;
		
		else
			return node;
	
	}
	
	
	
	
	public static void main(String[] args)
    {
       
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.left = new Node(5);
        root.right.right = new Node(6);
        root.right.left.left = new Node(7);
        root.right.left.right = new Node(8);
 
        lca(root,3,5);
    }
	
	
	
}
