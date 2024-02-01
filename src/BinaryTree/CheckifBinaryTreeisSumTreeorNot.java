package BinaryTree;


public class CheckifBinaryTreeisSumTreeorNot {

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
	
	public static boolean sumTree(Node node)
	{
		int res=solve(node);
		if(res==-1)
			return false;
		else
			return true;
	}
	
	
	public static int solve(Node node)
	{
		if(node==null)
		    return 0;
		   
		   int l=solve(node.left);
		   int r=solve(node.right);
		   
		   if(l==-1 || r==-1)
		   return -1;
		   
		   if(node.left==null && node.right==null)
		   return node.data;
		   
		   if(node.data!=l+r)
		   return -1;
		    
		    return node.data+l+r;
		
		
		
		
		
	}
	
	public static void main(String[] args)
    {
       
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        
 
        sumTree(root);
    }
	
	
	
	
	
}
