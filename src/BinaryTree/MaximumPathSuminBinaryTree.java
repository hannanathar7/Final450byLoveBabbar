package BinaryTree;


public class MaximumPathSuminBinaryTree {

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
	
	public static void maxSumPath(Node node)
	{
		int max[]=new int[1];
		solve(node,max);
		System.out.println(max[0]);
	}
	
	
	public static int solve(Node node,int max[])
	{
		if(node==null)
			return 0;
		
		int l=Math.max(0,solve(node.left,max));
		int r=Math.max(0,solve(node.right,max));
		
		max[0]=Math.max(max[0],node.data+l+r);
		
		return node.data+Math.max(l,r);
	}
	
	public static void main(String[] args)
    {
       
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        
 
        maxSumPath(root);
    }
	
	
	
	
	
}
