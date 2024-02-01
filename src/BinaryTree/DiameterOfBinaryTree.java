package BinaryTree;

public class DiameterOfBinaryTree {

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
	
	public static int diameter(Node node)
	{
		int dia[]=new int[1];
		Height(node,dia);
		return dia[0];
	}
	
	 public static int Height(Node node,int dia[])
		{
			if(node==null)
				return 0;
			
			int l=Height(node.left,dia);
			int r=Height(node.right,dia);
			
			dia[0]=Math.max(dia[0],1+l+r);
			
			return 1+Math.max(l, r);
		}
	
	
	
}
