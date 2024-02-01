package BinaryTree;

public class TotalNodesinCompleteBT {

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
	
	
	 public int countNodes(Node root) {
		 
		 if(root==null)
			 return 0;
		 
		 int l=leftHeight(root.left);
		 int r=rightHeight(root.right);
		 
		 if(l==r)
			 return ((2<<(l))-1);
		 
		 return 1+countNodes(root.left)+countNodes(root.right);
	        
	    }
	 
	 public int leftHeight(Node node) {
		 
		 int h=0;
		 while(node!=null)
		 {
			 h++;
			 node=node.left;
		 }
		 
		 return h;
	 }
	 
	 	public int rightHeight(Node node) {
		 
		 int h=0;
		 while(node!=null)
		 {
			 h++;
			 node=node.right;
		 }
		 
		 return h;
	 }
	
	
}
