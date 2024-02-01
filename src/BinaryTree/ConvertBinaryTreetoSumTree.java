package BinaryTree;


public class ConvertBinaryTreetoSumTree {

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
	
	public static void binaryTreetoSumTree(Node node)
	{
		solve(node);
	}
	
	
	public static int solve(Node node)
	{
		if(node==null)
			return 0;
		
		int l=solve(node.left);
		int r=solve(node.right);
		
		int d=node.data;
		node.data=l+r;
		
		return d+l+r;
	}
	
	public static void main(String[] args)
    {
       
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        
 
        binaryTreetoSumTree(root);
    }
	
	
	
	
	
}
